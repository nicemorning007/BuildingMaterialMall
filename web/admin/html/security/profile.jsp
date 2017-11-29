<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<head>
    <title>建材商城后台管理系统</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- Fonts -->
    <link href='http://fonts.googleapis.com/css?family=Roboto+Condensed:300,400' rel='stylesheet' type='text/css'>
    <link href='http://fonts.googleapis.com/css?family=Lato:300,400,700,900' rel='stylesheet' type='text/css'>
    <!-- CSS Libs -->
    <link rel="stylesheet" type="text/css" href="../../lib/css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="../../lib/css/font-awesome.min.css">
    <link rel="stylesheet" type="text/css" href="../../lib/css/animate.min.css">
    <link rel="stylesheet" type="text/css" href="../../lib/css/bootstrap-switch.min.css">
    <link rel="stylesheet" type="text/css" href="../../lib/css/checkbox3.min.css">
    <link rel="stylesheet" type="text/css" href="../../lib/css/jquery.dataTables.min.css">
    <link rel="stylesheet" type="text/css" href="../../lib/css/dataTables.bootstrap.css">
    <link rel="stylesheet" type="text/css" href="../../lib/css/select2.min.css">
    <!-- CSS App -->
    <link rel="stylesheet" type="text/css" href="../../css/style.css">
    <link rel="stylesheet" type="text/css" href="../../css/themes/flat-blue.css">
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
                            <%--todo:显示管理员名字--%>
                            占位
                            <span class="caret"></span></a>
                        <ul class="dropdown-menu animated fadeInDown">
                            <li class="profile-img">
                                <img src="../../img/profile/picjumbo.com_HNCK4153_resize.jpg" class="profile-img">
                            </li>
                            <li>
                                <div class="profile-info">
                                    <h4 class="username">
                                        <%--todo:显示管理员名字--%>
                                        占位
                                    </h4>
                                    <p>建材商城网——管理员</p>
                                    <div class="btn-group margin-bottom-2x" role="group">
                                        <button type="button" class="btn btn-default"><i class="fa fa-user"></i>
                                            <a href="#">安全设置</a>
                                        </button>
                                        <button type="button" class="btn btn-default"><i class="fa fa-sign-out"></i>
                                            <a href="./logout.jsp">注销</a>
                                        </button>
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
                            <a href="../index.jsp">
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
                                        <li><a href="../userConf/UserForbidden.jsp">用户注销</a>
                                        </li>
                                        <li><a href="../userConf/lossReporting.jsp">挂失与解挂</a>
                                        </li>
                                        <li><a href="../userConf/passwordReset.jsp">重置密码</a>
                                        </li>
                                        <li><a href="../userConf/findUser.jsp">用户查询</a>
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
                                        <li><a href="../goods/categorization.jsp">分类管理</a>
                                        </li>
                                        <li><a href="../goods/attribute.jsp">属性设置</a>
                                        </li>
                                        <li><a href="../goods/addGoods.jsp">新增商品</a>
                                        </li>
                                        <li><a href="../goods/removeGoods.jsp">移除商品</a>
                                        </li>
                                        <li><a href="../goods/findGoods.jsp">商品查询</a>
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
                                        <li><a href="../bill/billManagement.jsp">订单管理</a>
                                        </li>
                                        <li><a href="../bill/findBill.jsp">订单查询</a>
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
                                        <li><a href="../security/profile.jsp">
                                            <%--todo:show administrator`s name--%>
                                            占位
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
            <div class="side-body">
                <div class="row">
                    <div class="col-xs-12">
                        <div class="card">
                            <div class="card-header">
                                <div class="card-title">
                                    <div class="title">安全设置</div>
                                </div>
                            </div>
                            <div class="card-body">
                                <div class="col-sm-4">
                                    <div class="alert fresh-color alert-warning" role="alert">
                                        <strong>
                                            这项设置只影响当前用户的安全性。
                                        </strong>
                                    </div>
                                    <div class="panel fresh-color panel-warning">
                                        <div class="panel-heading">修改管理员密码</div>
                                        <div class="panel-body" style="padding: 0;">
                                            <div class="card-body">
                                                <form class="form-horizontal">
                                                    <div class="form-group">
                                                        <label for="password1"
                                                               class="col-sm-2 control-label">密码</label>
                                                        <div class="col-sm-10">
                                                            <input type="password" class="form-control" id="password1"
                                                                   placeholder="密码">
                                                        </div>
                                                    </div>
                                                    <div class="form-group">
                                                        <label for="password2"
                                                               class="col-sm-2 control-label">确认密码</label>
                                                        <div class="col-sm-10">
                                                            <input type="password" class="form-control"
                                                                   id="password2" placeholder="确认密码">
                                                        </div>
                                                    </div>
                                                    <div class="form-group">
                                                        <div class="col-sm-offset-2 col-sm-10">
                                                            <button type="submit" class="btn btn-default"
                                                                    style="width: 150px;float: left">确认
                                                            </button>
                                                            <button type="reset" class="btn btn-default"
                                                                    style="width: 150px;float: right">重置
                                                            </button>
                                                        </div>
                                                    </div>
                                                </form>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <div class="col-sm-4">
                                    <div class="alert fresh-color alert-danger" role="alert">
                                        <strong>
                                            这项设置会影响到整站。切勿随意操作。(仅最高管理员可用)
                                        </strong>
                                    </div>
                                    <div class="panel fresh-color panel-danger">
                                        <div class="panel-heading">全站操作</div>
                                        <%
                                            if (true) {
                                        %>
                                        <div class="panel-body" style="padding: 0">
                                            <%--todo:--%>
                                            <div class="pricing-table red">
                                                <div class="pt-header">
                                                    <div class="plan-pricing">
                                                        <div class="pricing">
                                                            <span class="glyphicon glyphicon-remove" aria-hidden="true">
                                                            </span>
                                                        </div>
                                                        <div class="pricing-type"><strong>不可用</strong></div>
                                                    </div>
                                                </div>
                                                <div class="pt-body">
                                                    <h4><strong>当前用户不可使用此功能</strong></h4>
                                                    <ul class="plan-detail">
                                                        <li>请联系最高管理员</li>
                                                    </ul>
                                                </div>
                                            </div>
                                        </div>
                                        <%
                                        } else {
                                        %>
                                        <div class="panel-body">
                                            <form class="form-horizontal">
                                                <%--todo:--%>
                                                <div align="center">
                                                    <div class="checkbox3 checkbox-danger checkbox-inline checkbox-check  checkbox-circle checkbox-light">
                                                        <input type="checkbox" id="checkbox-fa-light-1">
                                                        <label for="checkbox-fa-light-1">
                                                            <strong>清除所有用户</strong>
                                                        </label>
                                                    </div>
                                                    <div class="checkbox3 checkbox-danger checkbox-inline checkbox-check  checkbox-circle checkbox-light">
                                                        <input type="checkbox" id="checkbox-fa-light-2">
                                                        <label for="checkbox-fa-light-2">
                                                            <strong>清除所有商品</strong>
                                                        </label>
                                                    </div>
                                                    <div class="checkbox3 checkbox-danger checkbox-inline checkbox-check  checkbox-circle checkbox-light">
                                                        <input type="checkbox" id="checkbox-fa-light-3">
                                                        <label for="checkbox-fa-light-3">
                                                            <strong>清除所有数据</strong>
                                                        </label>
                                                    </div>
                                                </div>
                                                <div class="form-inline" style="padding-top: 20px">
                                                    <input type="password" class="form-control" id="password3"
                                                           placeholder="管理员密码" style="width: 80%"/>
                                                    <button type="button" class="btn btn-danger" style="width:auto;">
                                                        确认
                                                    </button>
                                                </div>
                                            </form>
                                        </div>
                                        <%
                                            }
                                        %>
                                    </div>
                                </div>
                                <div class="col-sm-4">
                                    <div class="alert alert-danger" role="alert">
                                        <strong>
                                            这项设置涉及到安全性，请确认后操作。
                                        </strong>
                                    </div>
                                    <div class="panel panel-danger">
                                        <div class="panel-heading">新增管理员</div>
                                        <div class="panel-body">
                                            <%--todo:新增管理员--%>
                                            <form class="form-horizontal">
                                                <div class="form-group">
                                                    <label for="username" class="col-sm-2 control-label">用户名</label>
                                                    <div class="col-sm-10">
                                                        <input type="email" class="form-control" id="username"
                                                               placeholder="用户名">
                                                    </div>
                                                </div>
                                                <div class="form-group">
                                                    <label for="password4" class="col-sm-2 control-label">密码</label>
                                                    <div class="col-sm-10">
                                                        <input type="password" class="form-control" id="password4"
                                                               placeholder="密码">
                                                    </div>
                                                </div>
                                                <div class="form-group">
                                                    <label for="confirmPassword"
                                                           class="col-sm-2 control-label">确认密码</label>
                                                    <div class="col-sm-10">
                                                        <input type="password" class="form-control" id="confirmPassword"
                                                               placeholder="确认密码">
                                                    </div>
                                                </div>
                                                <div class="form-group">
                                                    <div class="col-sm-offset-2 col-sm-10">
                                                        <button type="submit" class="btn btn-default"
                                                                style="width: 150px;float: left">注册
                                                        </button>
                                                        <button type="reset" class="btn btn-default"
                                                                style="width: 150px;float: right">重置
                                                        </button>
                                                    </div>
                                                </div>
                                            </form>
                                        </div>
                                    </div>
                                </div>
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
<script type="text/javascript" src="../../lib/js/jquery.min.js"></script>
<script type="text/javascript" src="../../lib/js/bootstrap.min.js"></script>
<script type="text/javascript" src="../../lib/js/Chart.min.js"></script>
<script type="text/javascript" src="../../lib/js/bootstrap-switch.min.js"></script>

<script type="text/javascript" src="../../lib/js/jquery.matchHeight-min.js"></script>
<script type="text/javascript" src="../../lib/js/jquery.dataTables.min.js"></script>
<script type="text/javascript" src="../../lib/js/dataTables.bootstrap.min.js"></script>
<script type="text/javascript" src="../../lib/js/select2.full.min.js"></script>
<script type="text/javascript" src="../../lib/js/ace/ace.js"></script>
<script type="text/javascript" src="../../lib/js/ace/mode-html.js"></script>
<script type="text/javascript" src="../../lib/js/ace/theme-github.js"></script>
<!-- Javascript -->
<script type="text/javascript" src="../../js/app.js"></script>
</body>

</html>