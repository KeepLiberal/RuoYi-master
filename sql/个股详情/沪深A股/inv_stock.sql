/*
 A股基本信息
*/
drop table if exists inv_stock;
create table inv_stock
(
    id                 int         not null auto_increment comment 'ID',
    code               varchar(10) not null comment '股票代码',
    name               varchar(10) not null comment '股票简称',
    market             varchar(10) default null comment '股票市场',
    stock_type         varchar(2)  default null comment '股票分类',
    org_code           varchar(10) default null comment '组织代码',
    org_type           varchar(10) default null comment '组织简称',
    security_type_code varchar(10) default null comment '股票分类代码',
    primary key (id) using btree
) engine=innodb default charset=utf8mb4 collate=utf8mb4_general_ci comment='A股基本信息';