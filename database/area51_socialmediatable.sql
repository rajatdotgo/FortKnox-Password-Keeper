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
-- Table structure for table `socialmediatable`
--

DROP TABLE IF EXISTS `socialmediatable`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `socialmediatable` (
  `Provider` varchar(100) NOT NULL,
  `Username` varchar(100) NOT NULL,
  `Password` varbinary(150) NOT NULL,
  `Hash` varchar(150) NOT NULL,
  `Comment` varchar(150) DEFAULT NULL,
  PRIMARY KEY (`Username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `socialmediatable`
--

LOCK TABLES `socialmediatable` WRITE;
/*!40000 ALTER TABLE `socialmediatable` DISABLE KEYS */;
INSERT INTO `socialmediatable` VALUES ('dasd','asdsadasd','y\ï9¶\'ž\É/s\âÕ«,','$2a$10$gOxn7zmKxsAoM.Z48i4ghuom0UlUy0ceUzrEuS/BTu5EoqjAc.UG2','asdasd'),('Insta','lakshaytalkstocomputer','ƒ\á@õ\ë7:\à\åD‰!\×','$2a$10$wLLYkaEhOWl04NnURi30FuS7PHKlxb58lJYaQ30D/N/cyEyL9bnOy','sadasdas'),('czxc','zxczc','DQ8$\ÌN˜]Û¨: –p\æ','$2a$10$4nCvRkL0Ftv6gQGSrM3o3.pxbm6Eu8qvJrFpl8uBvdTTeiqipAch.','zxxczxc');
/*!40000 ALTER TABLE `socialmediatable` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-06-29  8:49:03
