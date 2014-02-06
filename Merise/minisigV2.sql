-- phpMyAdmin SQL Dump
-- version 3.5.8.1
-- http://www.phpmyadmin.net
--
-- Client: 127.0.0.1
-- Généré le: Mer 05 Février 2014 à 14:04
-- Version du serveur: 5.6.11-log
-- Version de PHP: 5.4.14

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de données: `minisig`
--

-- --------------------------------------------------------

--
-- Structure de la table `historique`
--

CREATE TABLE IF NOT EXISTS `historique` (
  `ID_Historique` int(11) NOT NULL AUTO_INCREMENT,
  `Date_Historique` date DEFAULT NULL,
  `ID_Interet` int(11) NOT NULL,
  PRIMARY KEY (`ID_Historique`),
  KEY `FK_Historique_ID_Interet` (`ID_Interet`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Structure de la table `interet`
--

CREATE TABLE IF NOT EXISTS `interet` (
  `ID_Interet` int(11) NOT NULL AUTO_INCREMENT,
  `Libelle_Interet` text,
  `TexteCourt_Interet` mediumtext,
  `Description_Interet` longtext,
  `X_Interet` double DEFAULT NULL,
  `Y_Interet` double DEFAULT NULL,
  `Image_Interet` text,
  `ID_Lieu` int(11) DEFAULT NULL,
  PRIMARY KEY (`ID_Interet`),
  KEY `FK_Interet_ID_Lieu` (`ID_Lieu`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Structure de la table `lieu`
--

CREATE TABLE IF NOT EXISTS `lieu` (
  `ID_Lieu` int(11) NOT NULL AUTO_INCREMENT,
  `Libelle_Lieu` text,
  `X_Lieu` double DEFAULT NULL,
  `Y_Lieu` double DEFAULT NULL,
  `Zoom` int(11) NOT NULL,
  `ID_Map` int(11) DEFAULT NULL,
  PRIMARY KEY (`ID_Lieu`),
  KEY `FK_Lieu_ID_Map` (`ID_Map`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Structure de la table `map`
--

CREATE TABLE IF NOT EXISTS `map` (
  `ID_Map` int(11) NOT NULL AUTO_INCREMENT,
  `X1` double NOT NULL,
  `X2` tinyint(1) NOT NULL,
  `Y1` double NOT NULL,
  `Y2` double NOT NULL,
  `Image_Map` text,
  PRIMARY KEY (`ID_Map`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Structure de la table `new`
--

CREATE TABLE IF NOT EXISTS `new` (
  `ID_New` int(11) NOT NULL AUTO_INCREMENT,
  `Libelle_New` text,
  `Description_New` text,
  PRIMARY KEY (`ID_New`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Structure de la table `parcours`
--

CREATE TABLE IF NOT EXISTS `parcours` (
  `ID_Parcours` int(11) NOT NULL AUTO_INCREMENT,
  `Description_Parcours` longtext,
  `Libelle_Parcours` text,
  `TexteCourt_Parcours` mediumtext,
  `ID_Map` int(11) NOT NULL,
  PRIMARY KEY (`ID_Parcours`),
  KEY `FK_Parcours_ID_Map` (`ID_Map`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Structure de la table `passer`
--

CREATE TABLE IF NOT EXISTS `passer` (
  `ID_Parcours` int(11) NOT NULL AUTO_INCREMENT,
  `ID_Interet` int(11) NOT NULL,
  PRIMARY KEY (`ID_Parcours`,`ID_Interet`),
  KEY `FK_Passer_ID_Interet` (`ID_Interet`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

--
-- Contraintes pour les tables exportées
--

--
-- Contraintes pour la table `historique`
--
ALTER TABLE `historique`
  ADD CONSTRAINT `FK_Historique_ID_Interet` FOREIGN KEY (`ID_Interet`) REFERENCES `interet` (`ID_Interet`);

--
-- Contraintes pour la table `interet`
--
ALTER TABLE `interet`
  ADD CONSTRAINT `FK_Interet_ID_Lieu` FOREIGN KEY (`ID_Lieu`) REFERENCES `lieu` (`ID_Lieu`);

--
-- Contraintes pour la table `lieu`
--
ALTER TABLE `lieu`
  ADD CONSTRAINT `FK_Lieu_ID_Map` FOREIGN KEY (`ID_Map`) REFERENCES `map` (`ID_Map`);

--
-- Contraintes pour la table `parcours`
--
ALTER TABLE `parcours`
  ADD CONSTRAINT `FK_Parcours_ID_Map` FOREIGN KEY (`ID_Map`) REFERENCES `map` (`ID_Map`);

--
-- Contraintes pour la table `passer`
--
ALTER TABLE `passer`
  ADD CONSTRAINT `FK_Passer_ID_Interet` FOREIGN KEY (`ID_Interet`) REFERENCES `interet` (`ID_Interet`),
  ADD CONSTRAINT `FK_Passer_ID_Parcours` FOREIGN KEY (`ID_Parcours`) REFERENCES `parcours` (`ID_Parcours`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
