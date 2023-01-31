/*
融资融券
*/
drop table if exists inv_rzrq;
create table inv_rzrq
(
    id            int         not null auto_increment comment 'id',
    security_code varchar(10) not null comment '股票代码',
    date          datetime    not null comment '日期',
    rzye          double default null comment '融资余额(元)',
    rqye          double default null comment '融券余额(元)',
    rzmre         double default null comment '融资买入额(元)',
    rzche         double default null comment '融资偿还额(元)',
    rzjme         double default null comment '融资净买额(元)',
    rqyl          double default null comment '融券余量(股)',
    rqmcl         double default null comment '融券卖出量(股)',
    rqchl         double default null comment '融券偿还量(股)',
    rzrqye        double default null comment '融资融券余额(元)',
    primary key (id) using btree,
    key           inv_rzrq_index (security_code, date)
) engine=innodb default charset=utf8mb4 collate=utf8mb4_general_ci comment='融资融券';