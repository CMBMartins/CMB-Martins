<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta charset="UTF-8">
    <title>Página Pessoal </title>
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
        <?php echo $hoje; ?>
        <?php echo $horaHoje; ?><br><br><br>				
            <img src="Imagens/Carlos.png" alt="Logo da Minha Empresa" class="img-fluid">	
			
<footer>
    <p>Desenvolvido por [Carlos Martins]</p>
    <a href="">        
            <span class="fa fa-home"></span>            
            <!--<img src="Imagens/casa.png" alt="icone de configuração">-->
            <a href="PaginaPessoal.php">
            <span>Página Principal</span><br>
        </a>
    </footer>
    </div>			
		</div>
	</div>
</html>