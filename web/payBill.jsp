<%@ page import="bmm.dao.CategorizationControlDAO" %>
<%@ page import="bmm.dao.CheckoutControlDAO" %>
<%@ page import="bmm.dao.GoodsControlDAO" %>
<%@ page import="bmm.dao.UserControlDAO" %>
<%@ page import="bmm.entity.CategorizationEntity" %>
<%@ page import="bmm.entity.CheckoutEntity" %>
<%@ page import="bmm.utils.cookie_util.CookieUtil" %>
<%@ page import="bmm.utils.hibernate_util.SpringInjectionUtil" %>
<%@ page import="java.util.List" %>
<%@ page import="bmm.service.CheckoutControlService" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<%
    String username = CookieUtil.getCookiesValue(request, "userLogin");
    if (username == null) {
        out.print("您还未登录");
        response.sendRedirect("/denial.jsp");
    }
    GoodsControlDAO goodsControlDAO = (GoodsControlDAO) SpringInjectionUtil.getDao("goodsControlDao");
    CategorizationControlDAO categorizationControlDAO = (CategorizationControlDAO) SpringInjectionUtil.getDao("cateControlDao");
    CheckoutControlDAO checkoutControlDAO = (CheckoutControlDAO) SpringInjectionUtil.getDao("checkoutControlDao");
    CheckoutControlService checkoutControlService = (CheckoutControlService) SpringInjectionUtil.getDao("checkoutControlService");
    UserControlDAO userControlDAO = (UserControlDAO) SpringInjectionUtil.getDao("userControlDao");
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
                    <li><a href="${pageContext.request.contextPath}/contact.jsp">个人中心</a></li>
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
                <li><a style="color: #FF69B4"><s:property value="message"/></a></li>
            </ul>
        </div>
    </div>
</div>
<div class="copyrights"></div>
<!--start-content-->
<!-- checkout -->
<div class="cart-items">
    <div class="container">
        <h3 class="tittle">确认支付</h3>
        <div class="cart-header">
            <div class="cart-sec simpleCart_shelfItem">
                <%
                    double total = 0;
                    List<CheckoutEntity> checkoutEntityList = checkoutControlDAO.showAll(userControlDAO.getIdByName(username));
                    if (checkoutEntityList != null) {
                        for (CheckoutEntity checkoutEntity : checkoutEntityList) {
                %>
                <div class="cart-item cyc">
                    <%
                        String path = null;
                        if ((path = goodsControlDAO.getPicPathByGoodsId(checkoutEntity.getGoodsId(), 1)) != null) {
                    %>
                    <img src="${pageContext.request.contextPath}<%=goodsControlDAO.getPicPathByGoodsId(2, 1)%>"
                         class="img-responsive" alt="" style="width: 200px;height: 165px">
                    <%
                    } else {
                    %>
                    <img src="${pageContext.request.contextPath}/images/nopre.jpg"
                         class="img-responsive" alt="" style="width: 200px;height: 165px">
                    <%
                        }
                    %>
                </div>
                <div class="cart-item-info" style="padding-bottom: 20px">
                    <h3><a href="#">
                        <%=checkoutEntity.getGoodsName()%>
                    </a>
                    </h3>
                    <ul class="qty">
                        <li><p>单价:<%=goodsControlDAO.getPriceById(checkoutEntity.getGoodsId())%>
                        </p></li>
                        <li><p>购买数量:<%=checkoutEntity.getGoodsCount()%>
                        </p></li>
                    </ul>
                    <div class="delivery">
                        <p>总价为
                            :
                            ￥<%=checkoutEntity.getGoodsCount() * goodsControlDAO.getPriceById(checkoutEntity.getGoodsId())%>
                            0
                            <%
                                total += checkoutEntity.getGoodsCount() * goodsControlDAO.getPriceById(checkoutEntity.getGoodsId());
                            %>
                        </p>
                        <div class="clearfix"></div>
                    </div>
                </div>
                <div class="clearfix">
                </div>
                <%
                        }
                    }
                %>
                <div class="cart-item-info" style="padding-bottom: 20px">
                    <span>全部总价为：￥<%=total%></span>
                </div>
                <div class="cart-item-info" style="padding-bottom: 20px">
                    <s:form method="POST" action="billPaymentControlAction_payment">
                        <s:submit type="button" value="支付"/>
                    </s:form>
                </div>
                <div class="clearfix">
                </div>
            </div>
        </div>
    </div>
</div>
<!--//checkout-->
<!--start-bottom-->
<!--start-image-cursuals-->
<!--//end-bottom-->
<!--start-footer-->
<a href="#home" id="toTop" class="scroll" style="display: block;"> <span id="toTopHover"
                                                                         style="opacity: 1;"> </span></a>


</body>
</html>