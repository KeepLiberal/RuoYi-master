/*
龙虎榜上榜日期(新增)
*/
drop table if exists inv_lhb_report_date_new;
create table inv_lhb_report_date_new
(
    id            int         not null auto_increment comment 'id',
    security_code varchar(10) not null comment '股票代码',
    trade_date    datetime    not null comment '上榜日期',
    primary key (id) using btree,
    key           inv_lhb_report_date_new_index (security_code, trade_date)
) engine=innodb default charset=utf8mb4 collate=utf8mb4_general_ci comment='龙虎榜上榜日期(新增)';