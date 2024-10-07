
    $(document).ready(function () {
        var seccionadoraAAberta = false;
        var seccionadoraBAberta = false;

        $("#btnSeccionadoraA").click(function () {
            seccionadoraAAberta = !seccionadoraAAberta;
            //atualizarDiagramaSeccionadoraAAberta()
            atualizarDiagrama();
        });

        $("#btnSeccionadoraB").click(function () {
            seccionadoraBAberta = !seccionadoraBAberta;
            //atualizarDiagramaSeccionadoraBAberta()
            atualizarDiagrama();
        });

        function atualizarDiagrama() {
            $("#seccionadoraA").css("height", seccionadoraAAberta ? "96px" : "136px");
            $("#seccionadoraB").css("height", seccionadoraBAberta ? "32px" : "76px");
        }

        //function atualizarDiagramaSeccionadoraAAberta() {
            //$("#seccionadoraA").css("height", seccionadoraAAberta ? "96px" : "136px");
            //$("#seccionadoraA").css("height", seccionadoraAAberta ? "32px" : "76px");
        //}

        //function atualizarDiagramaSeccionadoraBAberta() {
            //$("#seccionadoraB").css("height", seccionadoraBAberta ? "96px" : "136px");
            //$("#seccionadoraB").css("height", seccionadoraBAberta ? "32px" : "76px");
        //}
    });

$(document).ready(function () {
        var disjuntorAberto = false;
        var transformadorAberto = false;
        var transformador1Aberto = false;
       
        $("#btnDisjuntor").click(function () {
            disjuntorAberto = !disjuntorAberto;
            transformadorAberto = !transformadorAberto;
            transformador1Aberto = !transformador1Aberto;
            atualizarDiagrama();
        });

        function atualizarDiagrama() {
            $(".disjuntor").css("background-color", disjuntorAberto ? "red" : "green");
            $(".transformador").css("background-color", transformadorAberto ? "red" : "orange");
            $(".transformador1").css("background-color", transformador1Aberto ? "red" : "lightblue");                      
        }
    });

    $(document).ready(function () {
        var seccionadoraAAbertaTF2 = false;
        var seccionadoraBAbertaTF2 = false;

        $("#btnSeccionadoraATF2").click(function () {
            seccionadoraAAbertaTF2 = !seccionadoraAAbertaTF2;
            atualizarDiagramaTF2();
        });

        $("#btnSeccionadoraBTF2").click(function () {
            seccionadoraBAbertaTF2 = !seccionadoraBAbertaTF2;
            atualizarDiagramaTF2();
        });

        function atualizarDiagramaTF2() {
            $("#seccionadoraATF2").css("height", seccionadoraAAbertaTF2 ? "96px" : "136px");
            $("#seccionadoraBTF2").css("height", seccionadoraBAbertaTF2 ? "32px" : "72px");
        }
    });

    $(document).ready(function () {
        var disjuntorAbertoTF2 = false;
        var transformadorAbertoTF2 = false;
        var transformador1AbertoTF2 = false;
       
        $("#btnDisjuntorTF2").click(function () {
            disjuntorAbertoTF2 = !disjuntorAbertoTF2;
            transformadorAbertoTF2 = !transformadorAbertoTF2;
            transformador1AbertoTF2 = !transformador1AbertoTF2;
            atualizarDiagramaTF2();
        });

        function atualizarDiagramaTF2() {
            $(".disjuntorTF2").css("background-color", disjuntorAbertoTF2 ? "red" : "green");
            $(".transformadorTF2").css("background-color", transformadorAbertoTF2 ? "red" : "orange");
            $(".transformador1TF2").css("background-color", transformador1AbertoTF2 ? "red" : "lightblue");                      
        }
    });

    $(document).ready(function () {
        var seccionadoraAAbertaTF3 = false;
        var seccionadoraBAbertaTF3 = false;

        $("#btnSeccionadoraATF3").click(function () {
            seccionadoraAAbertaTF3 = !seccionadoraAAbertaTF3;
            atualizarDiagramaTF3();
        });

        $("#btnSeccionadoraBTF3").click(function () {
            seccionadoraBAbertaTF3 = !seccionadoraBAbertaTF3;
            atualizarDiagramaTF3();
        });

        function atualizarDiagramaTF3() {
            $("#seccionadoraATF3").css("height", seccionadoraAAbertaTF3 ? "96px" : "136px");
            $("#seccionadoraBTF3").css("height", seccionadoraBAbertaTF3 ? "32px" : "72px");
        }
    });

    $(document).ready(function () {
        var disjuntorAbertoTF3 = false;
        var transformadorAbertoTF3 = false;
        var transformador1AbertoTF3 = false;
       
        $("#btnDisjuntorTF3").click(function () {
            disjuntorAbertoTF3 = !disjuntorAbertoTF3;
            transformadorAbertoTF3 = !transformadorAbertoTF3;
            transformador1AbertoTF3 = !transformador1AbertoTF3;
            atualizarDiagramaTF3();
        });

        function atualizarDiagramaTF3() {
            $(".disjuntorTF3").css("background-color", disjuntorAbertoTF3 ? "red" : "green");
            $(".transformadorTF3").css("background-color", transformadorAbertoTF3 ? "red" : "orange");
            $(".transformador1TF3").css("background-color", transformador1AbertoTF3 ? "red" : "lightblue");                      
        }
    });

    $(document).ready(function () {
        var seccionadoraAAbertaTF4 = false;
        var seccionadoraBAbertaTF4 = false;

        $("#btnSeccionadoraATF4").click(function () {
            seccionadoraAAbertaTF4 = !seccionadoraAAbertaTF4;
            atualizarDiagramaTF4();
        });

        $("#btnSeccionadoraBTF4").click(function () {
            seccionadoraBAbertaTF4 = !seccionadoraBAbertaTF4;
            atualizarDiagramaTF4();
        });

        function atualizarDiagramaTF4() {
            $("#seccionadoraATF4").css("height", seccionadoraAAbertaTF4 ? "96px" : "136px");
            $("#seccionadoraBTF4").css("height", seccionadoraBAbertaTF4 ? "32px" : "72px");
        }
    });

    $(document).ready(function () {
        var disjuntorAbertoTF4 = false;
        var transformadorAbertoTF4 = false;
        var transformador1AbertoTF4 = false;
       
        $("#btnDisjuntorTF4").click(function () {
            disjuntorAbertoTF4 = !disjuntorAbertoTF4;
            transformadorAbertoTF4 = !transformadorAbertoTF4;
            transformador1AbertoTF4 = !transformador1AbertoTF4;
            atualizarDiagramaTF4();
        });

        function atualizarDiagramaTF4() {
            $(".disjuntorTF4").css("background-color", disjuntorAbertoTF4 ? "red" : "green");
            $(".transformadorTF4").css("background-color", transformadorAbertoTF4 ? "red" : "orange");
            $(".transformador1TF4").css("background-color", transformador1AbertoTF4 ? "red" : "lightblue");                      
        }
    });