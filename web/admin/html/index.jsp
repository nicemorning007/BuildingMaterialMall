<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page import="bmm.dao.BillControlDAO" %>
<%@ page import="bmm.dao.GoodsControlDAO" %>
<%@ page import="bmm.dao.MessageControlDao" %>
<%@ page import="bmm.dao.UserControlDAO" %>
<%@ page import="bmm.entity.MessageEntity" %>
<%@ page import="bmm.utils.cookie_util.CookieUtil" %>
<%@ page import="bmm.utils.hibernate_util.SpringInjectionUtil" %>
<%@ page import="java.util.List" %>
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
                                        <a href="${pageContext.request.contextPath}/admin/html/security/profile.jsp">
                                            <button type="button" class="btn btn-default"><i class="fa fa-user"></i>
                                                安全设置
                                            </button>
                                        </a>
                                        <a href="/adminControlAction_logout.action"/>">
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
                            <a href="#">
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
        <!-- Main Content -->
        <%
            GoodsControlDAO goodsControlDAO = (GoodsControlDAO) SpringInjectionUtil.getDao("goodsControlDao");
            UserControlDAO userControlDAO = (UserControlDAO) SpringInjectionUtil.getDao("userControlDao");
            BillControlDAO billControlDAO = (BillControlDAO) SpringInjectionUtil.getDao("billControlDao");
        %>
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
                                            <%=userControlDAO.getUserCount()%>
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
                                            <%=goodsControlDAO.getGoodsCount()%>
                                        </div>
                                        <div class="sub-title">总商品数</div>
                                    </div>
                                    <div class="clear-both"></div>
                                </div>
                            </div>
                        </a>
                    </div>
                    <div class="col-lg-3 col-md-6 col-sm-6 col-xs-12">
                        <a href="${pageContext.request.contextPath}/admin/html/bill/findBill.jsp">
                            <div class="card green summary-inline">
                                <div class="card-body">
                                    <i class="icon fa fa-tags fa-4x"></i>
                                    <div class="content">
                                        <div class="title">
                                            <%=billControlDAO.getBillCount()%>
                                        </div>
                                        <div class="sub-title">总订单数</div>
                                    </div>
                                    <div class="clear-both"></div>
                                </div>
                            </div>
                        </a>
                    </div>
                    <div class="col-lg-3 col-md-6 col-sm-6 col-xs-12">
                        <a href="${pageContext.request.contextPath}/admin/html/bill/findBill.jsp">
                            <div class="card blue summary-inline">
                                <div class="card-body">
                                    <i class="icon fa fa-share-alt fa-4x"></i>
                                    <div class="content">
                                        <div class="title">
                                            <%=billControlDAO.getBillTotalCount()%>0
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
                    <div class="panel panel-default">
                        <div class="panel-heading"><%=username%>，欢迎登陆建材商城后台管理系统</div>
                        <div class="panel-body">
                            <p>
                                在建材商城后台管理系统中,可以为用户提供重置密码，注销挂失的涉及安全的操作。
                            </p>
                            <p>
                                对于商品可以为每个商品进行编辑，新增商品和分类的编辑等功能。
                            </p>
                            <p>
                                对于订单可以帮助用户更改收件人和收件地址。但一旦订单已发货将无法修改除交易额外的任何信息。
                            </p>
                            <p>
                                安全设置中，可以修改本账户的登陆密码。并新增管理员。
                            </p>
                            <strong>但全站操作中，只允许最高管理员进行操作，如果你不是最高管理员但需要进行此类操作。
                                <p>
                                    请联系最高管理员进行操作。
                                </p></strong>
                        </div>
                    </div>
                </div>
                <%
                    MessageControlDao messageControlDao = (MessageControlDao) SpringInjectionUtil.getDao("messageControlDao");
                    List<MessageEntity> list = messageControlDao.getAll();
                    if (list != null) {
                        if (list.size() > 0) {
                            for (MessageEntity messageEntity : list) {
                                if (messageEntity.getState() == 1) {
                %>
                <div class="panel panel-default">
                    <div class="panel-heading">
                        <h3 class="panel-title"><%=messageEntity.getName()%>
                        </h3>
                    </div>
                    <div class="panel-body">
                        <%=messageEntity.getContact()%>
                    </div>
                </div>
                <%
                } else {
                %>
                <s:form action="adminControlAction_message">
                    <input type="hidden" value="<%=messageEntity.getId()%>" name="messageId"/>
                    <div class="panel panel-danger">
                        <div class="panel-heading"><%=messageEntity.getName()%>
                        </div>
                        <div class="panel-body">
                            <%=messageEntity.getContact()%>
                            <s:submit cssStyle="float: right" cssClass="btn btn-success" value="标记为已处理"/>
                        </div>
                    </div>
                </s:form>

                <%
                                }
                            }
                        }
                    }
                %>
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
