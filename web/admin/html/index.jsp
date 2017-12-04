<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page import="bmm.utils.cookie_util.CookieUtil" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<%
    String username = CookieUtil.getCookiesValue(request, "isLogin");
%>
<head>
    <title>建材商城后台管理系统</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- Fonts -->
    <link href='http://fonts.googleapis.com/css?family=Roboto+Condensed:300,400' rel='stylesheet' type='text/css'>
    <link href='http://fonts.googleapis.com/css?family=Lato:300,400,700,900' rel='stylesheet' type='text/css'>
    <!-- CSS Libs -->
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/admin/lib/css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/admin/lib/css/font-awesome.min.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/admin/lib/css/animate.min.css">
    <link rel="stylesheet" type="text/css"
          href="${pageContext.request.contextPath}/admin/lib/css/bootstrap-switch.min.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/admin/lib/css/checkbox3.min.css">
    <link rel="stylesheet" type="text/css"
          href="${pageContext.request.contextPath}/admin/lib/css/jquery.dataTables.min.css">
    <link rel="stylesheet" type="text/css"
          href="${pageContext.request.contextPath}/admin/lib/css/dataTables.bootstrap.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/admin/lib/css/select2.min.css">
    <!-- CSS App -->
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/admin/css/style.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/admin/css/themes/flat-blue.css">
</head>

