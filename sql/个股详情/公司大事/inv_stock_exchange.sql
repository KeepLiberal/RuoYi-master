/*
证劵交易所
*/
drop table if exists inv_stock_exchange;
create table inv_stock_exchange
(
    id          int          not null auto_increment comment 'id',
    code        varchar(20)  not null comment '交易所代码',
    name        varchar(200) not null comment '交易所名称',
    create_date datetime     not null comment '创建日期',
    primary key (id) using btree
) engine=innodb default charset=utf8mb4 collate=utf8mb4_general_ci comment='证劵交易所';