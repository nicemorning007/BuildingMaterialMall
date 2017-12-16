<%@ page import="bmm.dao.CategorizationControlDAO" %>
<%@ page import="bmm.dao.GoodsControlDAO" %>
<%@ page import="bmm.entity.CategorizationEntity" %>
<%@ page import="bmm.entity.GoodsbaseEntity" %>
<%@ page import="bmm.service.CheckoutControlService" %>
<%@ page import="bmm.utils.cookie_util.CookieUtil" %>
<%@ page import="bmm.utils.hibernate_util.SpringInjectionUtil" %>
<%@ page import="java.util.List" %>
<%@ page import="bmm.dao.UserControlDAO" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<%
    String username = CookieUtil.getCookiesValue(request, "userLogin");
    GoodsControlDAO goodsControlDAO = (GoodsControlDAO) SpringInjectionUtil.getDao("goodsControlDao");
    CategorizationControlDAO categorizationControlDAO = (CategorizationControlDAO) SpringInjectionUtil.getDao("cateControlDao");
    GoodsbaseEntity randomGoods;
    CheckoutControlService checkoutControlService = (CheckoutControlService) SpringInjectionUtil.getDao("checkoutControlService");
    UserControlDAO userControlDAO = (UserControlDAO) SpringInjectionUtil.getDao("userControlDao");
    if (goodsControlDAO.getGoodsCount() > 0) {
%>
<head>
    <title>建材网上商城</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <link href="${pageContext.request.contextPath}/css/bootstrap.css" rel='stylesheet' type='text/css'/>
    <!-- Custom Theme files -->
    <link href="${pageContext.request.contextPath}/css/style.css" rel='stylesheet' type='text/css'/>
    <script src="js/jquery-1.11.1.min.js"></script>
    <!-- start menu -->
    <link href="${pageContext.request.contextPath}/css/megamenu.css" rel="stylesheet" type="text/css" media="all"/>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/megamenu.js"></script>
    <script>$(document).ready(function () {
        $(".megamenu").megamenu();
    });</script>
    <script src="${pageContext.request.contextPath}/js/menu_jquery.js"></script>
    <script src="${pageContext.request.contextPath}/js/simpleCart.min.js"></script>
    <!--web-fonts-->
    <link href='https://fonts.googleapis.com/css?family=Open+Sans:400,300,400italic,300italic,600,700' rel='stylesheet'
          type='text/css'>
    <link href='https://fonts.googleapis.com/css?family=Roboto+Slab:300,400,700' rel='stylesheet' type='text/css'>
    <!--//web-fonts-->
    <script src="${pageContext.request.contextPath}/js/scripts.js" type="text/javascript"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/move-top.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/easing.js"></script>
    <!--/script-->
</head>
<body>
<!--start-home-->
<div class="top_bg" id="home">
    <div class="container">
        <div class="header_top">
            <div class="top_right">
                <ul>
                    <li><a href="#">欢迎来到建材商城</a></li>
                    <%if (username == null) {%>
                    <li><a href="${pageContext.request.contextPath}/login.jsp">登陆</a></li>
                    <li><a href="${pageContext.request.contextPath}/register.jsp">注册</a></li>
                    <%} else {%>
                    <li><a href="${pageContext.request.contextPath}/userCenter.jsp">个人中心</a></li>
                    <li><a href="/userControlAction_logout.action">退出</a></li>
                    <%}%>
                </ul>
            </div>
            <div class="clearfix"></div>
        </div>
    </div>
</div>
<!-- header_top -->
<div class="header_bg">
    <div class="container">
        <div class="header">
            <div class="head-t">
                <div class="logo" style="">
                    <a href="index.jsp">
                        <h1>建 <span>材</span>
                            <img src="${pageContext.request.contextPath}/images/logo.png" alt="" width="48px"
                                 height="48px"/>
                        </h1>
                    </a>
                </div>
                <div class="header_right">
                    <%
                        if (username != null) {
                    %>
                    <div class="cart box_1">
                        <a href="checkout.jsp">
                            <div class="total">
                                <span>
                                    ￥<%=checkoutControlService.getAllTotal(userControlDAO.getIdByName(username))%>0
                                </span> (<span>
                                    <%=checkoutControlService.getCount(userControlDAO.getIdByName(username))%>
                                </span>
                                项商品)
                            </div>
                            <i class="glyphicon glyphicon-shopping-cart"></i></a>
                        <p><a href="javascript:" class="simpleCart_empty">购物车</a></p>
                        <div class="clearfix"></div>
                    </div>
                    <%
                        }
                    %>
                </div>
                <div class="clearfix"></div>
            </div>
            <!--start-header-menu-->
            <ul class="megamenu skyblue">
                <li class="active grid"><a class="color1" href="${pageContext.request.contextPath}/index.jsp">首页</a>
                </li>
                <li class="grid"><a class="color2" href="#">分类栏目</a>
                    <div class="megapanel">
                        <div class="row">
                            <div class="col1">
                                <div class="col1">
                                    <div class="h_nav">
                                        <ul>
                                            <li></li>
                                        </ul>
                                    </div>
                                </div>
                                <div class="h_nav">
                                    <h4>商品分类</h4>
                                    <ul>
                                        <%
                                            List<CategorizationEntity> list = categorizationControlDAO.showAllCate();
                                            for (CategorizationEntity categorizationEntity : list) {
                                        %>
                                        <li>
                                            <a href="${pageContext.request.contextPath}/product.jsp?cate=<%=categorizationEntity.getId()%>">
                                                <%=categorizationEntity.getName()%>
                                            </a>
                                        </li>
                                        <%
                                            }
                                        %>
                                    </ul>
                                </div>
                            </div>
                        </div>
                    </div>
                </li>
                <li><a class="color4" href="${pageContext.request.contextPath}/contact.jsp">联系我们</a></li>
            </ul>
        </div>
    </div>
</div>
<div class="copyrights"></div>
<!--start-content-->
<!--start-banner-->
<div class="banner">
    <div class="container">
        <div class="banner-grids">
            <div class="col-md-6 jocket">
                <div class="jock-img">
                    <%
                        if (goodsControlDAO.getPicPathByGoodsId(goodsControlDAO.getGoodsCount(), 1) != null) {
                    %>
                    <a class="collection" href="single.jsp?goodsId=<%=goodsControlDAO.getGoodsCount()%>">
                        <img src="${pageContext.request.contextPath}<%=goodsControlDAO.getPicPathByGoodsId(goodsControlDAO.getGoodsCount(),1)%>"
                             alt="" style="width: 555px;height: 626px">
                    </a>
                    <%
                    } else {
                    %>
                    <a class="collection" href="single.jsp?goodsId=<%=goodsControlDAO.getGoodsCount()%>">
                        <img src="${pageContext.request.contextPath}/images/nopre.jpg"
                             alt="" style="width: 555px;height: 626px">
                    </a>
                    <%
                        }
                    %>
                </div>
                <div class="jock-text">
                    <h3 class="b-tittle" style="margin-top: 20px;color: #2caef5">
                        <%=goodsControlDAO.getNameById(goodsControlDAO.getGoodsCount())%>
                    </h3>
                    <a class="collection" href="single.jsp?goodsId=<%=goodsControlDAO.getGoodsCount()%>">
                        <i class="glyphicon glyphicon-arrow-right">
                            查看详情
                        </i>
                    </a>
                </div>
                <div class="clearfix"></div>
            </div>
            <div class="col-md-6 shoe">
                <div class="shoe-img">
                    <%
                        randomGoods = goodsControlDAO.getRandomOne();
                        if (goodsControlDAO.getPicPathByGoodsId(randomGoods.getId(), 1) != null) {
                    %>
                    <a class="collection" href="single.jsp?goodsId=<%=randomGoods.getId()%>">
                        <img src="${pageContext.request.contextPath}<%=goodsControlDAO.getPicPathByGoodsId(randomGoods.getId(),1)%>"
                             alt="" style="width: 294px;height: 298px">
                    </a>
                    <%
                    } else {
                    %>
                    <a class="collection" href="single.jsp?goodsId=<%=goodsControlDAO.getGoodsCount()%>">
                        <img src="${pageContext.request.contextPath}/images/nopre.jpg"
                             alt="" style="width: 294px;height: 298px">
                    </a>
                    <%
                        }
                    %>
                </div>
                <div class="shoe-text">
                    <h3 class="b-tittle" style="margin-top: 20px;color: #2caef5"><%=randomGoods.getName()%>
                    </h3>
                    <a class="collection" href="single.jsp?goodsId=<%=randomGoods.getId()%>"><i
                            class="glyphicon glyphicon-arrow-right">查看详情</i></a>
                </div>
                <div class="clearfix"></div>
                <div class="bottom-bags">
                    <%
                        randomGoods = goodsControlDAO.getRandomOne();
                    %>
                    <div class="col-md-6 pack">
                        <div class="bag-text">
                            <h3 class="b-tittle" style="margin-top: 20px;color: #2caef5"><%=randomGoods.getName()%>
                            </h3>
                            <a class="collection" href="single.jsp?goodsId=<%=randomGoods.getId()%>"><i
                                    class="glyphicon glyphicon-arrow-right">查看详情</i></a>
                        </div>
                        <%
                            if (goodsControlDAO.getPicPathByGoodsId(randomGoods.getId(), 1) != null) {
                        %>
                        <a class="collection" href="single.jsp?goodsId=<%=randomGoods.getId()%>">
                            <img src="${pageContext.request.contextPath}<%=goodsControlDAO.getPicPathByGoodsId(randomGoods.getId(),1)%>"
                                 alt="" style="width: 176px;height: 230px">
                        </a>
                        <%
                        } else {
                        %>
                        <a class="collection" href="single.jsp?goodsId=<%=goodsControlDAO.getGoodsCount()%>">
                            <img src="${pageContext.request.contextPath}/images/nopre.jpg"
                                 alt="" style="width: 176px;height: 230px">
                        </a>
                        <%
                            }
                        %>
                        <div class="clearfix"></div>

                    </div>
                    <div class="col-md-6 glass">
                        <div class="glass-text">
                            <%
                                randomGoods = goodsControlDAO.getRandomOne();
                            %>
                            <h3 class="b-tittle" style="margin-top: 20px;color: #2caef5"><%=randomGoods.getName()%>
                            </h3>
                            <a class="collection" href="single.jsp?goodsId=<%=randomGoods.getId()%>"><i
                                    class="glyphicon glyphicon-arrow-right">查看详情</i></a>
                        </div>
                        <div class="glass-img">
                            <%
                                if (goodsControlDAO.getPicPathByGoodsId(randomGoods.getId(), 1) != null) {
                            %>
                            <a class="collection" href="single.jsp?goodsId=<%=randomGoods.getId()%>">
                                <img src="${pageContext.request.contextPath}<%=goodsControlDAO.getPicPathByGoodsId(randomGoods.getId(),1)%>"
                                     alt="" style="width: 176px;height: 230px">
                            </a>
                            <%
                            } else {
                            %>
                            <a class="collection" href="single.jsp?goodsId=<%=goodsControlDAO.getGoodsCount()%>">
                                <img src="${pageContext.request.contextPath}/images/nopre.jpg"
                                     alt="" style="width: 176px;height: 230px">
                            </a>
                            <%
                                }
                            %>
                        </div>
                        <div class="clearfix"></div>

                    </div>
                    <div class="clearfix"></div>
                </div>
            </div>
            <div class="clearfix"></div>
        </div>
    </div>
</div>
<!--/start-fashion-->
<div class="fashion-section">
    <div class="container">
        <h3 class="tittle">最近热销</h3>
        <div class="fashion-info">
            <%
                List<GoodsbaseEntity> bestSeal3Goods = goodsControlDAO.getBestSealXGoods(3);
                for (int i = 0; i < 3; i++) {
                    if (bestSeal3Goods.size() == i) {
                        break;
                    }
            %>
            <div class="col-md-4 fashion-grids">
                <figure class="effect-bubba">
                    <%
                        if (goodsControlDAO.getPicPathByGoodsId(bestSeal3Goods.get(i).getId(), 1) != null) {
                    %>
                    <a href="single.jsp?goodsId=<%=bestSeal3Goods.get(i).getId()%>">
                        <img src="${pageContext.request.contextPath}<%=goodsControlDAO.getPicPathByGoodsId(bestSeal3Goods.get(i).getId(),1)%>"
                             alt="" style="width: 400px;height: 300px">
                        <figcaption>
                            <%=bestSeal3Goods.get(i).getName()%>
                        </figcaption>
                    </a>
                    <%
                    } else {
                    %>
                    <a href="single.jsp?goodsId=<%=bestSeal3Goods.get(i).getId()%>">
                        <img src="${pageContext.request.contextPath}/images/nopre.jpg"
                             alt="" style="width: 400px;height: 300px">
                        <figcaption>
                            <%=bestSeal3Goods.get(i).getName()%>
                        </figcaption>
                    </a>
                    <%
                        }
                    %>
                </figure>
            </div>
            <%
                }%>
            <div class="clearfix"></div>
        </div>
    </div>
</div>
<!--//fashion-->
<!--/start-latest-->
<div class="collection-section">
    <div class="container">
        <h3 class="tittle fea">最近新品</h3>
        <div class="fashion-info">
            <%
                List<GoodsbaseEntity> newset3Goods = goodsControlDAO.getXNewest(3);
                for (int i = 0; i < 3; i++) {
                    if (newset3Goods.size() == i) {
                        break;
                    }
            %>
            <div class="col-md-4 fashion-grids">
                <figure class="effect-bubba">
                    <%
                        if (goodsControlDAO.getPicPathByGoodsId(newset3Goods.get(i).getId(), 1) != null) {
                    %>
                    <a href="single.jsp?goodsId=<%=newset3Goods.get(i).getId()%>">
                        <img src="${pageContext.request.contextPath}<%=goodsControlDAO.getPicPathByGoodsId(newset3Goods.get(i).getId(),1)%>"
                             alt="" style="width: 400px;height: 300px">
                        <figcaption>
                            <%=newset3Goods.get(i).getName()%>
                        </figcaption>
                    </a>
                    <%
                    } else {
                    %>
                    <a href="single.jsp?goodsId=<%=newset3Goods.get(i).getId()%>">
                        <img src="${pageContext.request.contextPath}/images/nopre.jpg"
                             alt="" style="width: 400px;height: 300px">
                        <figcaption>
                            <%=newset3Goods.get(i).getName()%>
                        </figcaption>
                    </a>
                    <%
                        }
                    %>
                </figure>
            </div>
            <%
                }%>
            <div class="clearfix"></div>
        </div>
    </div>
</div>
<!--//latest-->
<div class="mid-content">
    <div class="container">
        <div class="middle">
            <div class="mid-top">
                <h3>建&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;材&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;市&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;场</h3>
                <p>找&nbsp;到&nbsp;你&nbsp;想&nbsp;要&nbsp;的&nbsp;材&nbsp;料</p>
            </div>
        </div>
    </div>
</div>
<!--start-footer-->

<!--end-footer-->
<!--//end-content-->
<!--start-smooth-scrolling-->
<a href="#home" id="toTop" class="scroll" style="display: block;"> <span id="toTopHover"
                                                                         style="opacity: 1;"> </span></a>
</body>
<%
} else {
%>
<h1>请现在后台添加商品</h1>
<a href="${pageContext.request.contextPath}/admin/index.jsp">点击这里进入后台管理界面</a>
<%
    }
%>
</html>