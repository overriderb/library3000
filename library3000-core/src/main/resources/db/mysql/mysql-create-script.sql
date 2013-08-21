delimiter $$

CREATE DATABASE `library3` /*!40100 DEFAULT CHARACTER SET utf8 */$$

CREATE TABLE `rating` (
  `ratingId` int(11) NOT NULL AUTO_INCREMENT,
  `rating` varchar(5) NOT NULL,
  PRIMARY KEY (`ratingId`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8$$

CREATE TABLE `library` (
  `libraryId` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
  PRIMARY KEY (`libraryId`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8$$

CREATE TABLE `book` (
  `bookId` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(45) NOT NULL,
  `author` varchar(45) NOT NULL,
  `pageNumbers` int(11) NOT NULL,
  `description` varchar(300) NOT NULL,
  `libraryId` int(11) NOT NULL,
  PRIMARY KEY (`bookId`),
  KEY `libraryId_idx` (`libraryId`),
  CONSTRAINT `libraryId` FOREIGN KEY (`libraryId`) REFERENCES `library` (`libraryId`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=34 DEFAULT CHARSET=utf8$$

CREATE TABLE `comment` (
  `commentId` int(11) NOT NULL AUTO_INCREMENT,
  `comment` varchar(300) NOT NULL,
  `bookId` int(11) NOT NULL,
  `ratingId` int(11) NOT NULL,
  PRIMARY KEY (`commentId`),
  KEY `bookId_idx` (`bookId`),
  KEY `ratingId_idx` (`ratingId`),
  CONSTRAINT `bookId` FOREIGN KEY (`bookId`) REFERENCES `book` (`bookId`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `ratingId` FOREIGN KEY (`ratingId`) REFERENCES `rating` (`ratingId`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8$$