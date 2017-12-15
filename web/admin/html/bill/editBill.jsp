<%@ page import="bmm.dao.BillControlDAO" %>
<%@ page import="bmm.dao.GoodsControlDAO" %>
<%@ page import="bmm.dao.UserControlDAO" %>
<%@ page import="bmm.dao.impl.UserControlDAOImpl" %>
<%@ page import="bmm.entity.BillbaseEntity" %>
<%@ page import="bmm.utils.cookie_util.CookieUtil" %>
<%@ page import="bmm.utils.hibernate_util.SpringInjectionUtil" %>
<%@ page import="java.util.List" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
                                        <button type="button" class="btn btn-default"><i class="fa fa-user"></i>
                                            <a href="${pageContext.request.contextPath}/admin/html/security/profile.jsp">安全设置</a>
                                        </button>
                                        <button type="button" class="btn btn-default"><i class="fa fa-sign-out"></i>
                                            <a href="${pageContext.request.contextPath}/admin/html/security/logout.jsp">注销</a>
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
                            <a href="${pageContext.request.contextPath}/admin/html/index.jsp">
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
                                        <li>
                                            <a href="${pageContext.request.contextPath}/admin/html/userConf/UserForbidden.jsp">用户注销</a>
                                        </li>
                                        <li>
                                            <a href="${pageContext.request.contextPath}/admin/html/userConf/lossReporting.jsp">挂失与解挂</a>
                                        </li>
                                        <li>
                                            <a href="${pageContext.request.contextPath}/admin/html/userConf/passwordReset.jsp">重置密码</a>
                                        </li>
                                        <li>
                                            <a href="${pageContext.request.contextPath}/admin/html/userConf/findUser.jsp">用户查询</a>
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
                                        <li>
                                            <a href="${pageContext.request.contextPath}/admin/html/goods/categorization.jsp">分类管理</a>
                                        </li>
                                        <li><a href="${pageContext.request.contextPath}/admin/html/goods/attribute.jsp">属性设置</a>
                                        </li>
                                        <li><a href="${pageContext.request.contextPath}/admin/html/goods/addGoods.jsp">新增商品</a>
                                        </li>
                                        <li>
                                            <a href="${pageContext.request.contextPath}/admin/html/goods/removeGoods.jsp">移除商品</a>
                                        </li>
                                        <li><a href="${pageContext.request.contextPath}/admin/html/goods/findGoods.jsp">商品查询</a>
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
                                        <li>
                                            <a href="${pageContext.request.contextPath}/admin/html/bill/billManagement.jsp">订单管理</a>
                                        </li>
                                        <li><a href="${pageContext.request.contextPath}/admin/html/bill/findBill.jsp">订单查询</a>
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
                                        <li>
                                            <a href="${pageContext.request.contextPath}/admin/html/security/profile.jsp">
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
    </div>
    <!-- Main Content -->
    <div class="container-fluid">
        <div class="side-body">
            <div class="page-title">
                <span class="title">Datatable</span>
                <div class="description"></div>
            </div>
            <div class="row">
                <div class="col-xs-12">
                    <div class="card">
                        <div class="card-header">

                            <div class="card-title">
                                <div class="title">订单管理
                                    <span style="background-color: #93D52D"><s:property value="info"/></span>
                                </div>
                            </div>
                        </div>
                        <div class="card-body">
                            <div>
                                <p>查看和编辑订单的具体信息
                                    <span style="background-color: #93D52D">
                                         <s:property value="info"/>
                                    </span>
                                </p>
                                <div class="table-responsive">
                                    <%
                                        BillControlDAO billControlDAO =
                                                (BillControlDAO) SpringInjectionUtil.getDao("billControlDao");
                                        List<BillbaseEntity> list = null;
                                        if ((list = billControlDAO.showAllBills()) != null) {
                                            int billId = Integer.parseInt(request.getAttribute("billId").toString());
                                            UserControlDAO userControlDAO = new UserControlDAOImpl();
                                            GoodsControlDAO goodsControlDAO =
                                                    (GoodsControlDAO) SpringInjectionUtil.getDao("goodsControlDao");
                                    %>
                                    <table class="table table-bordered table-striped">
                                        <thead>
                                        <tr>
                                            <th></th>
                                            <th>
                                                属性
                                            </th>
                                            <th>
                                                名称
                                            </th>
                                            <th>
                                                编辑
                                            </th>
                                            <th>
                                                确认
                                            </th>
                                        </tr>
                                        </thead>
                                        <tbody>
                                        <tr>
                                            <th class="text-nowrap" scope="row">商品</th>
                                            <td>
                                                ID:<%=billControlDAO.getGoodsIdById(billId)%>
                                            </td>
                                            <td>
                                                <%=goodsControlDAO.getNameById(billControlDAO.getGoodsIdById(billId))%>
                                            </td>
                                            <td colspan="2">
                                                <div class="alert alert-danger" role="alert"
                                                     style="margin-bottom: 0px;width: initial;margin-right: 0;padding-top: 5px;padding-bottom: 5px">
                                                    <strong>此项内容不允许编辑</strong>
                                                </div>
                                            </td>
                                        </tr>
                                        <tr>
                                            <th class="text-nowrap" scope="row">用户</th>
                                            <td>ID:<%=billControlDAO.getUserIdById(billId)%>
                                            </td>
                                            <td><%=userControlDAO.getUsernameById(billControlDAO.getUserIdById(billId))%>
                                            </td>
                                            <td colspan="2">
                                                <div class="alert alert-danger" role="alert"
                                                     style="margin-bottom: 0;width: initial;margin-right: 0;padding-top: 5px;padding-bottom: 5px">
                                                    <strong>此项内容不允许编辑</strong>
                                                </div>
                                            </td>
                                        </tr>
                                        <tr>
                                            <th class="text-nowrap" scope="row">订单状态</th>
                                            <td colspan="2">
                                                <%
                                                    String state = "";
                                                    switch (billControlDAO.getStateById(billId)) {
                                                        case 0:
                                                            state = "已下单但未付款";
                                                            out.print(state);
                                                            break;
                                                        case 1:
                                                            state = "付款成功但未发货";
                                                            out.print(state);
                                                            break;
                                                        case 2:
                                                            state = "付款成功且已发货";
                                                            out.print(state);
                                                            break;
                                                        case 3:
                                                            state = "订单已完成";
                                                            out.print(state);
                                                            break;
                                                        case 4:
                                                            state = "订单已取消";
                                                            out.print(state);
                                                            break;
                                                    }
                                                %>
                                            </td>
                                            <td>
                                                <s:form action="billControlAction_editState" method="POST">
                                                <select name="state" title="" style="width: 200px;">
                                                    <option value="0">已下单但未付款</option>
                                                    <option value="1">付款成功但未发货</option>
                                                    <option value="2">付款成功且已发货</option>
                                                    <option value="3">订单已完成</option>
                                                    <option value="4">订单已取消</option>
                                                </select>
                                            </td>
                                            <td>
                                                <s:submit value="确认修改" cssClass="btn btn-primary"/>
                                            </td>
                                            </s:form>
                                        </tr>
                                        <tr>
                                            <th class="text-nowrap" scope="row">总价</th>
                                            <td colspan="2">
                                                <%=billControlDAO.getTotalById(billId)%>
                                            </td>
                                            <td>
                                                <s:form action="billControlAction_editTotal" method="POST">
                                                <input name="total" maxlength="8" class="form-control"
                                                       style="width:30%;"
                                                       onkeyup="value=value.replace(/[^\d\.]/g,'')"/>
                                            </td>
                                            <td>
                                                <s:submit value="确认修改" cssClass="btn btn-primary"/>
                                            </td>
                                            </s:form>
                                        </tr>
                                        <tr>
                                            <th class="text-nowrap" scope="row">订单创建时间</th>
                                            <td colspan="4">
                                                <%=billControlDAO.getTimeById(billId)%>
                                            </td>
                                        </tr>
                                        <tr>
                                            <th class="text-nowrap" scope="row">收件人</th>
                                            <td colspan="2">
                                                <%=billControlDAO.getReceiverById(billId)%>
                                            </td>
                                            <td>
                                                <s:form action="billControlAction_editReceiver" method="POST">
                                                <input name="receiver" maxlength="8" class="form-control"
                                                       style="width:30%"/>
                                            </td>
                                            <td>
                                                <s:submit value="确认修改" cssClass="btn btn-primary"/>
                                            </td>
                                            </s:form>
                                        </tr>
                                        </tbody>
                                    </table>
                                    <%

                                    } else {

                                    %>
                                    <div class="alert fresh-color alert-danger alert-dismissible fade in" role="alert">
                                        <button type="button" class="close" data-dismiss="alert" aria-label="Close">
                                            <span aria-hidden="true">×</span></button>
                                        <h4 id="oh-snap!-you-got-an-error!">服务器出错了！<a
                                                class="anchorjs-link" href="#oh-snap!-you-got-an-error!"><span
                                                class="anchorjs-icon"></span></a></h4>
                                        <p>如果你是系统管理员，可检查服务器日志确定出错原因。或者点击下面的重试按钮再试一次</p>
                                        <p>
                                            <button type="button" class="btn btn-default"
                                                    onclick="window.history.go(-1)">重试
                                            </button>
                                        </p>
                                    </div>
                                    <%

                                        }

                                    %>
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
</body>

</html>