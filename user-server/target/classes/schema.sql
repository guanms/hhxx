/**
  user表
 */
CREATE TABLE IF NOT EXISTS USER (
id BIGINT UNSIGNED NOT NULL AUTO_INCREMENT,
username VARCHAR ( 40 ),
name VARCHAR ( 20 ),
age INT ( 3 ),
balance DECIMAL ( 10, 2 ),
PRIMARY KEY ( id )
)ENGINE=INNODB;

INSERT INTO USER (username, name, age, balance) VALUES('account1', '张三', 20, 100.00);

INSERT INTO USER (username, name, age, balance) VALUES('account2', '李四', 28, 100.00);

INSERT INTO USER (username, name, age, balance) VALUES('account3', '王五', 32, 100.00);