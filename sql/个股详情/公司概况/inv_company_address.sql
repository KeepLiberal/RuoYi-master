/*
 公司地址
*/
drop table if exists inv_company_address;
create table inv_company_address (
  id bigint not null auto_increment comment 'ID',
  code varchar(10) not null comment '股票代码',
  province varchar(100) default null comment '省',
  city varchar(100) default null comment '市区',
  county varchar(100) default null comment '县',
  address varchar(100) default null comment '详细地址',

  primary key (id) using btree
) engine=innodb default charset=utf8mb4 collate=utf8mb4_general_ci comment='公司地址';