/*
 解禁股明细
*/
drop table if exists inv_jjg_mx;
create table inv_jjg_mx
(
    id                  int          not null auto_increment comment 'id',
    security_code       varchar(10)  not null comment '股票代码',
    free_date           datetime     not null comment '解除限售日期',
    limited_holder_name varchar(100) not null comment '股东名称',
    add_listing_shares  double       not null comment '新增可上市股份',
    free_shares_type    varchar(100) default null comment '限售股类型',
    plan_feature        varchar(100) default null comment '信息来源',
    primary key (id) using btree
) engine=innodb default charset=utf8mb4 collate=utf8mb4_general_ci comment='解禁股明细';