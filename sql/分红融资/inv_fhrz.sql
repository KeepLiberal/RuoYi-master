/*
分红情况
*/
drop table if exists inv_fhrz_fhqk;
create table inv_fhrz_fhqk
(
    id                 int         not null auto_increment comment 'ID',
    security_code      varchar(10) not null comment '股票代码',
    notice_date        datetime    not null comment '公告日期',
    impl_plan_profile  varchar(500) default null comment '分红方案',
    equity_record_date datetime    default null comment '股权登记日',
    ex_dividend_date   datetime    default null comment '除权除息日',
    pay_cash_date      datetime    default null comment '派息日',
    assign_progress    varchar(500) default null comment '方案进度',
    primary key (id) using btree,
    key                inv_fhrz_fhqk_index (security_code,notice_date)
) engine=innodb default charset=utf8mb4 collate=utf8mb4_general_ci comment='分红情况';


/*
历年分红融资
*/
drop table if exists inv_fhrz_lnfhrz;
create table inv_fhrz_lnfhrz
(
    id              int         not null auto_increment comment 'ID',
    security_code   varchar(10) not null comment '股票代码',
    statistics_year varchar(10) not null comment '年份',
    total_dividend  double default null comment '分红总额(万元)',
    seo_num         double default null comment '增发(万股)',
    allotment_num   double default null comment '配股(万股)',
    ipo_num         double default null comment '新股发行(万股)',
    primary key (id) using btree,
    key             inv_fhrz_lnfhrz_index (security_code,statistics_year)
) engine=innodb default charset=utf8mb4 collate=utf8mb4_general_ci comment='历年分红融资';


/*
增发明细
*/
drop table if exists inv_fhrz_zfmx;
create table inv_fhrz_zfmx
(
    id                int         not null auto_increment comment 'ID',
    security_code     varchar(10) not null comment '股票代码',
    notice_date       datetime    not null comment '增发时间',
    issue_num         double default null comment '实际增发数量(万股)',
    net_raise_funds   double default null comment '实际募集净额(万元)',
    issue_price       double default null comment '增发价格(元/股)',
    ipo_num           double default null comment '新股发行(万股)',
    issue_way_explain varchar(500) default null comment '发行方式',
    reg_date          datetime    default null comment '股权登记日',
    listing_date      datetime    default null comment '增发上市日',
    receive_date      datetime    default null comment '资金到账日',
    primary key (id) using btree,
    key               inv_fhrz_zfmx_index (security_code,notice_date)
) engine=innodb default charset=utf8mb4 collate=utf8mb4_general_ci comment='增发明细';


/*
配股明细
*/
drop table if exists inv_fhrz_pgmx;
create table inv_fhrz_pgmx
(
    id                 int         not null auto_increment comment 'id',
    security_code      varchar(10) not null comment '股票代码',
    notice_date        datetime    not null comment '配股公告日',
    issue_price        double default null comment '配股价格(元)',
    issue_num          double default null comment '实际配股数量(万股)',
    total_raise_funds  double default null comment '实际募资总额(万元)',
    equity_record_date datetime    default null comment '股权登记日',
    ex_dividend_datee  datetime    default null comment '除权基准日',
    event_explain      varchar(500) default null comment '配股方案',
    primary key (id) using btree,
    key                inv_fhrz_pgmx_index (security_code,notice_date)
) engine=innodb default charset=utf8mb4 collate=utf8mb4_general_ci comment='配股明细';


