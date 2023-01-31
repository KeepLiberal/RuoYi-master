/*
个股龙虎榜每日交易明细(包括营业部、机构)
*/
drop table if exists inv_lhb_stock_mrmx;
create table inv_lhb_stock_mrmx
(
    id                int         not null auto_increment comment 'id',
    security_code     varchar(10) not null comment '股票代码',
    trade_date        datetime    not null comment '上榜日期',
    explanation       varchar(100) default null comment '上榜原因',
    lhb_buy_sell_type varchar(10) not null comment '交易类型',
    operatedept_code  varchar(20)  default null comment '交易营业部代码',
    operatedept_name  varchar(200) default null comment '交易营业部名称',
    buy               double       default null comment '买入金额(元)',
    total_buyrio      double       default null comment '占总成交比例',
    sell              double       default null comment '卖出金额(元)',
    total_sellrio     double       default null comment '占总成交比例',
    net               double       default null comment '净额(元)',
    primary key (id) using btree,
    key               inv_lhb_stock_mrmx_index (security_code, trade_date, lhb_buy_sell_type)
) engine=innodb default charset=utf8mb4 collate=utf8mb4_general_ci comment='个股龙虎榜每日交易明细(包括营业部、机构)';