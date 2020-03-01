CREATE TABLE `myinterface` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) NOT NULL,
  `callTimes` int(11) DEFAULT NULL,
  `initTime` date DEFAULT NULL,
  `health` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
