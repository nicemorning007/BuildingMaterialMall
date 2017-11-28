<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>

<head>
    <title>Flat Admin V.2 - Free Bootstrap Admin Templates</title>
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
                            <li>Icons</li>
                            <li class="active">Glyphicons</li>
                        </ol>
                        <button type="button" class="navbar-right-expand-toggle pull-right visible-xs">
                            <i class="fa fa-th icon"></i>
                        </button>
                    </div>
                    <ul class="nav navbar-nav navbar-right">
                        <button type="button" class="navbar-right-expand-toggle pull-right visible-xs">
                            <i class="fa fa-times icon"></i>
                        </button>
                        <li class="dropdown">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false"><i class="fa fa-comments-o"></i></a>
                            <ul class="dropdown-menu animated fadeInDown">
                                <li class="title">
                                    Notification <span class="badge pull-right">0</span>
                                </li>
                                <li class="message">
                                    No new notification
                                </li>
                            </ul>
                        </li>
                        <li class="dropdown danger">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false"><i class="fa fa-star-half-o"></i> 4</a>
                            <ul class="dropdown-menu danger  animated fadeInDown">
                                <li class="title">
                                    Notification <span class="badge pull-right">4</span>
                                </li>
                                <li>
                                    <ul class="list-group notifications">
                                        <a href="#">
                                            <li class="list-group-item">
                                                <span class="badge">1</span> <i class="fa fa-exclamation-circle icon"></i> new registration
                                            </li>
                                        </a>
                                        <a href="#">
                                            <li class="list-group-item">
                                                <span class="badge success">1</span> <i class="fa fa-check icon"></i> new orders
                                            </li>
                                        </a>
                                        <a href="#">
                                            <li class="list-group-item">
                                                <span class="badge danger">2</span> <i class="fa fa-comments icon"></i> customers messages
                                            </li>
                                        </a>
                                        <a href="#">
                                            <li class="list-group-item message">
                                                view all
                                            </li>
                                        </a>
                                    </ul>
                                </li>
                            </ul>
                        </li>
                        <li class="dropdown profile">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false">Emily Hart <span class="caret"></span></a>
                            <ul class="dropdown-menu animated fadeInDown">
                                <li class="profile-img">
                                    <img src="../../img/profile/picjumbo.com_HNCK4153_resize.jpg" class="profile-img">
                                </li>
                                <li>
                                    <div class="profile-info">
                                        <h4 class="username">Emily Hart</h4>
                                        <p>emily_hart@email.com</p>
                                        <div class="btn-group margin-bottom-2x" role="group">
                                            <button type="button" class="btn btn-default"><i class="fa fa-user"></i> Profile</button>
                                            <button type="button" class="btn btn-default"><i class="fa fa-sign-out"></i> Logout</button>
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
                                <div class="icon fa fa-paper-plane"></div>
                                <div class="title">Flat Admin V.2</div>
                            </a>
                            <button type="button" class="navbar-expand-toggle pull-right visible-xs">
                                <i class="fa fa-times icon"></i>
                            </button>
                        </div>
                        <ul class="nav navbar-nav">
                            <li>
                                <a href="../index.jsp">
                                    <span class="icon fa fa-tachometer"></span><span class="title">Dashboard</span>
                                </a>
                            </li>
                            <li class="panel panel-default dropdown">
                                <a data-toggle="collapse" href="#dropdown-element">
                                    <span class="icon fa fa-desktop"></span><span class="title">UI Kits</span>
                                </a>
                                <!-- Dropdown level 1 -->
                                <div id="dropdown-element" class="panel-collapse collapse">
                                    <div class="panel-body">
                                        <ul class="nav navbar-nav">
                                            <li><a href="../ui-kits/grid.jsp">Grid</a></li>
                                            <li><a href="../ui-kits/theming.jsp">Theming</a></li>
                                            </li>
                                            <li><a href="../ui-kits/button.jsp">Buttons</a>
                                            </li>
                                            <li><a href="../ui-kits/card.jsp">Cards</a>
                                            </li>
                                            <li><a href="../ui-kits/list.jsp">Lists</a>
                                            </li>
                                            <li><a href="../ui-kits/modal.jsp">Modals</a>
                                            </li>
                                            <li><a href="../ui-kits/alert.jsp">Alerts & Toasts</a>
                                            </li>
                                            <li><a href="../ui-kits/panel.jsp">Panels</a>
                                            </li>
                                            <li><a href="../ui-kits/loader.jsp">Loaders</a>
                                            </li>
                                            <li><a href="../ui-kits/step.jsp">Tabs & Steps</a>
                                            </li>
                                            <li><a href="../ui-kits/other.jsp">Other</a>
                                            </li>
                                        </ul>
                                    </div>
                                </div>
                            </li>
                            <li class="panel panel-default dropdown">
                                <a data-toggle="collapse" href="#dropdown-table">
                                    <span class="icon fa fa-table"></span><span class="title">Table</span>
                                </a>
                                <!-- Dropdown level 1 -->
                                <div id="dropdown-table" class="panel-collapse collapse">
                                    <div class="panel-body">
                                        <ul class="nav navbar-nav">
                                            <li><a href="../table/table.jsp">Table</a>
                                            </li>
                                            <li><a href="../table/datatable.jsp">Datatable</a>
                                            </li>
                                        </ul>
                                    </div>
                                </div>
                            </li>
                            <li class="panel panel-default dropdown">
                                <a data-toggle="collapse" href="#dropdown-form">
                                    <span class="icon fa fa-file-text-o"></span><span class="title">Form</span>
                                </a>
                                <!-- Dropdown level 1 -->
                                <div id="dropdown-form" class="panel-collapse collapse">
                                    <div class="panel-body">
                                        <ul class="nav navbar-nav">
                                            <li><a href="../form/ui-kits.jsp">Form UI Kits</a>
                                            </li>

                                        </ul>
                                    </div>
                                </div>
                            </li>
                            <!-- Dropdown-->
                            <li class="panel panel-default dropdown">
                                <a data-toggle="collapse" href="#component-example">
                                    <span class="icon fa fa-cubes"></span><span class="title">Components</span>
                                </a>
                                <!-- Dropdown level 1 -->
                                <div id="component-example" class="panel-collapse collapse">
                                    <div class="panel-body">
                                        <ul class="nav navbar-nav">
                                            <li><a href="../components/pricing-table.jsp">Pricing Table</a>
                                            </li>
                                            <li><a href="../components/chartjs.jsp">Chart.JS</a>
                                            </li>
                                        </ul>
                                    </div>
                                </div>
                            </li>
                            <!-- Dropdown-->
                            <li class="panel panel-default dropdown">
                                <a data-toggle="collapse" href="#dropdown-example">
                                    <span class="icon fa fa-slack"></span><span class="title">Page Example</span>
                                </a>
                                <!-- Dropdown level 1 -->
                                <div id="dropdown-example" class="panel-collapse collapse">
                                    <div class="panel-body">
                                        <ul class="nav navbar-nav">
                                            <li><a href="../pages/login.jsp">Login</a>
                                            </li>

                                            <li><a href="../pages/index.jsp">Landing Page</a>
                                            </li>
                                        </ul>
                                    </div>
                                </div>
                            </li>
                            <!-- Dropdown-->
                            <li class="active panel panel-default dropdown">
                                <a data-toggle="collapse" href="#dropdown-icon">
                                    <span class="icon fa fa-archive"></span><span class="title">Icons</span>
                                </a>
                                <!-- Dropdown level 1 -->
                                <div id="dropdown-icon" class="panel-collapse collapse">
                                    <div class="panel-body">
                                        <ul class="nav navbar-nav">
                                            <li><a href="../icons/glyphicons.jsp">Glyphicons</a>
                                            </li>
                                            <li><a href="../icons/font-awesome.jsp">Font Awesomes</a>
                                            </li>
                                        </ul>
                                    </div>
                                </div>
                            </li>
                            <li>
                                <a href="../license.jsp">
                                    <span class="icon fa fa-thumbs-o-up"></span><span class="title">License</span>
                                </a>
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
                        <span class="title">Glyph Icons</span>
                        <div class="description">glyphicons bundle with bootstrap</div>
                    </div>
                    <div class="row">
                        <div class="col-sm-12">
                            <div class="card">
                                <div class="card-header">
                                    <div class="card-title">
                                        <div class="title">Icon Lists</div>
                                    </div>
                                    <div class="pull-right card-action">
                                        <div class="btn-group" role="group" aria-label="...">
                                            <button type="button" class="btn btn-link" data-toggle="modal" data-target="#modalCardProfileExample"><i class="fa fa-code"></i></button>
                                        </div>
                                    </div>
                                </div>
                                <div class="card-body">
                                    <ul class="icons-list">
                                        <li>
                                            <span class="glyphicon glyphicon-asterisk" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-asterisk</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-plus" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-plus</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-euro" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-euro</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-eur" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-eur</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-minus" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-minus</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-cloud" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-cloud</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-envelope" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-envelope</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-pencil" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-pencil</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-glass" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-glass</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-music" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-music</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-search" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-search</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-heart" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-heart</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-star" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-star</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-star-empty" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-star-empty</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-user" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-user</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-film" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-film</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-th-large" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-th-large</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-th" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-th</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-th-list" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-th-list</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-ok" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-ok</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-remove" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-remove</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-zoom-in" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-zoom-in</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-zoom-out" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-zoom-out</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-off" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-off</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-signal" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-signal</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-cog" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-cog</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-trash" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-trash</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-home" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-home</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-file" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-file</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-time" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-time</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-road" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-road</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-download-alt" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-download-alt</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-download" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-download</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-upload" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-upload</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-inbox" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-inbox</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-play-circle" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-play-circle</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-repeat" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-repeat</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-refresh" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-refresh</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-list-alt" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-list-alt</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-lock" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-lock</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-flag" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-flag</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-headphones" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-headphones</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-volume-off" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-volume-off</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-volume-down" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-volume-down</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-volume-up" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-volume-up</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-qrcode" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-qrcode</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-barcode" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-barcode</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-tag" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-tag</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-tags" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-tags</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-book" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-book</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-bookmark" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-bookmark</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-print" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-print</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-camera" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-camera</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-font" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-font</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-bold" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-bold</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-italic" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-italic</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-text-height" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-text-height</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-text-width" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-text-width</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-align-left" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-align-left</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-align-center" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-align-center</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-align-right" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-align-right</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-align-justify" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-align-justify</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-list" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-list</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-indent-left" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-indent-left</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-indent-right" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-indent-right</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-facetime-video" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-facetime-video</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-picture" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-picture</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-map-marker" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-map-marker</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-adjust" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-adjust</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-tint" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-tint</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-edit" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-edit</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-share" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-share</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-check" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-check</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-move" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-move</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-step-backward" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-step-backward</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-fast-backward" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-fast-backward</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-backward" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-backward</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-play" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-play</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-pause" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-pause</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-stop" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-stop</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-forward" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-forward</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-fast-forward" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-fast-forward</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-step-forward" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-step-forward</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-eject" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-eject</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-chevron-left</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-chevron-right</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-plus-sign" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-plus-sign</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-minus-sign" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-minus-sign</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-remove-sign" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-remove-sign</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-ok-sign" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-ok-sign</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-question-sign" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-question-sign</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-info-sign" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-info-sign</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-screenshot" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-screenshot</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-remove-circle" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-remove-circle</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-ok-circle" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-ok-circle</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-ban-circle" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-ban-circle</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-arrow-left" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-arrow-left</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-arrow-right" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-arrow-right</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-arrow-up" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-arrow-up</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-arrow-down" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-arrow-down</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-share-alt" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-share-alt</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-resize-full" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-resize-full</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-resize-small" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-resize-small</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-exclamation-sign" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-exclamation-sign</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-gift" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-gift</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-leaf" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-leaf</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-fire" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-fire</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-eye-open" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-eye-open</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-eye-close" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-eye-close</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-warning-sign" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-warning-sign</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-plane" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-plane</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-calendar" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-calendar</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-random" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-random</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-comment" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-comment</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-magnet" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-magnet</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-chevron-up" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-chevron-up</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-chevron-down" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-chevron-down</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-retweet" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-retweet</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-shopping-cart" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-shopping-cart</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-folder-close" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-folder-close</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-folder-open" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-folder-open</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-resize-vertical" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-resize-vertical</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-resize-horizontal" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-resize-horizontal</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-hdd" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-hdd</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-bullhorn" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-bullhorn</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-bell" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-bell</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-certificate" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-certificate</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-thumbs-up" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-thumbs-up</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-thumbs-down" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-thumbs-down</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-hand-right" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-hand-right</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-hand-left" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-hand-left</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-hand-up" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-hand-up</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-hand-down" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-hand-down</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-circle-arrow-right" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-circle-arrow-right</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-circle-arrow-left" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-circle-arrow-left</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-circle-arrow-up" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-circle-arrow-up</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-circle-arrow-down" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-circle-arrow-down</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-globe" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-globe</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-wrench" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-wrench</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-tasks" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-tasks</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-filter" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-filter</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-briefcase" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-briefcase</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-fullscreen" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-fullscreen</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-dashboard" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-dashboard</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-paperclip" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-paperclip</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-heart-empty" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-heart-empty</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-link" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-link</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-phone" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-phone</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-pushpin" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-pushpin</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-usd" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-usd</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-gbp" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-gbp</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-sort" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-sort</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-sort-by-alphabet" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-sort-by-alphabet</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-sort-by-alphabet-alt" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-sort-by-alphabet-alt</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-sort-by-order" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-sort-by-order</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-sort-by-order-alt" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-sort-by-order-alt</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-sort-by-attributes" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-sort-by-attributes</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-sort-by-attributes-alt" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-sort-by-attributes-alt</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-unchecked" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-unchecked</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-expand" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-expand</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-collapse-down" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-collapse-down</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-collapse-up" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-collapse-up</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-log-in" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-log-in</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-flash" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-flash</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-log-out" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-log-out</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-new-window" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-new-window</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-record" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-record</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-save" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-save</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-open" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-open</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-saved" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-saved</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-import" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-import</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-export" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-export</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-send" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-send</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-floppy-disk" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-floppy-disk</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-floppy-saved" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-floppy-saved</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-floppy-remove" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-floppy-remove</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-floppy-save" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-floppy-save</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-floppy-open" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-floppy-open</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-credit-card" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-credit-card</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-transfer" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-transfer</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-cutlery" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-cutlery</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-header" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-header</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-compressed" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-compressed</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-earphone" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-earphone</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-phone-alt" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-phone-alt</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-tower" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-tower</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-stats" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-stats</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-sd-video" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-sd-video</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-hd-video" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-hd-video</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-subtitles" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-subtitles</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-sound-stereo" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-sound-stereo</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-sound-dolby" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-sound-dolby</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-sound-5-1" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-sound-5-1</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-sound-6-1" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-sound-6-1</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-sound-7-1" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-sound-7-1</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-copyright-mark" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-copyright-mark</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-registration-mark" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-registration-mark</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-cloud-download" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-cloud-download</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-cloud-upload" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-cloud-upload</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-tree-conifer" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-tree-conifer</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-tree-deciduous" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-tree-deciduous</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-cd" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-cd</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-save-file" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-save-file</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-open-file" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-open-file</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-level-up" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-level-up</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-copy" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-copy</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-paste" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-paste</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-alert" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-alert</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-equalizer" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-equalizer</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-king" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-king</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-queen" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-queen</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-pawn" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-pawn</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-bishop" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-bishop</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-knight" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-knight</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-baby-formula" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-baby-formula</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-tent" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-tent</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-blackboard" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-blackboard</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-bed" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-bed</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-apple" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-apple</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-erase" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-erase</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-hourglass" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-hourglass</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-lamp" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-lamp</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-duplicate" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-duplicate</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-piggy-bank" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-piggy-bank</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-scissors" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-scissors</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-bitcoin" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-bitcoin</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-btc" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-btc</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-xbt" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-xbt</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-yen" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-yen</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-jpy" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-jpy</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-ruble" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-ruble</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-rub" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-rub</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-scale" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-scale</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-ice-lolly" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-ice-lolly</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-ice-lolly-tasted" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-ice-lolly-tasted</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-education" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-education</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-option-horizontal" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-option-horizontal</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-option-vertical" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-option-vertical</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-menu-hamburger" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-menu-hamburger</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-modal-window" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-modal-window</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-oil" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-oil</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-grain" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-grain</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-sunglasses" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-sunglasses</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-text-size" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-text-size</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-text-color" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-text-color</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-text-background" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-text-background</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-object-align-top" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-object-align-top</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-object-align-bottom" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-object-align-bottom</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-object-align-horizontal" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-object-align-horizontal</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-object-align-left" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-object-align-left</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-object-align-vertical" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-object-align-vertical</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-object-align-right" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-object-align-right</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-triangle-right" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-triangle-right</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-triangle-left" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-triangle-left</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-triangle-bottom" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-triangle-bottom</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-triangle-top" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-triangle-top</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-console" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-console</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-superscript" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-superscript</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-subscript" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-subscript</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-menu-left" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-menu-left</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-menu-right" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-menu-right</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-menu-down" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-menu-down</span>
                                        </li>
                                        <li>
                                            <span class="glyphicon glyphicon-menu-up" aria-hidden="true"></span>
                                            <span class="glyphicon-class">glyphicon glyphicon-menu-up</span>
                                        </li>
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
                <span class="pull-right">2.1 <a href="#"><i class="fa fa-long-arrow-up"></i></a></span> © 2015 Copyright.
            </div>
        </footer>
    <div>
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
    <script type="text/javascript" src="../../js/index.js"></script>
</body>

</html>