-- MySQL dump 10.13  Distrib 8.0.11, for Win64 (x86_64)
--
-- Host: localhost    Database: area51
-- ------------------------------------------------------
-- Server version	8.0.11

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8 ;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `emailtable`
--

DROP TABLE IF EXISTS `emailtable`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `emailtable` (
  `Provider` varchar(50) NOT NULL,
  `Email` varchar(100) NOT NULL,
  `Password` varbinary(150) NOT NULL,
  `Hash` varchar(150) NOT NULL,
  `Comment` varchar(150) DEFAULT NULL,
  PRIMARY KEY (`Email`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `emailtable`
--

LOCK TABLES `emailtable` WRITE;
/*!40000 ALTER TABLE `emailtable` DISABLE KEYS */;
INSERT INTO `emailtable` VALUES ('zczxc','czxczxc','¦\êº@ÿ\Çç¸«ý6«ú€r','$2a$10$6mUvV9f/OcjSc8ACWZOZHubncmqrgTTP4DmS1kMUFx8HiemIgkzrK','zczxcxz'),('Gmail','lakshaysagar@gmailc.om',']\è|U\Ï^	¥jº\å€\Å\É','$2a$10$lN0B0BScLcmKoFfLjMepmuFWELpKv.htdL33FDn886ZUYN4y8NglO','dasdasd'),('Gmail','lakshaysagarrana27@gmail.com','Cs¸\Òk‹ˆ>q\Ç\ÌfH','$2a$10$NHlRRBlygByYfBnwwPTxqODirA302q6843hdZ0Dm0cVdHsPrWko4q','adasdasd');
/*!40000 ALTER TABLE `emailtable` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-06-29  8:49:05
