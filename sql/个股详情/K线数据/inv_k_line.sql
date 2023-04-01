/*
 K线表
*/
drop table if exists inv_k_line;
create table inv_k_line
(
    id                int         not null auto_increment comment 'ID',
    security_code     varchar(10) not null comment '股票代码',
    report_date       datetime    not null comment '日期',
    open              double default null comment '开盘',
    close             double default null comment '收盘',
    high              double default null comment '最高',
    lower             double default null comment '最低',
    up_down_range     double default null comment '涨跌幅',
    up_down_quota     double default null comment '涨跌额',
    turnover_size     double default null comment '成交量',
    turnover_quota    double default null comment '成交额',
    vibrate_range     double default null comment '振幅',
    change_hand_range double default null comment '换手率',
    primary key (id) using btree,
    key               inv_k_line_index (security_code,report_date)
) engine=innodb default charset=utf8mb4 collate=utf8mb4_general_ci comment='K线表';
