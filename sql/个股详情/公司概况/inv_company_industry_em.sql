/*
 所属东财行业
*/
drop table if exists inv_company_industry_em;
create table inv_company_industry_em (
  id int not null auto_increment comment 'ID',
  code varchar(10) not null comment '股票代码',
  em1 varchar(10) not null comment '一级',
  em2 varchar(100) default null comment '二级',
  em3 varchar(100) default null comment '三级',
  em4 varchar(100) default null comment '四级',
  primary key (id) using btree
) engine=innodb default charset=utf8mb4 collate=utf8mb4_general_ci comment='所属东财行业';