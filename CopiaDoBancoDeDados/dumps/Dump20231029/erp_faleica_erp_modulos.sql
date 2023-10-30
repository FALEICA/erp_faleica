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
-- Table structure for table `erp_modulos`
--

DROP TABLE IF EXISTS `erp_modulos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `erp_modulos` (
  `modulo_Id` int NOT NULL AUTO_INCREMENT,
  `modulo_CodNumber` int NOT NULL,
  `modulo_CodSigla` varchar(10) NOT NULL,
  `modulo_Descricao` varchar(255) NOT NULL,
  `modulo_link` varchar(255) NOT NULL,
  `dta_Incl` datetime NOT NULL,
  `dta_Alter` datetime NOT NULL,
  `usu_Incl` int NOT NULL,
  `usu_Alter` int NOT NULL,
  PRIMARY KEY (`modulo_Id`),
  UNIQUE KEY `modulo_Id` (`modulo_Id`),
  UNIQUE KEY `modulo_CodNumber` (`modulo_CodNumber`),
  UNIQUE KEY `modulo_CodSigla` (`modulo_CodSigla`),
  UNIQUE KEY `modulo_Descricao` (`modulo_Descricao`),
  UNIQUE KEY `modulo_link` (`modulo_link`)
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `erp_modulos`
--

LOCK TABLES `erp_modulos` WRITE;
/*!40000 ALTER TABLE `erp_modulos` DISABLE KEYS */;
INSERT INTO `erp_modulos` VALUES (15,1,'SYS','SISTEMA','sistema','2023-08-29 20:48:26','2023-08-29 20:48:26',1,1),(16,2,'PES','PESSOAS','pessoas','2023-08-29 20:48:26','2023-08-29 20:48:26',1,1),(17,3,'FIS','FISCAL','fiscal','2023-08-29 20:48:26','2023-08-29 20:48:26',1,1),(18,4,'FIN','FINANCEIRO','financeiro','2023-08-29 20:48:26','2023-08-29 20:48:26',1,1),(19,5,'CTB','CONTABILIDADE','contabil','2023-08-29 20:48:26','2023-08-29 20:48:26',1,1),(20,6,'SUP','SUPRIMENTOS','suprimentos','2023-08-29 20:48:26','2023-08-29 20:48:26',1,1),(21,7,'PRD','PRODUTOS','produtos','2023-08-29 20:48:26','2023-08-29 20:48:26',1,1);
/*!40000 ALTER TABLE `erp_modulos` ENABLE KEYS */;
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
