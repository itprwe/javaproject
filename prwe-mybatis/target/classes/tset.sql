-- java project database
create database test;

use test;
--
drop table if exists tb_user;
create table tb_user(
                        id bigint(20) NOT NULL AUTO_INCREMENT,
                        user_name varchar(32) DEFAULT NULL,
                        password varchar(32) DEFAULT NULL,
                        name varchar(32) DEFAULT NULL,
                        age int(10) DEFAULT NULL,
                        sex int(2) DEFAULT NULL,
                        birthday date DEFAULT NULL,
                        create_time timestamp NULL DEFAULT CURRENT_TIMESTAMP,
                        last_modify_time timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
                        PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
--
select * from tb_user tu

--
    INSERT INTO test.tb_user
(user_name, password, name, age, sex, birthday, create_time, last_modify_time)
VALUES('gaga', '123456', '嘎嘎', 12, 1, '1999-01-02', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);

INSERT INTO test.tb_user
(user_name, password, name, age, sex, birthday, create_time, last_modify_time)
VALUES('itprwe', 'itprwe', '哈哈', 22, 0, '1993-01-02', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);