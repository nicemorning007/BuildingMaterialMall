<%@ page import="bmm.dao.CategorizationControlDAO" %>
<%@ page import="bmm.entity.CategorizationEntity" %>
<%@ page import="bmm.utils.hibernate_util.SpringInjectionUtil" %>
<%@ page import="java.util.List" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<%
    CategorizationControlDAO categorizationControlDAO = (CategorizationControlDAO) SpringInjectionUtil.getDao("cateControlDao");
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
                    <li><a href="${pageContext.request.contextPath}/login.jsp">登陆</a></li>
                    <li><a href="${pageContext.request.contextPath}/register.jsp">注册</a></li>
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
                <li><a class="color4" href="${pageContext.request.contextPath}/admin/index.jsp">管理员</a></li>
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
                <s:form action="userControlAction_resetPasswordCon" method="POST">
                    <div class="account-top heading">
                        <h3>重置密码</h3>
                        <span><s:property value="info"/></span>
                    </div>
                    <div class="address">
                        <span>新密码</span>
                        <s:password name="password"/>
                    </div>
                    <div class="address">
                        <span>确认新密码</span>
                        <s:password name="confirmPassword"/>
                    </div>
                    <div class="address new">
                        <s:submit value="注册"/>
                    </div>
                </s:form>
            </div>
        </div>
        <div class="clearfix"></div>
    </div>
</div>
<!-- checkout -->
<a href="#home" id="toTop" class="scroll" style="display: block;"> <span id="toTopHover"
                                                                         style="opacity: 1;"> </span></a>


</body>
</html>