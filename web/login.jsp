<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>建材网上商城</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <meta name="keywords" content="Nuevo Responsive web template, Bootstrap Web Templates, Flat Web Templates, Andriod Compatible web template,
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design"/>
    <script type="applijegleryion/x-javascript">
         addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); }









    </script>
    <link href="css/bootstrap.css" rel='stylesheet' type='text/css'/>
    <!-- Custom Theme files -->
    <link href="css/style.css" rel='stylesheet' type='text/css'/>
    <script src="js/jquery-1.11.1.min.js"></script>
    <!-- start menu -->
    <link href="css/megamenu.css" rel="stylesheet" type="text/css" media="all"/>
    <script type="text/javascript" src="js/megamenu.js"></script>
    <script>$(document).ready(function () {
        $(".megamenu").megamenu();
    });</script>
    <script src="js/menu_jquery.js"></script>
    <script src="js/simpleCart.min.js"></script>
    <!--web-fonts-->
    <link href='https://fonts.googleapis.com/css?family=Open+Sans:400,300,400italic,300italic,600,700' rel='stylesheet'
          type='text/css'>
    <link href='https://fonts.googleapis.com/css?family=Roboto+Slab:300,400,700' rel='stylesheet' type='text/css'>
    <!--//web-fonts-->
    <script src="js/scripts.js" type="text/javascript"></script>
    <script src="js/modernizr.custom.js"></script>
    <script type="text/javascript" src="js/move-top.js"></script>
    <script type="text/javascript" src="js/easing.js"></script>
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
                    <%--todo:check if login--%>
                    <s:if test="true">
                        <li><a href="login.jsp">登陆</a></li>
                        <li><a href="register.jsp">注册</a></li>
                    </s:if>
                    <s:else>
                        <li><a href="contact.jsp">个人中心</a></li>
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
                            <img src="/images/logo.png" alt="" width="48px" height="48px"/>
                        </h1>
                    </a>
                </div>
                <div class="header_right">
                </div>
                <div class="clearfix"></div>
            </div>
            <!--start-header-menu-->
            <ul class="megamenu skyblue">
                <li class="active grid"><a class="color1" href="index.jsp">首页</a></li>
                <li class="grid"><a class="color2" href="#">分类栏目</a>
                    <div class="megapanel">
                        <div class="row">
                            <div class="col1">
                                <div class="h_nav">
                                    <h4>装饰结构</h4>
                                    <ul>
                                        <li><a href="product.jsp">结构料件</a></li>
                                        <li><a href="product.jsp">门窗楼梯</a></li>
                                        <li><a href="product.jsp">装饰装潢</a></li>
                                    </ul>
                                </div>
                            </div>
                            <div class="col1">
                                <div class="h_nav">
                                    <h4>水电防护</h4>
                                    <ul>
                                        <li><a href="product.jsp">电工电气</a></li>
                                        <li><a href="product.jsp">照明电气</a></li>
                                        <li><a href="product.jsp">给排水</a></li>
                                        <li><a href="product.jsp">消防安防</a></li>
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
                                        <li><a href="product.jsp">机械设备</a></li>
                                        <li><a href="product.jsp">工程工具</a></li>
                                        <li><a href="product.jsp">工程辅料</a></li>
                                    </ul>
                                </div>
                            </div>
                            <div class="col1">
                                <div class="h_nav">
                                    <h4>冷暖器具</h4>
                                    <ul>
                                        <li><a href="product.jsp">暖通</a></li>
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

                <li><a href="./admin/index.jsp" class="color4">管理员</a></li>
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
<!--start-content-->
<!--account-->
<div class="account">
    <div class="container">
        <div class="account-bottom">
            <div class="col-md-6 account-left second">
                <%--todo--%>
                <s:form action="loginAction" theme="simple" method="POST">
                    <div class="account-top heading">
                        <h3>登陆</h3>
                    </div>
                    <div class="address">
                        <span>用户名</span>
                        <s:textfield type="text" name="username"/>
                    </div>
                    <div class="address">
                        <span>密码</span>
                        <s:password type="password" name="password"/>
                    </div>
                    <div class="address">
                        <a class="forgot" href="./forgetPassword.jsp">忘记密码?</a>
                        <s:submit type="submit" value="登陆"/>
                        <a class="forgot" href="register.jsp" style="float: right">没有账号?点此注册</a>
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
<!--start-image-->
<script type="text/javascript" src="js/jquery.flexisel.js"></script>
<!--//end-->
<script type="text/javascript">
    $(window).load(function () {
        $(".flexiselDemo3").flexisel({
            visibleItems: 5,
            animationSpeed: 1000,
            autoPlay: true,
            autoPlaySpeed: 3000,
            pauseOnHover: true,
            enableResponsiveBreakpoints: true,
            responsiveBreakpoints: {
                portrait: {
                    changePoint: 480,
                    visibleItems: 2
                },
                landscape: {
                    changePoint: 640,
                    visibleItems: 3
                },
                tablet: {
                    changePoint: 768,
                    visibleItems: 3
                }
            }
        });
    });
</script>
<!---->
<!--//end-bottom-->
<!--start-footer-->
<div class="scroll-slider">
    <div class="container">
        <div style="background-color: #e4e4e4">

            <div class="footer-top">
                <div class="col-md-2 footer-left">
                    <h3>装饰结构</h3>
                    <ul>
                        <li><a href="product.jsp">结构料件</a></li>
                        <li><a href="product.jsp">门窗楼梯</a></li>
                        <li><a href="product.jsp">装饰装潢</a></li>
                    </ul>
                </div>
                <div class="col-md-2 footer-left">
                    <h3>水电防护</h3>
                    <ul>
                        <li><a href="product.jsp">电工电气</a></li>
                        <li><a href="product.jsp">照明电气</a></li>
                        <li><a href="product.jsp">给排水</a></li>
                        <li><a href="product.jsp">消防安防</a></li>
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
                        <li><a href="product.jsp">机械设备</a></li>
                        <li><a href="product.jsp">工程工具</a></li>
                        <li><a href="product.jsp">工程辅料</a></li>
                    </ul>
                </div>
                <div class="col-md-2 footer-left lost">
                    <h3>冷暖器具</h3>
                    <ul>
                        <li><a href="product.jsp">暖通</a></li>
                    </ul>
                </div>
                <div class="clearfix"></div>
            </div>

        </div>
    </div>
</div>
    <!--start-smooth-scrolling-->
    <script type="text/javascript">
        $(document).ready(function () {
            var defaults = {
                  containerID: 'toTop', // fading element id
                containerHoverID: 'toTopHover', // fading element hover id
                scrollSpeed: 1200,
                easingType: 'linear'
             };
            $().UItoTop({easingType: 'easeOutQuart'});
        });
    </script>
    <a href="#home" id="toTop" class="scroll" style="display: block;"> <span id="toTopHover"
                                                                             style="opacity: 1;"> </span></a>


</body>
</html>