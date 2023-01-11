/*
 东财行业
*/
drop table if exists inv_industry_em;
create table inv_industry_em (
  id bigint not null auto_increment comment 'ID',
  pid int DEFAULT NULL COMMENT '父ID',
  shortname varchar(100) DEFAULT NULL COMMENT '简称',
  name varchar(100) DEFAULT NULL COMMENT '名称',
  mergename varchar(255) DEFAULT NULL COMMENT '全称',
  level tinyint DEFAULT NULL COMMENT '层级 1-4',
  pinyin varchar(100) DEFAULT NULL COMMENT '拼音',
  first varchar(50) DEFAULT NULL COMMENT '首字母',
  primary key (id) using btree
) engine=innodb default charset=utf8mb4 collate=utf8mb4_general_ci comment='东财行业';