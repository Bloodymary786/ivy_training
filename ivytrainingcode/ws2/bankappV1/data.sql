 create table users(id int not null primary key auto_increment, username varchar(80) not null, password varchar(80) not null, profile varchar(15) not null);

 create table customers(id int not null primary key auto_increment, name varchar(80) not null, dob date not null, address varchar(100) not null, email varchar(50) not null, accountType varchar(10) not null);


id
name
dob
address
email
accountType
