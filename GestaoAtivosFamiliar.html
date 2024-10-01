<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <title>Gestão de Ativos Familiar </title>
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
				<h1 class="text-center">Gestão de Bens da Família Martins</h1>
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
$sql = "SELECT codigo, integrante, contato, bem, documento FROM bancofamiliamartins";
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
    <h3>Cadastrar ou Alterar Integrantes da Família Martins</h3>

        <form method="POST" action="<?php echo $_SERVER["PHP_SELF"]; ?>">        
        
        <form action="GestaoAtivosFamiliar.php" method="post">
        <label for="codigo">CPF:</label>
        <input type="text" name="codigo" id="codigo" text>       
        
        <label for="integrante">Integrante:</label>
        <input type="text" name="integrante" id="integrante" text>

        <label for="contato">Contato Telefônico:</label>
        <input type="text" name="contato" id="contato" text>

        <label for="bem">Bem Cadastrado:</label>        
        <input type="text" name="bem" id="bem" text><br>

        <label for="documento">Documentos:</label>        
        <input type="text" name="documento" id="documento" text><br><br>
  
        <div class="container">
        <form action="GestaoAtivosFamiliar.php" method="post">                            
        <form method="post">         
        <!--<button type="submit" name="realizarLogin">REALIZAR LOGIN</button>-->
        <!--<button type="submit" name="realizarLogin">REALIZAR LOGIN</button <br>  <p>VOCÊ PRECISA ESTAR LOGADO PARA UTILIZAR O SISTEMA!</p>-->    
        
        <form action="GestaoAtivosFamiliar.php" method="post">                            
        <form method="post">         
        <button type="submit" name="cadastrarIntegrante">CADASTRAR INTEGRANTE</button> 
        <!--<button type="cadastrar">Cadastrar</button>-->

        <form action="GestaoAtivosFamiliar.php" method="post">                            
        <form method="post">         
        <button type="submit" name="atualizarDados">ATUALIZAR DADOS</button>

        <form method="post">         
        <button type="submit" name="excluirDados">EXCLUIR DADOS</button>

        <form method="post">         
        <button type="submit" name="consultarIntegrante">Consultar INTEGRANTE</button>

        <form method="post">         
        <button type="submit" name="consultarCPF">Consultar por CPF</button>

        <form method="post">         
        <button type="submit" name="buscar">Consultar todos os Dados na Tabela</button><br><br>
 
    <title>GestaoAtivosFamiliar</title>
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

    <h3>Lista dos Integrantes Familiares:</h3><br>

    <!-- Botões para abrir modais para cada item -->
    <?php foreach ($itens as $item) : ?>
        <button onclick="abrirModal(<?php echo $item['codigo']; ?>)">CPF <?php echo $item['codigo']; ?></button>
    <?php endforeach; ?><br>

    <!-- Modais para exibir os itens -->
    <?php foreach ($itens as $item) : ?>
        <div id="modal<?php echo $item['codigo']; ?>" class="modal">
            <div class="modal-content">
                <span class="close" onclick="fecharModal(<?php echo $item['codigo']; ?>)">&times;</span>
                <h2>CPF: <?php echo $item['codigo']; ?></h2>
                <p><h4>Integrante: <?php echo $item['integrante']; ?><h4></p>
                <p>Contato Telefônico: <?php echo $item['contato']; ?></p>
                <p>Bem: <?php echo $item['bem']; ?></p>
                <p>Documento de Identidade: <?php echo $item['documento']; ?></p>
            </div>
        </div>
    <?php endforeach; ?><br>

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

<?php

