<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>建材网上商城</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <meta name="keywords" content=""/>
    <script type="applijegleryion/x-javascript">
         addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); }



    </script>
    <link href="${pageContext.request.contextPath}/css/bootstrap.css" rel='stylesheet' type='text/css'/>
    <!-- Custom Theme files -->
    <link href="${pageContext.request.contextPath}/css/style.css" rel='stylesheet' type='text/css'/>
    <script src="${pageContext.request.contextPath}/js/jquery-1.11.1.min.js"></script>
    <!-- start menu -->
    <link href="${pageContext.request.contextPath}/css/megamenu.css" rel="stylesheet" type="text/css" media="all"/>
    <script type="text/javascript" src="js/megamenu.js"></script>
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
    <script type="${pageContext.request.contextPath}/text/javascript" src="js/move-top.js"></script>
    <script type="${pageContext.request.contextPath}/text/javascript" src="js/easing.js"></script>
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
<!-- header_top -->
<div class="top_bg" id="home">
    <div class="container">
        <div class="header_top">
            <div class="top_right">
                <ul>
                    <li><a href="#">欢迎来到建材商城</a></li>
                    <li><a href="${pageContext.request.contextPath}/contact.jsp">个人中心</a></li>
                </ul>
            </div>
            <div class="clearfix"></div>
        </div>
    </div>
</div>
<!-- header -->
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
                    <div class="cart box_1">
                        <a href="checkout.jsp">
                            <div class="total">
                                <%--todo:show total an count--%>
                                <span class="simpleCart_total"></span> (<span id="simpleCart_quantity"
                                                                              class="simpleCart_quantity"></span>
                                项商品)
                            </div>
                            <i class="glyphicon glyphicon-shopping-cart"></i></a>
                        <p><a href="javascript:" class="simpleCart_empty">购物车</a></p>
                        <div class="clearfix"></div>
                    </div>
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
                                        <li><a href="${pageContext.request.contextPath}/account.jsp">油漆化工</a></li>
                                        <li><a href="${pageContext.request.contextPath}/account.jsp">厨卫洁具</a></li>
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
                <li class="grid"><a class="color2" href="#">
                    <%--todo:show username--%>
                    User
                    <%--<s:property/>--%>
                </a>
                    <div class="megapanel">
                        <div class="row">
                            <div class="col1">
                                <div class="h_nav">
                                    <ul>
                                        <li></li>
                                    </ul>
                                </div>
                            </div>
                            <div class="col1">
                                <div class="h_nav">
                                    <ul>
                                        <li></li>
                                    </ul>
                                </div>
                            </div>
                            <div class="col1">
                                <div class="h_nav">
                                    <h4>账户</h4>
                                    <ul>
                                        <li><a href="${pageContext.request.contextPath}/account.jsp">个人中心</a></li>
                                        <li><a href="${pageContext.request.contextPath}/account.jsp">安全中心</a></li>
                                        <li><a href="${pageContext.request.contextPath}/account.jsp">购物车</a></li>
                                        <li><a href="${pageContext.request.contextPath}/product.jsp">订单查询</a></li>
                                        <li><a href="${pageContext.request.contextPath}/product.jsp">退出</a></li>
                                    </ul>
                                </div>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col2"></div>
                            <div class="col1"></div>
                            <div class="col1"></div>
                            <div class="col1"></div>
                        </div>
                    </div>
                </li>
            </ul>
        </div>
    </div>
</div>
<div class="copyrights"></div>
<!--start-content-->
<!-- checkout -->
<div class="cart-items">
    <div class="container">
        <h3 class="tittle">我的购物车</h3>
        <div class="cart-header">
            <div class="cart-sec simpleCart_shelfItem">
                <s:form theme="simple" method="POST">
                    <div class="cart-item cyc">
                            <%--todo:show images--%>
                        <img src="images/f4.jpg" class="img-responsive" alt="">
                    </div>
                    <div class="cart-item-info">
                            <%--todo:show name--%>
                        <h3><a href="#">name</a>
                            <span><a href="">移除</a></span></h3>
                        <ul class="qty">
                            <li><p>单价:</p></li>
                            <li><p>购买数量</p></li>
                        </ul>
                        <div class="delivery">
                            <p>总价为 : $10.00</p>
                            <div class="clearfix"></div>
                        </div>
                    </div>
                    <div class="clearfix">
                    </div>
                </s:form>
            </div>
        </div>
    </div>
</div>
<!--//checkout-->
<!--start-bottom-->
<!--start-image-cursuals-->
<!--//end-bottom-->
<!--start-footer-->
<div class="container">
    <div class="footer" style="background-color: #e4e4e4">
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
                    <li><a href="${pageContext.request.contextPath}/account.jsp">油漆化工</a></li>
                    <li><a href="${pageContext.request.contextPath}/account.jsp">厨卫洁具</a></li>
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
<!--end-footer-->
<!--//end-content-->
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