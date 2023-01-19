/*
 财务分析-报告日期
*/
drop table if exists inv_finance_report_date;
create table inv_finance_report_date
(
    id            int not null auto_increment comment 'ID',
    security_code varchar(10) comment '股票代码',
    finance_type  varchar(10) comment '财务类型',
    report_type   varchar(10) comment '报告类型',
    report_date   datetime default null comment '报告日期',
    primary key (id) using btree,
    key           inv_finance_report_date_index (security_code,finance_type,report_type)
) engine=innodb default charset=utf8mb4 collate=utf8mb4_general_ci comment='财务分析-报告日期';