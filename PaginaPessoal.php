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
		
</div> 
</head>

<body>
<title>Minha Página Pessoal</title>
    <style>
        body {
            background-color: #f3f3f3; /* Escolha a cor de fundo */
            font-family: Arial;
            margin: 0;
            padding: 0;
        }     
    
        header {
            background-color: #444;
            color: #fff;
            padding: 10px;
            text-align: center;
        }
        
        nav {
            background-color: #333;
            color: #ffffff;
            padding: 5px;
            display: flex;
            justify-content: center;
        }
        
        nav a {
            color: #ffffff;
            text-decoration: none;
            padding: 8px 16px;
        }
        
        nav a:hover {
            background-color: #f9f9f9;
        }
        
        section {
            padding: 20px;
        }
        
        img {
            max-width: 100%;
            height: auto;
        }

        #banner {
    width: 100%;
    transition: opacity 1s;
    opacity: 0;
}

#banner.fade-in {
    opacity: 1;
}

    </style>
    </head>
    
<body>
    <header>    
        <?php date_default_timezone_set('America/Sao_Paulo'); ?>
        <?php $hoje = date('d/m/Y'); ?>
        <?php $horaHoje = date("H:i:s"); ?>
        <?php echo $hoje; ?>
        <?php echo $horaHoje; ?>            	

    </header>    
    <nav>

    <img src="Imagens/carlos1.png" alt="Logo da Minha Empresa" class="img-fluid">
    <div class="dropdown">
        <!--<button>Selecione uma Aplicação</button>-->         
        <!--<button type="submit" class="btn btn-primary">APLICATIVOS DE GESTÃO</button>-->
        <h4><a href="#">APLICATIVOS DE GESTÃO</a></h4>     
        <div class="dropdown-content">
        <a href="ControleShowsFilmesCONSULTA.php">MÍDIAS DE SHOWS E FILMES</a><br>
        <a href="ControleProjetosCONSULTA">PROJETOS ELÉTRICOS</a><br> 
        <a href="GestaoAtivosFamiliar">ATIVOS FAMILIAR</a><br>
        <a href="GestaoContatosPessoais">CONTATOS PESSOAIS</a>        
        </div>
    </div>
    <div class="dropdown">
        <!--<button>Selecione uma Aplicação</button>-->
        <h4><a href= "#">APLICATIVOS ELÉTRICOS</a></h4>
        <div class="dropdown-content">
        <a href="CalculosdeProjetoEletrico.php">CÁLCULOS DE PROJETOS ELÉTRICOS</a><br>
        <a href="CalculosEletricos.php">CÁLCULOS ELETRICOS</a><br>
        <a href="Painel230.html">DIAGRAMA UNIFILAR DO SISTEMA ELÉTRICO</a>           
        </div>
        </div>
    
    <div class="dropdown">
        <!--<button>Selecione uma Aplicação</button>-->
        <h4><a href="#" >GESTÃO DE USUÁRIOS</a></h4>
        <div class="dropdown-content">
        <a href="ControleUsuarios.html">GESTÃO DE USUÁRIOS</a><br>
        <a href="autenticarUsuario.html">LOGIN DE USUÁRIOS</a>      
        </div>
        </div>

        <div class="dropdown">
        <!--<button>Selecione uma Aplicação</button>-->
        <h4><a href= "#" >ALBUM PESSOAL</a></h4>
        <div class="dropdown-content">
        <a href="AlbumPessoal.php">ALBUM PESSOAL</a>
        </div>
        </div>
    
    <div class="dropdown">
        <h4><a href="apresentaçãoPessoal">SOBRE MIM</a>
        <a href="AlbumPessoal">GALERIA</a>
        <a href="Contato">CONTATO</a>
        </div>
        </div>
    </nav>

    <!--banner-->  
    <?php
    $banners = [
    "imagens/Carlos.png",
    "imagens/banner.jpg",
    "imagens/banner1.jpg",
    "imagens/monitor.jpg",
    "imagens/tech.jpg"
];
?>

    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
        }
        
        .banner-container {
            position: relative;
            width: 100%;
            max-width: 800px; /* Ajuste conforme necessário */
            margin: auto;
            overflow: hidden;
        }
        
        .banner {
            display: none;
            width: 100%;
        }
        
        .banner.active {
            display: block;
        }
    </style><br>

    <div class="banner-container">
        <?php foreach ($banners as $index => $banner): ?>
            <img src="<?php echo $banner; ?>" class="banner <?php echo $index === 0 ? 'active' : ''; ?>" alt="Banner <?php echo $index + 1; ?>">
        <?php endforeach; ?>
    </div>

    <script>
        let currentIndex = 0;
        const banners = document.querySelectorAll('.banner');
        const totalBanners = banners.length;

        function showNextBanner() {
            banners[currentIndex].classList.remove('active');
            currentIndex = (currentIndex + 1) % totalBanners;
            banners[currentIndex].classList.add('active');
        }

        setInterval(showNextBanner, 3000); // Muda a cada 3 segundos
    </script><br>
    <!--end banner-->

    <!--acompanhe-->
  <section class="box-acompanhe"></section>
    <div class="container">
    <section></section>

      <div class="acompanhe">
        <p><strong>Siga as Redes Sociais:</strong></p>
        <a href="https://www.instagram.com/carlosmardoniomartins/" target="_blank"> <img src="Imagens/instagram4.jpg" class="ico-redesocial"></a>       
        <a href="http://www.youtube.com" target="_blank"> <img src="Imagens/youtube.png" class="tv-ico"></a>
        <a href="http://www.youtube.com/feed/playlists" target="_blank"> <img src="Imagens/youtube1.png" class="tv-ico"> </a>
        <a href="https://www.flickr.com" target="_blank"> <img src="Imagens/flickr-ico.png" class="ico-redesocial"></a>
        <a href="Contato.php" target="_blank"> <img src="Imagens/carlos2.png" class="ico-redesocial"></a>
      </div>

    </div>
  
  <!--end acompanhe-->

  <!--radio-->
  
 <section class="box-radio"></section>
 <div class="container">
 <h2>Link para Rádio</h2> 
   <!--<div class="container radio">-->
       <div class="play-radio">
            <button id="playButton">
                <a href="https://www.radios.com.br/aovivo/radio-cbn-macapa-933-fm/33054" target="_blank"> <img src="Imagens/cbn.png"class="icon"></a>
                
                  <!--<path d="Imagens/youtube.png"></path>--> <!-- Ícone de play -->
                </svg>
            </button>
            <a href="https://www.radios.com.br/aovivo/radio-cbn-macapa-933-fm/33054"></a>
       </div>
        <div class="info-radio">
            <div class="aovivo">ao vivo</div>
            <p>93.9 FM <strong>Rádio CBN Macapá</strong> </p>
        </div>
        </div>
       
