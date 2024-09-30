<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <title>Gestão de Contatos Pessoais </title>
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
				<h1 class="text-center">Gestão de Contatos Pessoais</h1>
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
$sql = "SELECT codigo, nome, telefone, endereço FROM pessoas";
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


            <!-- Aqui você pode adicionar o formulário HTML existente -->
            <div class="container">      
            <form action="GestaoContatosPessoais.php" method="post">                                       
            <label for="codigo">Código:</label>                    
            <input type="text" class="form-control" name="codigo" class="codigo" text><br> 
            
            <form action="GestaoContatosPessoais.php" method="post">            
            <label for="nome">Nome:</label>
            <input type="text" class="form-control" name="nome" class="nome" text><br>
            
            <form action="GestaoContatosPessoais.php" method="post">           
            <label for="">Telefone:</label>
            <input type="text" class="form-control" name="telefone" class="telefone" text><br>

            <form action="GestaoContatosPessoais.php" method="post">           
            <label for="">Endereço:</label>
            <input type="text" class="form-control" name="endereço" class="endereço" text><br>

            </div>

        <!--Cria o botão para inserir dados na Tabela e dá ação ao método Post-->
        <div class="container">
        <form action="GestaoContatosPessoais.php" method="post">                            
        <form method="post">         
        <button type="submit" name="inserir">Inserir Dados na Tabela</button>         
       
         <!--Cria o botão para atualizar dados na Tabela e dá ação ao método Post-->         
         <form action="GestaoContatosPessoais.php" method="post">        
        <form method="post">
        <button type="submit" name="atualizar">Atualizar Dados na Tabela</button>           
       
        <!--Cria o botão para apagar dados na Tabela e dá ação ao método Post-->        
        <form method="post">
        <form action="GestaoContatosPessoais.php" method="post"> 
         <button type="submit" name="apagar">Excluir Dados na Tabela</button>
         
         <!--Cria o botão para consultar um valor na tabela (código) e dá ação ao método Post-->
        <form action="GestaoContatosPessoais.php" method="post">         
        <form method="post">
        <button type="submit" name="consultaporcodigo">Consultar por Código</button>        

        <!--Cria o botão para consultar um valor na tabela (artista) e dá ação ao método Post-->
        <form action="GestaoContatosPessoais.php" method="post">         
        <form method="post">
        <button type="submit" name="consultapornome">Consultar por Nome</button>

        <!--Cria o botão para consultar todos os dados no Formulário pelo genero-->
        <form action="GestaoContatosPessoais.php" method="post">         
        <form method="post">        
        <button type="submit" name="consultaportelefone">Consultar por Telefone</button>

        <!--Cria o botão para consultar todos os dados no Formulário pelo genero-->
        <form action="GestaoContatosPessoais.php" method="post">         
        <form method="post">        
        <button type="submit" name="consultaporendereço">Consultar por Endereço</button>

        <!--Cria o botão para consultar todos os dados na tabela e dá ação ao método Post-->
        <form action="GestaoContatosPessoais.php" method="post">         
        <form method="post">
        <button type="submit" name="buscar">Consultar todos os Dados da Tabela</button>

        <!--Cria o botão para apagar todos os dados no Formulário-->
        <form action="GestaoContatosPessoais.php" method="post">         
        <form method="post">        
        <button type="submit" name="limpar">Apagar os Dados do Formulário</button><br>
        
        <!--Cria o botão para apagar todos os dados no Formulário-->
        <form action="GestaoContatosPessoais.php" method="post">         
        <form method="post">            
        
        <!--<a href="">        
            <span class="fa fa-home"></span>            
            <img src="Imagens/casa.png" alt="icone de configuração">
            <a href="PaginaPessoal.php">
            <span>Página Principal</span><br>
            </a>-->

