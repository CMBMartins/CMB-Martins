<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <title>Gestão de Usuários </title>
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
			<div class="col">      
				<img src="Imagens/logo.png" alt="Logo da Minha Empresa" class="img-fluid">
        <?php date_default_timezone_set('America/Sao_Paulo'); ?>
        <?php $hoje = date('d/m/Y'); ?>
        <?php $horaHoje = date("H:i:s"); ?>
        <?php echo $hoje; ?><br>
        <?php echo $horaHoje; ?><br>                             
               
			</div>
			<div class="col align-self-center">
				<h1 class="text-center">Gestão de Usuários</h1>
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
<!DOCTYPE html>
<body>
<div class="container">
    <h3>Cadastro ou Alteração de Usuários</h3>

        <form method="POST" action="<?php echo $_SERVER["PHP_SELF"]; ?>">       
        <form action="ControleUsuarios.php" method="post">
        <label for="codigo">Código:</label>
        <input type="text" name="codigo" id="codigo" text>
        
        <label for="usuario">Usuário:</label>
        <input type="text" name="usuario" id="usuario" required>

        <label for="senha">Senha:</label>
        <input type="password" name="senha" id="senha" required>

        <label for="perfil">Perfil:</label>        
        <input type="text" name="perfil" id="perfil" text><br><br>
  </div>  
  
        <div class="container">
        <form action="ControleUsuarios.php" method="post">                            
        <form method="post">         
        <button type="submit" name="realizarLogin">REALIZAR LOGIN</button>       
        
        <form action="ControleUsuarios.php" method="post">                            
        <form method="post">         
        <button type="submit" name="cadastrarUsuario">Cadastrar Usuário</button> 
        <!--<button type="cadastrar">Cadastrar</button>-->

        <form action="ControleUsuarios.php" method="post">                            
        <form method="post">         
        <button type="submit" name="atualizarUsuario">Atualizar Usuário</button>

        <form method="post">         
        <button type="submit" name="apagarUsuario">Excluir Usuário</button>

        <form method="post">         
        <button type="submit" name="consultarusuario">Consultar por Usuário</button>

        <form method="post">         
        <button type="submit" name="consultarcodigo">Consultar todos Usuários</button><br><br>
 
        </form>
    </div>
 
