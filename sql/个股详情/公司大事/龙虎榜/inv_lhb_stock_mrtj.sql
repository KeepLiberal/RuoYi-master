/*
个股龙虎榜每日统计(包括营业部、机构)
*/
drop table if exists inv_lhb_stock_mrtj;
create table inv_lhb_stock_mrtj
(
    id                  int         not null auto_increment comment 'id',
    security_code       varchar(10) not null comment '股票代码',
    trade_date          datetime    not null comment '上榜日期',
    explanation         varchar(100) default null comment '上榜原因',
    yyb_buy_amt         double       default null comment '营业部买入合计',
    yyb_sell_amt        double       default null comment '营业部卖出合计',
    yyb_net             double       default null comment '营业部买卖净额',

    jg_buy_count        double       default null comment '买入机构数',
    jg_sell_count       double       default null comment '卖出机构数',
    jg_buy_amt          double       default null comment '机构买入总额',
    jg_sell_amt         double       default null comment '机构卖出总额',
    jg_net              double       default null comment '机构买卖净额',

    d1_close_adjchrate  double       default null comment '后1日涨跌幅',
    d2_close_adjchrate  double       default null comment '后2日涨跌幅',
    d3_close_adjchrate  double       default null comment '后3日涨跌幅',
    d5_close_adjchrate  double       default null comment '后5日涨跌幅',
    d10_close_adjchrate double       default null comment '后10日涨跌幅',
    d20_close_adjchrate double       default null comment '后20日涨跌幅',
    d30_close_adjchrate double       default null comment '后30日涨跌幅',
    primary key (id) using btree,
    key                 inv_lhb_stock_mrtj_index (security_code, trade_date)
) engine=innodb default charset=utf8mb4 collate=utf8mb4_general_ci comment='个股龙虎榜每日统计(包括营业部、机构)';