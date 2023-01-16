/*
 公司地址
*/
drop table if exists inv_company_address;
create table inv_company_address
(
    id       int         not null auto_increment comment 'ID',
    code     varchar(10) not null comment '股票代码',
    type     varchar(10) not null comment '类型 W:办公地址 R:注册地址',
    province int          default null comment '省',
    city     int          default null comment '市',
    district int          default null comment '区/县',
    detail   varchar(255) default null comment '详细地址',
    primary key (id) using btree
) engine=innodb default charset=utf8mb4 collate=utf8mb4_general_ci comment='公司地址';