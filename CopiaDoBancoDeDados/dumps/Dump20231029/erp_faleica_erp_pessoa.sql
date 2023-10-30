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
-- Table structure for table `erp_pessoa`
--

DROP TABLE IF EXISTS `erp_pessoa`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `erp_pessoa` (
  `pes_Id` int NOT NULL AUTO_INCREMENT,
  `pes_Cod` int NOT NULL,
  `pes_Name` varchar(255) NOT NULL,
  `pes_TipoFiscal` varchar(30) NOT NULL,
  `pes_Codigo` varchar(14) NOT NULL,
  `pes_InscrEst` varchar(100) DEFAULT NULL,
  `pes_EstadoIE` varchar(2) DEFAULT NULL,
  `pes_NomeFantasia` varchar(255) DEFAULT NULL,
  `usu_Cod` int DEFAULT NULL,
  PRIMARY KEY (`pes_Id`),
  UNIQUE KEY `pes_Cod` (`pes_Cod`),
  UNIQUE KEY `pes_Name` (`pes_Name`),
  UNIQUE KEY `pes_Codigo` (`pes_Codigo`),
  UNIQUE KEY `usu_Cod` (`usu_Cod`),
  CONSTRAINT `erp_pessoa_ibfk_1` FOREIGN KEY (`usu_Cod`) REFERENCES `erp_user` (`usu_Cod`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `erp_pessoa`
--

LOCK TABLES `erp_pessoa` WRITE;
/*!40000 ALTER TABLE `erp_pessoa` DISABLE KEYS */;
INSERT INTO `erp_pessoa` VALUES (1,3630,'CHT BRASIL QUIMICA LTDA','Juridica','47684386000161','241007934119','SP','CHT BRASIL',NULL),(2,5926,'KIMONOS BUDOKAN LTDA. - ME','Juridica','09472513000170','148071673110','SP','BUDOKAN',NULL),(3,1000,'Fabio Leite Cardoso','Fisica','00447458507',NULL,NULL,NULL,NULL);
/*!40000 ALTER TABLE `erp_pessoa` ENABLE KEYS */;
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
