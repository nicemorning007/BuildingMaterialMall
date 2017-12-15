<%@ page import="bmm.dao.CategorizationControlDAO" %>
<%@ page import="bmm.dao.GoodsControlDAO" %>
<%@ page import="bmm.entity.CategorizationEntity" %>
<%@ page import="bmm.entity.GoodsbaseEntity" %>
<%@ page import="bmm.utils.cookie_util.CookieUtil" %>
<%@ page import="bmm.utils.hibernate_util.SpringInjectionUtil" %>
<%@ page import="java.util.List" %>
<%@ page import="bmm.service.CheckoutControlService" %>
<%@ page import="bmm.dao.UserControlDAO" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<%
    String username = CookieUtil.getCookiesValue(request, "userLogin");
    int cate;
    int nowPage;
    if (request.getParameter("cate") != null) {
        cate = Integer.parseInt(request.getParameter("cate"));
    } else {
        cate = 1;
    }
    if (request.getParameter("nowPage") != null) {
        nowPage = Integer.parseInt(request.getParameter("nowPage"));
    } else {
        nowPage = 1;
    }
    GoodsControlDAO goodsControlDAO = (GoodsControlDAO) SpringInjectionUtil.getDao("goodsControlDao");
    CategorizationControlDAO categorizationControlDAO = (CategorizationControlDAO) SpringInjectionUtil.getDao("cateControlDao");
    UserControlDAO userControlDAO = (UserControlDAO) SpringInjectionUtil.getDao("userControlDao");
    CheckoutControlService checkoutControlService = (CheckoutControlService) SpringInjectionUtil.getDao("checkoutControlService");

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
    <script src="${pageContext.request.contextPath}/js/bootstrap.js"></script>
    <!--web-fonts-->
    <link href='https://fonts.googleapis.com/css?family=Open+Sans:400,300,400italic,300italic,600,700' rel='stylesheet'
          type='text/css'>
    <link href='https://fonts.googleapis.com/css?family=Roboto+Slab:300,400,700' rel='stylesheet' type='text/css'>
    <!--//web-fonts-->
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/move-top.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/easing.js"></script>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/flexslider.css" type="text/css" media="screen"/>

    <!--/script-->
    <script type="text/javascript">
        jQuery(document).ready(function ($) {
            $(".scroll").click(function (event) {
                event.preventDefault();
                $('html,body').animate({scrollTop: $(this.hash).offset().top}, 900);
            });
        });
    </script>
    <!-- the jScrollPane script -->
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.jscrollpane.min.js"></script>
    <script type="text/javascript" id="sourcecode">
        $(function () {
            $('.scroll-pane').jScrollPane();
        });
    </script>
    <!-- //the jScrollPane script -->
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
<!--products-->
<div class="products">
    <div class="container">
        <div class="products-grids">
            <div class="col-md-8 products-grid-left">
                <%
                    List<GoodsbaseEntity> list1 = goodsControlDAO.getGoodsDependByCateByPage(nowPage, cate);
                %>
                <div class="products-grid-lft">
                    <%
                        if (list1 != null) {
                            for (GoodsbaseEntity goodsbaseEntity : list1) {
                    %>
                    <div class="products-grd">
                        <div class="p-one simpleCart_shelfItem prd">
                            <%
                                if (goodsControlDAO.getPicPathByGoodsId(goodsbaseEntity.getId(), 1) == null) {
                            %>
                            <a href="${pageContext.request.contextPath}/single.jsp?cate=<%=goodsbaseEntity.getCate()%>&goodsId=<%=goodsbaseEntity.getId()%>">
                                <img src="${pageContext.request.contextPath}/images/nopre.jpg"
                                     alt=""
                                     class="img-responsive"/>
                            </a>
                            <%
                            } else {
                            %>
                            <a href="${pageContext.request.contextPath}/single.jsp?cate=<%=goodsbaseEntity.getCate()%>&goodsId=<%=goodsbaseEntity.getId()%>">
                                <img src="${pageContext.request.contextPath}<%=goodsControlDAO.getPicPathByGoodsId(goodsbaseEntity.getId(),1)%>"
                                     alt=""
                                     class="img-responsive"/>
                            </a>
                            <%
                                }
                            %>
                            <h4>
                                <a href="${pageContext.request.contextPath}/single.jsp?cate=<%=goodsbaseEntity.getCate()%>&goodsId=<%=goodsbaseEntity.getId()%>"><%=goodsbaseEntity.getName()%>
                                </a>
                            </h4>
                            <p><a class="item_add"
                                  href="${pageContext.request.contextPath}/single.jsp?cate=<%=goodsbaseEntity.getCate()%>&goodsId=<%=goodsbaseEntity.getId()%>"><i
                                    class="glyphicon glyphicon-shopping-cart"></i> <span
                                    class=" item_price valsa">单位：<%=goodsbaseEntity.getUnit()%></span></a>
                            </p>
                            <div class="pro-grd">
                                <a href="${pageContext.request.contextPath}/single.jsp?cate=<%=goodsbaseEntity.getCate()%>&goodsId=<%=goodsbaseEntity.getId()%>">￥<%=goodsbaseEntity.getPrice()%>
                                </a>
                            </div>
                        </div>
                    </div>
                    <%
                        }
                    } else {
                    %>
                    <h1>该分类暂无商品</h1>
                    <%
                        }
                    %>
                    <div class="clearfix"></div>
                </div>
            </div>
            <div class="col-md-4 products-grid-right">
                <div class="w_sidebar">
                    <section class="sky-form">
                        <h4>分类显示</h4>
                        <div class="row1 scroll-pane" style="height: 438px">
                            <div class="col col-4">
                                <%
                                    for (CategorizationEntity categorizationEntity : list) {
                                %>
                                <p>
                                    <a href="${pageContext.request.contextPath}/product.jsp?cate=<%=categorizationEntity.getId()%>"><%=categorizationEntity.getName()%>
                                    </a>
                                </p>
                                <%
                                    }
                                %>
                            </div>
                        </div>
                    </section>
                </div>
            </div>
            <div class="clearfix"></div>
        </div>
    </div>
</div>
<!--start-footer-->
<a href="#home" id="toTop" class="scroll" style="display: block;"> <span id="toTopHover"
                                                                         style="opacity: 1;"> </span></a>


</body>
</html>