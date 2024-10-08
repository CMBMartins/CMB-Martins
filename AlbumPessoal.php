<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <title>Album Pessoal </title>
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
				<h1 class="text-center">Álbum Pessoal</h1>
                <img src="Imagens/Carlos" alt="Logo da Minha Empresa" class="img-fluid">  
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
    <title>Menu de Aplicativos</title>
    <div class="container">
    <style>
        .dropdown {
            position: relative;
            display: inline-block;
        }
        
        .dropdown-content {
            display: none;
            position: absolute;
            background-color: #f9f9f9;
            min-width: 160px;
            box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);
            z-index: 1;
        }
        
        .dropdown:hover .dropdown-content {
            display: block;
        }
    </style>
</head>
<body>
    <h3>Menu de Albuns</h3>
    
    <div class="dropdown">
        <!--<button>Selecione uma Aplicação</button>-->
        <button type="submit" class="btn btn-primary">Pátio da Subestação de 230 KV</button>
        <div class="dropdown-content">
            <!--<a href="ProjetosWeb/ControleShowsFilmes.php">Controle de Shows e Filmes</a><br>
            <a href="ProjetosWeb/ControleProjetos">Controle de Projetos Elétricos</a><br>
            <a href="ProjetosWeb/CalculosdeProjetoEletrico">Cálculos de Projetos Elétricos</a><br>
            <a href="ProjetosWeb/AutenticarUsuario">Login de Usuários</a><br>-->
            <img src="Imagens/patio.png" alt="Logo da Minha Empresa" class="img-fluid">
        </div>
    </div>
    <div class="dropdown">
        <!--<button>Selecione uma Aplicação</button>-->
        <button type="submit" class="btn btn-primary">Dimensionamento de Luz</button>
        <div class="dropdown-content">
            <!--<a href="ProjetosWeb/CalculosdeProjetoEletrico.php">Calculos de Projetos Elétricos</a><br>
            <a href="ProjetosWeb/CalculosEletricos.php">Calculos Elétricos</a><br>
            <a href="?url=https://www.example3.com">Exemplo 3</a><br>
            <a href="?url=https://www.example3.com">Exemplo 4</a><br>-->
            <img src="Imagens/DimensionarCircuitos.png" alt="Logo da Minha Empresa" class="img-fluid">
        </div>
    </div>
    <div class="dropdown">
        <!--<button>Selecione uma Aplicação</button>-->
        <button type="submit" class="btn btn-primary">Tela Principal Subestação de Energia</button>
        <div class="dropdown-content">
            <!--<a href="Menu.php">Página Pessoal</a><br>
            <a href="?url=https://www.example2.com">Exemplo 2</a><br>
            <a href="?url=https://www.example3.com">Exemplo 3</a><br>
            <a href="?url=https://www.example3.com">Exemplo 4</a><br>-->
            <img src="Imagens/Simulador.png" alt="Logo da Minha Empresa" class="img-fluid">
        </div>
    </div>
    <div class="dropdown">
        <!--<button>Selecione uma Aplicação</button>-->
        <button type="submit" class="btn btn-primary">Dimensionamento de Tomadas</button>
        <div class="dropdown-content">
            <!--<a href="ProjetosWeb/ControleUsuarios.php">Gestão de Usuários</a><br>
            <a href="ProjetosWeb/autenticarUsuario">Autenticar Usuarios</a><br>
            <a href="?url=https://www.example3.com">Exemplo 3</a><br>
            <a href="?url=https://www.example3.com">Exemplo 4</a><br>-->
            <img src="Imagens/projetoEletrico.png" alt="Logo da Minha Empresa" class="img-fluid">
        </div>
    </div>
    <!DOCTYPE html>
<head>
    <title>Pátio da Subestação de 230 KV ALBRAS</title>
    <style>
        body {
            background-image: url(<?php echo "C:\wamp64\www\logo.png"; ?>);
            background-repeat: no-repeat;
            background-size: cover;
        }
    </style>
</head>
    <h3>Pátio da Subestação de energia de 230 KV da ALBRAS</h3>
    <p>Operador realizando a inspeção visual nos equipamentos de 230 KV da Subestação da ALBRAS nos anos 2000</p>
    <img src="Imagens/patio.png" alt="Logo da Minha Empresa" class="img-fluid">
</body>
</html>