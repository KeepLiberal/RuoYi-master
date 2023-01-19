/*
 行业
*/
drop table if exists inv_industry;
create table inv_industry
(
    id         int          not null comment 'id',
    pid        int          not null comment '父id',
    type       varchar(10)  not null comment '类型 csrc:证监会行业 em:东财行业',
    level      int          not null comment '层级 1-4',
    short_name varchar(100) not null comment '简称',
    name       varchar(100) not null comment '名称',
    merge_name varchar(255) not null comment '全称',
    primary key (id) using btree
) engine=innodb default charset=utf8mb4 collate=utf8mb4_general_ci comment='行业';