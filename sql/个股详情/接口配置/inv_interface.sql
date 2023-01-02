/*
 接口配置表
*/
drop table if exists `inv_interface`;
create table `inv_interface` (
  `id` bigint not null auto_increment comment 'id',
  `interface_code` varchar(100) character set utf8mb4 collate utf8mb4_general_ci not null comment '接口代码',
  `interface_name`  varchar(100) character set utf8mb4 collate utf8mb4_general_ci not null comment '接口名称',
  `interface_type`  varchar(100) character set utf8mb4 collate utf8mb4_general_ci not null comment '接口分类',

  `interface_url` varchar(2000) character set utf8mb4 collate utf8mb4_general_ci not null comment '接口地址',
  `interface_url_market_flag` varchar(2) character set utf8mb4 collate utf8mb4_general_ci not null comment '接口地址是否包含股票市场',
  `interface_url_code_flag` varchar(2) character set utf8mb4 collate utf8mb4_general_ci not null comment '接口地址是否包含股票代码',

  `html_url` varchar(500) character set utf8mb4 collate utf8mb4_general_ci default null comment '页面地址',
  `html_url_market_flag` varchar(2) character set utf8mb4 collate utf8mb4_general_ci default null comment '页面地址是否包含股票市场',
  `html_url_code_flag` varchar(2) character set utf8mb4 collate utf8mb4_general_ci default null comment '页面地址是否包含股票代码',

  `remark` varchar(500) character set utf8mb4 collate utf8mb4_general_ci default null comment '备注',

  primary key (`id`) using btree,
  UNIQUE (code)
) engine=innodb default charset=utf8mb4 collate=utf8mb4_general_ci comment='接口配置表';