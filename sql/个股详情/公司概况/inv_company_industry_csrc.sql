/*
 所属证监会行业
*/
drop table if exists inv_company_industry_csrc;
create table inv_company_industry_csrc
(
    id             int         not null auto_increment comment 'ID',
    code           varchar(10) not null comment '股票代码',
    level          int         not null comment '级别',
    industry_csrc_id int         not null comment '证监会行业ID',
    primary key (id) using btree
) engine=innodb default charset=utf8mb4 collate=utf8mb4_general_ci comment='所属证监会行业';