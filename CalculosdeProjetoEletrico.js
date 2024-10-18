<!DOCTYPE html>
<html>
<head>
    <title>CálculodeProjetoEletrico</title>
</head>
<body>

    <form id="calcForm">
        <label for="num1">Insira um número:</label>
        <input type="number" name="num1" id="num1">
        <input type="submit" value="Calcular">
    </form>

    <h2 id="resultado"></h2>

    <script>
        document.getElementById("calcForm").addEventListener("submit", function(event) {
            event.preventDefault();
            let num1 = parseFloat(document.getElementById("num1").value);
            let resultado1 = 100 + (num1 - 6) / 4 * 60;
            document.getElementById("resultado").innerHTML = "Resultado: " + resultado1 + " VA";
        });
    </script>

<form id="calcForm2">
    <label for="num2">Insira um número:</label>
    <input type="number" name="num2" id="num2">
    <input type="submit" value="Calcular">
</form>

<h2 id="resultado"></h2>

<script>
    document.getElementById("calcForm2").addEventListener("submit", function(event) {
        event.preventDefault();
        let num3 = parseFloat(document.getElementById("num2").value);
        let resultado2 = (num2) /5;
        document.getElementById("resultado2").innerHTML = "Resultado: " + resultado2 + " VA";
    });
</script>

<form id="calcForm3">
    <label for="num3">Insira um número:</label>
    <input type="number" name="num3" id="num3">
    <input type="submit" value="Calcular">
</form>

<h2 id="resultado"></h2>

<script>
    document.getElementById("calcForm3").addEventListener("submit", function(event) {
        event.preventDefault();
        let num3 = parseFloat(document.getElementById("num3").value);
        let resultado3 = (num3) /3.5;
        document.getElementById("resultado3").innerHTML = "Resultado: " + resultado3 + " VA";
    });
</script>

</body>
</html>
