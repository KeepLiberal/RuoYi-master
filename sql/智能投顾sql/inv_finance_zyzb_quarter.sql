/*
财务分析-重要指标-季度列表
*/

DROP TABLE IF EXISTS `inv_finance_zyzb_quarter`;
CREATE TABLE `inv_finance_zyzb_quarter` (
  `id` bigint NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `security_code` varchar(10) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT '股票代码',
  `report_date` datetime DEFAULT NULL COMMENT '报告日期',
  `epsjb` double DEFAULT NULL COMMENT '摊薄每股收益(元)',
  `bps` double DEFAULT NULL COMMENT '每股净资产(元)',
  `per_capital_reserve` double DEFAULT NULL COMMENT '每股公积金(元)',
  `per_unassign_profit` double DEFAULT NULL COMMENT '每股未分配利润(元)',
  `per_netcash` double DEFAULT NULL COMMENT '每股经营现金流(元)',
  `totaloperatereve` double DEFAULT NULL COMMENT '营业总收入(元)',
  `GROSS_PROFIT` double DEFAULT NULL COMMENT '毛利润(元)',
  `parentnetprofit` double DEFAULT NULL COMMENT '归属净利润(元)',
  `dedu_parent_profit` double DEFAULT NULL COMMENT '扣非净利润(元)',
  `totaloperaterevetz` double DEFAULT NULL COMMENT '营业总收入同比增长(%)',
  `parentnetprofittz` double DEFAULT NULL COMMENT '归属净利润同比增长(%)',
  `dpnp_yoy_ratio` double DEFAULT NULL COMMENT '扣非净利润同比增长(%)',
  `yyzsrgdhbzc` double DEFAULT NULL COMMENT '营业总收入滚动环比增长(%)',
  `netprofitrphbzc` double DEFAULT NULL COMMENT '归属净利润滚动环比增长(%)',
  `kfjlrgdhbzc` double DEFAULT NULL COMMENT '摊薄净资产收益率(%)',
  `roe_diluted` double DEFAULT NULL COMMENT '扣非净利润滚动环比增长(%)',
  `jroa` double DEFAULT NULL COMMENT '摊薄总资产收益率(%)',
  `net_profit_ratio` double DEFAULT NULL COMMENT '净利率(%)',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci COMMENT='财务分析-重要指标-季度列表';