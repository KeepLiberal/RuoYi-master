/*
 公司地址
*/
drop table if exists inv_company_address;
create table inv_company_address
(
    id      int         not null auto_increment comment 'ID',
    code    varchar(10) not null comment '股票代码',
    level   int         not null comment '级别',
    area_id int         not null comment '地区ID',
    primary key (id) using btree
) engine=innodb default charset=utf8mb4 collate=utf8mb4_general_ci comment='公司地址';