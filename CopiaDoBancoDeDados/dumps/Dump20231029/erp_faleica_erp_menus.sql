CREATE DATABASE  IF NOT EXISTS `erp_faleica` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `erp_faleica`;
-- MySQL dump 10.13  Distrib 8.0.33, for Win64 (x86_64)
--
-- Host: localhost    Database: erp_faleica
-- ------------------------------------------------------
-- Server version	8.0.33

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `erp_menus`
--

DROP TABLE IF EXISTS `erp_menus`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `erp_menus` (
  `menu_Id` int NOT NULL AUTO_INCREMENT,
  `menu_CodNumber` int NOT NULL,
  `menu_CodSigla` varchar(10) NOT NULL,
  `menu_Desc` varchar(255) NOT NULL,
  `menu_Link` varchar(255) NOT NULL,
  `modulo_CodNumber` int NOT NULL,
  `dta_Incl` datetime NOT NULL,
  `dta_Alter` datetime NOT NULL,
  `usu_Incl` int NOT NULL,
  `usu_Alter` int NOT NULL,
  PRIMARY KEY (`menu_Id`),
  UNIQUE KEY `menu_Id` (`menu_Id`),
  UNIQUE KEY `menu_CodNumber` (`menu_CodNumber`),
  UNIQUE KEY `menu_CodSigla` (`menu_CodSigla`),
  UNIQUE KEY `menu_Desc` (`menu_Desc`),
  UNIQUE KEY `menu_Link` (`menu_Link`),
  KEY `modulo_CodNumber` (`modulo_CodNumber`),
  CONSTRAINT `erp_menus_ibfk_1` FOREIGN KEY (`modulo_CodNumber`) REFERENCES `erp_modulos` (`modulo_CodNumber`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `erp_menus`
--

LOCK TABLES `erp_menus` WRITE;
/*!40000 ALTER TABLE `erp_menus` DISABLE KEYS */;
INSERT INTO `erp_menus` VALUES (1,1,'SYSCAD','Sistema Cadastros','cadastros',1,'2023-08-29 21:16:46','2023-08-29 21:16:46',1,1),(2,2,'SYSEST','Sistema Estrutura','estrutura',1,'2023-08-29 21:16:46','2023-08-29 21:16:46',1,1),(3,3,'PESCAD','Pessoas Cadastros','cadpessoas',2,'2023-08-29 21:16:46','2023-08-29 21:16:46',1,1),(4,4,'PRDCAD','Produtos Cadastros','cadprodutos',7,'2023-08-29 21:16:46','2023-08-29 21:16:46',1,1);
/*!40000 ALTER TABLE `erp_menus` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-10-29 16:12:07
