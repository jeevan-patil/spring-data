
DROP TABLE IF EXISTS customer;

CREATE TABLE `customer` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `title` varchar(10) DEFAULT NULL,
  `email` VARCHAR(255) NOT NULL,
  `cust_name` varchar(255) NOT NULL,
  `cust_address` text,
  `cust_mobile` varchar(15) DEFAULT NULL,
  `created_date` DATETIME NOT NULL,
  `updated_date` DATETIME NULL DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `email_UNIQUE` (`email`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
