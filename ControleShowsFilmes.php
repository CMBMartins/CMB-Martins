<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <title>Gestão de Mídias DE SHOWS E FILMES </title>
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
            background-color: #f6f6f6; /* Escolha a cor de fundo */
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
            <span>Página Principal</span><br>
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

// Cria uma conexão com o banco de dados
$conn = new mysqli($servername, $username, $password, $dbname);

// Verifica se ocorreu algum erro na conexão
if ($conn->connect_error) {
    die("Falha na conexão: " . $conn->connect_error);
}

// Consulta SQL para selecionar os itens na tabela
$sql = "SELECT codigo, titulo, artista, anodelançamento, datadacompra, situaçao, tipo, genero FROM bancoshowsfilmes";
$result = $conn->query($sql);

// Inicializa uma variável para armazenar os resultados da consulta
$itens = array();

if ($result->num_rows > 0) {
    while ($row = $result->fetch_assoc()) {
        $itens[] = $row;
    }
}
// Fecha a conexão com o banco de dados
$conn->close();
?>

<!--<!DOCTYPE html>
<body>-->
            <!-- Aqui você pode adicionar o formulário HTML existente -->
            <div class="container">      
            <form action="ControleShowsFilmes.php" method="post">                                       
            <label for="codigo">Código:</label>                    
            <input type="text" class="form-control" name="codigo" class="codigo" text><br> 
            
            <form action="ControleShowsFilmes.php" method="post">            
            <label for="titulo">Título:</label>
            <input type="text" class="form-control" name="titulo" class="titulo" text><br>
            
            <form action="ControleShowsFilmes.php" method="post">           
            <label for="artista">Artista:</label>
            <input type="text" class="form-control" name="artista" class="artista" text><br>
            
            <form action="ControleShowsFilmes.php" method="post">            
            <label for="anodelançamento">Ano de Lançamento:</label>
            <input type="text" class="form-control" name="anodelançamento" class="anodelançamento" text><br>
            
            <form action="ControleShowsFilmes.php" method="post">            
            <label for="datadacompra">Data da Compra:</label>
            <input type="text" class="form-control" name="datadacompra" class="datadacompra" text><br>
            
            <form action="ControleShowsFilmes.php" method="post">            
            <label for="situaçao">Situação:</label>
            <input type="text" class="form-control" name="situaçao" class="situaçao" text><br>
            
            <form action="ControleShowsFilmes.php" method="post">            
            <label for="tipo">Tipo:</label>
            <input type="text" class="form-control" name="tipo" class="tipo" text><br>
            
            <form action="ControleShowsFilmes.php" method="post">            
            <label for="genero">Gênero:</label>
            <input type="text" class="form-control" name="genero" class="genero" text>
            </div>

        <!--Cria o botão para inserir dados na Tabela e dá ação ao método Post-->
        <div class="container">
        <form action="ControleShowsFilmes.php" method="post">                            
        <form method="post">         
        <button type="submit" name="inserir">Inserir Dados na Tabela</button>         
       
         <!--Cria o botão para atualizar dados na Tabela e dá ação ao método Post-->         
         <form action="ControleShowsFilmes.php" method="post">        
        <form method="post">
        <button type="submit" name="atualizar">Atualizar Dados na Tabela</button>           
       
        <!--Cria o botão para apagar dados na Tabela e dá ação ao método Post-->        
        <form method="post">
        <form action="ControleShowsFilmes.php" method="post"> 
         <button type="submit" name="apagar">Excluir Dados na Tabela</button>
         
        <!--Cria o botão para apagar todos os dados no Formulário-->
        <form action="ControleShowsFilmes.php" method="post">         
        <form method="post">        
        <button type="submit" name="limpar">Apagar os Dados do Formulário</button>
        
        <!--Cria o botão para apagar todos os dados no Formulário-->
        <form action="ControleShowsFilmes.php" method="post">         
        <form method="post">
        <button type="submit" name="buscar">Consultar todos os Dados na Tabela</button><br><br>            
        
        <a href="">        
            <span class="fa fa-home"></span>            
            <!--<img src="Imagens/casa.png" alt="icone de configuração">-->
            <a href="PaginaPessoal.php">
            <span>Página Principal</span>
            </a>

       <?php
  
        if(isset($_POST['inserir'])) {
          
        // Conexão com o banco de dados
        $servername = "localhost";
        $username = "root";
        $password = "";
        $dbname = "meubanco";
        $conn = new mysqli($servername, $username, $password, $dbname);
        
        if ($conn->connect_error) {
          throw new Exception("Falha na conexão: " . $conn->connect_error);
      }
            
            // Recebe os Dados do Formulário            
            $codigo = $_POST['codigo'];
            $titulo = $_POST['titulo'];
            $artista = $_POST['artista'];
            $anodelançamento = $_POST['anodelançamento'];
            $datadacompra = $_POST['datadacompra'];
            $situaçao = $_POST['situaçao'];
            $tipo = $_POST['tipo'];
            $genero = $_POST['genero'];
            
            // realiza a consulta no banco de dados para obter as informações do registro a ser excluído   
            //if(isset($_POST['codigo'])) {                        
            $sql = "SELECT * FROM bancoshowsfilmes WHERE codigo = '$codigo'";
            $result = $conn->query($sql);

            if ($result->num_rows > 0) {
              echo "<h4>Código já existe!<h4>";
              //echo "Código já existe no banco de dados!<br>";
             } else {              
              
            // Insere os dados na tabela                 
            $sql = "INSERT INTO bancoshowsfilmes SET codigo='$codigo', titulo='$titulo', artista='$artista', anodelançamento='$anodelançamento', datadacompra='$datadacompra', situaçao='$situaçao', tipo='$tipo', genero='$genero'";         
            }

            if ($conn->query($sql) === TRUE) {
              echo "<h4>Registro inserido com sucesso!";
              //echo "Registro inserido com sucesso!<br> Último Código inserido: " . $codigo . "<br>";
              echo "<h4>Último Título inserido: " . $titulo . "<br>";  

          } else {            
          echo "<h4>Erro ao inserir dados!<br> " . $conn->error;
          }     
           
            $conn->close();            
            exit();                  
        }      

            if(isset($_POST['atualizar'])) {

            $servername = "localhost";
            $username = "root";
            $password = "";
            $dbname = "meubanco";
            $conn = new mysqli($servername, $username, $password, $dbname);

            if ($conn->connect_error) {
              throw new Exception("Falha na conexão: " . $conn->connect_error);
          }
          
            $codigo = $_POST['codigo'];
            $titulo = $_POST['titulo'];
            $artista = $_POST['artista'];
            $anodelançamento = $_POST['anodelançamento'];
            $datadacompra = $_POST['datadacompra'];
            $situaçao = $_POST['situaçao'];
            $tipo = $_POST['tipo'];
            $genero = $_POST['genero'];

            //if(isset($_POST['codigo'])) {
              $sql = "SELECT * FROM bancoshowsfilmes WHERE codigo = '$codigo' ";
              $result = $conn->query($sql);
            
              if ($result->num_rows > 0) {
               echo "<h4>Código já existe no banco de dados:"; 
              
                // Atualiza os dados na tabela 
                $sql = "UPDATE bancoshowsfilmes SET codigo='$codigo', titulo='$titulo', artista='$artista', anodelançamento='$anodelançamento', datadacompra='$datadacompra', situaçao='$situaçao', tipo='$tipo', genero='$genero' WHERE codigo='$codigo'";
              }
              
          if ($conn->query($sql) === TRUE) {          
           echo "<h4>Registro atualizado com sucesso!";
           echo "<h4>Último Título atualizado: " . $titulo . "<br>";
            } else {      
              echo "<h4>Erro ao atualizar registro!<br>" . $conn->error;
           }
           $conn->close();
            exit();
          }
       
        if(isset($_POST['apagar'])) {

          $servername = "localhost";
          $username = "root";
          $password = "";
          $dbname = "meubanco";
          $conn = new mysqli($servername, $username, $password, $dbname);

         // Verifica se ocorreu algum erro na conexão
         if ($conn->connect_error) {
         die("Falha na conexão: " . $conn->connect_error);
        }

       // Verifica se o formulário foi enviado
       if ($_SERVER["REQUEST_METHOD"] == "POST") {

       // Verifica se o parâmetro de identificação do registro a ser excluído foi fornecido    
           $codigo = $_POST['codigo'];
           $titulo = $_POST['titulo'];
           $artista = $_POST['artista'];
           $anodelançamento = $_POST['anodelançamento'];
           $datadacompra = $_POST['datadacompra'];
           $situaçao = $_POST['situaçao'];
           $tipo = $_POST['tipo'];
           $genero = $_POST['genero'];

           // Cria a consulta SQL para excluir o registro
        $sql = "DELETE FROM bancoshowsfilmes WHERE codigo = $codigo";

        // Executa a consulta
        if ($conn->query($sql) === TRUE) {
            echo "<h4>Registro com Código: $codigo foi excluído com sucesso!";
        } else {
            echo "<h4>Erro ao excluir registro: " . $conn->error;
        }
        } else {
           echo "<h4>Parâmetro de identificação do registro não fornecido.";
        }         
            $conn->close();
            exit();
            }           
        
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
            echo "<h4>Nenhum resultado encontrado!";
          }              
          // Fechamento da conexão com o banco de dados
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
          echo "<h4>Dados apagados com sucesso no Formulário!";
        }
         
        else {
        throw new Exception("<h4>Erro ao Apagar no Formulário! " . $conn->error); 
        }
        exit();
        }
      
      ?>
        
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
      die("<h4>Erro na conexão com o banco de dados: " . $conn->connect_error);
  }
  
  // Inicializa as variáveis para armazenar as credenciais do usuário
  //$usuario = "";
  //$senha = "";
  
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
          echo "<h4>Login Realizado com Sucesso!";
          echo "<h4>Usuário: $usuario"; 
          //redireciona para a página de sucesso
          //header("Location: ControleUsuarios.php");
      } 
      else {
          // Autenticação falhou, exibe mensagem de erro
          $erro = "<h4>Usuário ou senha inválidos!";
      }

      // Fechar a conexão com o banco de dados
      $conn->close();
      exit();
  }
  }

?>

<title>Login</title>

<div class="container">
    <h2>Login</h2>
    <button type="submit" name="autenticarusuario">REALIZAR LOGIN</button <br> <p>VOCÊ PRECISA ESTAR LOGADO PARA UTILIZAR O SISTEMA!</p>
    <?php if (isset($erro)) { ?>
        <p><?php echo $erro; ?></p>
    <?php }    
    ?>

        <form method="POST" action="<?php echo $_SERVER["PHP_SELF"]; ?>">
        <label for="usuario">Usuário:</label>
        <input type="text" name="usuario" id="usuario" required>

        <label for="senha">Senha:</label>
        <input type="password" name="senha" id="senha" required><br><br>

        <!--Tabela para mostrar dados -->
        <h2>Consulta na Tabela:</h2>

</body>
</html>

       