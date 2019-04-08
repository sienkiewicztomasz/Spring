CREATE TABLE CUSTOMER (
ID bigint (20) NOT NULL AUTO_INCREMENT,
ADDRESS_LINE_ONE varchar (100) NOT NULL,
ADDRESS_LINE_TWO varchar (50) default NULL,
CITY varchar (50) DEFAULT NULL,
EMAIL varchar (50) DEFAULT NULL,
FIRST_NAME varchar (50) DEFAULT NULL,
LAST_NAME varchar (50) DEFAULT NULL,
PHONE_NUMBER varchar (50) DEFAULT NULL,
STATE varchar (50) DEFAULT NULL,
ZIP_CODE varchar (50) DEFAULT NULL,
primary key (ID)
);

INSERT INTO CUSTOMER (ID,ADDRESS_LINE_ONE,ADDRESS_LINE_TWO,CITY,EMAIL,FIRST_NAME,LAST_NAME,PHONE_NUMBER,STATE,ZIP_CODE)
VALUES (NULL,'Address 1','Address 1','W-WA','E@MAIL1','JAN','KOWALSKI','999-888-777','pl','00-001');
INSERT INTO CUSTOMER (ID,ADDRESS_LINE_ONE,ADDRESS_LINE_TWO,CITY,EMAIL,FIRST_NAME,LAST_NAME,PHONE_NUMBER,STATE,ZIP_CODE)
VALUES (NULL,'Address 2','Address 2','B-stok','E@MAIL2','TOM','GIT','999-888-777','pl','00-002');
INSERT INTO CUSTOMER (ID,ADDRESS_LINE_ONE,ADDRESS_LINE_TWO,CITY,EMAIL,FIRST_NAME,LAST_NAME,PHONE_NUMBER,STATE,ZIP_CODE)
VALUES (NULL,'Address 3','Address 3','W-WA','E@MAIL3','BARTLOMIEJ','LINUX','999-888-777','pl','00-003');
INSERT INTO CUSTOMER (ID,ADDRESS_LINE_ONE,ADDRESS_LINE_TWO,CITY,EMAIL,FIRST_NAME,LAST_NAME,PHONE_NUMBER,STATE,ZIP_CODE)
VALUES (NULL,'Address 4','Address 4','B-Stok','E@MAIL4','KAROLINA','SPRING','999-888-777','pl','00-004');
INSERT INTO CUSTOMER (ID,ADDRESS_LINE_ONE,ADDRESS_LINE_TWO,CITY,EMAIL,FIRST_NAME,LAST_NAME,PHONE_NUMBER,STATE,ZIP_CODE)
VALUES (NULL,'Address 5','Address 5','Gdansk','E@MAIL5','JAN','ZING','999-888-777','pl','00-005');

create table product (
  ID BIGINT(20) not null auto_increment,
  description varchar(100) not null,
  price DECIMAL (20),
  image_Url varchar(100) not null,
  PRIMARY KEY (ID)
);

insert into product (ID, description, price, image_Url) values (NULL,'Great product1',120.0,'http://img.com/prodId=1');
insert into product (ID, description, price, image_Url) values (NULL,'Great product2',220.0,'http://img.com/prodId=2');
insert into product (ID, description, price, image_Url) values (NULL,'Great product3',320.0,'http://img.com/prodId=3');
insert into product (ID, description, price, image_Url) values (NULL,'Great product4',420.0,'http://img.com/prodId=4');
insert into product (ID, description, price, image_Url) values (NULL,'Great product5',520.0,'http://img.com/prodId=5');