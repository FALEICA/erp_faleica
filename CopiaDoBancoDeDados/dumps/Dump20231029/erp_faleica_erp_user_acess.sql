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
-- Table structure for table `erp_user_acess`
--

DROP TABLE IF EXISTS `erp_user_acess`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `erp_user_acess` (
  `usu_Cod` int NOT NULL,
  `modulo_CodNumber` int NOT NULL,
  `menu_CodNumber` int NOT NULL,
  `compo_CodNumber` int NOT NULL,
  `usc_Select` tinyint(1) NOT NULL,
  `usc_Insert` tinyint(1) NOT NULL,
  `usc_Update` tinyint(1) NOT NULL,
  `usc_Delete` tinyint(1) NOT NULL,
  `usu_Incl` int NOT NULL,
  `usu_Alter` int NOT NULL,
  `dta_Incl` datetime NOT NULL,
  `dta_Alter` datetime NOT NULL,
  PRIMARY KEY (`usu_Cod`,`modulo_CodNumber`,`menu_CodNumber`,`compo_CodNumber`),
  KEY `FK_Modulo` (`modulo_CodNumber`),
  KEY `FK_Menu` (`menu_CodNumber`),
  KEY `FK_Componente` (`compo_CodNumber`),
  CONSTRAINT `FK_Componente` FOREIGN KEY (`compo_CodNumber`) REFERENCES `erp_componentes` (`compo_CodNumber`),
  CONSTRAINT `FK_Menu` FOREIGN KEY (`menu_CodNumber`) REFERENCES `erp_menus` (`menu_CodNumber`),
  CONSTRAINT `FK_Modulo` FOREIGN KEY (`modulo_CodNumber`) REFERENCES `erp_modulos` (`modulo_CodNumber`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `erp_user_acess`
--

LOCK TABLES `erp_user_acess` WRITE;
/*!40000 ALTER TABLE `erp_user_acess` DISABLE KEYS */;
INSERT INTO `erp_user_acess` VALUES (102,1,1,1,1,0,0,0,1,1,'2023-10-26 00:50:39','2023-10-26 00:50:39'),(159,1,1,1,1,1,1,1,1,1,'2023-10-26 00:37:01','2023-10-26 00:37:01'),(159,2,3,2,1,1,1,1,1,1,'2023-10-26 00:41:28','2023-10-26 00:41:28'),(159,2,3,3,1,1,1,1,1,1,'2023-10-26 00:41:37','2023-10-26 00:41:37'),(159,7,4,4,1,1,1,1,1,1,'2023-10-26 00:39:44','2023-10-26 00:39:44');
/*!40000 ALTER TABLE `erp_user_acess` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-10-29 16:12:08
