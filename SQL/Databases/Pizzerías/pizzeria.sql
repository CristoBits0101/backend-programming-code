-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 02-03-2021 a las 14:23:20
-- Versión del servidor: 10.4.17-MariaDB
-- Versión de PHP: 8.0.1

create database pizzeria;
use pizzeria;

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `pizzeria`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `distribuidor`
--

CREATE TABLE `distribuidor` (
  `id_di` decimal(3,0) NOT NULL,
  `nom_di` varchar(100) DEFAULT NULL,
  `direccion_di` varchar(100) DEFAULT NULL,
  `tlf_di` decimal(9,0) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `distribuidor`
--

INSERT INTO `distribuidor` (`id_di`, `nom_di`, `direccion_di`, `tlf_di`) VALUES
('1', 'Marisco Recio', 'C/Montepinar, 54', '654987888'),
('2', 'Bufalo Bills', 'C/Manhathan, 14', '664125395'),
('3', 'Fruterias Z', 'C/Tebeo, 75', '614253654'),
('4', 'ProductosCalis', 'Av. Canarias, 342', '677441123');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pizzas`
--

CREATE TABLE `pizzas` (
  `id_p` decimal(3,0) NOT NULL,
  `nom_p` varchar(50) DEFAULT NULL,
  `ingredientes` varchar(200) DEFAULT NULL,
  `precio` decimal(2,0) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `pizzas`
--

INSERT INTO `pizzas` (`id_p`, `nom_p`, `ingredientes`, `precio`) VALUES
('1', 'Margarita', 'Tomate, queso gouda, oregano', '5'),
('2', '4 Quesos', 'Queso elemental, queso azul, queso cabra, tomate, queso gouda, oregano', '7'),
('3', 'Barbacoa', 'Ternera, bacon, salsa barbacoa, tomate, queso gouda, oregano', '8'),
('4', 'Vegetariana', 'Espinacas, aceitunas, pimientos, tomate, oregano', '4'),
('5', 'Marinera', 'Gambas, cangrejos, , atun, tomate, queso gouda, oregano', '7');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pizzero`
--

CREATE TABLE `pizzero` (
  `dni_pi` varchar(9) NOT NULL,
  `nom_pi` varchar(20) NOT NULL,
  `puesto` varchar(10) DEFAULT NULL,
  `tlf_pi` decimal(9,0) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `pizzero`
--

INSERT INTO `pizzero` (`dni_pi`, `nom_pi`, `puesto`, `tlf_pi`) VALUES
('11111111A', 'Paula Garcia Moreno', 'Cocinero', '645454545'),
('22222222B', 'Manolo Manuel Manoe', 'Cocinero', '666332211'),
('33333333C', 'Paquita La Gamba', 'Camarero', '678989898'),
('44444444D', 'Paco el del Bombo', 'Camarero', '644556645'),
('66666666F', 'Adrian Sanchez Goyes', 'Cajero', '678451245'),
('77777777G', 'Maria Rosa Garcia', 'Cajero', '698988523');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `productos`
--

CREATE TABLE `productos` (
  `id_pr` decimal(3,0) NOT NULL,
  `nom_pr` varchar(100) DEFAULT NULL,
  `cantidad_pr` decimal(3,0) DEFAULT NULL,
  `origen` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `productos`
--

INSERT INTO `productos` (`id_pr`, `nom_pr`, `cantidad_pr`, `origen`) VALUES
('1', 'Queso azul', '450', 'Italia'),
('2', 'Queso cabra', '250', 'España'),
('3', 'Queso elemental', '210', 'España'),
('4', 'Gambas', '510', 'Francia'),
('5', 'Ternera', '440', 'Alemania'),
('6', 'Bacon', '635', 'Alemania'),
('7', 'Atun', '235', 'Italia'),
('8', 'Cangrejo', '337', 'Francia'),
('9', 'Aceitunas', '834', 'España'),
('10', 'Espinacas', '546', 'Dinamarca'),
('11', 'Pimientos', '423', 'España'),
('12', 'Salsa Barbacoa', '298', 'Alemania');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `productos_basicos`
--

CREATE TABLE `productos_basicos` (
  `id_pb` decimal(3,0) NOT NULL,
  `nom_pb` varchar(100) DEFAULT NULL,
  `cantidad` decimal(3,0) DEFAULT NULL,
  `descripcion` varchar(500) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `productos_basicos`
--

INSERT INTO `productos_basicos` (`id_pb`, `nom_pb`, `cantidad`, `descripcion`) VALUES
('1', 'Tomate', '999', 'Rojos de origen canario'),
('2', 'Queso gouda', '899', 'Rallado en tiras, origen Extremadura'),
('3', 'Oregano', '785', 'Origen Madrid');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `se_basa`
--

CREATE TABLE `se_basa` (
  `id_p` decimal(3,0) NOT NULL,
  `id_pb` decimal(3,0) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `se_hace`
--

CREATE TABLE `se_hace` (
  `id_p` decimal(3,0) NOT NULL,
  `id_pr` decimal(3,0) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `se_vende`
--

CREATE TABLE `se_vende` (
  `id_p` decimal(3,0) NOT NULL,
  `id_t` decimal(3,0) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tamanyo`
--

CREATE TABLE `tamanyo` (
  `id_t` decimal(3,0) NOT NULL,
  `tipo_t` varchar(10) DEFAULT NULL,
  `usuario` varchar(100) DEFAULT NULL,
  `dni_pi` varchar(9) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `distribuidor`
--
ALTER TABLE `distribuidor`
  ADD PRIMARY KEY (`id_di`);

--
-- Indices de la tabla `pizzas`
--
ALTER TABLE `pizzas`
  ADD PRIMARY KEY (`id_p`);

--
-- Indices de la tabla `pizzero`
--
ALTER TABLE `pizzero`
  ADD PRIMARY KEY (`dni_pi`);

--
-- Indices de la tabla `productos`
--
ALTER TABLE `productos`
  ADD PRIMARY KEY (`id_pr`);

--
-- Indices de la tabla `productos_basicos`
--
ALTER TABLE `productos_basicos`
  ADD PRIMARY KEY (`id_pb`);

--
-- Indices de la tabla `se_basa`
--
ALTER TABLE `se_basa`
  ADD PRIMARY KEY (`id_p`,`id_pb`),
  ADD KEY `FK_SE_BASA2` (`id_pb`);

--
-- Indices de la tabla `se_hace`
--
ALTER TABLE `se_hace`
  ADD PRIMARY KEY (`id_p`,`id_pr`),
  ADD KEY `FK_SE_HACE2` (`id_pr`);

--
-- Indices de la tabla `se_vende`
--
ALTER TABLE `se_vende`
  ADD PRIMARY KEY (`id_p`,`id_t`),
  ADD KEY `FK_SE_VENDE2` (`id_t`);

--
-- Indices de la tabla `tamanyo`
--
ALTER TABLE `tamanyo`
  ADD PRIMARY KEY (`id_t`),
  ADD KEY `FK_TAMANYO` (`dni_pi`);

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `se_basa`
--
ALTER TABLE `se_basa`
  ADD CONSTRAINT `FK_SE_BASA1` FOREIGN KEY (`id_p`) REFERENCES `pizzas` (`id_p`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `FK_SE_BASA2` FOREIGN KEY (`id_pb`) REFERENCES `productos_basicos` (`id_pb`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `se_hace`
--
ALTER TABLE `se_hace`
  ADD CONSTRAINT `FK_SE_HACE1` FOREIGN KEY (`id_p`) REFERENCES `pizzas` (`id_p`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `FK_SE_HACE2` FOREIGN KEY (`id_pr`) REFERENCES `productos` (`id_pr`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `se_vende`
--
ALTER TABLE `se_vende`
  ADD CONSTRAINT `FK_SE_VENDE1` FOREIGN KEY (`id_p`) REFERENCES `pizzas` (`id_p`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `FK_SE_VENDE2` FOREIGN KEY (`id_t`) REFERENCES `tamanyo` (`id_t`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `tamanyo`
--
ALTER TABLE `tamanyo`
  ADD CONSTRAINT `FK_TAMANYO` FOREIGN KEY (`dni_pi`) REFERENCES `pizzero` (`dni_pi`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
