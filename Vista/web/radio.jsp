<%-- 
    Document   : radio
    Created on : 03-oct-2016, 11:44:30
    Author     : Juan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Radio On Line</title>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="/Vista/BootStrap/lib/css/bootstrap.min.css">

        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
        <script src="/Vista/BootStrap/lib/js/bootstrap.min.js"></script>


        <style>
            .bg-1 { 
                background-color: #1abc9c; /* Green */
                color: #ffffff;
            }

            .navbar {
                padding-top: 4px;
                padding-bottom: 12px;
                border: 10px;
                border-radius: 0;
                margin-bottom: 0px;
                margin-top: 0px;

                font-size: 16px;
                letter-spacing: 1px;
                color: white;
                opacity: 0.93;



            }
            .containerMain{
                padding-left:0px;
                padding-right:0px;


            }

            .container-radio{
                padding-top: 0px;
                padding-bottom: 0px;
            }

            html,body {height:100%;}

            .special,.special .jumbotron {height:100%;}

            .div-esp{
                background:url(http://mw.esca.ae/images/greygradient.png);
                background-size: 100% 100%;
                background-repeat: no-repeat;

            }

            .cont-main{
                
                background-size: 100% 100%;
                background-repeat: no-repeat;
                background-attachment: fixed;

            }
            
            .cont-main2:after{
                
                background-size: 100% 100%;
                background-repeat: no-repeat;
                background-attachment: fixed;

            }


            .cont-main2 {

                width: 100%;
                height: 100%;
                background-attachment: fixed;
                background:url(station3.jpg);
                background-repeat: no-repeat;
                background-position: 50% 0;
                -ms-background-size: cover;
                -o-background-size: cover;
                -moz-background-size: cover;
                -webkit-background-size: cover;
                background-size: cover;
            }


            .bottom-align-text {
                position: absolute;
                bottom: 0;

            }


        </style>




    </head>
    <body>



        <nav class="navbar navbar-inverse navbar-fixed-top" style="color:whitesmoke">
            <div class="container-fluid">

                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand" style="font-size:37px;color: white" href="#">
                        <span class="glyphicon glyphicon-cd"></span></a>
                </div>

                <div class="collapse navbar-collapse" id="myNavbar">
                    <ul class="nav navbar-nav navbar-right">
                        <li><a href="#">Home</a></li>
                        <li><a href="#">Escuchanos!</a></li>
                        <li><a href="#">Horarios</a></li> 
                        <li><a href="#">Contactos</a></li>

                    </ul>
                </div>

            </div>

        </nav> 




        <div class="container-fluid containerMain special cont-main2 text-center" >



            <div class="container-fluid special" style="background-color:transparent">

                <h1 style="color:white;font-size:8vw;padding-top:16vw">RadioLaSuper</h1>
                <p style="color:white">Accede a nestra radio On line 100% Ecuatoriana:</p>
                <button class="btn btn-default">Escuchar</button>
                <button class="btn btn-default">Mas informacion</button>
                <button class="btn btn-default">Facebook</button>

                <p style="color: white;padding-top:20vw;
                   font-size: 2vw"><span class="glyphicon glyphicon-menu-down"></span></p>
            </div>

            <%--
            <div class="container-fluid" style="position: absolute;bottom: 50%;right: 39%;
               background-color: transparent;opacity:0.9;border-radius:15px">
                <h1 style="color:white;font-size:8vw">Hola</h1>
                <p style="color:white">Accede a nestra radio On line:</p>
                <button>Escuchar</button>
                <button>Mas informacion</button>
                <button>Facebook</button>
            </div>
            




            <div class="container-fluid" style="position: absolute;bottom: 0%;right: 49%;">
                <h1 style="color: white;
                    font-size: 2.5vw"><span class="glyphicon glyphicon-menu-down"></span></h1>
            </div>
            
            --%>
        </div>




        <div class="container-fluid containerMain special text-center div-esp" >



            <h1 style="padding-top:20%;font-size:7vw ">Más Música</h1>
            <p style="font-size:3vw">Radio Virtual Comienza Hoy</p>

        </div>




    </body>
</html>