<!DOCTYPE html>
<html>
<head>
<div class="container">

    <?php
    // Verifica se o formulário foi enviado
    if ($_SERVER["REQUEST_METHOD"] == "POST" && isset($_POST['cadastrarUsuario'])) {
        // Configurações de conexão
        $host = "localhost";      // Endereço do servidor PostgreSQL
        $port = "5432";           // Porta padrão do PostgreSQL
        $dbname = "meubanco";     // Nome do banco de dados
        $user = "postgres";    // Usuário do PostgreSQL
        $password = "Felipe15anos";  // Senha do PostgreSQL

        // Criando a string de conexão
        $connectionString = "host=$host port=$port dbname=$dbname user=$user password=$password";

        // Conectando ao banco de dados
        $conn = pg_connect($connectionString);

        if (!$conn) {
            die("Erro ao conectar ao banco de dados PostgreSQL.");
        }

        $codigo ='codigo';
        $usuario = 'usuario';
        $senha = 'senha'; // Hash da senha para segurança
        $perfil = 'perfil';

        // Obtendo dados do formulário
        $codigo = intval($_POST['codigo']);
        $usuario = $_POST['usuario'];
        $senha = password_hash($_POST['senha'], PASSWORD_BCRYPT); // Hash da senha para segurança
        $perfil = $_POST['perfil'];

        // Verifica se o usuário já existe
        $query_check = "SELECT COUNT(*) AS total FROM bancousuario WHERE usuario = $1";
        $result_check = pg_query_params($conn, $query_check, array($usuario));
        $row = pg_fetch_assoc($result_check);

        if ($row['total'] > 0) {
            echo "<h4><p style='color: red;'>Usuário já existe!</p>";
        } else {
            // Insere o novo usuário
            $query_insert = "INSERT INTO bancousuario (codigo, usuario, senha, perfil) VALUES ($1, $2, $3, $4)";
            $result_insert = pg_query_params($conn, $query_insert, array($codigo, $usuario, $senha, $perfil));

            if ($result_insert) {
                echo "<h4><p style='color: green;'>Usuário cadastrado com sucesso!</p>";
            } else {
                echo "<h4><p style='color: red;'>Erro ao cadastrar usuário: " . pg_last_error($conn) . "</p>";
            }
        }

        // Fechando a conexão
        pg_close($conn);
    }

    // Verifica se o formulário foi enviado
  if ($_SERVER["REQUEST_METHOD"] == "POST" && isset($_POST['realizarLogin'])) {
    // Configurações de conexão
    $host = "localhost";      // Endereço do servidor PostgreSQL
    $port = "5432";           // Porta padrão do PostgreSQL
    $dbname = "meubanco";     // Nome do banco de dados
    $user = "postgres";    // Usuário do PostgreSQL
    $password = "Felipe15anos";  // Senha do PostgreSQL

    try {
        // Criando uma nova conexão com PDO
        $dsn = "pgsql:host=$host;port=$port;dbname=$dbname;";
        $pdo = new PDO($dsn, $user, $password);
    
        // Configurando o modo de erros para exceções
        $pdo->setAttribute(PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION);
    
        // Variáveis para mensagens
        $mensagemLogin = "";
        $mensagemCadastro = "";
    
        // Verifica se o formulário de login foi enviado
        
            $usuario = $_POST['usuario'];
            $senha = $_POST['senha'];
    
            // Consulta para verificar o usuário e senha
            $query = "SELECT * FROM bancousuario WHERE usuario = :usuario";
            $stmt = $pdo->prepare($query);
            $stmt->bindParam(':usuario', $usuario, PDO::PARAM_STR);
            $stmt->execute();
    
            $user = $stmt->fetch(PDO::FETCH_ASSOC);
    
            if ($user && password_verify($senha, $user['senha'])) {
                // Usuário autenticado com sucesso
                $autenticado = true;
                $mensagemLogin = "<h4>Bem-vindo, " . htmlspecialchars($user['usuario']) . "!";
                echo $mensagemLogin;
            } else {
                // Falha na autenticação
                $autenticado = false;
                $mensagemLogin = "<h4>Usuário ou senha inválidos!";
                echo $mensagemLogin;
            }
    
    } catch (PDOException $e) {
        // Tratamento de erros no banco de dados
        die("Erro ao acessar o banco de dados: " . $e->getMessage());
    }
    }

    if(isset($_POST['consultarusuario'])) {

    // Configurações de conexão
    $host = "localhost";      // Endereço do servidor PostgreSQL
    $port = "5432";           // Porta padrão do PostgreSQL
    $dbname = "meubanco";     // Nome do banco de dados
    $user = "postgres";    // Usuário do PostgreSQL
    $password = "Felipe15anos";  // Senha do PostgreSQL

    $connectionString = "host=$host port=$port dbname=$dbname user=$user password=$password";

    // Conectando ao banco de dados
    $conn = pg_connect($connectionString);

    if (!$conn) {
        die("Erro ao conectar ao banco de dados PostgreSQL.");
    }  

try {
    // Criando uma nova conexão com PDO
    $dsn = "pgsql:host=$host;port=$port;dbname=$dbname;";
    $pdo = new PDO($dsn, $user, $password);

    // Configurando o modo de erros para exceções
    $pdo->setAttribute(PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION);

    // Verifica se o formulário foi enviado    
        $usuario = $_POST['usuario'];
        $perfil = $_POST['perfil'];
        

        // Consulta ao banco de dados para obter o nome do usuário
        $query = "SELECT usuario, perfil FROM bancousuario WHERE usuario = :usuario";
        $stmt = $pdo->prepare($query);
        $stmt->bindParam(':usuario', $usuario, PDO::PARAM_STR);
        $stmt->execute();

        // Verifica se há resultados
        if ($stmt->rowCount() > 0) {
            $row = $stmt->fetch(PDO::FETCH_ASSOC);
            $nomeUsuario = htmlspecialchars($row['usuario']);
            $nomePerfil = htmlspecialchars($row['perfil']);
            $mensagem = "<h4>Usuario: $nomeUsuario";
            $mensagem1 = "<h4>Perfil: $nomePerfil";           
            //echo "<h4><p>Perfil: $perfil</p>";
        } else {
            $mensagem = "<h4>Usuário não encontrado!";
        }
} 
catch (PDOException $e) {
    // Tratamento de erros no banco de dados
    $mensagem = "Erro ao acessar o banco de dados: " . $e->getMessage();
}

// Exibe a mensagem, se existir
if (isset($mensagem)) {
    echo "<h4><p>$mensagem</p>";
    echo "<h4><p>$mensagem1</p>";
}
    }

    if(isset($_POST['consultarcodigo'])) {

// Configurações de conexão
$host = "localhost";      // Endereço do servidor PostgreSQL
$port = "5432";           // Porta padrão do PostgreSQL
$dbname = "meubanco";     // Nome do banco de dados
$user = "postgres";    // Usuário do PostgreSQL
$password = "Felipe15anos";  // Senha do PostgreSQL

try {
    // Criando uma nova conexão com PDO
    $dsn = "pgsql:host=$host;port=$port;dbname=$dbname;";
    $pdo = new PDO($dsn, $user, $password);

    // Configurando o modo de erros para exceções
    $pdo->setAttribute(PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION);

    // Consulta para selecionar os dados
    $query = "SELECT codigo, usuario FROM bancousuario";
    $stmt = $pdo->prepare($query);
    $stmt->execute();

    // Busca todos os registros da consulta
    $usuarios = $stmt->fetchAll(PDO::FETCH_ASSOC);
} catch (PDOException $e) {
    // Tratamento de erros no banco de dados
    die("Erro ao acessar o banco de dados: " . $e->getMessage());
}

            // Verifica se há resultados e os exibe
            if (!empty($usuarios)) {
                foreach ($usuarios as $usuario) {
                    echo "<tr>";
                    echo "<h4><td>" . htmlspecialchars($usuario['codigo']) . "</td>";
                    echo "<h4><td>" . htmlspecialchars($usuario['usuario']) . "</td>";
                    echo "</tr>";
                }
            } else {
                echo "<tr><td colspan='2'>Nenhum usuário encontrado.</td></tr>";
            }
        }
 
    if(isset($_POST['apagarUsuario'])) {

// Configurações de conexão
$host = "localhost";      // Endereço do servidor PostgreSQL
$port = "5432";           // Porta padrão do PostgreSQL
$dbname = "meubanco";     // Nome do banco de dados
$user = "postgres";    // Usuário do PostgreSQL
$password = "Felipe15anos";  // Senha do PostgreSQL

try {
    // Criando uma nova conexão com PDO
    $dsn = "pgsql:host=$host;port=$port;dbname=$dbname;";
    $pdo = new PDO($dsn, $user, $password);

    // Configurando o modo de erros para exceções
    $pdo->setAttribute(PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION);

    // Verifica se o formulário foi enviado
    if ($_SERVER["REQUEST_METHOD"] == "POST") {
        $codigo = $_POST['codigo'];

        // Valida se o código foi preenchido
        if (!empty($codigo)) {
            // Consulta para deletar o registro
            $query = "DELETE FROM bancousuario WHERE codigo = :codigo";
            $stmt = $pdo->prepare($query);
            $stmt->bindParam(':codigo', $codigo, PDO::PARAM_INT);

            // Executa a consulta e verifica se algo foi deletado
            if ($stmt->execute() && $stmt->rowCount() > 0) {
                $mensagem = "Registro com o código $codigo foi excluído com sucesso.";
            } else {
                $mensagem = "<h4>Nenhum registro encontrado com o código $codigo.";
            }
        } else {
            $mensagem = "<h4>Por favor, informe um código válido!";
        }
    }
} catch (PDOException $e) {
    // Tratamento de erros no banco de dados
    $mensagem = "<h4>Erro ao acessar o banco de dados: " . $e->getMessage();
}

    // Exibe a mensagem, se existir
    if (isset($mensagem)) {
        echo "<h4><p>$mensagem</p>";
    }
}

