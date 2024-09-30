-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Tempo de geração: 20-Mar-2024 às 13:22
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
-- Estrutura da tabela `bancoprojetos`
--

DROP TABLE IF EXISTS `bancoprojetos`;
CREATE TABLE IF NOT EXISTS `bancoprojetos` (
  `codigo` int NOT NULL,
  `titulo` varchar(100) NOT NULL,
  `cliente` varchar(100) NOT NULL,
  `tamanhodoimovel` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `valordoprojeto` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `datadaentrega` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `tipo` varchar(100) NOT NULL,
  `genero` blob NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Extraindo dados da tabela `bancoprojetos`
--

INSERT INTO `bancoprojetos` (`codigo`, `titulo`, `cliente`, `tamanhodoimovel`, `valordoprojeto`, `datadaentrega`, `tipo`, `genero`) VALUES
(0, 'Projeto Elétrico residencial Carlos&Odaise', 'Carlos Martins', '275 mts²', 'R$ 3.300,00', '08/09/2020', 'Projeto Elétrico Executivo', 0x5265736964c3aa6e636961204f4441495345205f204341524c4f53204d415254494e53204d4f44494649434144412045584543555449564f2e647767),
(5, 'Projeto Elétrico residencial JEANE-DIEGO MARTINS PAIVA-ELETRICO', 'Jeane & Diego Martins Paiva', '550 mts²', 'R$ 6.600,00', '03/08/2016', 'Projeto Elétrico Executivo', 0x5245534944c38a4e4349412d4a45414e452d444945474f204d415254494e532050414956412d454c45545249434f2e647767),
(2, 'Projeto Elétrico Residência de Rosana e Davi', 'Rosana & Davi', '550 mts²', 'R$ 6.600,00', '16/02/2014', ' Projeto Elétrico Executivo', 0x5245534944c38a4e4349412d524f53414e412d44415649202d20454c45312e646777),
(3, 'Projeto Elétrico residencial Anete & Sérgio Torres', 'Anete&SérgioTorres', '690 mts²', 'R$ 8.280,00', '19/02/2015', 'Projeto Elétrico Executivo', 0x5245534944c38a4e4349412d414e4554452d53c3895247494f20544f525245532d454c452e647767),
(1, ' Projeto Elétrico residencial Carlos&Odaise', 'Carlos Martins', '275 mts²', 'R$ 3.300,00', '08/09/2020', 'Projeto Elétrico Executivo', 0x5265736964c3aa6e636961204f4441495345205f204341524c4f53204d415254494e53204d4f44494649434144412045584543555449564f2e647767),
(4, 'Projeto Elétrico residencial NOEMI-ALAN-ELET', 'Noemi & Alan', '660 mts²', 'R$ 7920,00', '09/06/2015', 'Projeto Elétrico Executivo', 0x5245534944c38a4e4349412d4e4f454d492d414c414e2d454c452e647767),
(6, ' Projeto Elétrico residencial ELIANA-EVANDRO PINGARILHO-ELETRICO', 'Eliana & Evandro Pingarilho', '630 mts²', 'R$ 7.560,00', '04/05/2017', 'Projeto Elétrico Execuitivo', 0x5245534944c38a4e4349412d454c49414e412d4556414e44524f2050494e474152494c484f2d454c45545249434f2e647767),
(7, 'Projeto Elétrico residencial JAQUELINE-FABRICIO-ELETRICO', 'Jaqueline & Fabricio', '450 mts²', 'R$ 5.400,00', '19/07/2017', 'Projeto Elétrico Executivo', 0x5245534944c38a4e4349412d4a415155454c494e452d464142524943494f2d454c45545249434f2e647767),
(8, 'Projeto Elétrico residencial HELAYNNE-IZAK', ' Helaynne & Izak', '635 mts²', 'R$ 7.620,00', '21/07/2017', 'Projeto Elétrico Executivo', 0x5245534944c38a4e4349412048454c41594e4e452d495a414b2d454c45542e647767),
(9, 'Projeto eletrico RESIDÊNCIA RITA&CARLOS', 'Rita', '380 mts²', 'R$ 4.560,00', '21/07/2017', 'Projeto eletrico executivo', 0x5245534944c38a4e4349412d20524954412d4341524c4f532d454c452e647767);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
