create database GLBank;

use GLBank;

create table Employees (idemp INTEGER AUTO_INCREMENT, 
                         firstname VARCHAR(20) NOT NULL,
						 lastname VARCHAR(20) NOT NULL,
						 email VARCHAR(30) NOT NULL UNIQUE,
						 position CHAR(1) NOT NULL DEFAULT 'C',
						 PRIMARY KEY (idemp) );
						 
create table LoginEmployee (id INTEGER AUTO_INCREMENT,
						idemp INTEGER,
						login varchar(15),
						password varchar(60),
						PRIMARY KEY (id),
						FOREIGN KEY (idemp) REFERENCES Employees(idemp)
						ON DELETE CASCADE
						ON UPDATE RESTRICT);
						
create table HistoryLoginEmployee ( id INTEGER AUTO_INCREMENT,
						idemp INTEGER ,
						logindate DATETIME,
						PRIMARY KEY(id),
						FOREIGN KEY (idemp) REFERENCES Employees(idemp)
						ON DELETE CASCADE
						ON UPDATE RESTRICT);
						
insert into Employees VALUES(1,'Jan','Kollar','kollar@pobox.sk','C');
insert into Employees VALUES(2,'Daniel','Molnar','molnar@pobox.sk','C');
insert into loginemployee values(1,1,'kollar','kollar');
insert into loginemployee values(2,2,'molnar','molnar');