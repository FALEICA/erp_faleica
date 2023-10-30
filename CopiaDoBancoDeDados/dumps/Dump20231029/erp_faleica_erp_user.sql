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
-- Table structure for table `erp_user`
--

DROP TABLE IF EXISTS `erp_user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `erp_user` (
  `usu_Id` int NOT NULL AUTO_INCREMENT,
  `usu_Cod` int NOT NULL,
  `usu_Login` varchar(100) NOT NULL,
  `usu_Email` varchar(100) NOT NULL,
  `usu_Senha` varchar(100) NOT NULL,
  `usu_img` varchar(250) DEFAULT NULL,
  `dta_Incl` datetime NOT NULL,
  `dta_Alter` datetime NOT NULL,
  `usu_Incl` int NOT NULL,
  `usu_Alter` int NOT NULL,
  PRIMARY KEY (`usu_Id`),
  UNIQUE KEY `usu_Id` (`usu_Id`),
  UNIQUE KEY `usu_Cod` (`usu_Cod`),
  UNIQUE KEY `usu_Login` (`usu_Login`),
  UNIQUE KEY `usu_Email` (`usu_Email`)
) ENGINE=InnoDB AUTO_INCREMENT=56 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `erp_user`
--

LOCK TABLES `erp_user` WRITE;
/*!40000 ALTER TABLE `erp_user` DISABLE KEYS */;
INSERT INTO `erp_user` VALUES (1,159,'fabio.leite','trulhulhu@yahoo.com','iptw3tko','/erp_faleica/img/avatartest.png','2023-09-06 22:56:39','2023-10-28 17:12:54',1,1),(37,102,'daniela.pontes','daniela.pontes@gmail.com','dani2501',NULL,'2023-10-24 21:30:47','2023-10-24 21:30:47',1,1),(52,200,'teste','teste@gmail.com','1234',NULL,'2023-10-27 10:32:21','2023-10-27 10:32:21',1,1),(55,300,'novo','novo@gmail.com','1234',NULL,'2023-10-28 20:25:12','2023-10-28 20:25:12',1,1);
/*!40000 ALTER TABLE `erp_user` ENABLE KEYS */;
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
