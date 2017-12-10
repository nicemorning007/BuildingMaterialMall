<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>建材网上商城</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <meta name="keywords" content="Nuevo Responsive web template, Bootstrap Web Templates, Flat Web Templates, Andriod Compatible web template,
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design"/>
    <link href="${pageContext.request.contextPath}/css/bootstrap.css" rel='stylesheet' type='text/css'/>
    <!-- Custom Theme files -->
    <link href="${pageContext.request.contextPath}/css/style.css" rel='stylesheet' type='text/css'/>
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
                    <s:if test="true">
                        <li><a href="${pageContext.request.contextPath}/login.jsp">登陆</a></li>
                        <li><a href="${pageContext.request.contextPath}/register.jsp">注册</a></li>
                    </s:if>
                    <s:else>
                        <li><a href="${pageContext.request.contextPath}/contact.jsp">个人中心</a></li>
                    </s:else>
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
                                    <h4>装饰结构</h4>
                                    <ul>
                                        <li><a href="${pageContext.request.contextPath}/product.jsp">结构料件</a></li>
                                        <li><a href="${pageContext.request.contextPath}/product.jsp">门窗楼梯</a></li>
                                        <li><a href="${pageContext.request.contextPath}/product.jsp">装饰装潢</a></li>
                                    </ul>
                                </div>
                            </div>
                            <div class="col1">
                                <div class="h_nav">
                                    <h4>水电防护</h4>
                                    <ul>
                                        <li><a href="${pageContext.request.contextPath}/product.jsp">电工电气</a></li>
                                        <li><a href="${pageContext.request.contextPath}/product.jsp">照明电气</a></li>
                                        <li><a href="${pageContext.request.contextPath}/product.jsp">给排水</a></li>
                                        <li><a href="${pageContext.request.contextPath}/product.jsp">消防安防</a></li>
                                    </ul>
                                </div>
                            </div>
                            <div class="col1">
                                <div class="h_nav">
                                    <h4>化工洁具</h4>
                                    <ul>
                                        <li><a href="account.jsp">油漆化工</a></li>
                                        <li><a href="account.jsp">厨卫洁具</a></li>
                                    </ul>
                                </div>
                            </div>
                            <div class="col1">
                                <div class="h_nav">
                                    <h4>机械设备</h4>
                                    <ul>
                                        <li><a href="${pageContext.request.contextPath}/product.jsp">机械设备</a></li>
                                        <li><a href="${pageContext.request.contextPath}/product.jsp">工程工具</a></li>
                                        <li><a href="${pageContext.request.contextPath}/product.jsp">工程辅料</a></li>
                                    </ul>
                                </div>
                            </div>
                            <div class="col1">
                                <div class="h_nav">
                                    <h4>冷暖器具</h4>
                                    <ul>
                                        <li><a href="${pageContext.request.contextPath}/product.jsp">暖通</a></li>
                                    </ul>
                                </div>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col2"></div>
                            <div class="col1"></div>
                            <div class="col1"></div>
                            <div class="col1"></div>
                            <div class="col1"></div>
                        </div>
                    </div>
                </li>
                <li><a class="color4" href="#">联系我们</a></li>
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
                <s:form action="userControlAction_register" method="POST">
                    <div class="account-top heading">
                        <h3>成为新用户</h3>
                        <span><s:property value="info"/></span>
                    </div>
                    <div class="address">
                        <span>用户名</span>
                        <s:textfield type="text" name="username"/>
                    </div>
                    <div class="address">
                        <span>密码</span>
                        <s:password name="password"/>
                    </div>
                    <div class="address">
                        <span>确认密码</span>
                        <s:password name="confirmPassword"/>
                    </div>
                    <div class="address">
                        <span>手机号</span>
                        <s:textfield name="phoneNum"/>
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
<!--start-bottom-->
<!--start-image-cursuals-->
<div class="scroll-slider">
    <div class="container">
        <!--start-footer-->
        <div style="background-color: #e4e4e4">
            <div class="container">
                <div class="footer-top">
                    <div class="col-md-2 footer-left">
                        <h3>装饰结构</h3>
                        <ul>
                            <li><a href="${pageContext.request.contextPath}/product.jsp">结构料件</a></li>
                            <li><a href="${pageContext.request.contextPath}/product.jsp">门窗楼梯</a></li>
                            <li><a href="${pageContext.request.contextPath}/product.jsp">装饰装潢</a></li>
                        </ul>
                    </div>
                    <div class="col-md-2 footer-left">
                        <h3>水电防护</h3>
                        <ul>
                            <li><a href="${pageContext.request.contextPath}/product.jsp">电工电气</a></li>
                            <li><a href="${pageContext.request.contextPath}/product.jsp">照明电气</a></li>
                            <li><a href="${pageContext.request.contextPath}/product.jsp">给排水</a></li>
                            <li><a href="${pageContext.request.contextPath}/product.jsp">消防安防</a></li>
                        </ul>
                    </div>
                    <div class="col-md-2 footer-left">
                        <h3>化工洁具</h3>
                        <ul>
                            <li><a href="account.jsp">油漆化工</a></li>
                            <li><a href="account.jsp">厨卫洁具</a></li>
                        </ul>
                    </div>
                    <div class="col-md-2 footer-left ">
                        <h3>机械设备</h3>
                        <ul>
                            <li><a href="${pageContext.request.contextPath}/product.jsp">机械设备</a></li>
                            <li><a href="${pageContext.request.contextPath}/product.jsp">工程工具</a></li>
                            <li><a href="${pageContext.request.contextPath}/product.jsp">工程辅料</a></li>
                        </ul>
                    </div>
                    <div class="col-md-2 footer-left lost">
                        <h3>冷暖器具</h3>
                        <ul>
                            <li><a href="${pageContext.request.contextPath}/product.jsp">暖通</a></li>
                        </ul>
                    </div>
                    <div class="clearfix"></div>
                </div>

            </div>
        </div>
    </div>
</div>
<!--start-smooth-scrolling-->
<a href="#home" id="toTop" class="scroll" style="display: block;"> <span id="toTopHover"
                                                                         style="opacity: 1;"> </span></a>


</body>
</html>