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
    <!-- the jScrollPane script -->
    <script type="text/javascript" src="js/jquery.jscrollpane.min.js"></script>
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
                        <li><a href="contact.jsp">登陆</a></li>
                        <li><a href="#">注册</a></li>
                    </s:if><s:else>
                    <li><a href="contact.jsp">个人中心</a></li>
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
                            <img src="/images/logo.png" alt="" width="48px" height="48px"/>
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
                                        <li><a href="product.jsp">订单查询</a></li>
                                        <li><a href="product.jsp">退出</a></li>
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
<!--products-->
<div class="products">
    <div class="container">
        <div class="products-grids">
            <div class="col-md-8 products-grid-left">
                <%--行--%>
                <%
                    for (int j = 0; j < 3; j++) {

                %>
                <div class="products-grid-lft">
                    <%--列--%>
                    <%--todo:show products--%>
                    <%
                        for (int i = 0; i < 3; i++) {
                    %>
                    <div class="products-grd">
                        <div class="p-one simpleCart_shelfItem prd">
                            <a href="single.jsp">
                                <img src="images/p<%=(j+1)*(i+1)%>.jpg" alt="" class="img-responsive"/>
                            </a>
                            <h4>名字</h4>
                            <p><a class="item_add" href="#"><i class="glyphicon glyphicon-shopping-cart"></i> <span
                                    class=" item_price valsa">单位：百粒</span></a></p>
                            <div class="pro-grd">
                                <a href="single.jsp">价格</a>
                            </div>
                        </div>
                    </div>
                    <%
                        }
                    %>
                    <div class="clearfix"></div>
                </div>
                <%
                    }
                %>
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
                    <section class="sky-form">
                        <h4>排序规则</h4>
                        <div class="row1 scroll-pane" style="height: 217px">
                            <div class="col col-4">
                                <label class="checkbox"><input type="checkbox" name="checkbox"><i></i>时间升序</label>
                                <label class="checkbox"><input type="checkbox" name="checkbox"><i></i>时间降序</label>
                                <label class="checkbox"><input type="checkbox" name="checkbox"><i></i>价格升序</label>
                            </div>
                            <div class="col col-4">
                                <label class="checkbox"><input type="checkbox" name="checkbox"><i></i>价格降序</label>
                                <label class="checkbox"><input type="checkbox" name="checkbox"><i></i>销量升序</label>
                                <label class="checkbox"><input type="checkbox" name="checkbox"><i></i>销量降序</label>
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
<div class="container">
    <div class="footer" style="background-color: #e4e4e4">

        <div class="footer-top">
            <div class="col-md-2 footer-left">
                <h3>装饰结构</h3>
                <ul>
                    <li><a href="#">结构料件</a></li>
                    <li><a href="#">门窗楼梯</a></li>
                    <li><a href="#">装饰装潢</a></li>
                </ul>
            </div>
            <div class="col-md-2 footer-left">
                <h3>水电防护</h3>
                <ul>
                    <li><a href="#">电工电气</a></li>
                    <li><a href="#">照明电气</a></li>
                    <li><a href="#">给排水</a></li>
                    <li><a href="#">消防安防</a></li>
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
                    <li><a href="#">机械设备</a></li>
                    <li><a href="#">工程工具</a></li>
                    <li><a href="#">工程辅料</a></li>
                </ul>
            </div>
            <div class="col-md-2 footer-left lost">
                <h3>冷暖器具</h3>
                <ul>
                    <li><a href="#">暖通</a></li>
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


</body>
</html>