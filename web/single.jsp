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
<!-- header_top -->
<div class="top_bg" id="home">
    <div class="container">
        <div class="header_top">
            <div class="top_right">
                <ul>
                    <li><a href="#">欢迎来到建材商城</a></li>
                    <%--todo:check if login--%>
                    <s:if test="false">
                        <li><a href="${pageContext.request.contextPath}/contact.jsp">登陆</a></li>
                        <li><a href="${pageContext.request.contextPath}/register.jsp">注册</a></li>
                    </s:if><s:else>
                    <li><a href="${pageContext.request.contextPath}/contact.jsp">个人中心</a></li>
                </s:else>
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
                    <%--todo: check if login--%>
                    <s:if test="true">
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
                    </s:if>
                </div>
                <div class="clearfix"></div>
                1
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
                <li class="grid"><a class="color2" href="#">
                    <%--todo:show username--%>
                    <%--todo--%>
                    <s:if test="true">
                        User
                        <%--<s:property/>--%>
                    </s:if>
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
                                        <li><a href="account.jsp">个人中心</a></li>
                                        <li><a href="account.jsp">安全中心</a></li>
                                        <li><a href="account.jsp">购物车</a></li>
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
<!-- products -->
<div class="products">
    <div class="container">
        <div class="products-grids">
            <div class="col-md-8 products-single">
                <div class="col-md-5 grid-single">
                    <div class="flexslider">
                        <ul class="slides">
                            <%--todo:show images--%>
                            <li data-thumb="images/z1.jpg">
                                <div class="thumb-image"><img src="${pageContext.request.contextPath}/images/z1.jpg"
                                                              data-imagezoom="true"
                                                              class="img-responsive" alt=""/></div>
                            </li>
                            <li data-thumb="images/z2.jpg">
                                <div class="thumb-image"><img src="${pageContext.request.contextPath}/images/z2.jpg"
                                                              data-imagezoom="true"
                                                              class="img-responsive" alt=""/></div>
                            </li>
                            <li data-thumb="images/z4.jpg">
                                <div class="thumb-image"><img src="${pageContext.request.contextPath}/images/z4.jpg"
                                                              data-imagezoom="true"
                                                              class="img-responsive" alt=""/></div>
                            </li>
                        </ul>
                    </div>
                    <!-- FlexSlider -->
                    <script src="${pageContext.request.contextPath}/js/imagezoom.js"></script>
                    <script defer src="${pageContext.request.contextPath}/js/jquery.flexslider.js"></script>
                    <script>
                        // Can also be used with $(document).ready()
                        $(window).load(function () {
                            $('.flexslider').flexslider({
                                animation: "slide",
                                controlNav: "thumbnails"
                            });
                        });
                    </script>

                </div>
                <div class="col-md-7 single-text">
                    <div class="details-left-info simpleCart_shelfItem">
                        <%--todo:--%>
                        <h3>产品名</h3>
                        <div class="price_single">
                            <%--todo:显示价格。--%>
                            <span class="actual item_price">￥200.00</span>
                        </div>
                        <h2 class="quick">商品简介</h2>
                        <p class="quick_desc">
                            <%--todo:显示商品详情前60字--%>
                            这里是一些商品简介
                        </p>
                        </h3>
                        <h3>单位：</h3>
                        <%--todo--%>
                        <ul class="size">
                            <li>100件</li>
                            <li>起售</li>
                        </ul>
                        <s:form method="POST" theme="simple">
                            <div class="quantity_box">
                                <span>购买量:</span>
                                <div class="product-qty">
                                        <%--todo--%>
                                    <input type="number" value="100"/>
                                </div>
                            </div>
                            <div class="clearfix"></div>
                            <div class="single-but">
                                <input type="submit" value="add to cart"/>
                            </div>
                        </s:form>
                    </div>
                </div>
                <div class="clearfix"></div>
            </div>
            <div class="col-md-4 products-grid-right">
                <div class="w_sidebar">
                    <section class="sky-form">
                        <h4>分类显示</h4>
                        <div class="row1 scroll-pane" style="height: 438px">
                            <div class="col col-4">
                                <label class="checkbox"><input type="checkbox" name="checkbox"><i></i>结构料件</label>
                                <label class="checkbox"><input type="checkbox" name="checkbox"><i></i>门窗楼梯</label>
                                <label class="checkbox"><input type="checkbox" name="checkbox"><i></i>装饰装潢</label>
                                <label class="checkbox"><input type="checkbox" name="checkbox"><i></i>电工电气</label>
                                <label class="checkbox"><input type="checkbox" name="checkbox"><i></i>照明电气</label>
                                <label class="checkbox"><input type="checkbox" name="checkbox"><i></i>给排水</label>
                                <label class="checkbox"><input type="checkbox" name="checkbox"><i></i>消防安防</label>
                                <label class="checkbox"><input type="checkbox" name="checkbox"><i></i>油漆化工</label>
                                <label class="checkbox"><input type="checkbox" name="checkbox"><i></i>厨卫洁具</label>
                                <label class="checkbox"><input type="checkbox" name="checkbox"><i></i>机械设备</label>
                                <label class="checkbox"><input type="checkbox" name="checkbox"><i></i>工程工具</label>
                                <label class="checkbox"><input type="checkbox" name="checkbox"><i></i>工程辅料</label>
                                <label class="checkbox"><input type="checkbox" name="checkbox"><i></i>暖通</label>
                            </div>
                        </div>
                    </section>
                </div>
            </div>
            <div class="clearfix"></div>
            <!-- collapse -->
            <div class="panel-group collpse" id="accordion" role="tablist" aria-multiselectable="true">
                <div class="panel panel-default">
                    <div class="panel-heading" role="tab" id="headingOne">
                        <h4 class="panel-title">
                            <a role="button" data-toggle="collapse" data-parent="#accordion" href="#collapseOne"
                               aria-expanded="true" aria-controls="collapseOne">
                                详情
                            </a>
                        </h4>
                    </div>
                    <div id="collapseOne" class="panel-collapse collapse in" role="tabpanel"
                         aria-labelledby="headingOne">
                        <div class="panel-body">
                            <%--todo:show detils--%>
                            这里显示商品详情
                        </div>
                    </div>
                </div>
                <div class="panel panel-default">
                    <div class="panel-heading" role="tab" id="headingTwo">
                        <h4 class="panel-title">
                            <a class="collapsed" role="button" data-toggle="collapse" data-parent="#accordion"
                               href="#collapseTwo" aria-expanded="false" aria-controls="collapseTwo">
                                商品参数
                            </a>
                        </h4>
                    </div>
                    <div id="collapseTwo" class="panel-collapse collapse" role="tabpanel" aria-labelledby="headingTwo">
                        <div class="panel-body">
                            <%--todo:show detils--%>
                            显示厂商产地等参数
                        </div>
                    </div>
                </div>
            </div>
            <!-- collapse -->
        </div>
    </div>
    <!-- //products -->
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
    <!--end-footer-->
    <!--//end-content-->
    <!--start-smooth-scrolling-->
    <script type="text/javascript">
        $(document).ready(function () {
            /*
            var defaults = {
                  containerID: 'toTop', // fading element id
                containerHoverID: 'toTopHover', // fading element hover id
                scrollSpeed: 1200,
                easingType: 'linear'
             };
            */

            $().UItoTop({easingType: 'easeOutQuart'});

        });
    </script>
    <a href="#home" id="toTop" class="scroll" style="display: block;"> <span id="toTopHover"
                                                                             style="opacity: 1;"> </span></a>
</div>

</body>
</html>