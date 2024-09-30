<!DOCTYPE html>
<html>
<head>
	<title>Cálculos de Projetos Elétricos</title>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">

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
		<div class="row">
			<div class="col">
				<img src="Imagens/logo.png" alt="Logo da Minha Empresa" class="img-fluid">
				<?php date_default_timezone_set('America/Sao_Paulo'); ?>
                <?php $hoje = date('d/m/Y'); ?>
                <?php $horaHoje = date("H:i:s"); ?>
                <?php echo $hoje; ?><br>
                <?php echo $horaHoje; ?><br>               
			</div>

				<h1 class="text-center">Cálculos de Potências de Luz e Tomadas</h1>
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
<body>
	<div class="container mt-5">
		<h1>Cálculo de Potências de Luz em VA!</h1>
		<form method="post" action="">
			<div class="mb-3">
				<label for="num1" class="form-label">Insira o tamanho do ambiente em mts² para Cálculo de Luz em VA!</label>
				<input type="number" class="form-control" id="num1" name="num1">			
			</div>
			<button type="submit" class="btn btn-primary">Calcular a Potencia de Luz em VA</button>
		</form>
		<?php
		if(isset($_POST['num1'])) 
		 { 		
			$num1 = $_POST['num1'];			
			$resultado1 = 100+($num1-6)/4*60; 
			echo "<h2>Resultado: $resultado1 VA</h2>";
		}
		?>
	</div>

	<div class="container mt-5">
		<h1>Cálculo de Quantidade de Tomadas de Uso Comum!</h1>
		<form method="post" action="">
			<div class="mb-3">
				<label for="num2" class="form-label">Insira o Perimetro do ambiente para Cálculo de Tomadas Comum!</label>
				<input type="number" class="form-control" id="num2" name="num2">			
			</div>
			<button type="submit" class="btn btn-primary">Calcular a quantidade de Tomadas Comum</button>
		</form>
		<?php
		if(isset($_POST['num2'])) 
		 { 
		
			$num2 = $_POST['num2'];           			
			$resultado2 = ($num2)/5; 
			echo "<h2>Resultado: $resultado2 UNDS</h2>";
		}
		?>
	</div>
	<div class="container mt-5">
		<h1>Cálculo de Quantidade de Tomadas de Uso Especial!</h1>
		<form method="post" action="">
			<div class="mb-3">
				<label for="num3" class="form-label">Insira o Perimetro do ambiente para Cálculo de Uso Especial</label>
				<input type="number" class="form-control" id="num3" name="num3">			
			</div>
			<button type="submit" class="btn btn-primary">Calcular a quantidade de Tomadas de Uso Especial</button>
		</form>
		<?php
		if(isset($_POST['num3']))
		 { 
		
			$num3 = $_POST['num3'];					
			$resultado3 = ($num3)/3.5; 
			echo "<h2>Resultado: $resultado3 UNDS</h2>";
		}
		?>
	</div>
	<!-- Adiciona o JavaScript do Bootstrap -->
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
