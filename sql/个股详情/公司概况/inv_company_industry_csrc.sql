/*
 所属证监会行业
*/
drop table if exists inv_company_industry_csrc;
create table inv_company_industry_csrc (
  id bigint not null auto_increment comment 'ID',
  csrc1 varchar(10) not null comment '一级',
  csrc2 varchar(100) default null comment '二级',
  csrc3 varchar(100) default null comment '三级',
  csrc4 varchar(100) default null comment '四级',
  primary key (id) using btree
) engine=innodb default charset=utf8mb4 collate=utf8mb4_general_ci comment='所属证监会行业';