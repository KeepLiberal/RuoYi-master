/*
个股龙虎榜
*/
drop table if exists inv_lhb_stock;
create table inv_lhb_stock
(
    id               int         not null auto_increment comment 'id',
    security_code    varchar(10) not null comment '股票代码',
    trade_date       datetime    not null comment '日期',
    lhb_data_type    varchar(10) not null comment '数据类型',
    explanation      varchar(100) default null comment '上榜类型',
    operatedept_code varchar(20)  default null comment '交易营业部代码',
    operatedept_name varchar(200) default null comment '交易营业部名称',
    buy              double       default null comment '买入金额(元)',
    total_buyrio     double       default null comment '占总成交比例',
    sell             double       default null comment '卖出金额(元)',
    total_sellrio    double       default null comment '占总成交比例',
    net              double       default null comment '净额(元)',
    total_buy        double       default null comment '(前5名)买入金额合计(元)',
    total_sell       double       default null comment '(前5名)卖出金额合计(元)',
    total_buyriotop  double       default null comment '(前5名)占总成交比例',
    total_net        double       default null comment '(前5名)净额合计(元)',
    primary key (id) using btree,
    key              inv_lhb_stock_index (security_code, trade_date, lhb_data_type)
) engine=innodb default charset=utf8mb4 collate=utf8mb4_general_ci comment='个股龙虎榜';