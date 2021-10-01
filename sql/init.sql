CREATE TABLE `address` (
                           `id` int(11) NOT NULL AUTO_INCREMENT,
                           `county` varchar(45) DEFAULT NULL,
                           `city` varchar(45) DEFAULT NULL,
                           `street` varchar(45) DEFAULT NULL,
                           PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

CREATE TABLE `student` (
                           `id` int(11) NOT NULL AUTO_INCREMENT,
                           `name` varchar(45) DEFAULT NULL,
                           `address` int(11) DEFAULT NULL,
                           `age` int(11) DEFAULT NULL,
                           PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;