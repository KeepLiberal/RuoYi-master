/*
 公司所属行业
*/
drop table if exists inv_company_industry;
create table inv_company_industry
(
    id     int         not null auto_increment comment 'ID',
    code   varchar(10) not null comment '股票代码',
    type   varchar(10) not null comment '类型 csrc:证监会行业 em:东财行业',
    level1 int         default null comment '一级',
    level2 int         default null comment '二级',
    level3 int         default null comment '三级',
    level4 int         default null comment '四级',
    primary key (id) using btree
) engine=innodb default charset=utf8mb4 collate=utf8mb4_general_ci comment='公司所属行业';