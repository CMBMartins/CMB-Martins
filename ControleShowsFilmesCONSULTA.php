<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <title>CONTROLE DE SHOWS E FILMES </title>
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
				<h1 class="text-center">Gestão de Mídias de Shows e Filmes</h1>
        <img src="Imagens/Carlos.png" alt="Logo da Minha Empresa" class="img-fluid">        
			</div>
            <a href="">        
            <span class="fa fa-home"></span>            
            <!--<img src="Imagens/casa.png" alt="icone de configuração">-->
            <a href="PaginaPessoal.php">
            <span>Página Principal</span><br><br>
            </a>
		</div>
	</div>
  </script>
</head>
<body>

<?php

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
$sql = "SELECT * FROM bancoshowsfilmes ORDER BY codigo DESC LIMIT 1";
$result = $conn->query($sql);

if ($result->num_rows > 0) {
  // Loop para exibir os resultados
  while ($row = $result->fetch_assoc()) {
      $codigo = $row["codigo"];
      $titulo = $row["titulo"];
      $artista = $row["artista"];
      $anodelançamento = $row["anodelançamento"];
      $datadacompra = $row["datadacompra"];
      $situaçao = $row["situaçao"];
      $tipo = $row["tipo"];
      $genero = $row["genero"];
  }
}
?>

