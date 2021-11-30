 create table users(id int not null primary key auto_increment, username varchar(80) not null, password varchar(80) not null, profile varchar(15) not null);

create table customers
(id int not null primary key auto_increment, 
name varchar(80) not null, 
dob date not null, 
address varchar(100) not null, 
email varchar(50) not null,
balance double not null, 
accountType varchar(10) not null
)engine=InnoDB;

create table account_transaction
(
        tid int not null auto_increment,
	txdate date not null,
	cid int not null,
	amount double not null,
	optype varchar(10) not null,
	primary key(tid),
	foreign key(cid) references 
		customers(id) 
	on delete cascade on update 
		cascade
)engine=InnoDB;

id
name
dob
address
email
accountType
