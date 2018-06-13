CREATE SCHEMA IF NOT EXISTS sys;

DROP TABLE IF EXISTS sys.sys_user;

CREATE TABLE sys.sys_user (
  id   BIGINT NOT NULL,
  name VARCHAR(255),
  PRIMARY KEY (id)
);

INSERT INTO sys.sys_user (id, name) VALUES (1111, '张三');