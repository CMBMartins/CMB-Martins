<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <title>CONTROLE DE PROJETOS EXECUTADOS </title>
    <!-- Adiciona o Bootstrap -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <!-- Adiciona o jQuery -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <!-- Adiciona o JavaScript do Bootstrap -->
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

    <link rel="shortcut icon" href="icons/favicon.png" type="image/x-icon" />
    <link rel="stylesheet" href="styles/reset.css" />
    <link rel="stylesheet" href="styles/vars.css" />
    <link rel="stylesheet" href="styles/main-content.css" />
    <link rel="stylesheet" href="styles/sidebar-footer.css" />
    <link rel="stylesheet" href="styles/media-query.css" /> <!--Media queries devem ser chamados depois do CSS principal -->


  <link rel="stylesheet" href="styles/reset.css" />
  <link rel="stylesheet" href="styles/vars.css" />
  <link rel="stylesheet" href="styles/media-query.css" />
  <link rel="stylesheet" href="styles/main-content.css" />
  <link rel="stylesheet" href="styles/sidebar-footer.css" />

  <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.15.4/css/solid.css"
    integrity="sha384-Tv5i09RULyHKMwX0E8wJUqSOaXlyu3SQxORObAI08iUwIalMmN5L6AvlPX2LMoSE" crossorigin="anonymous" />
  <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.15.4/css/fontawesome.css"
    integrity="sha384-jLKHWM3JRmfMU0A5x5AkjWkw/EYfGUAGagvnfryNV3F9VqM98XiIH7VBGVoxVSc7" crossorigin="anonymous" />

</head>
<body>

<style>       

        body {
            background-color: #f3f3f3; /* Escolha a cor de fundo */
        }
    </style>
    
<div class="container">		
			<div class="col">      
				<img src="Imagens/logo.png" alt="Logo da Minha Empresa" class="img-fluid">
        <?php date_default_timezone_set('America/Sao_Paulo'); ?>
        <?php $hoje = date('d/m/Y'); ?>
        <?php $horaHoje = date("H:i:s"); ?>
        <?php echo $hoje; ?><br>
        <?php echo $horaHoje; ?><br>
        
			</div>
			<div class="col align-self-center">
				<h1 class="text-center">Gestão de Projetos Arquitetônicos e Complementares</h1>
        <img src="Imagens/Carlos.png" alt="Logo da Minha Empresa" class="img-fluid">        
			</div>
      <a href="">        
            <span class="fa fa-home"></span>            
            <!--<img src="Imagens/casa.png" alt="icone de configuração">-->
            <a href="PaginaPessoal.php">
            <span>Página Principal</span><br>
        </a>
		</div>
	</div>
  </script>
</head>
<body>

<?php

// Conexão com o banco de dados
$servername = "localhost";
$username = "root";
$password = "";
$dbname = "meubanco";
$conn = new mysqli($servername, $username, $password, $dbname);

// Verificação de erro na conexão
if ($conn->connect_error) {
    die("Falha na conexão: " . $conn->connect_error);
}

// Consulta SQL para obter o último registro
$sql = "SELECT * FROM bancoprojetos ORDER BY codigo DESC LIMIT 1";
$result = $conn->query($sql);

