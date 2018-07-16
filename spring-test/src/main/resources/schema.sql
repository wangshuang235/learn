

create table Spittle (
	id identity,
	message varchar(140) not null,
	created_at timestamp not null,
	latitude double,
	longitude double
);

create table Spitter (
	id identity,
	username varchar(20) unique not null,
	password varchar(20) not null,
	first_name varchar(30) not null,
	last_name varchar(30) not null,
	email varchar(30) not null
);












CREATE SCHEMA IF NOT EXISTS sys;

DROP TABLE IF EXISTS sys.sys_user;

CREATE TABLE sys.sys_user (
  id   BIGINT NOT NULL,
  name VARCHAR(255),
  PRIMARY KEY (id)
);

INSERT INTO sys.sys_user (id, name) VALUES (1111, '张三');