if(isset($_POST['atualizarUsuario'])) {

// Configurações de conexão
$host = "localhost";      // Endereço do servidor PostgreSQL
$port = "5432";           // Porta padrão do PostgreSQL
$dbname = "meubanco";     // Nome do banco de dados
$user = "postgres";    // Usuário do PostgreSQL
$password = "Felipe15anos";  // Senha do PostgreSQL

try {
    // Criando uma nova conexão com PDO
    $dsn = "pgsql:host=$host;port=$port;dbname=$dbname;";
    $pdo = new PDO($dsn, $user, $password);

    // Configurando o modo de erros para exceções
    $pdo->setAttribute(PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION);

    // Verifica se o formulário foi enviado
    if ($_SERVER["REQUEST_METHOD"] == "POST") {
        $codigo = $_POST['codigo'];
        $usuario = $_POST['usuario'];
        $senha = $_POST['senha'];
        $perfil = $_POST['perfil'];

        // Validações simples
        if (!empty($codigo) && !empty($usuario) && !empty($senha) && !empty($perfil)) {
            // Hash da senha antes de salvar (opcional, recomendado)
            $senhaHash = password_hash($senha, PASSWORD_DEFAULT);

            // Consulta para atualizar o registro
            $query = "UPDATE bancousuario SET usuario = :usuario, senha = :senha, perfil = :perfil WHERE codigo = :codigo";
            $stmt = $pdo->prepare($query);
            $stmt->bindParam(':codigo', $codigo, PDO::PARAM_INT);
            $stmt->bindParam(':usuario', $usuario, PDO::PARAM_STR);
            $stmt->bindParam(':senha', $senhaHash, PDO::PARAM_STR);
            $stmt->bindParam(':perfil', $perfil, PDO::PARAM_STR);

            // Executa a consulta
            if ($stmt->execute()) {
                $mensagem = "<h4>Registro com o código $codigo atualizado com sucesso!";
            } else {
                $mensagem = "<h4>Erro ao atualizar o registro.";
            }
        } else {
            $mensagem = "<h4>Todos os campos são obrigatórios.";
        }
    }
} catch (PDOException $e) {
    // Tratamento de erros no banco de dados
    $mensagem = "<h4>Erro ao acessar o banco de dados: " . $e->getMessage();
}
    // Exibe a mensagem, se existir
    if (isset($mensagem)) {
        echo "<h4><p>$mensagem</p>";
    }
}
    ?>