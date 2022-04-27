CREATE DATABASE  IF NOT EXISTS `placethon` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `placethon`;
-- MySQL dump 10.13  Distrib 5.6.23, for Win64 (x86_64)
--
-- Host: localhost    Database: placethon
-- ------------------------------------------------------
-- Server version	5.5.16

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `applieddrives`
--

DROP TABLE IF EXISTS `applieddrives`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `applieddrives` (
  `adriveid` int(11) NOT NULL AUTO_INCREMENT,
  `driveid` int(11) DEFAULT NULL,
  `recid` int(11) DEFAULT NULL,
  `stuid` int(11) DEFAULT NULL,
  `adrivestatus` int(11) DEFAULT '1',
  PRIMARY KEY (`adriveid`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `applieddrives`
--

LOCK TABLES `applieddrives` WRITE;
/*!40000 ALTER TABLE `applieddrives` DISABLE KEYS */;
INSERT INTO `applieddrives` VALUES (6,1,1,8,1),(7,2,1,8,1),(8,3,1,8,1),(9,4,2,8,1);
/*!40000 ALTER TABLE `applieddrives` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `drives`
--

DROP TABLE IF EXISTS `drives`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `drives` (
  `driveid` int(11) NOT NULL AUTO_INCREMENT,
  `drivedesc` varchar(100) DEFAULT NULL,
  `drivelocation` varchar(50) DEFAULT NULL,
  `drivestartdate` datetime DEFAULT NULL,
  `driveenddate` datetime DEFAULT NULL,
  `jobResponsibilities` varchar(500) DEFAULT NULL,
  `criteria` varchar(100) DEFAULT NULL,
  `CTC` varchar(45) DEFAULT NULL,
  `experience` varchar(45) DEFAULT NULL,
  `jobtype` varchar(45) DEFAULT NULL,
  `driveprocess` varchar(80) DEFAULT NULL,
  `companyname` varchar(45) DEFAULT NULL,
  `recid` int(11) DEFAULT NULL,
  `drivestatus` tinyint(1) DEFAULT '1',
  PRIMARY KEY (`driveid`),
  KEY `recid_idx` (`recid`),
  CONSTRAINT `recid` FOREIGN KEY (`recid`) REFERENCES `recruiter` (`recid`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `drives`
--

LOCK TABLES `drives` WRITE;
/*!40000 ALTER TABLE `drives` DISABLE KEYS */;
INSERT INTO `drives` VALUES (1,'Software Developer','virtual','2022-04-03 00:00:00','2022-04-14 00:00:00','provide trust through assurance and help clients grow, transform and operate.\r\nWorking across assurance, consulting, law, strategy, tax and transactions, EY teams ask better questions to find new answers for the complex issues facing our world today.','50%','500000','1 year experience ','full-time','2 technical and aptitude and HR','infosys',1,1),(2,'Assistant Director','bangalore','2022-04-08 00:00:00','2022-04-22 00:00:00','Excellent understanding of computer science fundamentals, data structures, algorithms and design patterns\r\nAs a full stack developer, you will research, develop and support solutions for products and features within the WeSucceed.','all over 60%','450000','fresher','Part-time','2 technical and aptitude and HR','infosys',1,1),(3,'product support','hyderbad','2022-04-04 00:00:00','2022-04-09 00:00:00','Any Graduation / Post Graduation degree in Computer Science or IT or Electronics.\r\nStrong Design and Analytical Skills with good understanding of Design Patterns and principles.\r\nStrong in communication skills.\r\nStrong in aptitude skills, should have knowledge of latest technologies and should be eager to learn new technologies.','50%','500000','0.5','Part-time','2 technical and aptitude and HR','infosys',1,1),(4,'data analyst','noida','2022-04-06 00:00:00','2022-04-10 00:00:00','be competent in 1-2 programming languages\r\nHave experience with databases\r\nHave basic knowledge of information security, software design principles, MVC, code standards, source & version control','70%','550000','fresher','Part-time','2 technical and aptitude and HR','wipro',2,1),(5,'business analyst','virtual','2022-04-09 00:00:00','2022-04-22 00:00:00','Ability to develop value-creating strategies and models that enable clients to innovate, drive growth and increase their business profitability , Good knowledge on software configuration management systems, Awareness of latest technologies and Industry trends','all over 80%','700000','2 years experience in analyst role','full-time','technical and HR','infosys',1,1);
/*!40000 ALTER TABLE `drives` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `recruiter`
--

DROP TABLE IF EXISTS `recruiter`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `recruiter` (
  `recid` int(11) NOT NULL AUTO_INCREMENT,
  `recemail` varchar(50) DEFAULT NULL,
  `recfullname` varchar(45) DEFAULT NULL,
  `reccompname` varchar(45) DEFAULT NULL,
  `gender` varchar(2) DEFAULT NULL,
  `recmobile` varchar(12) DEFAULT NULL,
  `recpassword` varchar(200) DEFAULT NULL,
  `recstatus` tinyint(1) DEFAULT '1',
  PRIMARY KEY (`recid`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1 COMMENT='			';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `recruiter`
--

LOCK TABLES `recruiter` WRITE;
/*!40000 ALTER TABLE `recruiter` DISABLE KEYS */;
INSERT INTO `recruiter` VALUES (1,'mary@gmail.com','mary kom','infosys','m','9734574754','mary',1),(2,'bhar@gmail.com','bharat','wipro','m','9734509743','bhar',1);
/*!40000 ALTER TABLE `recruiter` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `student`
--

DROP TABLE IF EXISTS `student`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `student` (
  `stuid` int(11) NOT NULL AUTO_INCREMENT,
  `stufullname` varchar(45) DEFAULT NULL,
  `stuemail` varchar(45) DEFAULT NULL,
  `stumobile` varchar(12) DEFAULT NULL,
  `stugender` varchar(2) DEFAULT NULL,
  `stupassword` varchar(200) DEFAULT NULL,
  `stustatus` tinyint(1) DEFAULT '1',
  PRIMARY KEY (`stuid`),
  UNIQUE KEY `stu_id_UNIQUE` (`stuid`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `student`
--

LOCK TABLES `student` WRITE;
/*!40000 ALTER TABLE `student` DISABLE KEYS */;
INSERT INTO `student` VALUES (8,'rahul kubasad','rahulkubasad.rk@gmail.com','7829791660','m','rahul',1);
/*!40000 ALTER TABLE `student` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-04-06 11:56:03
