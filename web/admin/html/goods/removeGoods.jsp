<%@ page import="bmm.dao.CategorizationControlDAO" %>
<%@ page import="bmm.dao.GoodsControlDAO" %>
<%@ page import="bmm.dao.impl.CategorizationControlDAOImpl" %>
<%@ page import="bmm.dao.impl.GoodsControlDAOImpl" %>
<%@ page import="bmm.entity.GoodsbaseEntity" %>
<%@ page import="bmm.utils.cookie_util.CookieUtil" %>
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
                                <div class="title">移除商品
                                    <span style="background-color: #93D52D">
                                        <s:property value="message"/>
                                    </span>
                                </div>
                            </div>
                        </div>
                        <div class="card-body">
                            <table class="datatable table table-striped" cellspacing="0" width="100%"
                                   style="table-layout: fixed;word-wrap:break-word;word-break:break-all;">
                                <thead>
                                <tr>
                                    <th>商品名称</th>
                                    <th>预览图</th>
                                    <th>产地</th>
                                    <th>单价</th>
                                    <th>销量</th>
                                    <th>分类</th>
                                    <th>移除?</th>
                                </tr>
                                </thead>
                                <tfoot>
                                <tr>
                                    <th>商品名称</th>
                                    <th>预览图</th>
                                    <th>产地</th>
                                    <th>单价</th>
                                    <th>销量</th>
                                    <th>分类</th>
                                    <th>移除?</th>
                                </tr>
                                </tfoot>
                                <tbody>
                                <%
                                    GoodsControlDAO goodsControlDAO = new GoodsControlDAOImpl();
                                    CategorizationControlDAO categorizationControlDAO = null;
                                    List<GoodsbaseEntity> list = null;
                                    if (goodsControlDAO.showAllGoods() != null) {
                                        list = goodsControlDAO.showAllGoods();
                                        categorizationControlDAO = new CategorizationControlDAOImpl();
                                        String path;
                                        for (GoodsbaseEntity goodsbaseEntity : list) {
                                            if (goodsControlDAO.getPicPathByGoodsId(goodsbaseEntity.getId(), 1) != null) {
                                                path = goodsControlDAO.getPicPathByGoodsId(goodsbaseEntity.getId(), 1);
                                            } else {
                                                path = "/images/nopre.jpg";
                                            }
                                %>
                                <tr>
                                    <s:form action="goodsControlAction_deleteGoods" method="POST">
                                        <input type="hidden" name="goodsId" value="<%=goodsbaseEntity.getId()%>"/>
                                        <td><%=goodsbaseEntity.getName()%>
                                        </td>
                                        <td>
                                            <div style="width: 170px;height: 180px">
                                                <img src="<%=request.getScheme()+"://"+request.getServerName()+":"
                                                +request.getServerPort()+path%>" style="width: 100%;height: 100%">
                                            </div>
                                        </td>
                                        <td><%=goodsbaseEntity.getProducing()%>
                                        </td>
                                        <td><%=goodsbaseEntity.getPrice()%>
                                        </td>
                                        <td><%=goodsbaseEntity.getSale()%>
                                        </td>
                                        <td><%=categorizationControlDAO.getCateNameById(goodsbaseEntity.getCate())%>
                                        </td>
                                        <td>
                                            <s:submit value="移除" cssClass="btn btn-sm btn-default"/>
                                        </td>
                                    </s:form>
                                </tr>
                                <%
                                    }
                                } else {
                                %>
                                <tr>
                                    <td></td>
                                    <td></td>
                                    <td></td>
                                    <td></td>
                                    <td></td>
                                    <td></td>
                                    <td></td>
                                </tr>
                                <%
                                    }
                                %>
                                </tbody>
                            </table>
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
