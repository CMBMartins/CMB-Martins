-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Tempo de geração: 08-Abr-2024 às 12:48
-- Versão do servidor: 8.0.31
-- versão do PHP: 8.0.26

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `meubanco`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `bancofamiliamartins`
--

DROP TABLE IF EXISTS `bancofamiliamartins`;
CREATE TABLE IF NOT EXISTS `bancofamiliamartins` (
  `codigo` bigint NOT NULL,
  `integrante` varchar(100) NOT NULL,
  `contato` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `bem` varchar(100) NOT NULL,
  `documento` varchar(100) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Extraindo dados da tabela `bancofamiliamartins`
--

INSERT INTO `bancofamiliamartins` (`codigo`, `integrante`, `contato`, `bem`, `documento`) VALUES
(23711736220, 'Carlos M B Martins', '91 98802-5000', 'Smart TV 42\"', '1308356 SSP/PA'),
(23711736220, 'Carlos Martins', '91 988025000', 'Smart TV 42\"', '1308356 SSP/PA'),
(34203084272, 'Odaise Martins', '91 99984-5000', 'Veiculo Honda', '2636476 SSP/AP'),
(85247237198, 'Felipe Martins', '96 988445580', 'Nintendo Switch', '123456 SSP/AP');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
