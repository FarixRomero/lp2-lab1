-- MySQL dump 10.13  Distrib 8.0.21, for Win64 (x86_64)
--
-- Host: database-lp2.ciud7wkw0k9g.us-east-1.rds.amazonaws.com    Database: JAVOS
-- ------------------------------------------------------
-- Server version	8.0.28

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
SET @MYSQLDUMP_TEMP_LOG_BIN = @@SESSION.SQL_LOG_BIN;
SET @@SESSION.SQL_LOG_BIN= 0;

--
-- GTID state at the beginning of the backup 
--

SET @@GLOBAL.GTID_PURGED=/*!80000 '+'*/ '';

--
-- Table structure for table `Administrador`
--

DROP TABLE IF EXISTS `Administrador`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Administrador` (
  `id_administrador` int NOT NULL AUTO_INCREMENT,
  `fid_usuario` int DEFAULT NULL,
  `fid_especialidad` int DEFAULT NULL,
  `calificacion` decimal(10,2) DEFAULT NULL,
  `cant_pacientes` int DEFAULT NULL,
  PRIMARY KEY (`id_administrador`),
  UNIQUE KEY `fid_usuario` (`fid_usuario`),
  UNIQUE KEY `fid_especialidad` (`fid_especialidad`),
  CONSTRAINT `Administrador_ibfk_1` FOREIGN KEY (`fid_especialidad`) REFERENCES `Especialidad` (`id_especialidad`),
  CONSTRAINT `Administrador_ibfk_2` FOREIGN KEY (`fid_usuario`) REFERENCES `Usuario` (`id_usuario`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Administrador`
--

