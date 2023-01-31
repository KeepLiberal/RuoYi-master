/*
大宗交易-每日统计
*/
drop table if exists inv_dzjy_mrtj;
create table inv_dzjy_mrtj
(
    id                  int         not null auto_increment comment 'id',
    security_code       varchar(10) not null comment '股票代码',
    trade_date          datetime    not null comment '交易日期',
    change_rate         double default null comment '涨跌幅(%)',
    close_price         double default null comment '收盘价(元)',
    average_price       double default null comment '成交均价(元)',
    premium_ratio       double default null comment '折溢率(%)',
    deal_num            double default null comment '成交笔数',
    volume              double default null comment '成交总量(万股)',
    deal_amt            double default null comment '成交总额(万元)',
    turnoverrate        double default null comment '成交总额/流通市值',
    d1_close_adjchrate  double default null comment '上榜后1日涨跌幅(%)',
    d5_close_adjchrate  double default null comment '上榜后5日涨跌幅(%)',
    d10_close_adjchrate double default null comment '上榜后10日涨跌幅(%)',
    d20_close_adjchrate double default null comment '上榜后20日涨跌幅(%)',
    primary key (id) using btree,
    key                 inv_dzjy_mrtj_index(security_code, trade_date)
) engine=innodb default charset=utf8mb4 collate=utf8mb4_general_ci comment='大宗交易-每日统计';