CREATE DATABASE  IF NOT EXISTS `centrovacunacion` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci */;
USE `centrovacunacion`;
-- MySQL dump 10.13  Distrib 8.0.34, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: centrovacunacion
-- ------------------------------------------------------
-- Server version	5.5.5-10.4.28-MariaDB

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
-- Table structure for table `pacientevacunado`
--

DROP TABLE IF EXISTS `pacientevacunado`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `pacientevacunado` (
  `idpacienteVacunado` int(11) NOT NULL AUTO_INCREMENT,
  `dniPacVac` varchar(45) DEFAULT NULL,
  `nombrePacVac` varchar(45) DEFAULT NULL,
  `apellidoVacPac` varchar(45) DEFAULT NULL,
  `direcVacPac` varchar(90) DEFAULT NULL,
  `celVacPac` varchar(45) DEFAULT NULL,
  `fechaNacPacVac` varchar(45) DEFAULT NULL,
  `kitVacPac` varchar(45) DEFAULT NULL,
  `lotePacVac` varchar(45) DEFAULT NULL,
  `enferVacPac` varchar(45) DEFAULT NULL,
  `dosisVacPac` varchar(45) DEFAULT NULL,
  `fechaVac` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idpacienteVacunado`)
) ENGINE=InnoDB AUTO_INCREMENT=23 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pacientevacunado`
--

LOCK TABLES `pacientevacunado` WRITE;
/*!40000 ALTER TABLE `pacientevacunado` DISABLE KEYS */;
INSERT INTO `pacientevacunado` VALUES (1,'DniTest','nombreTest','apellidoTest','direccionTest','celTest','dd/MM/yyyy','kitTest','loteTest','enferTest','dosisTest','fechaTest'),(2,'70354998','Edgardo Juan Julián','Barboza Rincón','Pasaje Hipolito Unanue 193 Moyopampa, Chosica','999555666','22/02/2003','','','','','08/02/2024'),(3,'DniTest','nombreTest','apellidoTest','direccionTest','celTest','dd/MM/yyyy','1klm','23las','Rabia','18 ml','09/02/2024'),(4,'DniTest','nombreTest','apellidoTest','direccionTest','celTest','dd/MM/yyyy','K12','L12','Tetano','15 ml','09/02/2024'),(5,'70354998','Edgardo Juan Julián','Barboza Rincón','Pasaje Hipolito Unanue 193 Moyopampa, Chosica','999555666','22/02/2003','7514qqwe','lkj','Tetano','17 ml','15/02/2024'),(6,'DniTest','nombreTest','apellidoTest','direccionTest','celTest','dd/MM/yyyy','testKit','testLote','testEnfermedad','testDosis','16/02/2024'),(7,'70354998','Edgardo Juan Julián','Barboza Rincón','Pasaje Hipolito Unanue 193 Moyopampa, Chosica','999555666','22/02/2003','1klm','23las','Rabia','18 ml','18/02/2024'),(8,'70354998','Edgardo Juan Julián','Barboza Rincón','Pasaje Hipolito Unanue 193 Moyopampa, Chosica','999555666','22/02/2003','12klm','23las','Rabia','15 ml','18/02/2024'),(9,'95643781','Jorge Manuel','Ruiz Ernandez','Jiron Bolibar 354','789562314','30/08/1999','852qwe','plaqe','Tuberculosis','10 ml','18/02/2024'),(10,'95643781','Jorge Manuel','Ruiz Ernandez','Jiron Bolibar 354','789562314','30/08/1999','2asds','plaqe','Tuberculosis','10 ml','18/02/2024'),(11,'70354998','Edgardo Juan Julián','Barboza Rincón','Pasaje Hipolito Unanue 193 Moyopampa, Chosica','999555666','22/02/2003','123xzcq','plaqe','Tuberculosis','10 ml','18/02/2024'),(12,'DniTest','nombreTest','apellidoTest','direccionTest','celTest','dd/MM/yyyy','1klm','23las','Rabia','18 ml','18/02/2024'),(13,'854973197','Pepito Suarez','Avelardo Ramos','Lurigancho Lurin','79654832154','05/02/2002','K11','L11','Ebola','10 ml','18/02/2024'),(14,'854973197','Pepito Suarez','Avelardo Ramos','Lurigancho Lurin','79654832154','05/02/2002','12klm','23las','Rabia','15 ml','18/02/2024'),(15,'1111','a','b','v','d','07/10/2002','asd','lkj','Ebola','17 ml','18/02/2024'),(16,'70354998','Edgardo Juan Julián','Barboza Rincón','Pasaje Hipolito Unanue 193 Moyopampa, Chosica','999555666','22/02/2003','zxcq','plaqe','Tuberculosis','10 ml','18/02/2024'),(17,'5555555','ppppp','ññññññ','llllll','77777777','05/10/2003','12377zxc','plaqe','Tuberculosis','10 ml','18/02/2024'),(18,'5555555','ppppp','ññññññ','llllll','77777777','05/10/2003','zxqww12','lojks','Neumonia','7 mi','18/02/2024'),(19,'1111','a','b','v','d','07/10/2002','pñlqs','plaqe','Tuberculosis','10 ml','18/02/2024'),(20,'1111','a','b','v','d','07/10/2002','79zx','wertk','Tetano','10 ml','18/02/2024'),(21,'854973197','Pepito Suarez','Avelardo Ramos','Lurigancho Lurin','79654832154','05/02/2002','zxcqgf','wertk','Tetano','10 ml','18/02/2024'),(22,'78652334','Roalnd','Cristobal Aleck','Valiere Franses 123','7456982','18/05/2011','9adq|','plaqe','Tuberculosis','10 ml','18/02/2024');
/*!40000 ALTER TABLE `pacientevacunado` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuarios`
--

DROP TABLE IF EXISTS `usuarios`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `usuarios` (
  `dniUsuario` varchar(8) NOT NULL,
  `nombreUsuario` varchar(100) DEFAULT NULL,
  `apellidoUsuario` varchar(100) DEFAULT NULL,
  `rolUsuario` varchar(45) DEFAULT NULL,
  `claveUsuario` varchar(45) DEFAULT NULL,
  `idUsuario` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`dniUsuario`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuarios`
--

LOCK TABLES `usuarios` WRITE;
/*!40000 ALTER TABLE `usuarios` DISABLE KEYS */;
INSERT INTO `usuarios` VALUES ('DNIAdmin','nomAdmin','apeAdmin','Admin','claveAdmin','UserAdmin'),('DNIInven','nomInven','apeInven','Inventarista','claveInven','UserInven'),('DNIPerMe','nomPerMed','apePerMed','Personal medico','clavePerMed','UserPerMEd');
/*!40000 ALTER TABLE `usuarios` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `vacunasdisponibles`
--

DROP TABLE IF EXISTS `vacunasdisponibles`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `vacunasdisponibles` (
  `kit` varchar(45) NOT NULL,
  `lote` varchar(45) DEFAULT NULL,
  `enfermedad` varchar(45) DEFAULT NULL,
  `dosis` varchar(45) DEFAULT NULL,
  `fechaCaducidad` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`kit`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `vacunasdisponibles`
--

LOCK TABLES `vacunasdisponibles` WRITE;
/*!40000 ALTER TABLE `vacunasdisponibles` DISABLE KEYS */;
INSERT INTO `vacunasdisponibles` VALUES ('1234','lojks','Neumonia','7 mi','18/08/2041'),('123vcd','wertk','Tetano','10 ml','30/05/2028'),('21cvx67','plaqe','Tuberculosis','10 ml','14/02/2044'),('95521123','lojks','Neumonia','7 mi','18/08/2041'),('978zxc','wertk','Tetano','10 ml','30/05/2028'),('984654ad','lojks','Neumonia','7 mi','18/08/2041'),('as732','plaqe','Tuberculosis','10 ml','14/02/2044'),('asd','lojks','Neumonia','7 mi','18/08/2041');
/*!40000 ALTER TABLE `vacunasdisponibles` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `vacunasusadas`
--

DROP TABLE IF EXISTS `vacunasusadas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `vacunasusadas` (
  `kit` varchar(45) NOT NULL,
  `lote` varchar(45) DEFAULT NULL,
  `enfermedad` varchar(45) DEFAULT NULL,
  `dosis` varchar(45) DEFAULT NULL,
  `fechaUso` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`kit`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `vacunasusadas`
--

LOCK TABLES `vacunasusadas` WRITE;
/*!40000 ALTER TABLE `vacunasusadas` DISABLE KEYS */;
INSERT INTO `vacunasusadas` VALUES ('9adq|','plaqe','Tuberculosis','10 ml','18/02/2024'),('pruebaKit','pruebaLote','pruebaEnfermedad','pruebaDosis','dd/MM/yyyy'),('q','we','asdqw','ui','dd/MM/yyyy');
/*!40000 ALTER TABLE `vacunasusadas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'centrovacunacion'
--

--
-- Dumping routines for database 'centrovacunacion'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-02-18 21:09:03
