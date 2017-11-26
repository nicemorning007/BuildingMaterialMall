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
                            <li class="active">Font Awesomes</li>
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
                    <span class="title">Font Awesome</span>
                    <div class="description">Flat Admin V.2 bundle with Font Awesome 4.3</div>
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
                                <div class="sub-title">Web Application Icons</div>
                                <ul class="icons-list">
                                    <li><i class="fa fa-adjust"></i><div>adjust</div>
                                    </li><li><i class="fa fa-anchor"></i><div>anchor</div>
                                    </li><li><i class="fa fa-archive"></i><div>archive</div>
                                    </li><li><i class="fa fa-area-chart"></i><div>area-chart</div>
                                    </li><li><i class="fa fa-arrows"></i><div>arrows</div>
                                    </li><li><i class="fa fa-arrows-h"></i><div>arrows-h</div>
                                    </li><li><i class="fa fa-arrows-v"></i><div>arrows-v</div>
                                    </li><li><i class="fa fa-asterisk"></i><div>asterisk</div>
                                    </li><li><i class="fa fa-at"></i><div>at</div>
                                    </li><li><i class="fa fa-automobile"></i><div>automobile <span class="text-muted">(alias)</span></div>
                                    </li><li><i class="fa fa-ban"></i><div>ban</div>
                                    </li><li><i class="fa fa-bank"></i><div>bank <span class="text-muted">(alias)</span></div>
                                    </li><li><i class="fa fa-bar-chart"></i><div>bar-chart</div>
                                    </li><li><i class="fa fa-bar-chart-o"></i><div>bar-chart-o <span class="text-muted">(alias)</span></div>
                                    </li><li><i class="fa fa-barcode"></i><div>barcode</div>
                                    </li><li><i class="fa fa-bars"></i><div>bars</div>
                                    </li><li><i class="fa fa-bed"></i><div>bed</div>
                                    </li><li><i class="fa fa-beer"></i><div>beer</div>
                                    </li><li><i class="fa fa-bell"></i><div>bell</div>
                                    </li><li><i class="fa fa-bell-o"></i><div>bell-o</div>
                                    </li><li><i class="fa fa-bell-slash"></i><div>bell-slash</div>
                                    </li><li><i class="fa fa-bell-slash-o"></i><div>bell-slash-o</div>
                                    </li><li><i class="fa fa-bicycle"></i><div>bicycle</div>
                                    </li><li><i class="fa fa-binoculars"></i><div>binoculars</div>
                                    </li><li><i class="fa fa-birthday-cake"></i><div>birthday-cake</div>
                                    </li><li><i class="fa fa-bolt"></i><div>bolt</div>
                                    </li><li><i class="fa fa-bomb"></i><div>bomb</div>
                                    </li><li><i class="fa fa-book"></i><div>book</div>
                                    </li><li><i class="fa fa-bookmark"></i><div>bookmark</div>
                                    </li><li><i class="fa fa-bookmark-o"></i><div>bookmark-o</div>
                                    </li><li><i class="fa fa-briefcase"></i><div>briefcase</div>
                                    </li><li><i class="fa fa-bug"></i><div>bug</div>
                                    </li><li><i class="fa fa-building"></i><div>building</div>
                                    </li><li><i class="fa fa-building-o"></i><div>building-o</div>
                                    </li><li><i class="fa fa-bullhorn"></i><div>bullhorn</div>
                                    </li><li><i class="fa fa-bullseye"></i><div>bullseye</div>
                                    </li><li><i class="fa fa-bus"></i><div>bus</div>
                                    </li><li><i class="fa fa-cab"></i><div>cab <span class="text-muted">(alias)</span></div>
                                    </li><li><i class="fa fa-calculator"></i><div>calculator</div>
                                    </li><li><i class="fa fa-calendar"></i><div>calendar</div>
                                    </li><li><i class="fa fa-calendar-o"></i><div>calendar-o</div>
                                    </li><li><i class="fa fa-camera"></i><div>camera</div>
                                    </li><li><i class="fa fa-camera-retro"></i><div>camera-retro</div>
                                    </li><li><i class="fa fa-car"></i><div>car</div>
                                    </li><li><i class="fa fa-caret-square-o-down"></i><div>caret-square-o-down</div>
                                    </li><li><i class="fa fa-caret-square-o-left"></i><div>caret-square-o-left</div>
                                    </li><li><i class="fa fa-caret-square-o-right"></i><div>caret-square-o-right</div>
                                    </li><li><i class="fa fa-caret-square-o-up"></i><div>caret-square-o-up</div>
                                    </li><li><i class="fa fa-cart-arrow-down"></i><div>cart-arrow-down</div>
                                    </li><li><i class="fa fa-cart-plus"></i><div>cart-plus</div>
                                    </li><li><i class="fa fa-cc"></i><div>cc</div>
                                    </li><li><i class="fa fa-certificate"></i><div>certificate</div>
                                    </li><li><i class="fa fa-check"></i><div>check</div>
                                    </li><li><i class="fa fa-check-circle"></i><div>check-circle</div>
                                    </li><li><i class="fa fa-check-circle-o"></i><div>check-circle-o</div>
                                    </li><li><i class="fa fa-check-square"></i><div>check-square</div>
                                    </li><li><i class="fa fa-check-square-o"></i><div>check-square-o</div>
                                    </li><li><i class="fa fa-child"></i><div>child</div>
                                    </li><li><i class="fa fa-circle"></i><div>circle</div>
                                    </li><li><i class="fa fa-circle-o"></i><div>circle-o</div>
                                    </li><li><i class="fa fa-circle-o-notch"></i><div>circle-o-notch</div>
                                    </li><li><i class="fa fa-circle-thin"></i><div>circle-thin</div>
                                    </li><li><i class="fa fa-clock-o"></i><div>clock-o</div>
                                    </li><li><i class="fa fa-close"></i><div>close <span class="text-muted">(alias)</span></div>
                                    </li><li><i class="fa fa-cloud"></i><div>cloud</div>
                                    </li><li><i class="fa fa-cloud-download"></i><div>cloud-download</div>
                                    </li><li><i class="fa fa-cloud-upload"></i><div>cloud-upload</div>
                                    </li><li><i class="fa fa-code"></i><div>code</div>
                                    </li><li><i class="fa fa-code-fork"></i><div>code-fork</div>
                                    </li><li><i class="fa fa-coffee"></i><div>coffee</div>
                                    </li><li><i class="fa fa-cog"></i><div>cog</div>
                                    </li><li><i class="fa fa-cogs"></i><div>cogs</div>
                                    </li><li><i class="fa fa-comment"></i><div>comment</div>
                                    </li><li><i class="fa fa-comment-o"></i><div>comment-o</div>
                                    </li><li><i class="fa fa-comments"></i><div>comments</div>
                                    </li><li><i class="fa fa-comments-o"></i><div>comments-o</div>
                                    </li><li><i class="fa fa-compass"></i><div>compass</div>
                                    </li><li><i class="fa fa-copyright"></i><div>copyright</div>
                                    </li><li><i class="fa fa-credit-card"></i><div>credit-card</div>
                                    </li><li><i class="fa fa-crop"></i><div>crop</div>
                                    </li><li><i class="fa fa-crosshairs"></i><div>crosshairs</div>
                                    </li><li><i class="fa fa-cube"></i><div>cube</div>
                                    </li><li><i class="fa fa-cubes"></i><div>cubes</div>
                                    </li><li><i class="fa fa-cutlery"></i><div>cutlery</div>
                                    </li><li><i class="fa fa-dashboard"></i><div>dashboard <span class="text-muted">(alias)</span></div>
                                    </li><li><i class="fa fa-database"></i><div>database</div>
                                    </li><li><i class="fa fa-desktop"></i><div>desktop</div>
                                    </li><li><i class="fa fa-diamond"></i><div>diamond</div>
                                    </li><li><i class="fa fa-dot-circle-o"></i><div>dot-circle-o</div>
                                    </li><li><i class="fa fa-download"></i><div>download</div>
                                    </li><li><i class="fa fa-edit"></i><div>edit <span class="text-muted">(alias)</span></div>
                                    </li><li><i class="fa fa-ellipsis-h"></i><div>ellipsis-h</div>
                                    </li><li><i class="fa fa-ellipsis-v"></i><div>ellipsis-v</div>
                                    </li><li><i class="fa fa-envelope"></i><div>envelope</div>
                                    </li><li><i class="fa fa-envelope-o"></i><div>envelope-o</div>
                                    </li><li><i class="fa fa-envelope-square"></i><div>envelope-square</div>
                                    </li><li><i class="fa fa-eraser"></i><div>eraser</div>
                                    </li><li><i class="fa fa-exchange"></i><div>exchange</div>
                                    </li><li><i class="fa fa-exclamation"></i><div>exclamation</div>
                                    </li><li><i class="fa fa-exclamation-circle"></i><div>exclamation-circle</div>
                                    </li><li><i class="fa fa-exclamation-triangle"></i><div>exclamation-triangle</div>
                                    </li><li><i class="fa fa-external-link"></i><div>external-link</div>
                                    </li><li><i class="fa fa-external-link-square"></i><div>external-link-square</div>
                                    </li><li><i class="fa fa-eye"></i><div>eye</div>
                                    </li><li><i class="fa fa-eye-slash"></i><div>eye-slash</div>
                                    </li><li><i class="fa fa-eyedropper"></i><div>eyedropper</div>
                                    </li><li><i class="fa fa-fax"></i><div>fax</div>
                                    </li><li><i class="fa fa-female"></i><div>female</div>
                                    </li><li><i class="fa fa-fighter-jet"></i><div>fighter-jet</div>
                                    </li><li><i class="fa fa-file-archive-o"></i><div>file-archive-o</div>
                                    </li><li><i class="fa fa-file-audio-o"></i><div>file-audio-o</div>
                                    </li><li><i class="fa fa-file-code-o"></i><div>file-code-o</div>
                                    </li><li><i class="fa fa-file-excel-o"></i><div>file-excel-o</div>
                                    </li><li><i class="fa fa-file-image-o"></i><div>file-image-o</div>
                                    </li><li><i class="fa fa-file-movie-o"></i><div>file-movie-o <span class="text-muted">(alias)</span></div>
                                    </li><li><i class="fa fa-file-pdf-o"></i><div>file-pdf-o</div>
                                    </li><li><i class="fa fa-file-photo-o"></i><div>file-photo-o <span class="text-muted">(alias)</span></div>
                                    </li><li><i class="fa fa-file-picture-o"></i><div>file-picture-o <span class="text-muted">(alias)</span></div>
                                    </li><li><i class="fa fa-file-powerpoint-o"></i><div>file-powerpoint-o</div>
                                    </li><li><i class="fa fa-file-sound-o"></i><div>file-sound-o <span class="text-muted">(alias)</span></div>
                                    </li><li><i class="fa fa-file-video-o"></i><div>file-video-o</div>
                                    </li><li><i class="fa fa-file-word-o"></i><div>file-word-o</div>
                                    </li><li><i class="fa fa-file-zip-o"></i><div>file-zip-o <span class="text-muted">(alias)</span></div>
                                    </li><li><i class="fa fa-film"></i><div>film</div>
                                    </li><li><i class="fa fa-filter"></i><div>filter</div>
                                    </li><li><i class="fa fa-fire"></i><div>fire</div>
                                    </li><li><i class="fa fa-fire-extinguisher"></i><div>fire-extinguisher</div>
                                    </li><li><i class="fa fa-flag"></i><div>flag</div>
                                    </li><li><i class="fa fa-flag-checkered"></i><div>flag-checkered</div>
                                    </li><li><i class="fa fa-flag-o"></i><div>flag-o</div>
                                    </li><li><i class="fa fa-flash"></i><div>flash <span class="text-muted">(alias)</span></div>
                                    </li><li><i class="fa fa-flask"></i><div>flask</div>
                                    </li><li><i class="fa fa-folder"></i><div>folder</div>
                                    </li><li><i class="fa fa-folder-o"></i><div>folder-o</div>
                                    </li><li><i class="fa fa-folder-open"></i><div>folder-open</div>
                                    </li><li><i class="fa fa-folder-open-o"></i><div>folder-open-o</div>
                                    </li><li><i class="fa fa-frown-o"></i><div>frown-o</div>
                                    </li><li><i class="fa fa-futbol-o"></i><div>futbol-o</div>
                                    </li><li><i class="fa fa-gamepad"></i><div>gamepad</div>
                                    </li><li><i class="fa fa-gavel"></i><div>gavel</div>
                                    </li><li><i class="fa fa-gear"></i><div>gear <span class="text-muted">(alias)</span></div>
                                    </li><li><i class="fa fa-gears"></i><div>gears <span class="text-muted">(alias)</span></div>
                                    </li><li><i class="fa fa-genderless"></i><div>genderless <span class="text-muted">(alias)</span></div>
                                    </li><li><i class="fa fa-gift"></i><div>gift</div>
                                    </li><li><i class="fa fa-glass"></i><div>glass</div>
                                    </li><li><i class="fa fa-globe"></i><div>globe</div>
                                    </li><li><i class="fa fa-graduation-cap"></i><div>graduation-cap</div>
                                    </li><li><i class="fa fa-group"></i><div>group <span class="text-muted">(alias)</span></div>
                                    </li><li><i class="fa fa-hdd-o"></i><div>hdd-o</div>
                                    </li><li><i class="fa fa-headphones"></i><div>headphones</div>
                                    </li><li><i class="fa fa-heart"></i><div>heart</div>
                                    </li><li><i class="fa fa-heart-o"></i><div>heart-o</div>
                                    </li><li><i class="fa fa-heartbeat"></i><div>heartbeat</div>
                                    </li><li><i class="fa fa-history"></i><div>history</div>
                                    </li><li><i class="fa fa-home"></i><div>home</div>
                                    </li><li><i class="fa fa-hotel"></i><div>hotel <span class="text-muted">(alias)</span></div>
                                    </li><li><i class="fa fa-image"></i><div>image <span class="text-muted">(alias)</span></div>
                                    </li><li><i class="fa fa-inbox"></i><div>inbox</div>
                                    </li><li><i class="fa fa-info"></i><div>info</div>
                                    </li><li><i class="fa fa-info-circle"></i><div>info-circle</div>
                                    </li><li><i class="fa fa-institution"></i><div>institution <span class="text-muted">(alias)</span></div>
                                    </li><li><i class="fa fa-key"></i><div>key</div>
                                    </li><li><i class="fa fa-keyboard-o"></i><div>keyboard-o</div>
                                    </li><li><i class="fa fa-language"></i><div>language</div>
                                    </li><li><i class="fa fa-laptop"></i><div>laptop</div>
                                    </li><li><i class="fa fa-leaf"></i><div>leaf</div>
                                    </li><li><i class="fa fa-legal"></i><div>legal <span class="text-muted">(alias)</span></div>
                                    </li><li><i class="fa fa-lemon-o"></i><div>lemon-o</div>
                                    </li><li><i class="fa fa-level-down"></i><div>level-down</div>
                                    </li><li><i class="fa fa-level-up"></i><div>level-up</div>
                                    </li><li><i class="fa fa-life-bouy"></i><div>life-bouy <span class="text-muted">(alias)</span></div>
                                    </li><li><i class="fa fa-life-buoy"></i><div>life-buoy <span class="text-muted">(alias)</span></div>
                                    </li><li><i class="fa fa-life-ring"></i><div>life-ring</div>
                                    </li><li><i class="fa fa-life-saver"></i><div>life-saver <span class="text-muted">(alias)</span></div>
                                    </li><li><i class="fa fa-lightbulb-o"></i><div>lightbulb-o</div>
                                    </li><li><i class="fa fa-line-chart"></i><div>line-chart</div>
                                    </li><li><i class="fa fa-location-arrow"></i><div>location-arrow</div>
                                    </li><li><i class="fa fa-lock"></i><div>lock</div>
                                    </li><li><i class="fa fa-magic"></i><div>magic</div>
                                    </li><li><i class="fa fa-magnet"></i><div>magnet</div>
                                    </li><li><i class="fa fa-mail-forward"></i><div>mail-forward <span class="text-muted">(alias)</span></div>
                                    </li><li><i class="fa fa-mail-reply"></i><div>mail-reply <span class="text-muted">(alias)</span></div>
                                    </li><li><i class="fa fa-mail-reply-all"></i><div>mail-reply-all <span class="text-muted">(alias)</span></div>
                                    </li><li><i class="fa fa-male"></i><div>male</div>
                                    </li><li><i class="fa fa-map-marker"></i><div>map-marker</div>
                                    </li><li><i class="fa fa-meh-o"></i><div>meh-o</div>
                                    </li><li><i class="fa fa-microphone"></i><div>microphone</div>
                                    </li><li><i class="fa fa-microphone-slash"></i><div>microphone-slash</div>
                                    </li><li><i class="fa fa-minus"></i><div>minus</div>
                                    </li><li><i class="fa fa-minus-circle"></i><div>minus-circle</div>
                                    </li><li><i class="fa fa-minus-square"></i><div>minus-square</div>
                                    </li><li><i class="fa fa-minus-square-o"></i><div>minus-square-o</div>
                                    </li><li><i class="fa fa-mobile"></i><div>mobile</div>
                                    </li><li><i class="fa fa-mobile-phone"></i><div>mobile-phone <span class="text-muted">(alias)</span></div>
                                    </li><li><i class="fa fa-money"></i><div>money</div>
                                    </li><li><i class="fa fa-moon-o"></i><div>moon-o</div>
                                    </li><li><i class="fa fa-mortar-board"></i><div>mortar-board <span class="text-muted">(alias)</span></div>
                                    </li><li><i class="fa fa-motorcycle"></i><div>motorcycle</div>
                                    </li><li><i class="fa fa-music"></i><div>music</div>
                                    </li><li><i class="fa fa-navicon"></i><div>navicon <span class="text-muted">(alias)</span></div>
                                    </li><li><i class="fa fa-newspaper-o"></i><div>newspaper-o</div>
                                    </li><li><i class="fa fa-paint-brush"></i><div>paint-brush</div>
                                    </li><li><i class="fa fa-paper-plane"></i><div>paper-plane</div>
                                    </li><li><i class="fa fa-paper-plane-o"></i><div>paper-plane-o</div>
                                    </li><li><i class="fa fa-paw"></i><div>paw</div>
                                    </li><li><i class="fa fa-pencil"></i><div>pencil</div>
                                    </li><li><i class="fa fa-pencil-square"></i><div>pencil-square</div>
                                    </li><li><i class="fa fa-pencil-square-o"></i><div>pencil-square-o</div>
                                    </li><li><i class="fa fa-phone"></i><div>phone</div>
                                    </li><li><i class="fa fa-phone-square"></i><div>phone-square</div>
                                    </li><li><i class="fa fa-photo"></i><div>photo <span class="text-muted">(alias)</span></div>
                                    </li><li><i class="fa fa-picture-o"></i><div>picture-o</div>
                                    </li><li><i class="fa fa-pie-chart"></i><div>pie-chart</div>
                                    </li><li><i class="fa fa-plane"></i><div>plane</div>
                                    </li><li><i class="fa fa-plug"></i><div>plug</div>
                                    </li><li><i class="fa fa-plus"></i><div>plus</div>
                                    </li><li><i class="fa fa-plus-circle"></i><div>plus-circle</div>
                                    </li><li><i class="fa fa-plus-square"></i><div>plus-square</div>
                                    </li><li><i class="fa fa-plus-square-o"></i><div>plus-square-o</div>
                                    </li><li><i class="fa fa-power-off"></i><div>power-off</div>
                                    </li><li><i class="fa fa-print"></i><div>print</div>
                                    </li><li><i class="fa fa-puzzle-piece"></i><div>puzzle-piece</div>
                                    </li><li><i class="fa fa-qrcode"></i><div>qrcode</div>
                                    </li><li><i class="fa fa-question"></i><div>question</div>
                                    </li><li><i class="fa fa-question-circle"></i><div>question-circle</div>
                                    </li><li><i class="fa fa-quote-left"></i><div>quote-left</div>
                                    </li><li><i class="fa fa-quote-right"></i><div>quote-right</div>
                                    </li><li><i class="fa fa-random"></i><div>random</div>
                                    </li><li><i class="fa fa-recycle"></i><div>recycle</div>
                                    </li><li><i class="fa fa-refresh"></i><div>refresh</div>
                                    </li><li><i class="fa fa-remove"></i><div>remove <span class="text-muted">(alias)</span></div>
                                    </li><li><i class="fa fa-reorder"></i><div>reorder <span class="text-muted">(alias)</span></div>
                                    </li><li><i class="fa fa-reply"></i><div>reply</div>
                                    </li><li><i class="fa fa-reply-all"></i><div>reply-all</div>
                                    </li><li><i class="fa fa-retweet"></i><div>retweet</div>
                                    </li><li><i class="fa fa-road"></i><div>road</div>
                                    </li><li><i class="fa fa-rocket"></i><div>rocket</div>
                                    </li><li><i class="fa fa-rss"></i><div>rss</div>
                                    </li><li><i class="fa fa-rss-square"></i><div>rss-square</div>
                                    </li><li><i class="fa fa-search"></i><div>search</div>
                                    </li><li><i class="fa fa-search-minus"></i><div>search-minus</div>
                                    </li><li><i class="fa fa-search-plus"></i><div>search-plus</div>
                                    </li><li><i class="fa fa-send"></i><div>send <span class="text-muted">(alias)</span></div>
                                    </li><li><i class="fa fa-send-o"></i><div>send-o <span class="text-muted">(alias)</span></div>
                                    </li><li><i class="fa fa-server"></i><div>server</div>
                                    </li><li><i class="fa fa-share"></i><div>share</div>
                                    </li><li><i class="fa fa-share-alt"></i><div>share-alt</div>
                                    </li><li><i class="fa fa-share-alt-square"></i><div>share-alt-square</div>
                                    </li><li><i class="fa fa-share-square"></i><div>share-square</div>
                                    </li><li><i class="fa fa-share-square-o"></i><div>share-square-o</div>
                                    </li><li><i class="fa fa-shield"></i><div>shield</div>
                                    </li><li><i class="fa fa-ship"></i><div>ship</div>
                                    </li><li><i class="fa fa-shopping-cart"></i><div>shopping-cart</div>
                                    </li><li><i class="fa fa-sign-in"></i><div>sign-in</div>
                                    </li><li><i class="fa fa-sign-out"></i><div>sign-out</div>
                                    </li><li><i class="fa fa-signal"></i><div>signal</div>
                                    </li><li><i class="fa fa-sitemap"></i><div>sitemap</div>
                                    </li><li><i class="fa fa-sliders"></i><div>sliders</div>
                                    </li><li><i class="fa fa-smile-o"></i><div>smile-o</div>
                                    </li><li><i class="fa fa-soccer-ball-o"></i><div>soccer-ball-o <span class="text-muted">(alias)</span></div>
                                    </li><li><i class="fa fa-sort"></i><div>sort</div>
                                    </li><li><i class="fa fa-sort-alpha-asc"></i><div>sort-alpha-asc</div>
                                    </li><li><i class="fa fa-sort-alpha-desc"></i><div>sort-alpha-desc</div>
                                    </li><li><i class="fa fa-sort-amount-asc"></i><div>sort-amount-asc</div>
                                    </li><li><i class="fa fa-sort-amount-desc"></i><div>sort-amount-desc</div>
                                    </li><li><i class="fa fa-sort-asc"></i><div>sort-asc</div>
                                    </li><li><i class="fa fa-sort-desc"></i><div>sort-desc</div>
                                    </li><li><i class="fa fa-sort-down"></i><div>sort-down <span class="text-muted">(alias)</span></div>
                                    </li><li><i class="fa fa-sort-numeric-asc"></i><div>sort-numeric-asc</div>
                                    </li><li><i class="fa fa-sort-numeric-desc"></i><div>sort-numeric-desc</div>
                                    </li><li><i class="fa fa-sort-up"></i><div>sort-up <span class="text-muted">(alias)</span></div>
                                    </li><li><i class="fa fa-space-shuttle"></i><div>space-shuttle</div>
                                    </li><li><i class="fa fa-spinner"></i><div>spinner</div>
                                    </li><li><i class="fa fa-spoon"></i><div>spoon</div>
                                    </li><li><i class="fa fa-square"></i><div>square</div>
                                    </li><li><i class="fa fa-square-o"></i><div>square-o</div>
                                    </li><li><i class="fa fa-star"></i><div>star</div>
                                    </li><li><i class="fa fa-star-half"></i><div>star-half</div>
                                    </li><li><i class="fa fa-star-half-empty"></i><div>star-half-empty <span class="text-muted">(alias)</span></div>
                                    </li><li><i class="fa fa-star-half-full"></i><div>star-half-full <span class="text-muted">(alias)</span></div>
                                    </li><li><i class="fa fa-star-half-o"></i><div>star-half-o</div>
                                    </li><li><i class="fa fa-star-o"></i><div>star-o</div>
                                    </li><li><i class="fa fa-street-view"></i><div>street-view</div>
                                    </li><li><i class="fa fa-suitcase"></i><div>suitcase</div>
                                    </li><li><i class="fa fa-sun-o"></i><div>sun-o</div>
                                    </li><li><i class="fa fa-support"></i><div>support <span class="text-muted">(alias)</span></div>
                                    </li><li><i class="fa fa-tablet"></i><div>tablet</div>
                                    </li><li><i class="fa fa-tachometer"></i><div>tachometer</div>
                                    </li><li><i class="fa fa-tag"></i><div>tag</div>
                                    </li><li><i class="fa fa-tags"></i><div>tags</div>
                                    </li><li><i class="fa fa-tasks"></i><div>tasks</div>
                                    </li><li><i class="fa fa-taxi"></i><div>taxi</div>
                                    </li><li><i class="fa fa-terminal"></i><div>terminal</div>
                                    </li><li><i class="fa fa-thumb-tack"></i><div>thumb-tack</div>
                                    </li><li><i class="fa fa-thumbs-down"></i><div>thumbs-down</div>
                                    </li><li><i class="fa fa-thumbs-o-down"></i><div>thumbs-o-down</div>
                                    </li><li><i class="fa fa-thumbs-o-up"></i><div>thumbs-o-up</div>
                                    </li><li><i class="fa fa-thumbs-up"></i><div>thumbs-up</div>
                                    </li><li><i class="fa fa-ticket"></i><div>ticket</div>
                                    </li><li><i class="fa fa-times"></i><div>times</div>
                                    </li><li><i class="fa fa-times-circle"></i><div>times-circle</div>
                                    </li><li><i class="fa fa-times-circle-o"></i><div>times-circle-o</div>
                                    </li><li><i class="fa fa-tint"></i><div>tint</div>
                                    </li><li><i class="fa fa-toggle-down"></i><div>toggle-down <span class="text-muted">(alias)</span></div>
                                    </li><li><i class="fa fa-toggle-left"></i><div>toggle-left <span class="text-muted">(alias)</span></div>
                                    </li><li><i class="fa fa-toggle-off"></i><div>toggle-off</div>
                                    </li><li><i class="fa fa-toggle-on"></i><div>toggle-on</div>
                                    </li><li><i class="fa fa-toggle-right"></i><div>toggle-right <span class="text-muted">(alias)</span></div>
                                    </li><li><i class="fa fa-toggle-up"></i><div>toggle-up <span class="text-muted">(alias)</span></div>
                                    </li><li><i class="fa fa-trash"></i><div>trash</div>
                                    </li><li><i class="fa fa-trash-o"></i><div>trash-o</div>
                                    </li><li><i class="fa fa-tree"></i><div>tree</div>
                                    </li><li><i class="fa fa-trophy"></i><div>trophy</div>
                                    </li><li><i class="fa fa-truck"></i><div>truck</div>
                                    </li><li><i class="fa fa-tty"></i><div>tty</div>
                                    </li><li><i class="fa fa-umbrella"></i><div>umbrella</div>
                                    </li><li><i class="fa fa-university"></i><div>university</div>
                                    </li><li><i class="fa fa-unlock"></i><div>unlock</div>
                                    </li><li><i class="fa fa-unlock-alt"></i><div>unlock-alt</div>
                                    </li><li><i class="fa fa-unsorted"></i><div>unsorted <span class="text-muted">(alias)</span></div>
                                    </li><li><i class="fa fa-upload"></i><div>upload</div>
                                    </li><li><i class="fa fa-user"></i><div>user</div>
                                    </li><li><i class="fa fa-user-plus"></i><div>user-plus</div>
                                    </li><li><i class="fa fa-user-secret"></i><div>user-secret</div>
                                    </li><li><i class="fa fa-user-times"></i><div>user-times</div>
                                    </li><li><i class="fa fa-users"></i><div>users</div>
                                    </li><li><i class="fa fa-video-camera"></i><div>video-camera</div>
                                    </li><li><i class="fa fa-volume-down"></i><div>volume-down</div>
                                    </li><li><i class="fa fa-volume-off"></i><div>volume-off</div>
                                    </li><li><i class="fa fa-volume-up"></i><div>volume-up</div>
                                    </li><li><i class="fa fa-warning"></i><div>warning <span class="text-muted">(alias)</span></div>
                                    </li><li><i class="fa fa-wheelchair"></i><div>wheelchair</div>
                                    </li><li><i class="fa fa-wifi"></i><div>wifi</div>
                                    </li><li><i class="fa fa-wrench"></i><div>wrench</div>
                                    </li>
                                </ul>
                                <div class="sub-title">Transportation Icons</div>
                                <ul class="icons-list">
                                    <li><i class="fa fa-ambulance"></i><div>ambulance</div>
                                    </li><li><i class="fa fa-automobile"></i><div>automobile <span class="text-muted">(alias)</span></div>
                                    </li><li><i class="fa fa-bicycle"></i><div>bicycle</div>
                                    </li><li><i class="fa fa-bus"></i><div>bus</div>
                                    </li><li><i class="fa fa-cab"></i><div>cab <span class="text-muted">(alias)</span></div>
                                    </li><li><i class="fa fa-car"></i><div>car</div>
                                    </li><li><i class="fa fa-fighter-jet"></i><div>fighter-jet</div>
                                    </li><li><i class="fa fa-motorcycle"></i><div>motorcycle</div>
                                    </li><li><i class="fa fa-plane"></i><div>plane</div>
                                    </li><li><i class="fa fa-rocket"></i><div>rocket</div>
                                    </li><li><i class="fa fa-ship"></i><div>ship</div>
                                    </li><li><i class="fa fa-space-shuttle"></i><div>space-shuttle</div>
                                    </li><li><i class="fa fa-subway"></i><div>subway</div>
                                    </li><li><i class="fa fa-taxi"></i><div>taxi</div>
                                    </li><li><i class="fa fa-train"></i><div>train</div>
                                    </li><li><i class="fa fa-truck"></i><div>truck</div>
                                    </li><li><i class="fa fa-wheelchair"></i><div>wheelchair</div>
                                    </li>
                                </ul>
                                <div class="sub-title">Gender Icons</div>
                                <ul class="icons-list">
                                    </li><li><i class="fa fa-circle-thin"></i><div>circle-thin</div>
                                    </li><li><i class="fa fa-genderless"></i><div>genderless <span class="text-muted">(alias)</span></div>
                                    </li><li><i class="fa fa-mars"></i><div>mars</div>
                                    </li><li><i class="fa fa-mars-double"></i><div>mars-double</div>
                                    </li><li><i class="fa fa-mars-stroke"></i><div>mars-stroke</div>
                                    </li><li><i class="fa fa-mars-stroke-h"></i><div>mars-stroke-h</div>
                                    </li><li><i class="fa fa-mars-stroke-v"></i><div>mars-stroke-v</div>
                                    </li><li><i class="fa fa-mercury"></i><div>mercury</div>
                                    </li><li><i class="fa fa-neuter"></i><div>neuter</div>
                                    </li><li><i class="fa fa-transgender"></i><div>transgender</div>
                                    </li><li><i class="fa fa-transgender-alt"></i><div>transgender-alt</div>
                                    </li><li><i class="fa fa-venus"></i><div>venus</div>
                                    </li><li><i class="fa fa-venus-double"></i><div>venus-double</div>
                                    </li><li><i class="fa fa-venus-mars"></i><div>venus-mars</div>
                                </li>
                                </ul>
                                <div class="sub-title">File Type Icons</div>
                                <ul class="icons-list">
                                    </li><li><i class="fa fa-file"></i><div>file</div>
                                    </li><li><i class="fa fa-file-archive-o"></i><div>file-archive-o</div>
                                    </li><li><i class="fa fa-file-audio-o"></i><div>file-audio-o</div>
                                    </li><li><i class="fa fa-file-code-o"></i><div>file-code-o</div>
                                    </li><li><i class="fa fa-file-excel-o"></i><div>file-excel-o</div>
                                    </li><li><i class="fa fa-file-image-o"></i><div>file-image-o</div>
                                    </li><li><i class="fa fa-file-movie-o"></i><div>file-movie-o <span class="text-muted">(alias)</span></div>
                                    </li><li><i class="fa fa-file-o"></i><div>file-o</div>
                                    </li><li><i class="fa fa-file-pdf-o"></i><div>file-pdf-o</div>
                                    </li><li><i class="fa fa-file-photo-o"></i><div>file-photo-o <span class="text-muted">(alias)</span></div>
                                    </li><li><i class="fa fa-file-picture-o"></i><div>file-picture-o <span class="text-muted">(alias)</span></div>
                                    </li><li><i class="fa fa-file-powerpoint-o"></i><div>file-powerpoint-o</div>
                                    </li><li><i class="fa fa-file-sound-o"></i><div>file-sound-o <span class="text-muted">(alias)</span></div>
                                    </li><li><i class="fa fa-file-text"></i><div>file-text</div>
                                    </li><li><i class="fa fa-file-text-o"></i><div>file-text-o</div>
                                    </li><li><i class="fa fa-file-video-o"></i><div>file-video-o</div>
                                    </li><li><i class="fa fa-file-word-o"></i><div>file-word-o</div>
                                    </li><li><i class="fa fa-file-zip-o"></i><div>file-zip-o <span class="text-muted">(alias)</span></div>
                                    </li>
                                </ul>
                                <div class="sub-title">Spinner Icons</div>
                                <ul class="icons-list">
                                    </li><li><i class="fa fa-circle-o-notch"></i><div>circle-o-notch</div>
                                    </li><li><i class="fa fa-cog"></i><div>cog</div>
                                    </li><li><i class="fa fa-gear"></i><div>gear <span class="text-muted">(alias)</span></div>
                                    </li><li><i class="fa fa-refresh"></i><div>refresh</div>
                                    </li><li><i class="fa fa-spinner"></i><div>spinner</div>
                                    </li>
                                </ul>
                                <div class="sub-title">Form Control Icons</div>
                                <ul class="icons-list">
                                    </li><li><i class="fa fa-check-square"></i><div>check-square</div>
                                    </li><li><i class="fa fa-check-square-o"></i><div>check-square-o</div>
                                    </li><li><i class="fa fa-circle"></i><div>circle</div>
                                    </li><li><i class="fa fa-circle-o"></i><div>circle-o</div>
                                    </li><li><i class="fa fa-dot-circle-o"></i><div>dot-circle-o</div>
                                    </li><li><i class="fa fa-minus-square"></i><div>minus-square</div>
                                    </li><li><i class="fa fa-minus-square-o"></i><div>minus-square-o</div>
                                    </li><li><i class="fa fa-plus-square"></i><div>plus-square</div>
                                    </li><li><i class="fa fa-plus-square-o"></i><div>plus-square-o</div>
                                    </li><li><i class="fa fa-square"></i><div>square</div>
                                    </li><li><i class="fa fa-square-o"></i><div>square-o</div>
                                    </li>
                                </ul>
                                <div class="sub-title">Payment Icons</div>
                                <ul class="icons-list">
                                    </li><li><i class="fa fa-cc-amex"></i><div>cc-amex</div>
                                    </li><li><i class="fa fa-cc-discover"></i><div>cc-discover</div>
                                    </li><li><i class="fa fa-cc-mastercard"></i><div>cc-mastercard</div>
                                    </li><li><i class="fa fa-cc-paypal"></i><div>cc-paypal</div>
                                    </li><li><i class="fa fa-cc-stripe"></i><div>cc-stripe</div>
                                    </li><li><i class="fa fa-cc-visa"></i><div>cc-visa</div>
                                    </li><li><i class="fa fa-credit-card"></i><div>credit-card</div>
                                    </li><li><i class="fa fa-google-wallet"></i><div>google-wallet</div>
                                    </li><li><i class="fa fa-paypal"></i><div>paypal</div>
                                    </li>
                                </ul>
                                <div class="sub-title">Chart Icons</div>
                                <ul class="icons-list">
                                    </li><li><i class="fa fa-area-chart"></i><div>area-chart</div>
                                    </li><li><i class="fa fa-bar-chart"></i><div>bar-chart</div>
                                    </li><li><i class="fa fa-bar-chart-o"></i><div>bar-chart-o <span class="text-muted">(alias)</span></div>
                                    </li><li><i class="fa fa-line-chart"></i><div>line-chart</div>
                                    </li><li><i class="fa fa-pie-chart"></i><div>pie-chart</div>
                                    </li>
                                </ul>
                                <div class="sub-title">Currency Icons</div>
                                <ul class="icons-list">
                                    </li><li><i class="fa fa-bitcoin"></i><div>bitcoin <span class="text-muted">(alias)</span></div>
                                    </li><li><i class="fa fa-btc"></i><div>btc</div>
                                    </li><li><i class="fa fa-cny"></i><div>cny <span class="text-muted">(alias)</span></div>
                                    </li><li><i class="fa fa-dollar"></i><div>dollar <span class="text-muted">(alias)</span></div>
                                    </li><li><i class="fa fa-eur"></i><div>eur</div>
                                    </li><li><i class="fa fa-euro"></i><div>euro <span class="text-muted">(alias)</span></div>
                                    </li><li><i class="fa fa-gbp"></i><div>gbp</div>
                                    </li><li><i class="fa fa-ils"></i><div>ils</div>
                                    </li><li><i class="fa fa-inr"></i><div>inr</div>
                                    </li><li><i class="fa fa-jpy"></i><div>jpy</div>
                                    </li><li><i class="fa fa-krw"></i><div>krw</div>
                                    </li><li><i class="fa fa-money"></i><div>money</div>
                                    </li><li><i class="fa fa-rmb"></i><div>rmb <span class="text-muted">(alias)</span></div>
                                    </li><li><i class="fa fa-rouble"></i><div>rouble <span class="text-muted">(alias)</span></div>
                                    </li><li><i class="fa fa-rub"></i><div>rub</div>
                                    </li><li><i class="fa fa-ruble"></i><div>ruble <span class="text-muted">(alias)</span></div>
                                    </li><li><i class="fa fa-rupee"></i><div>rupee <span class="text-muted">(alias)</span></div>
                                    </li><li><i class="fa fa-shekel"></i><div>shekel <span class="text-muted">(alias)</span></div>
                                    </li><li><i class="fa fa-sheqel"></i><div>sheqel <span class="text-muted">(alias)</span></div>
                                    </li><li><i class="fa fa-try"></i><div>try</div>
                                    </li><li><i class="fa fa-turkish-lira"></i><div>turkish-lira <span class="text-muted">(alias)</span></div>
                                    </li><li><i class="fa fa-usd"></i><div>usd</div>
                                    </li><li><i class="fa fa-won"></i><div>won <span class="text-muted">(alias)</span></div>
                                    </li><li><i class="fa fa-yen"></i><div>yen <span class="text-muted">(alias)</span></div>
                                    </li>
                                </ul>
                                <div class="sub-title">Text Editor Icons</div>
                                <ul class="icons-list">
                                    </li><li><i class="fa fa-align-center"></i><div>align-center</div>
                                    </li><li><i class="fa fa-align-justify"></i><div>align-justify</div>
                                    </li><li><i class="fa fa-align-left"></i><div>align-left</div>
                                    </li><li><i class="fa fa-align-right"></i><div>align-right</div>
                                    </li><li><i class="fa fa-bold"></i><div>bold</div>
                                    </li><li><i class="fa fa-chain"></i><div>chain <span class="text-muted">(alias)</span></div>
                                    </li><li><i class="fa fa-chain-broken"></i><div>chain-broken</div>
                                    </li><li><i class="fa fa-clipboard"></i><div>clipboard</div>
                                    </li><li><i class="fa fa-columns"></i><div>columns</div>
                                    </li><li><i class="fa fa-copy"></i><div>copy <span class="text-muted">(alias)</span></div>
                                    </li><li><i class="fa fa-cut"></i><div>cut <span class="text-muted">(alias)</span></div>
                                    </li><li><i class="fa fa-dedent"></i><div>dedent <span class="text-muted">(alias)</span></div>
                                    </li><li><i class="fa fa-eraser"></i><div>eraser</div>
                                    </li><li><i class="fa fa-file"></i><div>file</div>
                                    </li><li><i class="fa fa-file-o"></i><div>file-o</div>
                                    </li><li><i class="fa fa-file-text"></i><div>file-text</div>
                                    </li><li><i class="fa fa-file-text-o"></i><div>file-text-o</div>
                                    </li><li><i class="fa fa-files-o"></i><div>files-o</div>
                                    </li><li><i class="fa fa-floppy-o"></i><div>floppy-o</div>
                                    </li><li><i class="fa fa-font"></i><div>font</div>
                                    </li><li><i class="fa fa-header"></i><div>header</div>
                                    </li><li><i class="fa fa-indent"></i><div>indent</div>
                                    </li><li><i class="fa fa-italic"></i><div>italic</div>
                                    </li><li><i class="fa fa-link"></i><div>link</div>
                                    </li><li><i class="fa fa-list"></i><div>list</div>
                                    </li><li><i class="fa fa-list-alt"></i><div>list-alt</div>
                                    </li><li><i class="fa fa-list-ol"></i><div>list-ol</div>
                                    </li><li><i class="fa fa-list-ul"></i><div>list-ul</div>
                                    </li><li><i class="fa fa-outdent"></i><div>outdent</div>
                                    </li><li><i class="fa fa-paperclip"></i><div>paperclip</div>
                                    </li><li><i class="fa fa-paragraph"></i><div>paragraph</div>
                                    </li><li><i class="fa fa-paste"></i><div>paste <span class="text-muted">(alias)</span></div>
                                    </li><li><i class="fa fa-repeat"></i><div>repeat</div>
                                    </li><li><i class="fa fa-rotate-left"></i><div>rotate-left <span class="text-muted">(alias)</span></div>
                                    </li><li><i class="fa fa-rotate-right"></i><div>rotate-right <span class="text-muted">(alias)</span></div>
                                    </li><li><i class="fa fa-save"></i><div>save <span class="text-muted">(alias)</span></div>
                                    </li><li><i class="fa fa-scissors"></i><div>scissors</div>
                                    </li><li><i class="fa fa-strikethrough"></i><div>strikethrough</div>
                                    </li><li><i class="fa fa-subscript"></i><div>subscript</div>
                                    </li><li><i class="fa fa-superscript"></i><div>superscript</div>
                                    </li><li><i class="fa fa-table"></i><div>table</div>
                                    </li><li><i class="fa fa-text-height"></i><div>text-height</div>
                                    </li><li><i class="fa fa-text-width"></i><div>text-width</div>
                                    </li><li><i class="fa fa-th"></i><div>th</div>
                                    </li><li><i class="fa fa-th-large"></i><div>th-large</div>
                                    </li><li><i class="fa fa-th-list"></i><div>th-list</div>
                                    </li><li><i class="fa fa-underline"></i><div>underline</div>
                                    </li><li><i class="fa fa-undo"></i><div>undo</div>
                                    </li><li><i class="fa fa-unlink"></i><div>unlink <span class="text-muted">(alias)</span></div>
                                    </li>
                                </ul>
                                <div class="sub-title">Directional Icons</div>
                                <ul class="icons-list">
                                    </li><li><i class="fa fa-angle-double-down"></i><div>angle-double-down</div>
                                    </li><li><i class="fa fa-angle-double-left"></i><div>angle-double-left</div>
                                    </li><li><i class="fa fa-angle-double-right"></i><div>angle-double-right</div>
                                    </li><li><i class="fa fa-angle-double-up"></i><div>angle-double-up</div>
                                    </li><li><i class="fa fa-angle-down"></i><div>angle-down</div>
                                    </li><li><i class="fa fa-angle-left"></i><div>angle-left</div>
                                    </li><li><i class="fa fa-angle-right"></i><div>angle-right</div>
                                    </li><li><i class="fa fa-angle-up"></i><div>angle-up</div>
                                    </li><li><i class="fa fa-arrow-circle-down"></i><div>arrow-circle-down</div>
                                    </li><li><i class="fa fa-arrow-circle-left"></i><div>arrow-circle-left</div>
                                    </li><li><i class="fa fa-arrow-circle-o-down"></i><div>arrow-circle-o-down</div>
                                    </li><li><i class="fa fa-arrow-circle-o-left"></i><div>arrow-circle-o-left</div>
                                    </li><li><i class="fa fa-arrow-circle-o-right"></i><div>arrow-circle-o-right</div>
                                    </li><li><i class="fa fa-arrow-circle-o-up"></i><div>arrow-circle-o-up</div>
                                    </li><li><i class="fa fa-arrow-circle-right"></i><div>arrow-circle-right</div>
                                    </li><li><i class="fa fa-arrow-circle-up"></i><div>arrow-circle-up</div>
                                    </li><li><i class="fa fa-arrow-down"></i><div>arrow-down</div>
                                    </li><li><i class="fa fa-arrow-left"></i><div>arrow-left</div>
                                    </li><li><i class="fa fa-arrow-right"></i><div>arrow-right</div>
                                    </li><li><i class="fa fa-arrow-up"></i><div>arrow-up</div>
                                    </li><li><i class="fa fa-arrows"></i><div>arrows</div>
                                    </li><li><i class="fa fa-arrows-alt"></i><div>arrows-alt</div>
                                    </li><li><i class="fa fa-arrows-h"></i><div>arrows-h</div>
                                    </li><li><i class="fa fa-arrows-v"></i><div>arrows-v</div>
                                    </li><li><i class="fa fa-caret-down"></i><div>caret-down</div>
                                    </li><li><i class="fa fa-caret-left"></i><div>caret-left</div>
                                    </li><li><i class="fa fa-caret-right"></i><div>caret-right</div>
                                    </li><li><i class="fa fa-caret-square-o-down"></i><div>caret-square-o-down</div>
                                    </li><li><i class="fa fa-caret-square-o-left"></i><div>caret-square-o-left</div>
                                    </li><li><i class="fa fa-caret-square-o-right"></i><div>caret-square-o-right</div>
                                    </li><li><i class="fa fa-caret-square-o-up"></i><div>caret-square-o-up</div>
                                    </li><li><i class="fa fa-caret-up"></i><div>caret-up</div>
                                    </li><li><i class="fa fa-chevron-circle-down"></i><div>chevron-circle-down</div>
                                    </li><li><i class="fa fa-chevron-circle-left"></i><div>chevron-circle-left</div>
                                    </li><li><i class="fa fa-chevron-circle-right"></i><div>chevron-circle-right</div>
                                    </li><li><i class="fa fa-chevron-circle-up"></i><div>chevron-circle-up</div>
                                    </li><li><i class="fa fa-chevron-down"></i><div>chevron-down</div>
                                    </li><li><i class="fa fa-chevron-left"></i><div>chevron-left</div>
                                    </li><li><i class="fa fa-chevron-right"></i><div>chevron-right</div>
                                    </li><li><i class="fa fa-chevron-up"></i><div>chevron-up</div>
                                    </li><li><i class="fa fa-hand-o-down"></i><div>hand-o-down</div>
                                    </li><li><i class="fa fa-hand-o-left"></i><div>hand-o-left</div>
                                    </li><li><i class="fa fa-hand-o-right"></i><div>hand-o-right</div>
                                    </li><li><i class="fa fa-hand-o-up"></i><div>hand-o-up</div>
                                    </li><li><i class="fa fa-long-arrow-down"></i><div>long-arrow-down</div>
                                    </li><li><i class="fa fa-long-arrow-left"></i><div>long-arrow-left</div>
                                    </li><li><i class="fa fa-long-arrow-right"></i><div>long-arrow-right</div>
                                    </li><li><i class="fa fa-long-arrow-up"></i><div>long-arrow-up</div>
                                    </li><li><i class="fa fa-toggle-down"></i><div>toggle-down <span class="text-muted">(alias)</span></div>
                                    </li><li><i class="fa fa-toggle-left"></i><div>toggle-left <span class="text-muted">(alias)</span></div>
                                    </li><li><i class="fa fa-toggle-right"></i><div>toggle-right <span class="text-muted">(alias)</span></div>
                                    </li><li><i class="fa fa-toggle-up"></i><div>toggle-up <span class="text-muted">(alias)</span></div>
                                    </li>
                                </ul>
                                <div class="sub-title">Video Player Icons</div>
                                <ul class="icons-list">
                                    </li><li><i class="fa fa-arrows-alt"></i><div>arrows-alt</div>
                                    </li><li><i class="fa fa-backward"></i><div>backward</div>
                                    </li><li><i class="fa fa-compress"></i><div>compress</div>
                                    </li><li><i class="fa fa-eject"></i><div>eject</div>
                                    </li><li><i class="fa fa-expand"></i><div>expand</div>
                                    </li><li><i class="fa fa-fast-backward"></i><div>fast-backward</div>
                                    </li><li><i class="fa fa-fast-forward"></i><div>fast-forward</div>
                                    </li><li><i class="fa fa-forward"></i><div>forward</div>
                                    </li><li><i class="fa fa-pause"></i><div>pause</div>
                                    </li><li><i class="fa fa-play"></i><div>play</div>
                                    </li><li><i class="fa fa-play-circle"></i><div>play-circle</div>
                                    </li><li><i class="fa fa-play-circle-o"></i><div>play-circle-o</div>
                                    </li><li><i class="fa fa-step-backward"></i><div>step-backward</div>
                                    </li><li><i class="fa fa-step-forward"></i><div>step-forward</div>
                                    </li><li><i class="fa fa-stop"></i><div>stop</div>
                                    </li><li><i class="fa fa-youtube-play"></i><div>youtube-play</div>
                                    </li>
                                </ul>
                                <div class="sub-title">Brand Icons</div>
                                <ul class="icons-list">
                                    </li><li><i class="fa fa-adn"></i><div>adn</div>
                                    </li><li><i class="fa fa-android"></i><div>android</div>
                                    </li><li><i class="fa fa-angellist"></i><div>angellist</div>
                                    </li><li><i class="fa fa-apple"></i><div>apple</div>
                                    </li><li><i class="fa fa-behance"></i><div>behance</div>
                                    </li><li><i class="fa fa-behance-square"></i><div>behance-square</div>
                                    </li><li><i class="fa fa-bitbucket"></i><div>bitbucket</div>
                                    </li><li><i class="fa fa-bitbucket-square"></i><div>bitbucket-square</div>
                                    </li><li><i class="fa fa-bitcoin"></i><div>bitcoin <span class="text-muted">(alias)</span></div>
                                    </li><li><i class="fa fa-btc"></i><div>btc</div>
                                    </li><li><i class="fa fa-buysellads"></i><div>buysellads</div>
                                    </li><li><i class="fa fa-cc-amex"></i><div>cc-amex</div>
                                    </li><li><i class="fa fa-cc-discover"></i><div>cc-discover</div>
                                    </li><li><i class="fa fa-cc-mastercard"></i><div>cc-mastercard</div>
                                    </li><li><i class="fa fa-cc-paypal"></i><div>cc-paypal</div>
                                    </li><li><i class="fa fa-cc-stripe"></i><div>cc-stripe</div>
                                    </li><li><i class="fa fa-cc-visa"></i><div>cc-visa</div>
                                    </li><li><i class="fa fa-codepen"></i><div>codepen</div>
                                    </li><li><i class="fa fa-connectdevelop"></i><div>connectdevelop</div>
                                    </li><li><i class="fa fa-css3"></i><div>css3</div>
                                    </li><li><i class="fa fa-dashcube"></i><div>dashcube</div>
                                    </li><li><i class="fa fa-delicious"></i><div>delicious</div>
                                    </li><li><i class="fa fa-deviantart"></i><div>deviantart</div>
                                    </li><li><i class="fa fa-digg"></i><div>digg</div>
                                    </li><li><i class="fa fa-dribbble"></i><div>dribbble</div>
                                    </li><li><i class="fa fa-dropbox"></i><div>dropbox</div>
                                    </li><li><i class="fa fa-drupal"></i><div>drupal</div>
                                    </li><li><i class="fa fa-empire"></i><div>empire</div>
                                    </li><li><i class="fa fa-facebook"></i><div>facebook</div>
                                    </li><li><i class="fa fa-facebook-f"></i><div>facebook-f <span class="text-muted">(alias)</span></div>
                                    </li><li><i class="fa fa-facebook-official"></i><div>facebook-official</div>
                                    </li><li><i class="fa fa-facebook-square"></i><div>facebook-square</div>
                                    </li><li><i class="fa fa-flickr"></i><div>flickr</div>
                                    </li><li><i class="fa fa-forumbee"></i><div>forumbee</div>
                                    </li><li><i class="fa fa-foursquare"></i><div>foursquare</div>
                                    </li><li><i class="fa fa-ge"></i><div>ge <span class="text-muted">(alias)</span></div>
                                    </li><li><i class="fa fa-git"></i><div>git</div>
                                    </li><li><i class="fa fa-git-square"></i><div>git-square</div>
                                    </li><li><i class="fa fa-github"></i><div>github</div>
                                    </li><li><i class="fa fa-github-alt"></i><div>github-alt</div>
                                    </li><li><i class="fa fa-github-square"></i><div>github-square</div>
                                    </li><li><i class="fa fa-gittip"></i><div>gittip <span class="text-muted">(alias)</span></div>
                                    </li><li><i class="fa fa-google"></i><div>google</div>
                                    </li><li><i class="fa fa-google-plus"></i><div>google-plus</div>
                                    </li><li><i class="fa fa-google-plus-square"></i><div>google-plus-square</div>
                                    </li><li><i class="fa fa-google-wallet"></i><div>google-wallet</div>
                                    </li><li><i class="fa fa-gratipay"></i><div>gratipay</div>
                                    </li><li><i class="fa fa-hacker-news"></i><div>hacker-news</div>
                                    </li><li><i class="fa fa-html5"></i><div>html5</div>
                                    </li><li><i class="fa fa-instagram"></i><div>instagram</div>
                                    </li><li><i class="fa fa-ioxhost"></i><div>ioxhost</div>
                                    </li><li><i class="fa fa-joomla"></i><div>joomla</div>
                                    </li><li><i class="fa fa-jsfiddle"></i><div>jsfiddle</div>
                                    </li><li><i class="fa fa-lastfm"></i><div>lastfm</div>
                                    </li><li><i class="fa fa-lastfm-square"></i><div>lastfm-square</div>
                                    </li><li><i class="fa fa-leanpub"></i><div>leanpub</div>
                                    </li><li><i class="fa fa-linkedin"></i><div>linkedin</div>
                                    </li><li><i class="fa fa-linkedin-square"></i><div>linkedin-square</div>
                                    </li><li><i class="fa fa-linux"></i><div>linux</div>
                                    </li><li><i class="fa fa-maxcdn"></i><div>maxcdn</div>
                                    </li><li><i class="fa fa-meanpath"></i><div>meanpath</div>
                                    </li><li><i class="fa fa-medium"></i><div>medium</div>
                                    </li><li><i class="fa fa-openid"></i><div>openid</div>
                                    </li><li><i class="fa fa-pagelines"></i><div>pagelines</div>
                                    </li><li><i class="fa fa-paypal"></i><div>paypal</div>
                                    </li><li><i class="fa fa-pied-piper"></i><div>pied-piper</div>
                                    </li><li><i class="fa fa-pied-piper-alt"></i><div>pied-piper-alt</div>
                                    </li><li><i class="fa fa-pinterest"></i><div>pinterest</div>
                                    </li><li><i class="fa fa-pinterest-p"></i><div>pinterest-p</div>
                                    </li><li><i class="fa fa-pinterest-square"></i><div>pinterest-square</div>
                                    </li><li><i class="fa fa-qq"></i><div>qq</div>
                                    </li><li><i class="fa fa-ra"></i><div>ra <span class="text-muted">(alias)</span></div>
                                    </li><li><i class="fa fa-rebel"></i><div>rebel</div>
                                    </li><li><i class="fa fa-reddit"></i><div>reddit</div>
                                    </li><li><i class="fa fa-reddit-square"></i><div>reddit-square</div>
                                    </li><li><i class="fa fa-renren"></i><div>renren</div>
                                    </li><li><i class="fa fa-sellsy"></i><div>sellsy</div>
                                    </li><li><i class="fa fa-share-alt"></i><div>share-alt</div>
                                    </li><li><i class="fa fa-share-alt-square"></i><div>share-alt-square</div>
                                    </li><li><i class="fa fa-shirtsinbulk"></i><div>shirtsinbulk</div>
                                    </li><li><i class="fa fa-simplybuilt"></i><div>simplybuilt</div>
                                    </li><li><i class="fa fa-skyatlas"></i><div>skyatlas</div>
                                    </li><li><i class="fa fa-skype"></i><div>skype</div>
                                    </li><li><i class="fa fa-slack"></i><div>slack</div>
                                    </li><li><i class="fa fa-slideshare"></i><div>slideshare</div>
                                    </li><li><i class="fa fa-soundcloud"></i><div>soundcloud</div>
                                    </li><li><i class="fa fa-spotify"></i><div>spotify</div>
                                    </li><li><i class="fa fa-stack-exchange"></i><div>stack-exchange</div>
                                    </li><li><i class="fa fa-stack-overflow"></i><div>stack-overflow</div>
                                    </li><li><i class="fa fa-steam"></i><div>steam</div>
                                    </li><li><i class="fa fa-steam-square"></i><div>steam-square</div>
                                    </li><li><i class="fa fa-stumbleupon"></i><div>stumbleupon</div>
                                    </li><li><i class="fa fa-stumbleupon-circle"></i><div>stumbleupon-circle</div>
                                    </li><li><i class="fa fa-tencent-weibo"></i><div>tencent-weibo</div>
                                    </li><li><i class="fa fa-trello"></i><div>trello</div>
                                    </li><li><i class="fa fa-tumblr"></i><div>tumblr</div>
                                    </li><li><i class="fa fa-tumblr-square"></i><div>tumblr-square</div>
                                    </li><li><i class="fa fa-twitch"></i><div>twitch</div>
                                    </li><li><i class="fa fa-twitter"></i><div>twitter</div>
                                    </li><li><i class="fa fa-twitter-square"></i><div>twitter-square</div>
                                    </li><li><i class="fa fa-viacoin"></i><div>viacoin</div>
                                    </li><li><i class="fa fa-vimeo-square"></i><div>vimeo-square</div>
                                    </li><li><i class="fa fa-vine"></i><div>vine</div>
                                    </li><li><i class="fa fa-vk"></i><div>vk</div>
                                    </li><li><i class="fa fa-wechat"></i><div>wechat <span class="text-muted">(alias)</span></div>
                                    </li><li><i class="fa fa-weibo"></i><div>weibo</div>
                                    </li><li><i class="fa fa-weixin"></i><div>weixin</div>
                                    </li><li><i class="fa fa-whatsapp"></i><div>whatsapp</div>
                                    </li><li><i class="fa fa-windows"></i><div>windows</div>
                                    </li><li><i class="fa fa-wordpress"></i><div>wordpress</div>
                                    </li><li><i class="fa fa-xing"></i><div>xing</div>
                                    </li><li><i class="fa fa-xing-square"></i><div>xing-square</div>
                                    </li><li><i class="fa fa-yahoo"></i><div>yahoo</div>
                                    </li><li><i class="fa fa-yelp"></i><div>yelp</div>
                                    </li><li><i class="fa fa-youtube"></i><div>youtube</div>
                                    </li><li><i class="fa fa-youtube-play"></i><div>youtube-play</div>
                                    </li><li><i class="fa fa-youtube-square"></i><div>youtube-square</div>
                                    </li>
                                </ul>
                                <div class="sub-title">Medical Icons</div>
                                <ul class="icons-list">
                                    </li><li><i class="fa fa-ambulance"></i><div>ambulance</div>
                                    </li><li><i class="fa fa-h-square"></i><div>h-square</div>
                                    </li><li><i class="fa fa-heart"></i><div>heart</div>
                                    </li><li><i class="fa fa-heart-o"></i><div>heart-o</div>
                                    </li><li><i class="fa fa-heartbeat"></i><div>heartbeat</div>
                                    </li><li><i class="fa fa-hospital-o"></i><div>hospital-o</div>
                                    </li><li><i class="fa fa-medkit"></i><div>medkit</div>
                                    </li><li><i class="fa fa-plus-square"></i><div>plus-square</div>
                                    </li><li><i class="fa fa-stethoscope"></i><div>stethoscope</div>
                                    </li><li><i class="fa fa-user-md"></i><div>user-md</div>
                                    </li><li><i class="fa fa-wheelchair"></i><div>wheelchair</div>
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
