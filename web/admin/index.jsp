<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>建材商城后台管理系统</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- Fonts -->
    <link href='http://fonts.googleapis.com/css?family=Roboto+Condensed:300,400' rel='stylesheet' type='text/css'>
    <link href='http://fonts.googleapis.com/css?family=Lato:300,400,700,900' rel='stylesheet' type='text/css'>
    <!-- CSS Libs -->
    <link rel="stylesheet" type="text/css" href="./lib/css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="./lib/css/font-awesome.min.css">
    <link rel="stylesheet" type="text/css" href="./lib/css/animate.min.css">
    <link rel="stylesheet" type="text/css" href="./lib/css/bootstrap-switch.min.css">
    <link rel="stylesheet" type="text/css" href="./lib/css/checkbox3.min.css">
    <link rel="stylesheet" type="text/css" href="./lib/css/jquery.dataTables.min.css">
    <link rel="stylesheet" type="text/css" href="./lib/css/dataTables.bootstrap.css">
    <link rel="stylesheet" type="text/css" href="./lib/css/select2.min.css">
    <!-- CSS App -->
    <link rel="stylesheet" type="text/css" href="./css/style.css">
    <link rel="stylesheet" type="text/css" href="./css/themes/flat-blue.css">
</head>

<style type="text/css">
    #form-control {
        display: block;
        width: 100%;
        height: 34px;
        padding: 6px 12px;
        font-size: 14px;
        line-height: 1.42857143;
        color: #555;
        background-color: #fff;
        background-image: none;
        border: 1px solid #ccc;
        border-radius: 4px;
        -webkit-box-shadow: inset 0 1px 1px rgba(0, 0, 0, .075);
        box-shadow: inset 0 1px 1px rgba(0, 0, 0, .075);
        -webkit-transition: border-color ease-in-out .15s, -webkit-box-shadow ease-in-out .15s;
        -o-transition: border-color ease-in-out .15s, box-shadow ease-in-out .15s;
        transition: border-color ease-in-out .15s, box-shadow ease-in-out .15s
    }

    #form-control:focus {
        border-color: #66afe9;
        outline: 0;
        -webkit-box-shadow: inset 0 1px 1px rgba(0, 0, 0, .075), 0 0 8px rgba(102, 175, 233, .6);
        box-shadow: inset 0 1px 1px rgba(0, 0, 0, .075), 0 0 8px rgba(102, 175, 233, .6)
    }

    #form-control::-moz-placeholder {
        color: #999;
        opacity: 1
    }

    #form-control:-ms-input-placeholder {
        color: #999
    }

    #form-control::-webkit-input-placeholder {
        color: #999
    }

    #form-control::-ms-expand {
        background-color: transparent;
        border: 0
    }

    #form-control[disabled], #form-control[readonly], fieldset[disabled] #form-control {
        background-color: #eee;
        opacity: 1
    }

    #form-control[disabled], fieldset[disabled] #form-control {
        cursor: not-allowed
    }
</style>

<body class="flat-blue login-page">
<div class="container">
    <div class="login-box">
        <div>
            <div class="login-form row">
                <div class="col-sm-12 text-center">
                    <i class="login-logo fa fa-connectdevelop fa-5x"></i>
                    <h4>建材商城后台管理系统</h4>
                </div>
                <div class="col-sm-12">
                    <div class="login-body">
                        <div class="progress hidden" id="login-progress">
                            <div class="progress-bar progress-bar-success progress-bar-striped active"
                                 role="progressbar" aria-valuenow="100" aria-valuemin="0" aria-valuemax="100"
                                 style="width: 100%">
                                Log In...
                            </div>
                        </div>
                        <form>
                            <div class="control">
                                <a>Administrator:</a>
                                <input type="text" class="form-control"/>
                            </div>
                            <div class="control">
                                <a>password:</a>
                                <input type="password" id="form-control"/>
                            </div>
                            <div class="login-button text-center">
                                <input type="submit" class="btn btn-primary" value="Login">
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<!-- Javascript Libs -->
<script type="text/javascript" src="./lib/js/jquery.min.js"></script>
<script type="text/javascript" src="./lib/js/bootstrap.min.js"></script>
<script type="text/javascript" src="./lib/js/Chart.min.js"></script>
<script type="text/javascript" src="./lib/js/bootstrap-switch.min.js"></script>

<script type="text/javascript" src="./lib/js/jquery.matchHeight-min.js"></script>
<script type="text/javascript" src="./lib/js/jquery.dataTables.min.js"></script>
<script type="text/javascript" src="./lib/js/dataTables.bootstrap.min.js"></script>
<script type="text/javascript" src="./lib/js/select2.full.min.js"></script>
<script type="text/javascript" src="./lib/js/ace/ace.js"></script>
<script type="text/javascript" src="./lib/js/ace/mode-html.js"></script>
<script type="text/javascript" src="./lib/js/ace/theme-github.js"></script>
<!-- Javascript -->
<script type="text/javascript" src="./js/app.js"></script>
</body>

</html>
