/*
 财务分析-报告日期
*/
drop table if exists `inv_finance_report_date`;
create table `inv_finance_report_date`(
    `id` bigint not null auto_increment comment 'id',
    `code` varchar(10) character set utf8mb4 collate utf8mb4_general_ci not null comment '股票代码',
    `report_type` varchar(10) character set utf8mb4 collate utf8mb4_general_ci not null comment '报告类型  zcfz-资产负债，lr-利润，xjll-现金流量',
    `report_date` datetime default null comment '报告日期',
    primary key (`id`) using btree,
    key `inv_finance_report_date_code` (`code`)
) engine=innodb default charset=utf8mb4 collate=utf8mb4_general_ci comment='财务分析-报告日期';