<body class="flat-blue">
<div class="app-container">
    <div class="row content-container">
        <nav class="navbar navbar-default navbar-fixed-top navbar-top">
            <div class="container-fluid">
                <div class="navbar-header">
                    <button type="button" class="navbar-expand-toggle">
                        <i class="fa fa-bars icon"></i>
                    </button>
                    <ol class="breadcrumb navbar-breadcrumb">
                        <li class="active">建材商城</li>
                    </ol>
                    <button type="button" class="navbar-right-expand-toggle pull-right visible-xs">
                        <i class="fa fa-th icon"></i>
                    </button>
                </div>
                <ul class="nav navbar-nav navbar-right">
                    <li class="dropdown profile">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false">
                            <%=username%>
                            <span class="caret"></span></a>
                        <ul class="dropdown-menu animated fadeInDown">
                            <li class="profile-img">
                                <img src="${pageContext.request.contextPath}/admin/img/profile/picjumbo.com_HNCK4153_resize.jpg"
                                     class="profile-img">
                            </li>
                            <li>
                                <div class="profile-info">
                                    <h4 class="username">
                                        <%=username%>
                                    </h4>
                                    <p>建材商城网——管理员</p>
                                    <div class="btn-group margin-bottom-2x" role="group">
                                        <a href="./security/profile.jsp">
                                            <button type="button" class="btn btn-default"><i class="fa fa-user"></i>
                                                安全设置
                                            </button>
                                        </a>
                                        <a href="/adminControlAction_logout.action">
                                            <button type="button" class="btn btn-default"><i class="fa fa-sign-out"></i>
                                                注销
                                            </button>
                                        </a>
                                    </div>
                                </div>
                            </li>
                        </ul>
                    </li>
                </ul>
            </div>
        </nav>
        <div class="side-menu sidebar-inverse">
            <nav class="navbar navbar-default" role="navigation">
                <div class="side-menu-container">
                    <div class="navbar-header">
                        <a class="navbar-brand" href="#">
                            <div class="icon fa fa-wrench"></div>
                            <div class="title">后台管理系统</div>
                        </a>
                        <button type="button" class="navbar-expand-toggle pull-right visible-xs">
                            <i class="fa fa-times icon"></i>
                        </button>
                    </div>
                    <ul class="nav navbar-nav">
                        <li class="active">
                            <a href="index.jsp">
                                <span class="icon fa fa-calendar"></span><span class="title">统计</span>
                            </a>
                        </li>
                        <li class="panel panel-default dropdown">
                            <a data-toggle="collapse" href="#dropdown-element">
                                <span class="fa fa-user icon"></span><span class="title">用户管理</span>
                            </a>
                            <!-- Dropdown level 1 -->
                            <div id="dropdown-element" class="panel-collapse collapse">
                                <div class="panel-body">
                                    <ul class="nav navbar-nav">
                                        <li><a href="userConf/UserForbidden.jsp">用户注销</a>
                                        </li>
                                        <li><a href="userConf/lossReporting.jsp">挂失与解挂</a>
                                        </li>
                                        <li><a href="userConf/passwordReset.jsp">重置密码</a>
                                        </li>
                                        <li><a href="userConf/findUser.jsp">用户查询</a>
                                        </li>
                                    </ul>
                                </div>
                            </div>
                        </li>
                        <li class="panel panel-default dropdown">
                            <a data-toggle="collapse" href="#dropdown-table">
                                <span class="icon fa fa-gift"></span><span class="title">商品管理</span>
                            </a>
                            <!-- Dropdown level 1 -->
                            <div id="dropdown-table" class="panel-collapse collapse">
                                <div class="panel-body">
                                    <ul class="nav navbar-nav">
                                        <li><a href="goods/categorization.jsp">分类管理</a>
                                        </li>
                                        <li><a href="goods/attribute.jsp">属性设置</a>
                                        </li>
                                        <li><a href="goods/addGoods.jsp">新增商品</a>
                                        </li>
                                        <li><a href="goods/removeGoods.jsp">移除商品</a>
                                        </li>
                                        <li><a href="goods/findGoods.jsp">商品查询</a>
                                        </li>
                                    </ul>
                                </div>
                            </div>
                        </li>
                        <li class="panel panel-default dropdown">
                            <a data-toggle="collapse" href="#component-example">
                                <span class="icon fa fa-cubes"></span><span class="title">订单管理</span>
                            </a>
                            <!-- Dropdown level 1 -->
                            <div id="component-example" class="panel-collapse collapse">
                                <div class="panel-body">
                                    <ul class="nav navbar-nav">
                                        <li><a href="./bill/billManagement.jsp">订单管理</a>
                                        </li>
                                        <li><a href="./bill/findBill.jsp">订单查询</a>
                                        </li>
                                    </ul>
                                </div>
                            </div>
                        </li>
                        <li class="panel panel-default dropdown">
                            <a data-toggle="collapse" href="#dropdown-form">
                                <span class="icon fa fa-lock"></span><span class="title">安全设置</span>
                            </a>
                            <!-- Dropdown level 1 -->
                            <div id="dropdown-form" class="panel-collapse collapse">
                                <div class="panel-body">
                                    <ul class="nav navbar-nav">
                                        <li><a href="security/profile.jsp">
                                            <%=username%>
                                        </a>
                                        </li>
                                    </ul>
                                </div>
                            </div>
                        </li>
                    </ul>
                </div>
                <!-- /.navbar-collapse -->
            </nav>
        </div>
        <!-- Main Content -->
        <div class="container-fluid">
            <div class="side-body padding-top">
                <div class="row">
                    <div class="col-lg-3 col-md-6 col-sm-6 col-xs-12">
                        <a href="${pageContext.request.contextPath}/admin/html/userConf/findUser.jsp">
                            <div class="card red summary-inline">
                                <div class="card-body">
                                    <i class="icon fa fa-inbox fa-4x"></i>
                                    <div class="content">
                                        <div class="title">
                                            <%--todo:显示总用户数--%>
                                        </div>
                                        <div class="sub-title">总用户数</div>
                                    </div>
                                    <div class="clear-both"></div>
                                </div>
                            </div>
                        </a>
                    </div>
                    <div class="col-lg-3 col-md-6 col-sm-6 col-xs-12">
                        <a href="${pageContext.request.contextPath}/admin/html/goods/findGoods.jsp">
                            <div class="card yellow summary-inline">
                                <div class="card-body">
                                    <i class="icon fa fa-gift fa-4x"></i>
                                    <div class="content">
                                        <div class="title">
                                            <%--todo:显示总商品数--%>
                                        </div>
                                        <div class="sub-title">总商品数</div>
                                    </div>
                                    <div class="clear-both"></div>
                                </div>
                            </div>
                        </a>
                    </div>
                    <div class="col-lg-3 col-md-6 col-sm-6 col-xs-12">
                        <a href="">
                            <div class="card green summary-inline">
                                <div class="card-body">
                                    <i class="icon fa fa-tags fa-4x"></i>
                                    <div class="content">
                                        <div class="title">
                                            <%--todo:显示总订单数--%>
                                        </div>
                                        <div class="sub-title">总订单数</div>
                                    </div>
                                    <div class="clear-both"></div>
                                </div>
                            </div>
                        </a>
                    </div>
                    <div class="col-lg-3 col-md-6 col-sm-6 col-xs-12">
                        <a href="#">
                            <div class="card blue summary-inline">
                                <div class="card-body">
                                    <i class="icon fa fa-share-alt fa-4x"></i>
                                    <div class="content">
                                        <div class="title">
                                            <%--todo:显示成交额--%>
                                        </div>
                                        <div class="sub-title">成交额</div>
                                    </div>
                                    <div class="clear-both"></div>
                                </div>
                            </div>
                        </a>
                    </div>
                </div>
                <div class="row  no-margin-bottom">
                    <div class="col-sm-6 col-xs-12">
                        <div class="row">
                            <div class="col-xs-12">
                                <div class="card primary">
                                    <div class="card-jumbotron no-padding">
                                        <canvas id="jumbotron-line-chart" class="chart no-padding"></canvas>
                                    </div>
                                    <div class="card-body half-padding">
                                        <h4 class="float-left no-margin font-weight-300">成交额</h4>
                                        <h2 class="float-right no-margin font-weight-300">
                                            $<%--todo:显示成交额--%>
                                        </h2>
                                        <div class="clear-both"></div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col-sm-6 col-xs-12">
                        <div class="card card-success">
                            <div class="card-body no-padding">
                                <ul class="message-list">
                                    <a href="#">
                                        <li>
                                            <%--todo:添加到下面的for循环中--%>
                                            <img src="${pageContext.request.contextPath}/admin/img/profile/profile-1.jpg"
                                                 class="profile-img pull-left">
                                            <div class="message-block">
                                                <div><span class="username">
                                                    <%--todo:显示创建订单的用户--%>
                                                    yonghu
                                                </span>
                                                    <span
                                                            class="message-datetime">
                                                </span>
                                                </div>
                                                <div class="message">
                                                    <%--todo:显示最新订单--%>
                                                    bill
                                                </div>
                                            </div>
                                        </li>
                                        <%
                                            for (int i = 0; i < 6; i++) {
                                                out.print("");
                                            }
                                        %>
                                    </a>
                                </ul>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <footer class="app-footer">
        <div class="wrapper">
        </div>
    </footer>
</div>
<!-- Javascript Libs -->
<script type="text/javascript" src="${pageContext.request.contextPath}/admin/lib/js/jquery.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/admin/lib/js/bootstrap.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/admin/lib/js/Chart.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/admin/lib/js/bootstrap-switch.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/admin/lib/js/jquery.matchHeight-min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/admin/lib/js/jquery.dataTables.min.js"></script>
<script type="text/javascript"
        src="${pageContext.request.contextPath}/admin/lib/js/dataTables.bootstrap.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/admin/lib/js/select2.full.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/admin/lib/js/ace/ace.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/admin/lib/js/ace/mode-html.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/admin/lib/js/ace/theme-github.js"></script>
<!-- Javascript -->
<script type="text/javascript" src="${pageContext.request.contextPath}/admin/js/app.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/admin/js/index.js"></script>
</body>

</html>
