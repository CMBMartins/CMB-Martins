<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <title>Login </title>
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
<div class="container">
    
<style>
        body {
            background-color: #f6f6f6; /* Escolha a cor de fundo */
        }
		</style>
        
		<div class="col">      
		<img src="Imagens/logo.png" alt="Logo da Minha Empresa" class="img-fluid">
        <?php date_default_timezone_set('America/Sao_Paulo'); ?>
        <?php $hoje = date('d/m/Y'); ?>
        <?php $horaHoje = date("H:i:s"); ?>
        <?php echo $hoje; ?><br>
        <?php echo $horaHoje; ?><br>       
                
			</div>
			<div class="col align-self-center">
				<h1 class="text-center">LOGIN</h1>
                <img src="Imagens/Carlos.png" alt="Logo da Minha Empresa" class="img-fluid"><br><br>        
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
$sql = "SELECT codigo, usuario, senha, perfil FROM bancousuario";
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

<!DOCTYPE html>
<body>
<div class="container">
    <h3>Realizar Login</h3>

        <form method="POST" action="<?php echo $_SERVER["PHP_SELF"]; ?>">
       
        <form action="ControleUsuarios.php" method="post">
        <!--<label for="codigo">Código:</label>
        <input type="text" name="codigo" id="codigo" text>-->
        
        <label for="usuario">Usuário:</label>
        <input type="text" name="usuario" id="usuario" required>

        <label for="senha">Senha:</label>
        <input type="password" name="senha" id="senha" text>

        <label for="perfil">Perfil:</label>        
        <input type="text" name="perfil" id="perfil" text><br><br> 
  
        <div class="container">
        <form action="ControleUsuarios.php" method="post">                            
        <form method="post">         
        <button type="submit" name="realizarLogin">REALIZAR LOGIN</button>       
        
        <form action="ControleUsuarios.php" method="post">                            
        <form method="post">         
        <button type="submit" name="cadastrarUsuario">CADASTRAR USUÁRIO</button> 
        
        <form method="post">         
        <button type="submit" name="consultarusuario">CONSULTAR USUÁRIO</button><br><br>

        </form>
    
<!--<!DOCTYPE html>
<html>
<head>-->

<?php
// Configurações do banco de dados
    if(isset($_POST['realizarLogin'])) {
          
    // Conexão com o banco de dados
    $servername = "localhost";
    $username = "root";
    $password = "";
    $dbname = "meubanco";
    $conn = new mysqli($servername, $username, $password, $dbname);
    
    if ($conn->connect_error) {
      throw new Exception("Falha na conexão: " . $conn->connect_error);
  }        
  
// Conexão com o banco de dados
$conn = new mysqli($servername, $username, $password, $dbname);

// Verifica se houve erro na conexão
if ($conn->connect_error) {
    die("Erro na conexão com o banco de dados: " . $conn->connect_error);
}

// Inicializa as variáveis para armazenar as credenciais do usuário
$usuario = "";
$senha = "";
//$perfil = "";

// Verifica se o formulário foi enviado
if ($_SERVER["REQUEST_METHOD"] == "POST") {
    // Obtém as credenciais do formulário
    $usuario = "";
    $senha = "";
    $usuario = $_POST["usuario"];
    $senha = $_POST["senha"];
    //$perfil = $_POST["perfil"];

    // Consulta SQL para verificar se o usuário existe na tabela
    $sql = "SELECT * FROM bancousuario WHERE usuario = '$usuario' AND senha = '$senha'";
    $result = $conn->query($sql);

    // Verifica se a consulta retornou algum resultado
    if ($result->num_rows > 0) {
       
        echo "<h4>Login Realizado com Sucesso!"; 
        echo "<h4>Usuário consultado: $usuario";
        header('Location: PaginaPessoal.php');       
        exit();        
    } 
       
    else {
        // Autenticação falhou, exibe mensagem de erro
        $erro = "<h4>Usuário ou senha inválidos!";
    }
    $conn->close();
    }
}
?>
    
    <h3>Lista dos Usuários:</h3><br>

    <!-- Botões para abrir modais para cada item -->
    <?php foreach ($itens as $item) : ?>
        <button onclick="abrirModal(<?php echo $item['codigo']; ?>)">Código: <?php echo $item['codigo']; ?></button>
    <?php endforeach; ?><br><br>

    <!-- Modais para exibir os itens -->
    <?php foreach ($itens as $item) : ?>
        <div id="modal<?php echo $item['codigo']; ?>" class="modal">
            <div class="modal-content">
                <span class="close" onclick="fecharModal(<?php echo $item['codigo']; ?>)">&times;</span>
                <h2>Código: <?php echo $item['codigo']; ?></h2>
                <p>Usuário: <?php echo $item['usuario']; ?></p>
                <p>Perfil: <?php echo $item['perfil']; ?></p>
            </div>
        </div>
    <?php endforeach; ?>

    <script>
        // Função para abrir um modal
        function abrirModal(codigo) {
            var modal = document.getElementById("modal" + codigo);
            modal.style.display = "block";
        }

        // Função para fechar um modal
        function fecharModal(codigo) {
            var modal = document.getElementById("modal" + codigo);
            modal.style.display = "none";
        }
    </script>
    </div>
