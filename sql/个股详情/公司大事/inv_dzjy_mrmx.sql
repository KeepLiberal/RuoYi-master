/*
大宗交易-每日明细
*/
drop table if exists inv_dzjy_mrmx;
create table inv_dzjy_mrmx
(
    id                 int         not null auto_increment comment 'ID',
    security_code      varchar(10) not null comment '股票代码',
    num                int         not null comment '序号',
    trade_date         datetime    not null comment '交易日期',
    change_rate        double       default null comment '涨跌幅(%)',
    close_price        double       default null comment '收盘价(元)',
    deal_price         double       default null comment '成交价(元)',
    premium_ratio      double       default null comment '折溢率(%)',
    deal_volume        double       default null comment '成交量(万股)',
    deal_amt           double       default null comment '成交额(万元)',
    turnover_rate      double       default null comment '成交额/流通市值',
    buyer_code         varchar(20)  default null comment '买方营业部代码',
    buyer_name         varchar(200) default null comment '买方营业部',
    seller_code        varchar(20)  default null comment '卖方营业部代码',
    seller_name        varchar(200) default null comment '卖方营业部',
    change_rate_1days  double       default null comment '上榜后1日涨跌幅(%)',
    change_rate_5days  double       default null comment '上榜后5日涨跌幅(%)',
    change_rate_10days double       default null comment '上榜后10日涨跌幅(%)',
    change_rate_20days double       default null comment '上榜后20日涨跌幅(%)',
    primary key (id) using btree,
    key                inv_dzjy_mrmx_index(security_code, trade_date)
) engine=innodb default charset=utf8mb4 collate=utf8mb4_general_ci comment='大宗交易-每日明细';