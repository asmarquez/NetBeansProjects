<%-- 
    Document   : Peticion
    Created on : 29-sep-2016, 11:17:08
    Author     : Juan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="w3.css">
    </head>
    <body>


        <div class="w3-display-container w3-responsive">
            <img src="cat2.jpg" alt="Car" style="width:100%">
            <div class="w3-display-topmiddle w3-container w3-animate-zoom">
                <h1 class="w3-text-blue" style="font-size: 200%;
                    font-family:Avenir Next Condensed">
                    SPIKE LIBRE.COM!
                </h1>
            </div>

        </div>

        <div class="w3-container w3-black" >
            <h2 style="font-family:Avenir Next Condensed">Libertad para los Gatos!</h2>
        </div>

        <div class="w3-container w3-blue-grey ">


            <div class="w3-third">
                <div class="w3-card-12 w3-margin" style="width:80%">
                    <img src="cat4.gif" alt="Gato" style="width:100%">
                    <div class="w3-container w3-center w3-light-blue">
                        <p>Gatos</p>
                    </div>
                </div>

            </div>
            <div class="w3-third">
                <div class="w3-card-12 w3-margin" style="width:80%">
                    <img src="cat5.gif" alt="Gato" style="width:100%">
                    <div class="w3-container w3-center w3-light-blue">
                        <p>Animados</p>
                    </div>
                </div>

            </div>

            <div class="w3-third">
                <div class="w3-card-12 w3-margin" style="width:80%">
                    <img src="cat6.gif" alt="Gato" style="width:100%">
                    <div class="w3-container w3-center w3-light-blue">
                        <p>Locos</p>
                    </div>
                </div>

            </div>

        </div>




        <div class="w3-container w3-black">
            <h2 style="font-family:Avenir Next Condensed">Firma La Peticion!</h2>
            <p>Es para salvar al Gato!!</p>
        </div>

        <div class="w3-container w3-cyan ">

            <div class="w3-card-12 w3-light-blue w3-margin-top w3-margin-bottom "
                 style="width: 50%">

                <div class="w3-container w3-center">
                    <h1>Vive o Muere!</h1>
                    <img src="cat7.jpg" alt="Avatar" style="width:50%">
                    <h5>Salva al Gato</h5>

                    <div class="w3-section">
                        <form class="w3-form" method="post" 
                              action="/JavaEECurso/AnhadirFirma.jsp">
                            <p>
                                <label class="w3-text-blue"><b>Nombre</b></label>
                                <input class="w3-input w3-border" name="nombre" type="text"></p>
                            <p>
                                <label class="w3-text-blue"><b>email</b></label>
                                <input class="w3-input w3-border" name="email" type="text"></p>
                            <p>
                                <label class="w3-text-blue"><b>Edad</b></label>
                                <input class="w3-input w3-border" name="edad" type="text"></p>
                            
                            <p><button class="w3-btn w3-red w3-margin-top">
                                    Firmar!
                                </button>
                            </p>
                                
                        </form>
                    </div>

                </div>

            </div>
        </div>

        <div class="w3-container w3-black">
            <h2>Sobre Gatos!</h2>
        </div>

        <article class="w3-container w3-blue-grey"> 

            <p>El gato o gato doméstico1 2 (Felis silvestris catus) y 
                coloquialmente llamado minino,3 micho,4 mizo5 o miz;6 es una 
                subespecie de mamífero carnívoro de la familia Felidae. El gato 
                está en convivencia cercana al ser humano desde hace unos 9500 
                años,7 periodo superior al estimado anteriormente, que oscilaba 
                entre 3500 y 8000 años.</p>
        </article>


        <div class="w3-container w3-blue">
            <span class="w3-closebtn" onclick="this.parentElement.style.display = 'none'">X</span>
            <p>Esta pagina requiere de tu firma, cierra el aviso!.</p>
        </div>


        <footer class="w3-container w3-black">
            <h5>Peticion dedicada a:</h5>
            <p>Gato Spike, creado por Juan Francisco Chango perugachi. 
                Todo el contenido esta registrado bajo la autoría pertinente.</p>
        </footer>


    </body>
</html>
