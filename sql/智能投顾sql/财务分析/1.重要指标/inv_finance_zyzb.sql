/*
财务分析-重要指标
*/

drop table if exists `inv_finance_zyzb`;
create table `inv_finance_zyzb` (
    `id` bigint not null auto_increment comment 'id',
    `security_code` varchar(10) character set utf8mb3 collate utf8mb3_bin not null comment '股票代码',
    `report_type` varchar(10) character set utf8mb4 collate utf8mb4_general_ci not null comment '报告类型',
    `report_date` datetime default null comment '报告日期',
    `per_capital_reserve` double default null comment '每股公积金(元)',
    `per_netcash` double default null comment '每股经营现金流(元)',
    `per_unassign_profit` double default null comment '每股未分配利润(元)',
    `yszkyysr` double default null comment '预收账款/营业总收入',
    `rzrqywfxzb` double default null comment '融资融券业务风险准备(元)',
    `zygdsylzqjzb` double default null comment '自营固定收益类证券规模/净资产',
    `totaldeposits` double default null comment '存款总额(元)',
    `xsjll` double default null comment '净利率(%)',
    `mlr` double default null comment '毛利润(元)',
    `net_profit_ratio` double default null comment '净利率(%)',
    `kcfjcxsyjlr` double default null comment '扣非净利润(元)',
    `earned_premium` double default null comment '已赚保费(元)',
    `jzbjzc` double default null comment '净资本/净资产',
    `zzczzts` double default null comment '总资产周转天数(天)',
    `mgwfplr` double default null comment '每股未分配利润(元)',
    `taxrate` double default null comment '实际税率(%)',
    `yszkzzl` double default null comment '应收账款周转率(次)',
    `cqbl` double default null comment '产权比率',
    `zygpgmjzc` double default null comment '自营股票规模/净资产',
    `kfjlrgdhbzc` double default null comment '扣非净利润滚动环比增长(%)',
    `ltdrr` double default null comment '存贷款比例',
    `solvency_ar` double default null comment '偿付能力充足率(%)',
    `epsjb` double default null comment '基本每股收益(元)',
    `jjywfxzb` double default null comment '经纪业务风险准备(元)',
    `zqzyywfxzb` double default null comment '证券自营业务风险准备(元)',
    `roekcjq` double default null comment '净资产收益率(扣非/加权)(%)',
    `surrender_rate_life` double default null comment '退保率(%)',
    `yyzsrgdhbzc` double default null comment '营业总收入滚动环比增长(%)',
    `zcfzl` double default null comment '资产负债率(%)',
    `jyxjlyysr` double default null comment '经营净现金流/营业总收入',
    `qycs` double default null comment '权益乘数',
    `zzcjll` double default null comment '总资产收益率(加权)(%)',
    `bps` double default null comment '每股净资产(元)',
    `nzbje` double default null comment '资本净额(元)',
    `roejq` double default null comment '净资产收益率(加权)(%)',
    `yszkzzts` double default null comment '应收账款周转天数(天)',
    `xsmll` double default null comment '毛利率(%)',
    `kcfjcxsyjlrtz` double default null comment '扣非净利润同比增长(%)',
    `totaloperatereve` double default null comment '营业总收入(元)',
    `gross_profit` double default null comment '毛利润(元)',
    `sd` double default null comment '速动比率',
    `chzzts` double default null comment '存货周转天数(天)',
    `mgzbgj` double default null comment '每股公积金(元)',
    `parentnetprofit` double default null comment '归属净利润(元)',
    `nonperloan` double default null comment '不良贷款率(%)',
    `total_roi` double default null comment '总投资收益率(%)',
    `zqcxywfxzb` double default null comment '证券承销业务风险准备(元)',
    `chzzl` double default null comment '存货周转率(次)',
    `net_roi` double default null comment '净投资收益率(%)',
    `grossloans` double default null comment '贷款总额(元)',
    `epskcjb` double default null comment '扣非每股收益(元)',
    `netprofitrphbzc` double default null comment '归属净利润滚动环比增长(%)',
    `hxyjbczl` double default null comment '核心资本充足率(%)',
    `parentnetprofittz` double default null comment '归属净利润同比增长(%)',
    `dedu_parent_profit` double default null comment '扣非净利润(元)',
    `toazzl` double default null comment '总资产周转率(次)',
    `totaloperaterevetz` double default null comment '营业总收入同比增长(%)',
    `epsxs` double default null comment '稀释每股收益(元)',
    `compensate_expense` double default null comment '赔付支出(元)',
    `jzc` double default null comment '净资产(元)',
    `jzb` double default null comment '净资本(元)',
    `bldkbbl` double default null comment '不良贷款拨备覆盖率(%)',
    `ld` double default null comment '流动比率',
    `newcapitalader` double default null comment '资本充足率(%)',
    `xsjxlyysr` double default null comment '销售净现金流/营业总收入',
    `mgjyxjje` double default null comment '每股经营现金流(元)',
    `yyfxzb` double default null comment '营运风险准备(元)',
    `xjllb` double default null comment '现金流量比率',
    `epsjbtz` double default null comment '归属净利润同比增长(%)',
    `dpnp_yoy_ratio` double default null comment '扣非净利润同比增长(%)',
    `roe_diluted` double default null comment '扣非净利润滚动环比增长(%)',
    `jroa` double default null comment '摊薄总资产收益率(%)',
    primary key (`id`) using btree,
    key `inv_finance_zyzb_index` (`security_code`,`report_type`)
) engine=innodb default charset=utf8mb4 collate=utf8mb4_general_ci comment='财务分析-重要指标';