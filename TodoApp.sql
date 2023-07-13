create database TodoApp;

------------------------------------------------------------
--        Script Postgre 
------------------------------------------------------------



------------------------------------------------------------
-- Table: todo
------------------------------------------------------------
CREATE TABLE public.todo(
	id            INT  NOT NULL ,
	title         VARCHAR (255) NOT NULL ,
	descritpion   VARCHAR (2000)  NOT NULL ,
	deadline      TIMESTAMP  NOT NULL ,
	priority      INTEGER  NOT NULL  ,
	CONSTRAINT todo_PK PRIMARY KEY (id)
)WITHOUT OIDS;