<!DOCTYPE html>
<body>
            <!-- Aqui você pode adicionar o formulário HTML existente -->
            <div class="container">      
            <form action="ControleShowsFilmesCONSULTA.php" method="post">                                      
            <label for="codigo">Código:</label>                    
            <input type="text" class="form-control" name="codigo" class="codigo" text><br> 
            
            <form action="ControleShowsFilmesCONSULTA.php" method="post">            
            <label for="titulo">Título:</label>
            <input type="text" class="form-control" name="titulo" class="titulo" text><br>
            
            <form action="ControleShowsFilmesCONSULTA.php" method="post">           
            <label for="artista">Artista:</label>
            <input type="text" class="form-control" name="artista" class="artista" text><br>
            
            <form action="ControleShowsFilmesCONSULTA.php" method="post">            
            <label for="anodelançamento">Ano de Lançamento:</label>
            <input type="text" class="form-control" name="anodelançamento" class="anodelançamento" text><br>
            
            <form action="ControleShowsFilmesCONSULTA.php" method="post">            
            <label for="datadacompra">Data da Compra:</label>
            <input type="text" class="form-control" name="datadacompra" class="datadacompra" text><br>
            
            <form action="ControleShowsFilmesCONSULTA.php" method="post">            
            <label for="situaçao">Situação:</label>
            <input type="text" class="form-control" name="situaçao" class="situaçao" text><br>
            
            <form action="ControleShowsFilmesCONSULTA.php" method="post">            
            <label for="tipo">Tipo:</label>
            <input type="text" class="form-control" name="tipo" class="tipo" text><br>
            
            <form action="ControleShowsFilmesCONSULTA.php" method="post">            
            <label for="genero">Gênero:</label>
            <input type="text" class="form-control" name="genero" class="genero" text>
 
            </div>

        <!--Cria o botão para inserir dados na Tabela e dá ação ao método Post-->
        <div class="container">         
        <form action="ControleShowsFilmesCONSULTA.php" method="post">         
        <form method="post">
        <button type="submit" name="consultaporcodigo">Consultar por Código</button>        

        <!--Cria o botão para consultar um valor na tabela (artista) e dá ação ao método Post-->
        <form action="ControleShowsFilmesCONSULTA.php" method="post">         
        <form method="post">
        <button type="submit" name="consultapornome">Consultar por Artista</button>

        <!--Cria o botão para consultar todos os dados no Formulário pelo genero-->
        <form action="ControleShowsFilmesCONSULTA.php" method="post">         
        <form method="post">        
        <button type="submit" name="consultaporgenero">Consultar por Gênero - dvd ou blu ray</button>

        <!--Cria o botão para consultar todos os dados no Formulário pelo genero-->
        <form action="ControleShowsFilmesCONSULTA.php" method="post">         
        <form method="post">        
        <button type="submit" name="consultaportipo">Consultar por Tipo - show ou filme</button>

        <!--Cria o botão para consultar todos os dados na tabela e dá ação ao método Post-->
        <form action="ControleShowsFilmesCONSULTA.php" method="post">         
        <form method="post">
        <button type="submit" name="buscar">Consultar todos os Dados da Tabela</button>

        <!--Cria o botão para apagar todos os dados no Formulário-->
        <form action="ControleShowsFilmesCONSULTA.php" method="post">         
        <form method="post">        
        <button type="submit" name="limpar">Apagar os Dados do Formulário</button><br><br>
        
        <!--Cria o botão para apagar encaminhar para a página Principal-->
        <form action="ControleShowsFilmesCONSULTA.php" method="post">         
        <form method="post">        
        
        <a href="">        
            <span class="fa fa-home"></span>           
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
            <a href="ControleShowsFilmes.php">
            <span>FAZER LOGIN</span><br>
            <p>VOCÊ PRECISA ESTAR LOGADO PARA REALIZAR INSERT E UPDATE NO BANCO!</p>
            </a>
		</div>

        <?php
  
          if(isset($_POST['buscar'])) {

          $servername = "localhost";
          $username = "root";
          $password = "";
          $dbname = "meubanco";
          $conn = new mysqli($servername, $username, $password, $dbname);
          
          // Consulta no banco de dados
          $sql = "SELECT * FROM bancoshowsfilmes";
          $resultado = $conn->query($sql);
        if ($resultado->num_rows > 0) {
                echo "<table><tr><th>Código </th><th>Titulo </th><th>Artista </th><th>Ano de Lançamento</th><th>Data da Compra</th><th>Situação </th><th>Tipo </th><th>Gênero </th></tr>";
                while($row = $resultado->fetch_assoc()) {
                  echo "<tr><th>" . $row["codigo"] . "</th><th>" . $row["titulo"] . "</th><th>" . $row["artista"] ."</th><th>" . $row["anodelançamento"] ."</th><th>" . $row["datadacompra"] ."</th><th>" . $row["situaçao"] ."</th><th>" . $row["tipo"] ."</th><th>" . $row["genero"] . "</th></tr>";
              }
            }

           else {
            echo "<h4>Nenhum resultado encontrado!<h4>";
            //echo "Nenhum resultado encontrado!";
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
         $sql = "SELECT * FROM bancoshowsfilmes WHERE codigo = ?";
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
        echo "<h4><th>Código:</th>" . $codigo . "<br><h4>";
        echo "Titulo: " . $titulo . "<br>";

        $artista = $row["artista"];
        $anodelançamento = $row["anodelançamento"];       
        echo "<th>Artista:</th> " . $artista . "<br>";
        echo "Ano de Lançamento: " . $anodelançamento . "<br>";

        $datadacompra = $row["datadacompra"];
        $situaçao = $row["situaçao"];        
        echo "Data da Compra: " . $datadacompra . "<br>";
        echo "Situaçao: " . $situaçao . "<br>";
        $tipo = $row["tipo"];
        $genero = $row["genero"];
        
        echo "Tipo: " . $tipo . "<br>";
        echo "Gênero: " . $genero . "<br><br>";       
    }
    } else {
        echo "<h4>Nenhum resultado encontrado!<h4>";
        //echo "Nenhum resultado encontrado!";
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
         
          $artista = "artista"; // Substitua com o valor desejado
          $artista = $_POST['artista'];

         // Consulta SQL com parâmetro
         $sql = "SELECT * FROM bancoshowsfilmes WHERE artista = ?";
         $stmt = $conn->prepare($sql);
         $stmt->bind_param("s", $artista);
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
        echo "<h4><th>codigo:</th>" . $codigo . "<br>";
        echo "titulo: " . $titulo . "<br>";

        $artista = $row["artista"];
        $anodelançamento = $row["anodelançamento"];       
        echo "<th>artista:</th> " . $artista . "<br>";
        //echo "anodelançamento: " . $anodelançamento . "<br>";

        $datadacompra = $row["datadacompra"];
        $situaçao = $row["situaçao"];        
        //echo "datadacompra: " . $datadacompra . "<br>";
        //echo "situaçao: " . $situaçao . "<br>";

        $tipo = $row["tipo"];
        $genero = $row["genero"];        
        echo "tipo: " . $tipo . "<br>";
        echo "genero: " . $genero . "<br><br>";
       
    }
    } else {
        echo "<h4>Nenhum resultado encontrado!<h4>";
        //echo "Nenhum resultado encontrado!";
      }

      // Fecha a conexão com o banco de dados
      
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
       $sql = "SELECT * FROM bancoshowsfilmes WHERE genero = ?";
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
      $titulo = $row["titulo"];
      echo "<h4><th>codigo:</th>" . $codigo . "<br>";
      echo "titulo: " . $titulo . "<br>";

      $artista = $row["artista"];
      //$anodelançamento = $row["anodelançamento"];       
      echo "<th>artista:</th> " . $artista . "<br>";
      //echo "anodelançamento: " . $anodelançamento . "<br>";

      $tipo = $row["tipo"];
      $genero = $row["genero"] . "<br>";      
      //echo "tipo: " . $tipo . "<br>";
      echo "genero: " . $genero . "<br>";       
  }
  } else {
    echo "<h4>Nenhum resultado encontrado!<h4>";
    //echo "Nenhum resultado encontrado!";
  }

  // Fecha a conexão com o banco de dados
  
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
       $sql = "SELECT * FROM bancoshowsfilmes WHERE tipo = ?";
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
      echo "<h4><th>codigo:</th>" . $codigo . "<br>";
      echo "titulo: " . $titulo . "<br>";

      $artista = $row["artista"];
      //$anodelançamento = $row["anodelançamento"];       
      echo "<th>artista:</th> " . $artista . "<br>";
      //echo "anodelançamento: " . $anodelançamento . "<br>";

      $tipo = $row["tipo"];
      $genero = $row["genero"] . "<br>";      
      echo "tipo: " . $tipo . "<br>";
      //echo "genero: " . $genero . "<br>";       
  }
  } else {
    echo "<h4>Nenhum resultado encontrado!<h4>";
    //echo "Nenhum resultado encontrado!";
  }

  // Fecha a conexão com o banco de dados
  
  $conn->close();
  exit();

      }

      //if ($_SERVER["REQUEST_METHOD"] == "limpar") {
        if(isset($_POST['limpar'])) {
        // Apagar os dados digitados nos campos do formulário
        unset($codigo);
        unset($titulo);
        unset($artista);
        unset($anodelançamento);
        unset($datadacompra);
        unset($situaçao);
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
          
  <!-- Tabela para mostrar dados -->
        <h2>Consulta na Tabela:</h2>
        <table class="table">
            <thead>                
            </thead>               
            </tbody>
        </table>

        <?php

  if(isset($_POST['autenticarusuario'])) {
  // Configurações do banco de dados
  $servername = "localhost";
  $username = "root";
  $password = "";
  $dbname = "meubanco";
  
  // Conexão com o banco de dados
  $conn = new mysqli($servername, $username, $password, $dbname);
  
  // Verifica se houve erro na conexão
  if ($conn->connect_error) {
      die("Erro na conexão com o banco de dados: " . $conn->connect_error);
  }
  
  // Inicializa as variáveis para armazenar as credenciais do usuário
  $usuario = "";
  $senha = "";
  
  // Verifica se o formulário foi enviado
  if ($_SERVER["REQUEST_METHOD"] == "POST") {
      // Obtém as credenciais do formulário
      $usuario = $_POST["usuario"];
      $senha = $_POST["senha"];
  
      // Consulta SQL para verificar se o usuário existe na tabela
      $sql = "SELECT * FROM bancousuario WHERE usuario = '$usuario' AND senha = '$senha'";
      $result = $conn->query($sql);
  
      // Verifica se a consulta retornou algum resultado
      if ($result->num_rows > 0) {
          echo "LOGIN BEM SUCEDIDO!"; 
          //redireciona para a página de sucesso
          //header("Location: ControleUsuarios.php");
          exit();
      } 
      else {
          // Autenticação falhou, exibe mensagem de erro
          $erro = "Usuário ou senha inválidos!";
      }
      // Fechar a conexão com o banco de dados
      $conn->close();
  }
  }
  ?>

</body>
</html>

       