if(isset($_POST['cadastrarIntegrante'])) {

// Configurações de conexão com o banco de dados
$servername = "localhost";
$username = "root";
$password = "";
$dbname = "meubanco";

// Dados do formulário
$codigo = $_POST["codigo"];
$integrante = $_POST["integrante"];
$contato = $_POST["contato"];
$bem = $_POST["bem"];
$documento = $_POST["documento"];

// Cria uma conexão com o banco de dados
$conn = new mysqli($servername, $username, $password, $dbname);

// Verifica se ocorreu algum erro na conexão
if ($conn->connect_error) {
    die("Falha na conexão: " . $conn->connect_error);
}

// Consulta SQL para inserir os dados na tabela
$sql = "INSERT INTO bancofamiliamartins (codigo, integrante, contato, bem, documento) VALUES ('$codigo', '$integrante', '$contato', '$bem', '$documento')";
  
// Executa a consulta
if ($conn->query($sql) === TRUE) {
    echo "<h4>Cadastro realizado com Sucesso!</h4><div class='card'</div>";
    echo "<h4>Ultimo Integrante inserido:</h4><div class='card'$integrante</div>";   
    
} else {
    echo "Erro ao cadastrar: " . $conn->error;
}

// Fecha a conexão com o banco de dados
$conn->close();
exit();
}

    if(isset($_POST['atualizarDados'])) {

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
     $integrante = $_POST['integrante'];
     $contato = $_POST['contato'];
     $bem = $_POST['bem'];
     $documento = $_POST['documento'];
     
     $sql = "UPDATE bancofamiliamartins SET codigo='$codigo', integrante='$integrante', contato='$contato', bem='$bem', documento='$documento' WHERE codigo='$codigo'";
            //echo "Registro atualizado com sucesso!<br> Último usuário atualizado: " . $usuario . "<br>";
     
      // Executa a consulta
      if ($conn->query($sql) === TRUE) {
          echo "<h4>Atualização realizada com Sucesso!";
          //echo "Registro com Integrante: $integrante, foi excluído com sucesso!";
      } else {
          echo "Erro ao excluir registro: " . $conn->error;
      }
          $conn->close();
          exit();
          }
        }
   
        if(isset($_POST['excluirDados'])) {

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
     $integrante = $_POST['integrante'];
     $contato = $_POST['contato'];
     $bem = $_POST['bem'];
     $documento = $_POST['documento'];  
       
         // Cria a consulta SQL para excluir o registro
      $sql = "DELETE FROM bancofamiliamartins WHERE codigo = $codigo";

      // Executa a consulta
      if ($conn->query($sql) === TRUE) {
          echo "<h4>Exclusão realizada com Sucesso!</h4><div class='card'</div>";
          //echo "Registro com Integrante: $integrante, foi excluído com sucesso!";
      } else {
          echo "Erro ao excluir registro: " . $conn->error;
      }
          $conn->close();
          exit();
          }
        }

        if(isset($_POST['buscar'])) {

            $servername = "localhost";
            $username = "root";
            $password = "";
            $dbname = "meubanco";
            $conn = new mysqli($servername, $username, $password, $dbname);
            
            // Consulta no banco de dados
            $sql = "SELECT * FROM bancofamiliamartins";
            $resultado = $conn->query($sql);
          if ($resultado->num_rows > 0) {
                  echo "<table><tr><th>Código: </th><th>Integrante: </th><th>Contato Telefônico: </th><th>Bem: </th><th>Documento:</th></tr>";
                  while($row = $resultado->fetch_assoc()) {
                    echo "<tr><th>" . $row["codigo"] . "</th><th>" . $row["integrante"] . "</th><th>" . $row["contato"] ."</th><th>" . $row["bem"] ."</th><th>" . $row["documento"] ."</th></tr>";
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
   
        if(isset($_POST['consultarIntegrante'])) {

            $servername = "localhost";
            $username = "root";
            $password = "";
            $dbname = "meubanco";
            $conn = new mysqli($servername, $username, $password, $dbname);
           
            $codigo = "integrante"; // Substitua com o valor desejado
            $codigo = $_POST['integrante'];
  
           // Consulta SQL com parâmetro
           $sql = "SELECT * FROM bancofamiliamartins WHERE integrante = ?";
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
          $integrante = $row["integrante"];
          $bem = $row["bem"];
          $contato = $row["contato"];
          $documento = $row["documento"];
          
          echo "<h4>Código:$codigo";
          echo "<h4>Integrante:$integrante";
          echo "<h4>Contato Telefônico:$contato";
          echo "<h4>Bem:$bem";
          echo "<h4>Documento de Identidade:$documento";
           
      }
      } else {
        echo "<h4>Nenhum resultado encontrado!";
        //echo "Nenhum resultado encontrado!";
        }
  
        // Fecha a conexão com o banco de dados        
        $conn->close();
        exit();
        }

        if(isset($_POST['consultarCPF'])) {

            $servername = "localhost";
            $username = "root";
            $password = "";
            $dbname = "meubanco";
            $conn = new mysqli($servername, $username, $password, $dbname);
           
            $codigo = "codigo"; // Substitua com o valor desejado
            $codigo = $_POST['codigo'];
  
           // Consulta SQL com parâmetro
           $sql = "SELECT * FROM bancofamiliamartins WHERE codigo = ?";
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
          $integrante = $row["integrante"];
          $bem = $row["bem"];
          $contato = $row["contato"];
          $documento = $row["documento"];
          
          echo "<h4>Código:$codigo";
          echo "<h4>Integrante:$integrante";
          echo "<h4>Contato Telefônico:$contato";
          echo "<h4>Bem:$bem";
          echo "<h4>Documento de Identidade:$documento";
          
          //echo "Código:" . $codigo . "<br>";         
          //echo "Integrante:" . $integrante . "<br>";
          //echo "Contato Telefônico:" . $contato . "<br>";                       
          //echo "Bem:" . $bem . "<br>";
          //echo "Documento Identidade:" . $documento . "<br>";          
      }
      } else {
        echo "<h4>Nenhum resultado encontrado!";
        //echo "Nenhum resultado encontrado!";
        }
  
        // Fecha a conexão com o banco de dados        
        $conn->close();
        exit();
        }

        if(isset($_POST['realizarLogin'])) {
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
            //$codigo = "";
            $usuario = "";
            $senha = "";
            //$perfil ="";
            
            // Verifica se o formulário foi enviado
            if ($_SERVER["REQUEST_METHOD"] == "POST") {
                // Obtém as credenciais do formulário
                //$codigo = $_POST["codigo"];
                $usuario = $_POST["usuario"];
                $senha = $_POST["senha"];
                //$perfil = $_POST["perfil"];
                
                // Consulta SQL para verificar se o usuário existe na tabela
                $sql = "SELECT * FROM bancousuario WHERE usuario = '$usuario' AND senha = '$senha'";
                $result = $conn->query($sql);
            
                // Verifica se a consulta retornou algum resultado
                if ($result->num_rows > 0) {
                    echo "<h4>Login realizado com Sucesso!</h4><div class='card'</div>";
                    //echo "<h4>Login realizado com sucesso!</h4><div class='card'>";      
                    //echo "LOGIN REALIZADO COM SUCESSO!"; 
                    //redireciona para a página de sucesso;
                    //header("Location: ControleUsuarios.php");
                    //exit();
                } 
                else {
                    // Autenticação falhou, exibe mensagem de erro
                    $erro = "Usuário ou senha inválidos!";
                }
    
                // Fechar a conexão com o banco de dados
                $conn->close();
                exit();
            }
            }
            
?>
<!DOCTYPE html>
<body>
<title>Login</title>

<div class="container">
    <h2>Login</h2>
    <button type="submit" name="realizarLogin">REALIZAR LOGIN</button <br> <p>VOCÊ PRECISA ESTAR LOGADO PARA UTILIZAR O SISTEMA!</p>
    <?php if (isset($erro)) { ?>
        <p><?php echo $erro; ?></p>
    <?php }    
    ?>

        <form method="POST" action="<?php echo $_SERVER["PHP_SELF"]; ?>">
        <label for="usuario">Usuário:</label>
        <input type="text" name="usuario" id="usuario" required>

        <label for="senha">Senha:</label>
        <input type="password" name="senha" id="senha" required><br><br>

</div>
</body>
</html>