<!--</body>
</html>-->

<?php

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
$codigo = "";
$usuario = "";
$senha = "";
$perfil = "";

// Verifica se o formulário foi enviado
if ($_SERVER["REQUEST_METHOD"] == "POST") {

    // Obtém as credenciais do formulário
    //$codigo = $_POST["codigo"];
    $usuario = $_POST["usuario"];
    $senha = $_POST["senha"];
    $perfil = $_POST["perfil"];

    // Consulta SQL para verificar se o usuário existe na tabela
    $sql = "SELECT * FROM bancousuario WHERE usuario = '$usuario' AND senha = '$senha' ";
    $result = $conn->query($sql);

    }else {
        // Autenticação falhou, exibe mensagem de erro
        //echo "<h4>Usuário ou senha inválidos!</h4><div class='card'>";
        $erro = "Usuário ou senha inválidos!";

    // Fechar a conexão com o banco de dados
    $conn->close();
}

if(isset($_POST['cadastrarUsuario'])) {

    // Configurações de conexão com o banco de dados
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

    // Dados do formulário
    //$codigo = $_POST["codigo"];
    $usuario = $_POST["usuario"];
    $senha = $_POST["senha"];
    $perfil = $_POST["perfil"];

    if(isset($_POST['usuario'])) {                        
        $sql = "SELECT * FROM bancousuario WHERE usuario = '$usuario'";
        $result = $conn->query($sql);

        if ($result->num_rows > 0) {
          echo "<h4>Código já existe no banco de dados!<br>";
         } else {              
    
    // Consulta SQL para inserir os dados na tabela
    $sql = "INSERT INTO bancousuario (usuario, senha, perfil) VALUES ('$usuario', '$senha', '$perfil')";
         }
      
    // Executa a consulta
    if ($conn->query($sql) === TRUE) {
        echo "<h4>Cadastro Realizado com Sucesso!<div class='card'>$usuario</h4></div>";
        //echo "Cadastro realizado com sucesso!<br>";
        //echo "<h4>Último Usuário inserido foi:<div class='card'>$usuario</h4></div>";
        echo "<h4>Último Usuário inserido:  $usuario<br>";
    } else {
        echo "Erro ao cadastrar: " . $conn->error;
    }
}
    
    // Fecha a conexão com o banco de dados
    $conn->close();
    }

    if(isset($_POST['consultarusuario'])) {

        $servername = "localhost";
        $username = "root";
        $password = "";
        $dbname = "meubanco";
        $conn = new mysqli($servername, $username, $password, $dbname);
       
        $usuario = "usuario"; // Substitua com o valor desejado
        $usuario = $_POST['usuario'];

       // Consulta SQL com parâmetro
       $sql = "SELECT * FROM bancousuario WHERE usuario = ?";
       $stmt = $conn->prepare($sql);
       $stmt->bind_param("s", $usuario);
       $stmt->execute();

       // Resultado da consulta
       $result = $stmt->get_result();

       // Verifica se existem resultados
       if ($result->num_rows > 0) {
        // Loop para exibir os resultados
        while ($row = $result->fetch_assoc()) {

      // Processar os dados obtidos
      $codigo = $row["codigo"];
      $usuario = $row["usuario"];
      $perfil = $row["perfil"];
      
      echo "<h4>Código:$codigo";
      echo "<h4>Usuário:$usuario";
      echo "<h4>Perfil:$perfil";
              
  }
  } else {
    echo "Nenhum resultado encontrado!";
    }

    // Fecha a conexão com o banco de dados    
    $conn->close();
    //exit();
    }
  ?>

</div> 
</body>
</html>
