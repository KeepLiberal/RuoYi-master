/*
财务分析-重要指标-季度
*/

drop table if exists `inv_finance_zyzb_jd`;
create table `inv_finance_zyzb_jd` (
    `id` bigint not null auto_increment comment 'id',
    `security_code` varchar(10) character set utf8mb3 collate utf8mb3_bin not null comment '股票代码',
    `report_date` datetime default null comment '报告日期',
    `per_capital_reserve` double default null comment '每股公积金(元)',
    `per_netcash` double default null comment '每股经营现金流(元)',
    `per_unassign_profit` double default null comment '每股未分配利润(元)',
    `net_profit_ratio` double default null comment '净利率(%)',
    `kfjlrgdhbzc` double default null comment '扣非净利润滚动环比增长(%)',
    `epsjb` double default null comment '基本每股收益(元)',
    `yyzsrgdhbzc` double default null comment '营业总收入滚动环比增长(%)',
    `bps` double default null comment '每股净资产(元)',
    `totaloperatereve` double default null comment '营业总收入(元)',
    `gross_profit` double default null comment '毛利润(元)',
    `parentnetprofit` double default null comment '归属净利润(元)',
    `netprofitrphbzc` double default null comment '归属净利润滚动环比增长(%)',
    `parentnetprofittz` double default null comment '归属净利润同比增长(%)',
    `dedu_parent_profit` double default null comment '扣非净利润(元)',
    `totaloperaterevetz` double default null comment '营业总收入同比增长(%)',
    `dpnp_yoy_ratio` double default null comment '扣非净利润同比增长(%)',
    `roe_diluted` double default null comment '扣非净利润滚动环比增长(%)',
    `jroa` double default null comment '摊薄总资产收益率(%)',
    primary key (`id`) using btree,
    key `inv_finance_zyzb_jd_index` (`security_code`)
) engine=innodb default charset=utf8mb4 collate=utf8mb4_general_ci comment='财务分析-重要指标-季度';