<!--end radio-->
    
   
    <div class="container">
    <section></section>
               
        <h2>Seção de Conteúdo</h2>
        <a href="">        
            <h4><span class="fa fa-home"></span>           
            <!--<img src="Imagens/casa.png" alt="icone de Sidebar">-->
            <a href="http://www.youtube.com/feed/playlists">You tube do Gestor da página</a>           
        </a>
        <h5><p>Este link encaminha para o youtube do gestor da página!</p></h5>
        
    <section></section>
    <h2>Seção Pessoal</h2>
    <a href="">        
            <!--<h4><span class="fa fa-search"></span>-->
            <h4><span class="fa fa-user"></span>            
            <!--<img src="Imagens/html.png" alt="icone de Sidebar">-->
            <a href="https://www.instagram.com/carlosmardoniomartins/">Rede Social do Gestor da página</a>            
        </a>
        <h5><p>Este link encaminha para a rede social do gestor da página!</p></h5>

        <section></section>
        <h2>Aplicativos de Gestão:</h2>
        <a href="">        
            <h4><span class="fa fa-envelope"></span>          
            <a href="ControleShowsFilmesCONSULTA.html">Mídias de Shows e Filmes</a><br>
            <a href="">
            <span class="fa fa-envelope"></span>
            <a href="ControleProjetosCONSULTA.html">Projetos Elétricos</a><br>
            <a href="">
            <span class="fa fa-envelope"></span> 
            <a href="GestaoAtivosFamiliar.html">Ativos Familiar</a><br>
            <a href="">
            <span class="fa fa-envelope"></span>
            <a href="GestaoContatosPessoais.html">Contatos Pessoais</a><br>
        </a>

        <h2>Aplicativos Elétricos:</h2>
        <a href="">        
            <h4><span class="fa fa-star"></span>            
            <a href="CalculosdeProjetoEletrico.html">Calculos de Projetos Elétricos</a><br>
            <a href="">
            <span class="fa fa-star"></span>
            <a href="CalculosEletricos.html">Calculos Elétricos</a><br>
            <a href="">
            <span class="fa fa-star"></span>
            <a href="Painel230.html">Diagrama Unifilar de Sistema Elétrico</a><br> 
        </a>

        <h2>Galeria de Imagens Pessoais:</h2>
            <a href="">        
            <h4><span class="fa fa-search"></span>                                 
            <a href="AlbumPessoal.php">Galeria de Imagens:</a><br></h> 
        </a><br>
        
    
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

<!--<h2>Galeria de Imagens:<h2>-->
<section></section>
     <div class="dropdown">
     <h2>Destaques</h2>
        <!--<button>Selecione uma Aplicação</button>-->
        <button type="submit" class="btn "><strong>Pátio da Subestação de 230 KV</strong></button>
        <div class="dropdown-content">          
            <img src="Imagens/patio.png" alt="Logo da Minha Empresa" class="img-fluid">
        </div>
        </div>
   
    <div class="dropdown">
        <!--<button>Selecione uma Aplicação</button>-->
        <button type="submit" class="btn "><strong>Tech Gov Forum Amapá</strong></button>
        <div class="dropdown-content">           
            <img src="Imagens/TechGov.jpg" alt="Logo da Minha Empresa" class="img-fluid">
        </div>
        </div>

    <div class="dropdown">
        <!--<button>Selecione uma Aplicação</button>-->
        <button type="submit" class="btn "><strong>Tech Gov Fórum Amapá</strong></button>
        <div class="dropdown-content">           
            <img src="Imagens/TechGov1.jpg" alt="Logo da Minha Empresa" class="img-fluid">
        </div>
        </div>
   
    <div class="dropdown">
        <!--<button>Selecione uma Aplicação</button>-->
        <button type="submit" class="btn "><strong>Plano ALAP Digital</strong></button>
        <div class="dropdown-content">            
            <img src="Imagens/ALAPDIGITAL.JPG" alt="Logo da Minha Empresa" class="img-fluid">
        </div>
        </div>
    </div>
    
<body>

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
    </style><br><br><br>

<section></section>
    <img src="Imagens/Carlos.png" alt="Logo da Minha Empresa" class="img-fluid">

    <footer>
    <p><h5><img src="Imagens/carlos2.png" alt="Logo da Minha Empresa" class="img-fluid">Desenvolvido por [Carlos Martins]</h5></p>
    </footer>
    
</head>
</body>   
</html>
