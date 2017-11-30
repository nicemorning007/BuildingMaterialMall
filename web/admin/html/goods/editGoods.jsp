<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %>
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
                                        <button type="button" class="btn btn-default"><i class="fa fa-user"></i>
                                            <a href="../security/profile.jsp">安全设置</a>
                                        </button>
                                        <button type="button" class="btn btn-default"><i class="fa fa-sign-out"></i>
                                            <a href="../security/logout.jsp">注销</a>
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
                <div class="page-title">
                    <span class="title">商品管理</span>
                </div>
                <%--todo: form action--%>
                <s:form class="form-inline" action="addGoodsTest" method="post" theme="simple">
                    <div class="row">
                        <div class="col-xs-12">
                            <div class="card">
                                <div class="card-header">
                                    <div class="card-title">
                                        <div class="title">新增商品</div>
                                    </div>
                                </div>
                                <div class="card-body">
                                    <div class="sub-title">商品名称</div>
                                    <div>
                                        <s:textfield name="name" cssClass="form-control" style="width:100%" placeholder="<%=name%>"/>
                                    </div>
                                    <div class="sub-title">商品属性<span class="description">(支持html标签)</span></div>
                                    <div>
                                        <s:textarea name="info" cssClass="form-control" rows="15" cssStyle="resize: none;width: 100%" placeholder="<%=info%>"/>
                                    </div>
                                    <div class="sub-title">单价<span class="description">(只允许输入数字)</span></div>
                                    <div>
                                        <s:textfield name="price" cssClass="form-control" style="width:10%" onkeyup="value=value.replace(/[^\d\.]/g,'')" maxlength="8" placeholder="<%=price%>"/>
                                    </div>
                                        <%--todo:tag--%>
                                    <div class="sub-title">参加活动</div>
                                    <div>
                                        <div class="checkbox3 checkbox-success checkbox-inline checkbox-check checkbox-round  checkbox-light">
                                            <input type="checkbox" id="checkbox-fa-light-1" name="tag" value="促销折扣" <%=tag1%>>
                                            <label for="checkbox-fa-light-1">
                                                促销折扣
                                            </label>
                                        </div>
                                        <div class="checkbox3 checkbox-success checkbox-inline checkbox-check checkbox-round  checkbox-light">
                                            <input type="checkbox" id="checkbox-fa-light-2" name="tag" value="批发优惠" <%=tag2%>>
                                            <label for="checkbox-fa-light-2">
                                                批发优惠
                                            </label>
                                        </div>
                                    </div>
                                    <div class="sub-title">选择分类 <span class="description">(新增分类请在分类管理处理)</span></div>
                                    <div>
                                    </div>
                                    <select name="cate" style="width: 150px">
                                        <%
                                            List<String> list = new ArrayList<>();
                                            String s1 = "s1";
                                            String s2 = "s2";
                                            String s3 = "s3";
                                            String s4 = "s4";
                                            String s5 = "s5";
                                            list.add(s1);
                                            list.add(s2);
                                            list.add(s3);
                                            list.add(s4);
                                            list.add(s5);
                                            for (String s:list){
                                        %>
                                        <option value="<%=s%>" <%=selected%>><%=s%></option>
                                            <%--<option value="HI">Hawaii</option>--%>
                                            <%--<option value="AK" selected="selected">Alaska</option>--%>
                                        <%
                                            }
                                        %>
                                    </select>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-xs-12">
                            <div class="card">
                                <div class="card-header">
                                    <div class="card-title">
                                        <div class="title">产地</div>
                                    </div>
                                </div>
                                <div class="card-body">
                                    <div class="form-group">
                                        <label>厂商</label>
                                        <input type="text" class="form-control" name="manufacturer"
                                               placeholder="<%=manufacturer%>">
                                    </div>
                                    <div class="form-group">
                                        <label>产地</label>
                                        <input type="text" class="form-control" id="producing"
                                               placeholder="<%=producing%>">
                                    </div>
                                    <div class="card-body">
                                        <div class="form-group">
                                            <label>规格</label>
                                            <input type="text" class="form-control" name="manufacturer"
                                                   placeholder="<%=format%>">
                                        </div>
                                        <div class="form-group">
                                            <label>计量单位</label>
                                            <input type="text" class="form-control" name="manufacturer"
                                                   placeholder="<%=units%>">
                                        </div>
                                        <div class="form-group">
                                            <label>起售数量</label>
                                            <input type="text" class="form-control" name="manufacturer"
                                                   placeholder="<%=begin%>">
                                        </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-xs-12">
                            <div class="card">
                                <div class="card-body">
                                        <%--todo:file upload--%>
                                    <div class="form-group">
                                        <label>上传商品大图</label>
                                        <input type="file" name="exampleInputFile">
                                        <p class="help-block">显示在商品预览页的图</p>
                                    </div>
                                    <button type="submit" class="btn btn-default">上传</button>
                                    <%
                                        int i = 0;
                                        for (; i < 6; i++) {
                                    %>
                                    <div class="form-group">
                                        <label>上传商品图片<%=i + 1%>
                                        </label>
                                        <input type="file" name="exampleInputFile">
                                        <p class="help-block">显示在商品详情页的图</p>
                                    </div>
                                    <button type="submit" class="btn btn-default">上传</button>
                                    <%
                                        }
                                    %>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-xs-12">
                            <div class="card">
                                <div class="card-body">
                                    <s:submit value="提交修改" cssClass="btn btn-success"/>
                                </div>
                            </div>
                        </div>
                    </div>
                </s:form>
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
