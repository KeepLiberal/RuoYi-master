/*
 A股基本信息
*/

drop table if exists `inv_stock`;
create table `inv_stock` (
  `code` varchar(10) character set utf8mb4 collate utf8mb4_general_ci not null comment '股票代码',
  `name`  varchar(10) character set utf8 collate utf8_bin not null comment '股票简称',
  `org_code` varchar(10) character set utf8 collate utf8_bin default null comment '组织代码',
  `org_type` varchar(10) character set utf8 collate utf8_bin default null comment '组织简称',
  `security_type_code`  varchar(10) character set utf8 collate utf8_bin default null  comment '股票分类代码',
  `company_type` varchar(2) character set utf8mb4 collate utf8mb4_general_ci default null comment '股票分类',
  `market` varchar(10) character set utf8mb4 collate utf8mb4_general_ci default null comment '股票市场',
  primary key (`code`) using btree
) engine=innodb default charset=utf8mb4 collate=utf8mb4_general_ci comment='A股基本信息';