/*
 东财行业
*/
drop table if exists inv_industry_em;
create table inv_industry_em (
  id int not null auto_increment comment 'id',
  pid int default null comment '父id',
  short_name varchar(100) default null comment '简称',
  name varchar(100) default null comment '名称',
  merge_name varchar(255) default null comment '全称',
  level int default null comment '层级 1-4',
  pinyin varchar(100) default null comment '拼音',
  first varchar(50) default null comment '首字母',
  primary key (id) using btree
) engine=innodb default charset=utf8mb4 collate=utf8mb4_general_ci comment='东财行业';