LOCK TABLES `Administrador` WRITE;
/*!40000 ALTER TABLE `Administrador` DISABLE KEYS */;
/*!40000 ALTER TABLE `Administrador` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Chat`
--

DROP TABLE IF EXISTS `Chat`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Chat` (
  `comentario` varchar(200) DEFAULT NULL,
  `fecha` date DEFAULT NULL,
  `emisor` varchar(50) DEFAULT NULL,
  `hora` time DEFAULT NULL,
  `fid_medico` int DEFAULT NULL,
  `fid_paciente` int DEFAULT NULL,
  KEY `fid_medico` (`fid_medico`),
  KEY `fid_paciente` (`fid_paciente`),
  CONSTRAINT `Chat_ibfk_1` FOREIGN KEY (`fid_medico`) REFERENCES `Medico` (`id_medico`),
  CONSTRAINT `Chat_ibfk_2` FOREIGN KEY (`fid_paciente`) REFERENCES `Paciente` (`id_paciente`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Chat`
--

LOCK TABLES `Chat` WRITE;
/*!40000 ALTER TABLE `Chat` DISABLE KEYS */;
/*!40000 ALTER TABLE `Chat` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `CitaMedica`
--

DROP TABLE IF EXISTS `CitaMedica`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `CitaMedica` (
  `id_cita` int NOT NULL AUTO_INCREMENT,
  `fid_paciente` int DEFAULT NULL,
  `fid_horario` int DEFAULT NULL,
  `fid_consultorio` int DEFAULT NULL,
  `fecha` date DEFAULT NULL,
  PRIMARY KEY (`id_cita`),
  KEY `fid_paciente` (`fid_paciente`),
  KEY `fid_horario` (`fid_horario`),
  KEY `fid_consultorio` (`fid_consultorio`),
  CONSTRAINT `CitaMedica_ibfk_1` FOREIGN KEY (`fid_paciente`) REFERENCES `Paciente` (`id_paciente`),
  CONSTRAINT `CitaMedica_ibfk_2` FOREIGN KEY (`fid_horario`) REFERENCES `Horario` (`id_horario`),
  CONSTRAINT `CitaMedica_ibfk_3` FOREIGN KEY (`fid_consultorio`) REFERENCES `Consultorio` (`id_consultorio`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `CitaMedica`
--

LOCK TABLES `CitaMedica` WRITE;
/*!40000 ALTER TABLE `CitaMedica` DISABLE KEYS */;
/*!40000 ALTER TABLE `CitaMedica` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Comentario`
--

DROP TABLE IF EXISTS `Comentario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Comentario` (
  `descripcion` varchar(50) DEFAULT NULL,
  `fecha_comentario` date DEFAULT NULL,
  `fid_medico` int DEFAULT NULL,
  KEY `fid_medico` (`fid_medico`),
  CONSTRAINT `Comentario_ibfk_1` FOREIGN KEY (`fid_medico`) REFERENCES `Medico` (`id_medico`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Comentario`
--

LOCK TABLES `Comentario` WRITE;
/*!40000 ALTER TABLE `Comentario` DISABLE KEYS */;
/*!40000 ALTER TABLE `Comentario` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Consultorio`
--

DROP TABLE IF EXISTS `Consultorio`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Consultorio` (
  `id_consultorio` int NOT NULL AUTO_INCREMENT,
  `disponible` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`id_consultorio`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Consultorio`
--

LOCK TABLES `Consultorio` WRITE;
/*!40000 ALTER TABLE `Consultorio` DISABLE KEYS */;
/*!40000 ALTER TABLE `Consultorio` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Diagnostico`
--

DROP TABLE IF EXISTS `Diagnostico`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Diagnostico` (
  `id_diagnostico` int NOT NULL AUTO_INCREMENT,
  `fid_cita` int DEFAULT NULL,
  `fid_historia` int DEFAULT NULL,
  `resultado` varchar(100) DEFAULT NULL,
  `observacion` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id_diagnostico`),
  KEY `fid_cita` (`fid_cita`),
  KEY `fid_historia` (`fid_historia`),
  CONSTRAINT `Diagnostico_ibfk_1` FOREIGN KEY (`fid_cita`) REFERENCES `CitaMedica` (`id_cita`),
  CONSTRAINT `Diagnostico_ibfk_2` FOREIGN KEY (`fid_historia`) REFERENCES `HistorialClinico` (`id_historia`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Diagnostico`
--

LOCK TABLES `Diagnostico` WRITE;
/*!40000 ALTER TABLE `Diagnostico` DISABLE KEYS */;
/*!40000 ALTER TABLE `Diagnostico` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Especialidad`
--

DROP TABLE IF EXISTS `Especialidad`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Especialidad` (
  `id_especialidad` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(50) DEFAULT NULL,
  `estado` tinyint DEFAULT NULL,
  `cant_medicos` int DEFAULT NULL,
  PRIMARY KEY (`id_especialidad`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Especialidad`
--

LOCK TABLES `Especialidad` WRITE;
/*!40000 ALTER TABLE `Especialidad` DISABLE KEYS */;
/*!40000 ALTER TABLE `Especialidad` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `HistorialClinico`
--

DROP TABLE IF EXISTS `HistorialClinico`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `HistorialClinico` (
  `id_historia` int NOT NULL AUTO_INCREMENT,
  `fid_paciente` int DEFAULT NULL,
  PRIMARY KEY (`id_historia`),
  KEY `fid_paciente` (`fid_paciente`),
  CONSTRAINT `HistorialClinico_ibfk_1` FOREIGN KEY (`fid_paciente`) REFERENCES `Paciente` (`id_paciente`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `HistorialClinico`
--

LOCK TABLES `HistorialClinico` WRITE;
/*!40000 ALTER TABLE `HistorialClinico` DISABLE KEYS */;
/*!40000 ALTER TABLE `HistorialClinico` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Horario`
--

DROP TABLE IF EXISTS `Horario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Horario` (
  `id_horario` int NOT NULL AUTO_INCREMENT,
  `dia` varchar(50) DEFAULT NULL,
  `hora_inicio` date DEFAULT NULL,
  `hora_fin` date DEFAULT NULL,
  `fid_semestre` int DEFAULT NULL,
  `fid_medico` int DEFAULT NULL,
  PRIMARY KEY (`id_horario`),
  KEY `fid_medico` (`fid_medico`),
  KEY `fid_semestre` (`fid_semestre`),
  CONSTRAINT `Horario_ibfk_1` FOREIGN KEY (`fid_medico`) REFERENCES `Medico` (`id_medico`),
  CONSTRAINT `Horario_ibfk_2` FOREIGN KEY (`fid_semestre`) REFERENCES `Semestre` (`id_semestre`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Horario`
--

LOCK TABLES `Horario` WRITE;
/*!40000 ALTER TABLE `Horario` DISABLE KEYS */;
/*!40000 ALTER TABLE `Horario` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `LineaRecetaMedica`
--

DROP TABLE IF EXISTS `LineaRecetaMedica`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `LineaRecetaMedica` (
  `id_lineaRecetaMedica` int NOT NULL AUTO_INCREMENT,
  `fid_recetaMedica` int DEFAULT NULL,
  `fid_medicamento` int DEFAULT NULL,
  `cantidad` int DEFAULT NULL,
  PRIMARY KEY (`id_lineaRecetaMedica`),
  KEY `fid_medicamento` (`fid_medicamento`),
  KEY `fid_recetaMedica` (`fid_recetaMedica`),
  CONSTRAINT `LineaRecetaMedica_ibfk_1` FOREIGN KEY (`fid_medicamento`) REFERENCES `Medicamento` (`id_medicamento`),
  CONSTRAINT `LineaRecetaMedica_ibfk_2` FOREIGN KEY (`fid_recetaMedica`) REFERENCES `RecetaMedica` (`id_recetaMedica`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `LineaRecetaMedica`
--

LOCK TABLES `LineaRecetaMedica` WRITE;
/*!40000 ALTER TABLE `LineaRecetaMedica` DISABLE KEYS */;
/*!40000 ALTER TABLE `LineaRecetaMedica` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Medicamento`
--

DROP TABLE IF EXISTS `Medicamento`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Medicamento` (
  `id_medicamento` int NOT NULL AUTO_INCREMENT,
  `codigo` varchar(50) DEFAULT NULL,
  `nombre` varchar(90) DEFAULT NULL,
  PRIMARY KEY (`id_medicamento`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Medicamento`
--

LOCK TABLES `Medicamento` WRITE;
/*!40000 ALTER TABLE `Medicamento` DISABLE KEYS */;
/*!40000 ALTER TABLE `Medicamento` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Medico`
--

DROP TABLE IF EXISTS `Medico`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Medico` (
  `id_medico` int NOT NULL AUTO_INCREMENT,
  `fid_usuario` int DEFAULT NULL,
  `fid_especialidad` int DEFAULT NULL,
  `fid_administrador` int DEFAULT NULL,
  `calificacion` decimal(10,2) DEFAULT NULL,
  `cant_pacientes` int DEFAULT NULL,
  PRIMARY KEY (`id_medico`),
  UNIQUE KEY `fid_usuario` (`fid_usuario`),
  UNIQUE KEY `fid_especialidad` (`fid_especialidad`),
  KEY `fid_administrador` (`fid_administrador`),
  CONSTRAINT `Medico_ibfk_1` FOREIGN KEY (`fid_administrador`) REFERENCES `Administrador` (`id_administrador`),
  CONSTRAINT `Medico_ibfk_2` FOREIGN KEY (`fid_especialidad`) REFERENCES `Especialidad` (`id_especialidad`),
  CONSTRAINT `Medico_ibfk_3` FOREIGN KEY (`fid_usuario`) REFERENCES `Usuario` (`id_usuario`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Medico`
--

LOCK TABLES `Medico` WRITE;
/*!40000 ALTER TABLE `Medico` DISABLE KEYS */;
/*!40000 ALTER TABLE `Medico` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Paciente`
--

DROP TABLE IF EXISTS `Paciente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Paciente` (
  `id_paciente` int NOT NULL AUTO_INCREMENT,
  `seguro` tinyint(1) DEFAULT NULL,
  `fid_usuario` int DEFAULT NULL,
  PRIMARY KEY (`id_paciente`),
  KEY `fid_usuario` (`fid_usuario`),
  CONSTRAINT `Paciente_ibfk_1` FOREIGN KEY (`fid_usuario`) REFERENCES `Usuario` (`id_usuario`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Paciente`
--

LOCK TABLES `Paciente` WRITE;
/*!40000 ALTER TABLE `Paciente` DISABLE KEYS */;
/*!40000 ALTER TABLE `Paciente` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Persona`
--

DROP TABLE IF EXISTS `Persona`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Persona` (
  `id_persona` int NOT NULL AUTO_INCREMENT,
  `DNI` varchar(8) DEFAULT NULL,
  `nombre` varchar(50) DEFAULT NULL,
  `apellido` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id_persona`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Persona`
--

LOCK TABLES `Persona` WRITE;
/*!40000 ALTER TABLE `Persona` DISABLE KEYS */;
/*!40000 ALTER TABLE `Persona` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `RecetaMedica`
--

DROP TABLE IF EXISTS `RecetaMedica`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `RecetaMedica` (
  `id_recetaMedica` int NOT NULL AUTO_INCREMENT,
  `fid_diagnostico` int DEFAULT NULL,
  `cod_receta` varchar(90) DEFAULT NULL,
  PRIMARY KEY (`id_recetaMedica`),
  KEY `fid_diagnostico` (`fid_diagnostico`),
  CONSTRAINT `RecetaMedica_ibfk_1` FOREIGN KEY (`fid_diagnostico`) REFERENCES `Diagnostico` (`id_diagnostico`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `RecetaMedica`
--

LOCK TABLES `RecetaMedica` WRITE;
/*!40000 ALTER TABLE `RecetaMedica` DISABLE KEYS */;
/*!40000 ALTER TABLE `RecetaMedica` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Semestre`
--

DROP TABLE IF EXISTS `Semestre`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Semestre` (
  `id_semestre` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(50) DEFAULT NULL,
  `fechaInicio` date DEFAULT NULL,
  `fechaFin` date DEFAULT NULL,
  PRIMARY KEY (`id_semestre`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Semestre`
--

LOCK TABLES `Semestre` WRITE;
/*!40000 ALTER TABLE `Semestre` DISABLE KEYS */;
/*!40000 ALTER TABLE `Semestre` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Usuario`
--

DROP TABLE IF EXISTS `Usuario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Usuario` (
  `id_usuario` int NOT NULL AUTO_INCREMENT,
  `fid_persona` int DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  `username` varchar(50) DEFAULT NULL,
  `password` varchar(50) DEFAULT NULL,
  `estado` tinyint DEFAULT NULL,
  PRIMARY KEY (`id_usuario`),
  KEY `fid_persona` (`fid_persona`),
  CONSTRAINT `Usuario_ibfk_1` FOREIGN KEY (`fid_persona`) REFERENCES `Persona` (`id_persona`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Usuario`
--

LOCK TABLES `Usuario` WRITE;
/*!40000 ALTER TABLE `Usuario` DISABLE KEYS */;
/*!40000 ALTER TABLE `Usuario` ENABLE KEYS */;
UNLOCK TABLES;
SET @@SESSION.SQL_LOG_BIN = @MYSQLDUMP_TEMP_LOG_BIN;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-04-27  1:03:42
