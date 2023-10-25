-- MySQL dump 10.13  Distrib 8.0.19, for Win64 (x86_64)
--
-- Host: localhost    Database: autokuca_importhib
-- ------------------------------------------------------
-- Server version	11.1.2-MariaDB

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `kupac`
--

DROP TABLE IF EXISTS `kupac`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `kupac` (
  `sifra` int(11) NOT NULL AUTO_INCREMENT,
  `broj_telefona` varchar(255) DEFAULT NULL,
  `budzet` decimal(38,2) DEFAULT NULL,
  `ime` varchar(255) DEFAULT NULL,
  `prezime` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`sifra`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `kupac`
--

LOCK TABLES `kupac` WRITE;
/*!40000 ALTER TABLE `kupac` DISABLE KEYS */;
INSERT INTO `kupac` VALUES (1,'312.443.1364',209332.00,'Gregory','Jacobs'),(2,'425-989-2925',123060.00,'Lashawna','Thiel'),(3,'1-713-815-3597',543821.00,'Darrel','Wilderman'),(4,'415.608.7512',661867.00,'Alise','Stehr'),(5,'1-718-603-0193',529015.00,'Yolondfa','Schulist');
/*!40000 ALTER TABLE `kupac` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `operater`
--

DROP TABLE IF EXISTS `operater`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `operater` (
  `sifra` int(11) NOT NULL AUTO_INCREMENT,
  `email` varchar(255) DEFAULT NULL,
  `ime` varchar(255) DEFAULT NULL,
  `lozinka` varchar(255) DEFAULT NULL,
  `prezime` varchar(255) DEFAULT NULL,
  `uloga` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`sifra`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `operater`
--

LOCK TABLES `operater` WRITE;
/*!40000 ALTER TABLE `operater` DISABLE KEYS */;
INSERT INTO `operater` VALUES (1,'pero@import.com','Petar','$argon2i$v=19$m=65536,t=10,p=1$TM7YjYuVKTmRoucPtPDOTg$jJagGBHzBqr0aYbJDPuXWJn+wd/4PhMSpnEZ6sASRic','Matić','oper');
/*!40000 ALTER TABLE `operater` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `prodajnomjesto`
--

DROP TABLE IF EXISTS `prodajnomjesto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `prodajnomjesto` (
  `sifra` int(11) NOT NULL AUTO_INCREMENT,
  `adresa` varchar(255) DEFAULT NULL,
  `naziv` varchar(255) DEFAULT NULL,
  `prodavac_sifra` int(11) DEFAULT NULL,
  PRIMARY KEY (`sifra`),
  KEY `FKmhndb5uo06rvr6lg4ceha5y88` (`prodavac_sifra`),
  CONSTRAINT `FKmhndb5uo06rvr6lg4ceha5y88` FOREIGN KEY (`prodavac_sifra`) REFERENCES `prodavac` (`sifra`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `prodajnomjesto`
--

LOCK TABLES `prodajnomjesto` WRITE;
/*!40000 ALTER TABLE `prodajnomjesto` DISABLE KEYS */;
INSERT INTO `prodajnomjesto` VALUES (1,'Apt. 534 471 Rau Cliff, Lake Russ, NC 24060','Bode-Koepp',3),(2,'Apt. 207 20764 Brock Groves, Chaunceyhaven, NM 23410','Schmeler-Lockman',3),(3,'8196 Berge Harbors, South Elliott, MI 59665','Gislason and Sons',5),(4,'26476 Roberts Ranch, Port Lauren, NE 59855','Hayes and Sons',1),(5,'0382 Murazik Square, Schaeferport, SC 21999','Dickinson, Mann and Russel',5),(6,'0382 Murazik Square, Schaeferport, SC 21999','Dickinson, Mann and Russekljhgjhg',2);
/*!40000 ALTER TABLE `prodajnomjesto` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `prodavac`
--

DROP TABLE IF EXISTS `prodavac`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `prodavac` (
  `sifra` int(11) NOT NULL AUTO_INCREMENT,
  `ime` varchar(255) DEFAULT NULL,
  `prezime` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`sifra`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `prodavac`
--

LOCK TABLES `prodavac` WRITE;
/*!40000 ALTER TABLE `prodavac` DISABLE KEYS */;
INSERT INTO `prodavac` VALUES (1,'Raymundo','Ryan'),(2,'Tashia','Bechtelar'),(3,'Katharine','Conroy'),(4,'Numbers','Vandervort'),(5,'Marianobb','Macejkovic');
/*!40000 ALTER TABLE `prodavac` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `racun`
--

DROP TABLE IF EXISTS `racun`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `racun` (
  `sifra` int(11) NOT NULL AUTO_INCREMENT,
  `kupac_sifra` int(11) DEFAULT NULL,
  `prodavac_sifra` int(11) DEFAULT NULL,
  `vozilo_sifra` int(11) DEFAULT NULL,
  PRIMARY KEY (`sifra`),
  KEY `FKm2kredb5vj1p5e6xdhby4q8xg` (`kupac_sifra`),
  KEY `FKk4iyv5aok8uwaxk298fb2sihr` (`prodavac_sifra`),
  KEY `FKavp4dnp26tose6t3vk5k7awig` (`vozilo_sifra`),
  CONSTRAINT `FKavp4dnp26tose6t3vk5k7awig` FOREIGN KEY (`vozilo_sifra`) REFERENCES `vozilo` (`sifra`),
  CONSTRAINT `FKk4iyv5aok8uwaxk298fb2sihr` FOREIGN KEY (`prodavac_sifra`) REFERENCES `prodavac` (`sifra`),
  CONSTRAINT `FKm2kredb5vj1p5e6xdhby4q8xg` FOREIGN KEY (`kupac_sifra`) REFERENCES `kupac` (`sifra`)
) ENGINE=InnoDB AUTO_INCREMENT=102 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `racun`
--

LOCK TABLES `racun` WRITE;
/*!40000 ALTER TABLE `racun` DISABLE KEYS */;
INSERT INTO `racun` VALUES (1,1,1,1),(2,2,1,2),(3,2,2,3),(4,5,2,4),(5,3,3,5),(6,3,4,6),(7,2,1,7),(8,5,2,8),(9,2,3,9),(10,1,4,10),(11,4,1,11),(12,4,3,12),(13,4,4,13),(14,1,2,14),(15,3,4,15),(16,2,3,16),(17,3,3,17),(18,4,3,18),(19,2,4,19),(20,3,4,20),(21,1,1,21),(22,2,5,22),(23,4,4,23),(24,2,1,24),(25,5,4,25),(26,1,4,26),(27,4,2,27),(28,3,5,28),(29,2,3,29),(30,1,4,30),(31,4,3,31),(32,1,4,32),(33,2,2,33),(34,1,3,34),(35,4,1,35),(36,3,1,36),(37,1,5,37),(38,3,5,38),(39,2,3,39),(40,4,5,40),(41,5,2,41),(42,2,1,42),(43,1,3,43),(44,1,2,44),(45,2,2,45),(46,1,4,46),(47,1,1,47),(48,5,5,48),(49,4,3,49),(50,5,1,50),(51,2,1,51),(52,3,5,52),(53,5,4,53),(54,1,1,54),(55,4,4,55),(56,4,2,56),(57,3,2,57),(58,1,3,58),(59,1,4,59),(60,5,5,60),(61,3,3,61),(62,1,2,62),(63,4,4,63),(64,1,3,64),(65,2,5,65),(66,1,5,66),(67,2,2,67),(68,1,4,68),(69,2,5,69),(70,1,1,70),(71,3,1,71),(72,5,2,72),(73,4,2,73),(74,2,5,74),(75,5,5,75),(76,5,1,76),(77,4,2,77),(78,3,4,78),(79,3,4,79),(80,4,3,80),(81,2,1,81),(82,2,5,82),(83,5,3,83),(84,2,5,84),(85,1,4,85),(86,4,1,86),(87,1,2,87),(88,5,3,88),(89,1,2,89),(90,5,4,90),(91,2,1,91),(92,4,1,92),(93,4,4,93),(94,5,5,94),(95,1,1,95),(96,2,1,96),(97,1,2,97),(98,1,3,98),(99,2,5,99),(100,2,5,97),(101,2,5,92);
/*!40000 ALTER TABLE `racun` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `vozilo`
--

DROP TABLE IF EXISTS `vozilo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `vozilo` (
  `sifra` int(11) NOT NULL AUTO_INCREMENT,
  `VIN` varchar(255) DEFAULT NULL,
  `cijena` decimal(38,2) DEFAULT NULL,
  `model` varchar(255) DEFAULT NULL,
  `proizvodac` varchar(255) DEFAULT NULL,
  `prodajnomjesto_sifra` int(11) DEFAULT NULL,
  PRIMARY KEY (`sifra`),
  KEY `FKrqt307edfjm4kuhuak84hcwfp` (`prodajnomjesto_sifra`),
  CONSTRAINT `FKrqt307edfjm4kuhuak84hcwfp` FOREIGN KEY (`prodajnomjesto_sifra`) REFERENCES `prodajnomjesto` (`sifra`)
) ENGINE=InnoDB AUTO_INCREMENT=102 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `vozilo`
--

LOCK TABLES `vozilo` WRITE;
/*!40000 ALTER TABLE `vozilo` DISABLE KEYS */;
INSERT INTO `vozilo` VALUES (1,'2XPN3PAL6A0L85449',750258.00,'Encore','Audi',1),(2,'6HBPUZPFPR0155567',412370.00,'Sportage','Audi',3),(3,'8PR5LFPZRB0404249',148261.00,'159','Toyota',1),(4,'LUBWZURZJL0F84186',671527.00,'155','Nissan',3),(5,'28LTKP4NJALP15468',965855.00,'Ibiza','Xpeng',1),(6,'P7PYEN78JPSB21503',280294.00,'Pathfiner','Fiat',3),(7,'PRPPPDNS2PPN08838',178115.00,'A8','Lancia',5),(8,'KPPPJUXP5RXF48038',599383.00,'Superb','Xpeng',4),(9,'SP2HLFPZ8TKK98194',83500.00,'408','Tesla',1),(10,'GNKPPJHTNU0990525',128518.00,'Durango','Ford',2),(11,'0PP9PZEE4PPW65497',83242.00,'Arona','Mercedes-Benz',3),(12,'NPP3DUFTPTPR87369',776274.00,'Altima','Buick',1),(13,'5PTZHFC9ASWV16376',508499.00,'Golf','Audi',3),(14,'0CPMXMEAU3PB86497',831848.00,'Ceed','Fiat',4),(15,'7EP9BPBPCMVP58197',92945.00,'ID.3','Fiat',3),(16,'C486RP7DMPYY30650',659711.00,'Kona','Mercedes-Benz',5),(17,'6P0R4PJLPZPN98569',705880.00,'ET7','Toyota',1),(18,'PLFA0JPLPJFP38648',988158.00,'208','Seat',4),(19,'58UEJKX5MPMP54481',31843.00,'Duster','Toyota',2),(20,'CP6LJ7RMDNKV21050',790014.00,'Verano','Hyundai',2),(21,'XLA1JPPPPPN714376',506913.00,'Altima','Lincoln',5),(22,'02AD5MHYDGVN67355',74827.00,'CR-V','BMW',4),(23,'KPP4LN6KBSAF77024',434355.00,'T-Roc','Seat',3),(24,'F0XSC3L8SM0411576',259536.00,'MKX','Volkswagen',5),(25,'0UMGJJPPB4PY12800',629954.00,'Yaris','Nio',2),(26,'7DNCVY0PPVLL61359',393638.00,'MKS','Honda',4),(27,'36LJPP7G8MRY06683',440263.00,'Golf','Toyota',5),(28,'GNV9SPE90PVP97863',502904.00,'Accord','Fiat',3),(29,'PRALPVVXKJ0Y76044',409641.00,'A8','Opel',5),(30,'E5DPJPVPYPPW76881',204077.00,'X5','Kia',2),(31,'PP5VPDK57UEP56986',828463.00,'E-Class','Nio',3),(32,'PPPPPEKLEPRP13819',864572.00,'108','Lancia',2),(33,'SLE62PP2PHAG79313',233591.00,'EV6','Kia',2),(34,'PH4WH193GPY510471',746619.00,'Sportage','Seat',5),(35,'HNFHPHU166T503888',909401.00,'Malibu','Peugeot',1),(36,'G2UP67FMKS0P49331',360997.00,'EC6','Honda',5),(37,'GZP5P7268KP944752',10.00,'Accordg','Alfa-Romeog',2),(38,'JPPGB2NEUTJN31856',35802.00,'Ram','Hyundai',3),(39,'S6MTLY6JP5PW82364',611473.00,'MKZ','Renault',2),(40,'UBTBX4MP3MPD48526',848446.00,'Accord','Ford',4),(41,'BPXBAV7JJYJE10116',446988.00,'Qashqai','Xpeng',3),(42,'TNYLHUATKPCX61281',637611.00,'3008','Fiat',2),(43,'4PPJKSHMHPPM90374',872192.00,'Tarraco','Tesla',5),(44,'TDNVM1KM0UTZ67864',587294.00,'208','Volkswagen',2),(45,'LP2P2BNW67FC10232',779846.00,'G3i','Nio',5),(46,'PCSPSFYE7KE400656',546416.00,'Clio','Ford',3),(47,'KKPFHBPCKPDP77511',700608.00,'Ram','Honda',1),(48,'P7TDKP0ZEUFJ24293',550764.00,'ET7','Fiat',2),(49,'2M6VG3PNAURL57286',593638.00,'Duster','BMW',3),(50,'0M32LB6DBHPL73901',232530.00,'Sportage','Mercedes-Benz',4),(51,'PA8TRJPFPWV749090',868023.00,'Zoe','Alfa-Romeo',1),(52,'PE0WFPJ0P9PL74830',344424.00,'2008','Hyundai',1),(53,'J2N7B9PPPCP936032',984358.00,'Ibiza','Mercedes-Benz',4),(54,'Z4KV6M2XHA0P17296',774516.00,'Thesis','Tesla',3),(55,'HCRVPNP8PYK842822',432190.00,'Kodiaq','Xpeng',3),(56,'ELB2P9FNWL0G97302',939439.00,'156','Nissan',5),(57,'MGC2GFU7PHFC62207',48324.00,'Yaris','Toyota',3),(58,'PAP8RYPJ9PNM16537',287109.00,'Multipla','Lancia',2),(59,'FPPPAN2P6WPK57260',732063.00,'Kodiaq','Citroën',1),(60,'CPC0HP9LSZ0F06178',947765.00,'Camry','Opel',4),(61,'E34EKPYPPPPJ21515',31137.00,'Enyaq','Toyota',4),(62,'WV6PKP7PJL0K36194',871901.00,'Captur','Ford',1),(63,'Z5KPLLPJP0HP92299',781983.00,'Ibiza','Audi',1),(64,'0TBSZ77NDK0P96514',562090.00,'Verano','Nissan',5),(65,'MHCPR6GPPKPP85834',807655.00,'X3','Dacia',2),(66,'ECKHACH7S1MK84003',734796.00,'Clio','Lancia',5),(67,'PPEPNKTUBED536536',640325.00,'Astra','Audi',4),(68,'ZF0PS32REF0M30712',124784.00,'i10','Chevy',1),(69,'4FBLCTF70RDD36395',912823.00,'CR-V','Alfa-Romeo',2),(70,'5RDPKSETPSJY66009',389930.00,'CX-8','Mercedes-Benz',4),(71,'P0GPTAMVS7CT39254',29860.00,'Odyssey','Buick',5),(72,'0HPKKTPP2PET07532',67597.00,'MKX','Tesla',4),(73,'P24PPPYSELB748491',412745.00,'C3','Buick',3),(74,'T9TFANPMDL0K39881',299042.00,'328i','Xpeng',2),(75,'N72L68KP670D36919',920893.00,'E-Class','Fiat',1),(76,'MVRYPCS1RK0P38738',147081.00,'Zoe','Kia',4),(77,'NKPBSHUPPPPP55431',442307.00,'Tarraco','Buick',1),(78,'PP9LNR4MY0KM81519',48394.00,'Fabia','Nissan',3),(79,'DPPFZPE9P8ZZ64168',354675.00,'MX-5','Toyota',3),(80,'VPPL3XBN71PW21218',480823.00,'A8','Nio',4),(81,'LDNPHPPCXXC619462',537572.00,'Silverado','Volvo',2),(82,'UPS40X72KMY667741',65189.00,'Megane','Chevy',1),(83,'SKSDJFMNP5TJ01982',238097.00,'i20','Lancia',5),(84,'MYS6DTAPXXGW40087',675513.00,'Bravo','Seat',5),(85,'SPHPP3VA6KWT76205',208305.00,'Navigator','Mazda',4),(86,'E2PPPSPD3KYT32410',847085.00,'Twingo','Honda',2),(87,'FLBTPNPHPBK183498',547042.00,'ET7','Opel',1),(88,'7PMEDYKFUPBX26970',669231.00,'Sandero','Lancia',4),(89,'XWTMXPTPTDKD04953',519459.00,'Crossland','Chevy',5),(90,'YPKYX21DVPPX08722',126793.00,'Prius','BMW',4),(91,'N71FCJPFMP0L73146',673043.00,'Bravo','Honda',3),(92,'KRFLNPCNZP0B06734',480174.00,'i30','Tesla',1),(93,'EKGE8PKFPPPT20316',744236.00,'Camry','Volkswagen',3),(94,'PXLC67DZ0JP341264',504875.00,'CX-8','Mazda',3),(95,'7189PZPB5PM739128',417061.00,'LaCrosse','Ford',3),(96,'PZ06PRPPMLLL69855',712186.00,'Durango','Audi',3),(97,'JCPAR36DD8TK17311',166660.00,'Corsa','Fiat',3),(98,'DMJPJE4PFDJL42631',459320.00,'ES7','Skoda',1),(99,'KCYN96JNKHKS60471',481574.00,'V60','Chevy',3),(100,'TSGPY9HPPWUN39646',441931.00,'Juke','Audi',2),(101,'GZP5P7268KP944752',10.00,'Accordg','Alfa-Romeog',2);
/*!40000 ALTER TABLE `vozilo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping routines for database 'autokuca_importhib'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-10-25 12:29:13
