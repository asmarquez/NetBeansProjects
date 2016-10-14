<%-- 
    Document   : prueba
    Created on : 01-oct-2016, 18:36:01
    Author     : Juan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <title>Bootstrap Example</title>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="/JavaEECurso/BootStrap/lib/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
        <script src="/JavaEECurso/BootStrap/lib/js/bootstrap.min.js"></script>
    </head>

    <body>
        
        <nav class="navbar navbar-default">
            <div class="container-fluid">
                <div class="navbar-header">
                    <a class="navbar-brand" href="#">WebSiteName</a>
                </div>
                <ul class="nav navbar-nav">
                    <li class="active"><a href="#">Home</a></li>
                    <li><a href="#">Page 1</a></li>
                    <li><a href="#">Page 2</a></li> 
                    <li><a href="#">Page 3</a></li> 
                </ul>
            </div>
        </nav>
        
        
        <div class="container">
            <div class="btn-group btn-group-justified">

                <div class="btn-group">
                    <button type="button" class="btn btn-primary">Apple</button>
                </div>

                <div class="btn-group">
                    <button type="button" class="btn btn-primary">Samsung</button>
                </div>

                <div class="btn-group">
                    <button type="button" class="btn btn-primary">Sony</button>
                </div>

                <div class="btn-group">
                    <button type="button" class="btn btn-primary">Sony</button>
                </div>

                <div class="btn-group btn-group-justified">    
                    <button type="button" class="btn btn-primary dropdown-toggle" 
                            data-toggle="dropdown">MENU  <span class="label label-danger">2 msgs</span>
                    </button>

                    <ul class="dropdown-menu" role="menu">
                        <li><a href="#">Tablet</a></li>
                        <li><a href="#">Smartphone</a></li>
                        <li><a href="#">Smartphone</a></li>
                        <li><a href="#">Smartphone</a></li>
                        <li><a href="#">Smartphone</a></li>
                        <li><a href="#">Smartphone</a></li>
                        <li><a href="#">Smartphone</a></li>
                        <li><a href="#">Smartphone</a></li>
                    </ul>
                </div>


            </div>


        </div>

        <div class="container">
            <h2>My First Bootstrap Page</h2>
            <p>This is some text.</p> 

            <ul class="list-group">
                <li class="list-group-item">First item</li>
                <li class="list-group-item">Second item</li>
                <li class="list-group-item">Third item</li>
            </ul>

            <div class="panel-group">
                <div class="panel panel-default">
                    <div class="panel-body">Panel Content</div>
                </div>
                <div class="panel panel-default">
                    <div class="panel-body">Panel Content</div>
                </div>
            </div>

            <div class="dropdown">
                <button class="btn btn-default dropdown-toggle" type="button" data-toggle="dropdown">Tutorials
                    <span class="caret"></span></button>
                <ul class="dropdown-menu">
                    <li><a href="#">HTML</a></li>
                    <li><a href="#">CSS</a></li>
                    <li><a href="#">JavaScript</a></li>
                    <li class="divider"></li>
                    <li><a href="#">About Us</a></li>
                </ul>
            </div>

        </div>


        <div class="container">
            <div class="alert alert-success fade in">
                <a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
                <strong>Exito!</strong> Radio La Super te da la Bienvenida.
            </div>
        </div>

        <div class="container">
            <h2>Dynamic Tabs</h2>
            <ul class="nav nav-tabs">
                <li class="active"><a data-toggle="tab" href="#home">Home</a></li>
                <li><a data-toggle="tab" href="#menu1">Menu 1</a></li>
                <li><a data-toggle="tab" href="#menu2">Menu 2</a></li>
                <li><a data-toggle="tab" href="#menu3">Menu 3</a></li>
            </ul>

            <div class="tab-content">
                <div id="home" class="tab-pane fade in active">
                    <h3>HOME</h3>
                    <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.</p>
                </div>
                <div id="menu1" class="tab-pane fade">
                    <h3>Menu 1</h3>
                    <p>Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.</p>
                </div>
                <div id="menu2" class="tab-pane fade">
                    <h3>Menu 2</h3>
                    <p>Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam.</p>
                </div>
                <div id="menu3" class="tab-pane fade">
                    <h3>Menu 3</h3>
                    <p>Eaque ipsa quae ab illo inventore veritatis et quasi architecto beatae vitae dicta sunt explicabo.</p>
                </div>
            </div>
        </div>






    </body>
</html>