<head>
    <title>Gestao de Contatos Pessoais</title>
    <style>
        /* Estilos para modais (mesmos estilos do exemplo anterior) */
        .modal {
            /* ... */
        }

        .modal-content {
            /* ... */
        }

        .close {
            /* ... */
        }
    </style>

    <h3>Lista dos Contatos Pessoais:</h3>

    <!-- Botões para abrir modais para cada item -->
    <?php foreach ($itens as $item) : ?>
        <button onclick="abrirModal(<?php echo $item['codigo']; ?>)">código: <?php echo $item['codigo']; ?></button>
    <?php endforeach; ?><br><br>

    <!-- Modais para exibir os itens -->
    <?php foreach ($itens as $item) : ?>
        <div id="modal<?php echo $item['codigo']; ?>" class="modal">
            <div class="modal-content">
                <span class="close" onclick="fecharModal(<?php echo $item['codigo']; ?>)">&times;</span>
                <h4>Código: <?php echo $item['codigo']; ?></h4></p>
                <p><h5>Titulo: <?php echo $item['nome']; ?><h5></p>
                <p>Artista: <?php echo $item['telefone']; ?></p>
                <p>Ano de Lançamento: <?php echo $item['endereço']; ?></p>                          
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
        //exit(); 
    </script>

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
            $nome = $_POST['nome'];
            $telefone = $_POST['telefone'];
            $endereço = $_POST['endereço'];
            
            // realiza a consulta no banco de dados para obter as informações do registro a ser excluído   
            //if(isset($_POST['codigo'])) {                        
            $sql = "SELECT * FROM pessoas WHERE codigo = '$codigo'";
            $result = $conn->query($sql);

            if ($result->num_rows > 0) {
              echo "<h4>Código já existe no banco de dados!<br>";
             } else {              
              
            // Insere os dados na tabela                 
            $sql = "INSERT INTO pessoas SET codigo='$codigo', nome='$nome', telefone='$telefone', endereço='$endereço'";         
            }

            if ($conn->query($sql) === TRUE) {
              echo "<h4>Registro inserido com sucesso!<br> Último Código inserido: " . $codigo . "<br>";
              echo "<h4>Último Título inserido: " . $nome . "<br>";  

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
            $nome = $_POST['nome'];
            $telefone = $_POST['telefone'];
            $endereço = $_POST['endereço'];
            
            //if(isset($_POST['codigo'])) {
              $sql = "SELECT * FROM bancoshowsfilmes WHERE codigo = '$codigo' ";
              $result = $conn->query($sql);
            
              if ($result->num_rows > 0) {
               echo "<h4>Código já existe no banco de dados:"; 
              
                // Atualiza os dados na tabela 
                $sql = "UPDATE pessoas SET codigo='$codigo', nome='$nome', telefone='$telefone', endereço='$endereço' WHERE codigo='$codigo'";
              }
              
          if ($conn->query($sql) === TRUE) {          
           echo "<h4>Registro atualizado com sucesso!<br> Último Código atualizado: " . $codigo . "<br>";
           echo "<h4>Último Título atualizado: " . $nome . "<br>";
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
           $nome = $_POST['nome'];
           $telefone = $_POST['telefone'];
           $endereço = $_POST['endereço'];
           
           // Cria a consulta SQL para excluir o registro
        $sql = "DELETE FROM pessoas WHERE codigo = $codigo";

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
          $sql = "SELECT * FROM pessoas";
          $resultado = $conn->query($sql);
        if ($resultado->num_rows > 0) {
                echo "<table><tr><th>Código: </th><th>Nome: </th><th>Telefone: </th><th>Endereço </th></tr>";
                while($row = $resultado->fetch_assoc()) {
                  echo "<tr><th>" . $row["codigo"] . "</th><th>" . $row["nome"] . "</th><th>" . $row["telefone"] ."</th><th>" . $row["endereço"] . "</th></tr>";
              }
            }

           else {
            echo "<h4>Nenhum resultado encontrado!";
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
         $sql = "SELECT * FROM pessoas WHERE codigo = ?";
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
        $nome = $row["nome"];
        echo "<th>codigo:</th>" . $codigo . "<br>";
        echo "nome: " . $nome . "<br>";

        $telefone = $row["telefone"];
        $endereço = $row["endereço"];       
        echo "<th>telefone:</th> " . $telefone . "<br>";
        echo "endereço: " . $endereço . "<br>";
      
    }
    } else {
    echo "<h4>Nenhum resultado encontrado!";
    }

    // Fecha a conexão com o banco de dados
    $stmt->close();
    $conn->close();
    exit();        
        }         
        
        if(isset($_POST['consultapornome'])) {

          $servername = "localhost";
          $username = "root";
          $password = "";
          $dbname = "meubanco";
          $conn = new mysqli($servername, $username, $password, $dbname);
         
          $nome = "nome"; // Substitua com o valor desejado
          $nome = $_POST['nome'];

         // Consulta SQL com parâmetro
         $sql = "SELECT * FROM pessoas WHERE nome = ?";
         $stmt = $conn->prepare($sql);
         $stmt->bind_param("s", $nome);
         $stmt->execute();

         // Resultado da consulta
         $result = $stmt->get_result();

         // Verifica se existem resultados
         if ($result->num_rows > 0) {
          // Loop para exibir os resultados
          while ($row = $result->fetch_assoc()) {

        // Processar os dados obtidos
        $codigo = $row["codigo"];
        $nome = $row["nome"];       
        echo "<th>codigo:</th>" . $codigo . "<br>";
        echo "nome: " . $nome . "<br>";

        $telefone = $row["telefone"];
        $endereço = $row["endereço"];       
        echo "<th>telefone:</th> " . $telefone . "<br>";
        echo "endereço: " . $endereço . "<br><br>";
    }
    } else {
      echo "<h4>Nenhum resultado encontrado!";
      }

      // Fecha a conexão com o banco de dados
      $stmt->close();
      $conn->close();
      exit();
      }

      if(isset($_POST['consultaportelefone'])) {

        $servername = "localhost";
        $username = "root";
        $password = "";
        $dbname = "meubanco";
        $conn = new mysqli($servername, $username, $password, $dbname);
       
        $telefone = "telefone"; // Substitua com o valor desejado
        $telefone = $_POST['telefone'];

       // Consulta SQL com parâmetro
       $sql = "SELECT * FROM pessoas WHERE telefone = ?";
       $stmt = $conn->prepare($sql);
       $stmt->bind_param("s", $telefone);
       $stmt->execute();

       // Resultado da consulta
       $result = $stmt->get_result();

       // Verifica se existem resultados
       if ($result->num_rows > 0) {
        // Loop para exibir os resultados
        while ($row = $result->fetch_assoc()) {
      // Processar os dados obtidos
      $codigo = $row["codigo"];
      $nome = $row["nome"];
      echo "<th>codigo:</th>" . $codigo . "<br>";
      echo "nome: " . $nome . "<br>";      
      
      $telefone = $row["telefone"];
      $endereço = $row["endereço"] . "<br>";      
      echo "telefone: " . $telefone . "<br>";
      echo "endereço: " . $endereço . "<br>";       
  }
  } else {
  echo "<h4>Nenhum resultado encontrado!";
  }

  // Fecha a conexão com o banco de dados
  $stmt->close();
  $conn->close();
  exit();        
      }

      if(isset($_POST['consultaporendereço'])) {

        $servername = "localhost";
        $username = "root";
        $password = "";
        $dbname = "meubanco";
        $conn = new mysqli($servername, $username, $password, $dbname);
       
        $tipo = "endereço"; // Substitua com o valor desejado
        $tipo = $_POST['endereço'];

       // Consulta SQL com parâmetro
       $sql = "SELECT * FROM pessoas WHERE endereço = ?";
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
      $nome = $row["nome"];
      echo "<th>codigo:</th>" . $codigo . "<br>";
      echo "nome: " . $nome . "<br>";      
      
      $telefone = $row["telefone"];
      $endereço = $row["endereço"] . "<br>";      
      echo "telefone: " . $telefone . "<br>";
      echo "endereço: " . $endereço . "<br>";   
  }
  } else {
  echo "<h4>Nenhum resultado encontrado!";
  }

  // Fecha a conexão com o banco de dados
  $stmt->close();
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
          echo "<h4>LOGIN BEM SUCEDIDO!"; 
          //redireciona para a página de sucesso
          //header("Location: ControleUsuarios.php");
          exit();
      } 
      else {
          // Autenticação falhou, exibe mensagem de erro
          $erro = "<h4>Usuário ou senha inválidos!";
      }
      // Fechar a conexão com o banco de dados
      $conn->close();
  }
  }

?>

<!DOCTYPE html>
<title>Login</title>
</head>
<body>
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

</body>
</html>