if ($result->num_rows > 0) {
  // Loop para exibir os resultados
  while ($row = $result->fetch_assoc()) {
      $codigo = $row["codigo"];
      $titulo = $row["titulo"];
      $cliente = $row["cliente"];
      $tamanhodoimovel = $row["tamanhodoimovel"];
      $valordoprojeto = $row["valordoprojeto"];
      $datadaentrega = $row["datadaentrega"];
      $tipo = $row["tipo"];
      $genero = $row["genero"];      
      ?>
            <!-- Aqui você pode adicionar o formulário HTML existente -->
            <div class="container">     
            <form action="ControleProjetosCONSULTA.php" method="post">                                    
            <label for="codigo">Código:</label>                    
            <input type="text" class="form-control" name="codigo" class="codigo" text><br>
            <!--<input type="text" class="form-control" name="codigo" class="codigo" value="<?php echo $codigo; ?>"><br>--> 
            
            <form action="ControleProjetosCONSULTA.php" method="post">           
                <label for="titulo">Título:</label>
                <input type="text" class="form-control" name="titulo" class="titulo" text><br>
                <!--<input type="text" class="form-control" name="titulo" class="titulo" value="<?php echo $titulo; ?>"><br>-->
            
            <form action="ControleProjetosCONSULTA.php" method="post">           
                <label for="cliente">Cliente:</label>
                <input type="text" class="form-control" name="cliente" class="cliente" text><br>
                <!--<input type="text" class="form-control" name="cliente" class="cliente" value="<?php echo $cliente; ?>"><br>-->
            
            <form action="ControleProjetosCONSULTA.php" method="post">            
                <label for="tamanhodoimovel">Tamanho do Imóvel:</label>
                <input type="text" class="form-control" name="tamanhodoimovel" class="tamanhodoimovel" text><br>
                <!--<input type="text" class="form-control" name="tamanhodoimovel" class="tamanhodoimovel" value="<?php echo $tamanhodoimovel; ?>">-->
            
            <form action="ControleProjetosCONSULTA.php" method="post">            
                <label for="valordoprojeto">Valor do Projeto:</label>
                <input type="text" class="form-control" name="valordoproduto" class="valordoproduto" text><br>
                <!--<input type="text" class="form-control" name="valordoprojeto" class="valordoprojeto" value="<?php echo $valordoprojeto; ?>"><br>-->
            
            <form action="ControleProjetosCONSULTA.php" method="post">           
                <label for="datadaentrega">Data da Entrega:</label>
                <input type="text" class="form-control" name="datadaentrega" class="datadaentrega" text><br>
                <!--<input type="text" class="form-control" name="datadaentrega" class="datadaentrega" value="<?php echo $datadaentrega; ?>"><br>-->
            
            <form action="ControleProjetosCONSULTA.php" method="post">            
                <label for="tipo">Tipo: arquitetônico ou complementares </label>
                <input type="text" class="form-control" name="tipo" class="tipo" text><br>
                <!--<input type="text" class="form-control" name="tipo" class="tipo" value="<?php echo $tipo; ?>"><br>-->
            
            <form action="ControleProjetosCONSULTA.php" method="post">           
                <label for="genero">Gênero: arquivo dwg</label>
                <input type="text" class="form-control" name="genero" class="genero" text><br>
                <!--<input type="text" class="form-control" name="genero" class="genero" value="<?php echo $genero; ?>"><br>-->
            </div>

            <?php
      }
  
  }else {
      echo "Nenhum resultado encontrado!";
  }
  
  // Fecha a conexão com o banco de dados
  $conn->close();
  ?>

        <div class="container">        
         <!--Cria o botão para consultar um valor na tabela (código) e dá ação ao método Post-->
        <form action="ControleProjetosCONSULTA.php" method="post">         
        <form method="post">
        <button type="submit" name="consultaporcodigo">Consultar por Código</button>        

        <!--Cria o botão para consultar um valor na tabela (artista) e dá ação ao método Post-->
        <form action="ControleProjetosCONSULTA.php" method="post">         
        <form method="post">
        <button type="submit" name="consultapornome">Consultar por Cliente</button>

        <!--Cria o botão para consultar todos os dados no Formulário pelo genero-->
        <form action="ControleProjetosCONSULTA.php" method="post">         
        <form method="post">        
        <button type="submit" name="consultaportipo">Tipo: arquitetônicos - complementares</button>

        <!--Cria o botão para consultar todos os dados no Formulário pelo genero-->
        <form action="ControleProjetosCONSULTA.php" method="post">         
        <form method="post">        
        <button type="submit" name="consultaporgenero">Consulta Gênero - tipo de arquivo </button>

        <!--Cria o botão para consultar todos os dados na tabela e dá ação ao método Post-->
        <form action="ControleProjetosCONSULTA.php" method="post">         
        <form method="post">
        <button type="submit" name="buscar">Consultar todos os Dados da Tabela</button>

        <!--Cria o botão para apagar todos os dados no Formulário-->
        <form action="ControleProjetosCONSULTA.php" method="post">         
        <form method="post">        
        <button type="submit" name="limpar">Apagar os Dados do Formulário</button><br><br>
       
        <!--Cria o botão para apagar encaminhar para a página Principal-->
        <form action="ControleProjetos.php" method="post">         
        <form method="post">
        <a href="">        
            <span class="fa fa-home"></span>            
            <!--<img src="Imagens/casa.png" alt="icone de configuração">-->
            <a href="PaginaPessoal.php">
            <span>Página Principal</span><br><br>
        </a>
       
       <p>Último Código Registrado na Tabela: <?php echo $codigo; ?></p>
       <p>Último Titulo Registrado na Tabela: <?php echo $titulo; ?></p>
       
       <title>Login</title>
    <div class="container">
    <h2>Login:</h2>    
            <a href="">        
            <span class="fa fa-home"></span>            
            <!--<img src="Imagens/casa.png" alt="icone de configuração">-->
            <a href="ControleProjetos.php">
            <span>FAZER LOGIN</span><br>
            <p>VOCÊ PRECISA ESTAR LOGADO PARA REALIZAR INSERT E UPDATE NO BANCO!</p>
            </a>

        <!-- Tabela para mostrar dados -->
        <h2>Consulta na Tabela:</h2>
        <table class="table">
            <thead>                
            </thead>               
            </tbody>
        </table>
		</div>
    
    <?php
        
          if(isset($_POST['buscar'])) {

          $servername = "localhost";
          $username = "root";
          $password = "";
          $dbname = "meubanco";
          $conn = new mysqli($servername, $username, $password, $dbname);
          
          // Consulta no banco de dados
          $sql = "SELECT * FROM bancoprojetos";
          $resultado = $conn->query($sql);
        if ($resultado->num_rows > 0) {
                echo "<table><tr><th>Código: </th><th>Titulo: </th><th>Cliente: </th><th>Tamanho do Imovel: </th><th>valor do Projeto: </th><th>Data da Entrega: </th><th>Tipo: </th><th>Gênero: </th></tr>";
                while($row = $resultado->fetch_assoc()) {
                  echo "<tr><th>" . $row["codigo"] . "</th><th>" . $row["titulo"] . "</th><th>" . $row["cliente"] ."</th><th>" . $row["tamanhodoimovel"] ."</th><th>" . $row["valordoprojeto"] ."</th><th>" . $row["datadaentrega"] ."</th><th>" . $row["tipo"] ."</th><th>" . $row["genero"] . "</th></tr>";
              }
            }

           else {
            echo "Nenhum resultado encontrado!";
          }              
          // Fechamento da conexão com o banco de dados
          $conn->close();
          exit();
        } 

        if(isset($_POST['consultaporcodigo'])) {

          $servername = "localhost";
          $username = "root";
          $password = "";
          $dbname = "meubanco";
          $conn = new mysqli($servername, $username, $password, $dbname);
         
          $codigo = "codigo"; // Substitua com o valor desejado
          $codigo = $_POST['codigo'];

         // Consulta SQL com parâmetro
         $sql = "SELECT * FROM bancoprojetos WHERE codigo = ?";
         $stmt = $conn->prepare($sql);
         $stmt->bind_param("s", $codigo);
         $stmt->execute();

         // Resultado da consulta
         $result = $stmt->get_result();

         // Verifica se existem resultados
         if ($result->num_rows > 0) {
          // Loop para exibir os resultados
          while ($row = $result->fetch_assoc()) {
        // Processar os dados obtidos
        $codigo = $row["codigo"];
        $titulo = $row["titulo"];
        echo "<h4><th>Código:</th>" . $codigo . "<br>";
        echo "Titulo: " . $titulo . "<br>";

        $cliente = $row["cliente"];
        $tamanhodoimovel = $row["tamanhodoimovel"];       
        echo "<th>Cliente:</th> " . $cliente . "<br>";
        echo "Tamanho do Imóvel: " . $tamanhodoimovel . "<br>";

        $valordoprojeto = $row["valordoprojeto"];
        $datadaentrega = $row["datadaentrega"];        
        echo "Valor do Projeto: " . $valordoprojeto . "<br>";
        echo "Data da Entrega: " . $datadaentrega . "<br>";

        $tipo = $row["tipo"];
        $genero = $row["genero"];        
        echo "Tipo: " . $tipo . "<br>";
        echo "Gênero: " . $genero . "<br>";       
    }
    } else {
    echo "<h4>Nenhum resultado encontrado!";
    }

    // Fecha a conexão com o banco de dados    
    $conn->close();
    exit();        
        }         
        
        if(isset($_POST['consultapornome'])) {

          $servername = "localhost";
          $username = "root";
          $password = "";
          $dbname = "meubanco";
          $conn = new mysqli($servername, $username, $password, $dbname);
         
          $cliente = "cliente"; // Substitua com o valor desejado
          $cliente = $_POST['cliente'];

         // Consulta SQL com parâmetro
         $sql = "SELECT * FROM bancoprojetos WHERE cliente = ?";
         $stmt = $conn->prepare($sql);
         $stmt->bind_param("s", $cliente);
         $stmt->execute();

         // Resultado da consulta
         $result = $stmt->get_result();

         // Verifica se existem resultados
         if ($result->num_rows > 0) {
          // Loop para exibir os resultados
          while ($row = $result->fetch_assoc()) {

        // Processar os dados obtidos
        $codigo = $row["codigo"];
        $titulo = $row["titulo"];       
        echo "<h4><th>Código:</th>" . $codigo . "<br>";
        echo "Título: " . $titulo . "<br>";

        $cliente = $row["cliente"];
        $tamanhodoimovel = $row["tamanhodoimovel"];       
        echo "<th>Cliente:</th> " . $cliente . "<br>";
        echo "Tamanho do Imóvel: " . $tamanhodoimovel . "<br>";

        $valordoprojeto = $row["valordoprojeto"];
        $datadaentrega = $row["datadaentrega"];        
        echo "Valor do Projeto: " . $valordoprojeto . "<br>";
        echo "Data da Entrega: " . $datadaentrega . "<br>";

        $tipo = $row["tipo"];
        $genero = $row["genero"];        
        echo "Tipo: " . $tipo . "<br>";
        echo "Genero: " . $genero . "<br><br>";
       
    }
    } else {
      echo "<h4>Nenhum resultado encontrado!";
      }

      // Fecha a conexão com o banco de dados
      $stmt->close();
      $conn->close();
      exit();
      }

      if(isset($_POST['consultaporgenero'])) {

        $servername = "localhost";
        $username = "root";
        $password = "";
        $dbname = "meubanco";
        $conn = new mysqli($servername, $username, $password, $dbname);
       
        $genero = "genero"; // Substitua com o valor desejado
        $genero = $_POST['genero'];

       // Consulta SQL com parâmetro
       $sql = "SELECT * FROM bancoprojetos WHERE genero = ?";
       $stmt = $conn->prepare($sql);
       $stmt->bind_param("s", $genero);
       $stmt->execute();

       // Resultado da consulta
       $result = $stmt->get_result();

       // Verifica se existem resultados
       if ($result->num_rows > 0) {
        // Loop para exibir os resultados
        while ($row = $result->fetch_assoc()) {
      // Processar os dados obtidos
      $codigo = $row["codigo"];      
      echo "<h4><h4><th>Código:</th>" . $codigo . "<br>";
      
      $cliente = $row["cliente"];           
      echo "<th>Cliente:</th> " . $cliente . "<br>";     
      $tipo = $row["tipo"];
      $genero = $row["genero"] . "<br>";      
      echo "Tipo: " . $tipo . "<br>";
      echo "Gênero: " . $genero . "<br>";       
  }
  } else {
  echo "<h4>Nenhum resultado encontrado!";
  }

  // Fecha a conexão com o banco de dados
  $stmt->close();
  $conn->close();
  exit();        
      }

      if(isset($_POST['consultaportipo'])) {

        $servername = "localhost";
        $username = "root";
        $password = "";
        $dbname = "meubanco";
        $conn = new mysqli($servername, $username, $password, $dbname);
       
        $tipo = "tipo"; // Substitua com o valor desejado
        $tipo = $_POST['tipo'];

       // Consulta SQL com parâmetro
       $sql = "SELECT * FROM bancoprojetos WHERE tipo = ?";
       $stmt = $conn->prepare($sql);
       $stmt->bind_param("s", $tipo);
       $stmt->execute();

       // Resultado da consulta
       $result = $stmt->get_result();

       // Verifica se existem resultados
       if ($result->num_rows > 0) {
        // Loop para exibir os resultados
        while ($row = $result->fetch_assoc()) {
      // Processar os dados obtidos
      $codigo = $row["codigo"];
      $titulo = $row["titulo"];
      echo "<h4><th>Cóodigo:</th>" . $codigo . "<br>";
      echo "Titulo: " . $titulo . "<br>";

      $cliente = $row["cliente"];            
      echo "<th>Cliente:</th> " . $cliente . "<br>";     
      $tipo = $row["tipo"];
      $genero = $row["genero"] . "<br>";      
      echo "Tipo: " . $tipo . "<br>";
      echo "Gênero: " . $genero . "<br>";       
  }
  } else {
  echo "<h4>Nenhum resultado encontrado!";
  }

  // Fecha a conexão com o banco de dados
  $stmt->close();
  $conn->close();
  exit();        
      }

      if(isset($_POST['limpar'])) {
        // Apagar os dados digitados nos campos do formulário
        
        unset($codigo);
        unset($titulo);
        unset($cliente);
        unset($tamanhodoimovel);
        unset($valordoprojeto);
        unset($datadaentrega);
        unset($tipo);
        unset($genero);

        if(isset($_POST['limpar'])) {                    
          echo "<h4>Dados apagados com sucesso no Formulário!<h4>";
        }
         
        else {
        throw new Exception("Erro ao Apagar no Formulário! " . $conn->error); 
        }
        exit();
        }

      ?>

</body>
</html>