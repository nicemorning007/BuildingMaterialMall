<%@ taglib prefix="s" uri="/struts-tags" %>
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
                                        <button type="button" class="btn btn-default"><i class="fa fa-user"></i>安全设置
                                        </button>
                                        <button type="button" class="btn btn-default"><i class="fa fa-sign-out"></i>
                                            注销
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
                                    <div class="title">用户管理</div>
                                </div>
                            </div>
                            <div class="card-body">
                                <div class="panel panel-default">
                                    <!-- Default panel contents -->
                                    <div class="panel-heading">用户注销</div>
                                    <div class="panel-body">
                                        <form action="" method="post">
                                            <label class="panel-showright">输入用户名以查找：
                                                <%--todo:edit action--%>
                                                <input type="text"/>
                                                <input type="submit"/>
                                            </label>
                                        </form>
                                    </div>
                                </div>
                                <!-- Table -->
                                <table class="table table-checkbox">
                                    <thead>
                                    <tr>
                                        <th>#</th>
                                        <th>用户名</th>
                                        <th>昵称</th>
                                        <th>最后登录时间</th>
                                        <th>注销？</th>
                                    </tr>
                                    </thead>
                                    <tbody>
                                    <%--todo:show detail--%>
                                    <s:form name="test" action="checkboxCheckAction" theme="simple">
                                        <%--todo:分页显示用户 get获取page值--%>
                                        <%
                                            for (int i = 0; i < 6; i++) {
                                        %>
                                        <tr>

                                            <th scope="row">1</th>
                                            <td>
                                                    <%--todo:show username--%>
                                                <%="username" + i%>
                                            </td>
                                            <td>
                                                    <%--todo:show nickname--%>
                                                <%="nickname" + i%>
                                            </td>
                                            <td>
                                                    <%--todo:show last login time--%>
                                                <%="lastlogintime" + i%>
                                            </td>
                                            <td>
                                                <input type="checkbox" name="forb" value="<%="forb"+i%>">
                                            </td>
                                        </tr>

                                        <%
                                            }
                                        %>
                                        <tr>
                                            <%
                                                int i;
                                                if (request.getParameter("page") != null) {
                                                    String nowPage = request.getParameter("page");
                                                    i = Integer.parseInt(nowPage);
                                                } else {
                                                    i=1;
                                                }
                                            %>
                                            <td></td>
                                            <td>
                                                <div align="right">
                                                    <%
                                                        if (i > 1) {
                                                    %>
                                                    <a href="UserForbidden.jsp?page=<%=i-1%>">上一页</a>
                                                    <%
                                                        }
                                                    %>
                                                </div>
                                            </td>
                                            <td>
                                                <div align="center">
                                                    <%--todo:show all pages--%>
                                                    1 2 3 4 5 6 7 8 9
                                                </div>
                                            </td>
                                            <td>
                                                <div align="left">
                                                    <a href="./UserForbidden.jsp?page=<%=i+1%>">
                                                        下一页
                                                    </a>
                                                </div>
                                            </td>
                                            <td>
                                                <s:submit value="注销"/>
                                            </td>
                                        </tr>
                                    </s:form>
                                    </tbody>
                                </table>
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
        <span class="pull-right">2.1 <a href="#"><i class="fa fa-long-arrow-up"></i></a></span> © 2015 Copyright.
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