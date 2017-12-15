<%@ page import="bmm.entity.CategorizationEntity" %>
<%@ page import="bmm.entity.GoodsbaseEntity" %>
<%@ page import="bmm.service.CheckoutControlService" %>
<%@ page import="bmm.utils.cookie_util.CookieUtil" %>
<%@ page import="bmm.utils.hibernate_util.SpringInjectionUtil" %>
<%@ page import="java.util.List" %>
<%@ page import="bmm.entity.BillbaseEntity" %>
<%@ page import="bmm.dao.*" %>
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
    BalanceControlDAO balanceControlDAO = (BalanceControlDAO) SpringInjectionUtil.getDao("balanceControlDao");
    BillControlDAO billControlDAO = (BillControlDAO) SpringInjectionUtil.getDao("billControlDao");
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
    <script type="text/javascript">
        jQuery(document).ready(function ($) {
            $(".scroll").click(function (event) {
                event.preventDefault();
                $('html,body').animate({scrollTop: $(this.hash).offset().top}, 900);
            });
        });
    </script>
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
                <li><a class="color4" href="${pageContext.request.contextPath}/userCenter.jsp">个人中心</a>
                    <div class="megapanel">
                        <div class="row">
                            <div class="col1">
                                <div class="h_nav">
                                    <h4>商品分类</h4>
                                    <ul>
                                        <li>
                                            <a href="${pageContext.request.contextPath}/userCenter.jsp">
                                                修改信息
                                            </a>
                                        </li>
                                        <li>
                                            <a href="${pageContext.request.contextPath}/userCenter.jsp?id=1">
                                                我的订单
                                            </a>
                                        </li>
                                        <li>
                                            <a href="${pageContext.request.contextPath}/userCenter.jsp?id=2">
                                                修改收件信息
                                            </a>
                                        </li>
                                        <li>
                                            <a href="${pageContext.request.contextPath}/userCenter.jsp?id=3">
                                                修改密码
                                            </a>
                                        </li>
                                        <li>
                                            <a href="${pageContext.request.contextPath}/userCenter.jsp?id=4">
                                                余额充值
                                            </a>
                                        </li>
                                    </ul>
                                </div>
                            </div>
                        </div>
                    </div>
                </li>
                <li><a style="color: #FF69B4"><s:property value="message"/></a></li>
            </ul>
            <div class="row">
                <div class="col2"></div>
                <div class="col1"></div>
                <div class="col1"></div>
                <div class="col1"></div>
            </div>
        </div>
    </div>
</div>
<div class="copyrights"></div>
<!--account-->
<div class="account">
    <div class="container">
        <div class="account-bottom">
            <div class="col-md-6 account-left">
                <%
                    List<Integer> billbaseEntityList = billControlDAO.getOneUserAllBillIdByUserId(userControlDAO.getUserIdByUsername(username));
                    if (request.getParameter("id") != null) {
                        int id = Integer.parseInt(request.getParameter("id"));
                        switch (id) {
                            case 1:
                                if (billbaseEntityList != null) {
                                    for (int i = billbaseEntityList.size() - 1; i >= 0; i--) {
                %>
                <div class="cart-item cyc">
                    <%
                        String path = null;
                        if ((path = goodsControlDAO.getPicPathByGoodsId(billControlDAO.getGoodsIdById(billbaseEntityList.get(i)), 1)) != null) {
                    %>
                    <img src="${pageContext.request.contextPath}<%=path%>"
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
                        <%=goodsControlDAO.getNameById(billControlDAO.getGoodsIdById(billbaseEntityList.get(i)))%>
                    </a></h3>
                    <ul class="qty">
                        <li><p>
                            单价:<%=goodsControlDAO.getPriceById(billControlDAO.getGoodsIdById(billbaseEntityList.get(i)))%>
                        </p></li>
                        <li><p>购买数量:<%=billControlDAO.getGoodsCountById(billbaseEntityList.get(i))%>
                        </p></li>
                    </ul>
                    <div class="delivery">
                        <p>总价为
                            :
                            ￥<%=billControlDAO.getTotalById(billbaseEntityList.get(i))%>0
                        </p>
                        <div class="clearfix"></div>
                    </div>
                </div>
                <div class="clearfix">
                </div>
                <% }
                } else {%>
                <h1>您还没有任何订单，快去购买吧！</h1>
                <%
                        }
                        break;
                    case 2:
                %>
                <s:form method="POST" action="userControlAction_editInfo">
                    <input type="hidden" name="userId" value="<%=userControlDAO.getIdByName(username)%>"/>
                    <div class="address">
                        <span>收件人</span>
                        <input name="receiver"
                               value="<%=userControlDAO.getReceiverById(userControlDAO.getIdByName(username))%>"/>
                    </div>
                    <div class="address">
                        <span>收件地址</span>
                        <input name="address"
                               value="<%=userControlDAO.getAddressById(userControlDAO.getIdByName(username))%>"/>
                    </div>
                    <div class="address">
                        <span>联系方式</span>
                        <input name="phone"
                               value="<%=userControlDAO.getPhoneById(userControlDAO.getIdByName(username))%>"/>
                    </div>
                    <div class="address new">
                        <s:submit value="修改"/>
                    </div>
                </s:form>
                <%
                        break;
                    case 3:
                %>
                <s:form action="userControlAction_changePassword" method="POST">
                    <input type="hidden" name="userId" value="<%=userControlDAO.getIdByName(username)%>"/>
                    <div class="address">
                        <span>修改密码</span>
                        <s:password name="password"/>
                    </div>
                    <div class="address">
                        <span>确认密码</span>
                        <s:password name="confirmPassword"/>
                    </div>
                    <div class="address new">
                        <s:submit value="修改"/>
                    </div>
                </s:form>
                <%
                        break;
                    case 4:
                %>
                <s:form action="userControlAction_reCharge" method="POST">
                    <input type="hidden" name="userId" value="<%=userControlDAO.getIdByName(username)%>"/>
                    <div class="address">
                        <span>当前余额</span>
                        <input type="number"
                               value="<%=balanceControlDAO.getBalanceById(balanceControlDAO.getIdByUserId(userControlDAO.getIdByName(username)))%>"
                               disabled="disabled"/>
                    </div>
                    <div class="address">
                        <span>充值余额</span>
                        <s:textfield name="money"/>
                    </div>
                    <div class="address new">
                        <s:submit value="充值"/>
                    </div>
                </s:form>
                <%
                            break;
                    }
                } else {
                %>
                <s:form method="POST" action="userControlAction_baseChange">
                    <input type="hidden" name="userId" value="<%=userControlDAO.getIdByName(username)%>"/>
                    <div class="address">
                        <span>昵称</span>
                        <input name="nickname"
                               value="<%=userControlDAO.getNickNameById(userControlDAO.getUserIdByUsername(username))%>"/>
                    </div>
                    <div class="address">
                        <span>性别</span>
                        <select name="selectCate" style="width: 150px" title="">
                            <option value="男">男</option>
                            <option value="女">女</option>
                        </select>
                    </div>
                    <div class="address new">
                        <s:submit value="修改"/>
                    </div>
                </s:form>
                <%
                    }
                %>
            </div>
        </div>
        <div class="clearfix"></div>
    </div>
</div>
<!-- checkout -->
<!--start-bottom-->
<!--start-image-cursuals-->
<!--start-smooth-scrolling-->
<a href="#home" id="toTop" class="scroll" style="display: block;"> <span id="toTopHover"
                                                                         style="opacity: 1;"> </span></a>


</body>
</html>