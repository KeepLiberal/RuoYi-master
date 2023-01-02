/*
 接口配置表
*/
drop table if exists `inv_interface`;
create table `inv_interface` (
  `id` bigint not null auto_increment comment 'id',
  `code` varchar(100) character set utf8mb4 collate utf8mb4_general_ci not null comment '接口代码',
  `name`  varchar(100) character set utf8mb4 collate utf8mb4_general_ci not null comment '接口名称',
  `type`  varchar(100) character set utf8mb4 collate utf8mb4_general_ci not null comment '接口分类',
  `url` varchar(500) character set utf8mb4 collate utf8mb4_general_ci default null comment '接口地址',
  `bgq_url` varchar(500) character set utf8mb4 collate utf8mb4_general_ci default null comment '报告期地址',
  `nd_url` varchar(500) character set utf8mb4 collate utf8mb4_general_ci default null comment '年度地址',
  `jd_url` varchar(500) character set utf8mb4 collate utf8mb4_general_ci default null comment '季度地址',
  `url_market` varchar(2) character set utf8mb4 collate utf8mb4_general_ci not null comment '接口地址是否包含市场',
  `html_url` varchar(500) character set utf8mb4 collate utf8mb4_general_ci default null comment '页面地址',
  `html_market` varchar(500) character set utf8mb4 collate utf8mb4_general_ci not null comment '页面地址是否包含市场',
  `remark` varchar(500) character set utf8mb4 collate utf8mb4_general_ci default null comment '备注',

  primary key (`id`) using btree,
  UNIQUE (code)
) engine=innodb default charset=utf8mb4 collate=utf8mb4_general_ci comment='接口配置表';