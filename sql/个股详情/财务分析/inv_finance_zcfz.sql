/*
财务分析-资产负债表
*/
drop table if exists inv_finance_zcfz;
create table inv_finance_zcfz
(
    id                             int         not null auto_increment comment 'ID',
    security_code                  varchar(10) not null comment '股票代码',
    report_type                    varchar(10) not null comment '报告类型',
    report_date                    datetime     default null comment '报告日期',
    opinion_type                   varchar(100) default null comment '审计意见(境内)',
    osopinion_type                 varchar(100) default null comment '审计意见(境外)',
    cash_deposit_pbc               double       default null comment '现金及存放中央银行款项',
    cash_deposit_pbc_yoy           double       default null comment '现金及存放中央银行款项(同比%)',
    deposit_interbank              double       default null comment '存放同业款项',
    deposit_interbank_yoy          double       default null comment '存放同业款项(同比%)',
    precious_metal                 double       default null comment '贵金属',
    precious_metal_yoy             double       default null comment '贵金属(同比%)',
    lend_fund                      double       default null comment '拆出资金',
    lend_fund_yoy                  double       default null comment '拆出资金(同比%)',
    fvtpl_finasset                 double       default null comment '以公允价值计量且其变动计入当期损益的金融资产',
    fvtpl_finasset_yoy             double       default null comment '以公允价值计量且其变动计入当期损益的金融资产(同比%)',
    trade_finasset                 double       default null comment '交易性金融资产',
    trade_finasset_yoy             double       default null comment '交易性金融资产(同比%)',
    appoint_fvtpl_finasset         double       default null comment '指定以公允价值计量且其变动计入当期损益的金融资产',
    appoint_fvtpl_finasset_yoy     double       default null comment '指定以公允价值计量且其变动计入当期损益的金融资产(同比%)',
    derive_finasset                double       default null comment '衍生金融资产',
    derive_finasset_yoy            double       default null comment '衍生金融资产(同比%)',
    buy_resale_finasset            double       default null comment '买入返售金融资产',
    buy_resale_finasset_yoy        double       default null comment '买入返售金融资产(同比%)',
    accounts_rece                  double       default null comment '应收账款',
    accounts_rece_yoy              double       default null comment '应收账款(同比%)',
    interest_rece                  double       default null comment '应收利息',
    interest_rece_yoy              double       default null comment '应收利息(同比%)',
    loan_advance                   double       default null comment '发放贷款及垫款',
    loan_advance_yoy               double       default null comment '发放贷款及垫款(同比%)',
    trade_finasset_notfvtpl        double       default null comment '交易性金融资产',
    trade_finasset_notfvtpl_yoy    double       default null comment '交易性金融资产(同比%)',
    creditor_invest                double       default null comment '债权投资',
    creditor_invest_yoy            double       default null comment '债权投资(同比%)',
    other_creditor_invest          double       default null comment '其他债权投资',
    other_creditor_invest_yoy      double       default null comment '其他债权投资(同比%)',
    other_equity_invest            double       default null comment '其他权益工具投资',
    other_equity_invest_yoy        double       default null comment '其他权益工具投资(同比%)',
    available_sale_finasset        double       default null comment '可供出售金融资产',
    available_sale_finasset_yoy    double       default null comment '可供出售金融资产(同比%)',
    hold_maturity_invest           double       default null comment '持有至到期投资',
    hold_maturity_invest_yoy       double       default null comment '持有至到期投资(同比%)',
    invest_rece                    double       default null comment '应收款项类投资',
    invest_rece_yoy                double       default null comment '应收款项类投资(同比%)',
    amortize_cost_finasset         double       default null comment '以摊余成本计量的金融资产',
    amortize_cost_finasset_yoy     double       default null comment '以摊余成本计量的金融资产(同比%)',
    fvtoci_finasset                double       default null comment '以公允价值计量且其变动计入其他综合收益的金融资产',
    fvtoci_finasset_yoy            double       default null comment '以公允价值计量且其变动计入其他综合收益的金融资产(同比%)',
    holdsale_asset                 double       default null comment '持有待售资产',
    holdsale_asset_yoy             double       default null comment '持有待售资产(同比%)',
    long_equity_invest             double       default null comment '长期股权投资',
    long_equity_invest_yoy         double       default null comment '长期股权投资(同比%)',
    invest_subsidiary              double       default null comment '对子公司的投资',
    invest_subsidiary_yoy          double       default null comment '对子公司的投资(同比%)',
    invest_joint                   double       default null comment '对联营和合营企业的投资',
    invest_joint_yoy               double       default null comment '对联营和合营企业的投资(同比%)',
    invest_realestate              double       default null comment '投资性房地产',
    invest_realestate_yoy          double       default null comment '投资性房地产(同比%)',
    fixed_asset                    double       default null comment '固定资产',
    fixed_asset_yoy                double       default null comment '固定资产(同比%)',
    cip                            double       default null comment '在建工程',
    cip_yoy                        double       default null comment '在建工程(同比%)',
    useright_asset                 double       default null comment '使用权资产',
    useright_asset_yoy             double       default null comment '使用权资产(同比%)',
    intangible_asset               double       default null comment '无形资产',
    intangible_asset_yoy           double       default null comment '无形资产(同比%)',
    goodwill                       double       default null comment '商誉',
    goodwill_yoy                   double       default null comment '商誉(同比%)',
    pend_mortgage_asset            double       default null comment '待处理抵债资产',
    pend_mortgage_asset_yoy        double       default null comment '待处理抵债资产(同比%)',
    mortgage_asset_impairment      double       default null comment '减:抵债资产减值准备',
    mortgage_asset_impairment_yoy  double       default null comment '减:抵债资产减值准备(同比%)',
    net_pendmortgage_asset         double       default null comment '待处理抵债资产净额',
    net_pendmortgage_asset_yoy     double       default null comment '待处理抵债资产净额(同比%)',
    defer_tax_asset                double       default null comment '递延所得税资产',
    defer_tax_asset_yoy            double       default null comment '递延所得税资产(同比%)',
    long_prepaid_expense           double       default null comment '长期待摊费用',
    long_prepaid_expense_yoy       double       default null comment '长期待摊费用(同比%)',
    other_asset                    double       default null comment '其他资产',
    other_asset_yoy                double       default null comment '其他资产(同比%)',
    asset_other                    double       default null comment '资产其他项目',
    asset_other_yoy                double       default null comment '资产其他项目(同比%)',
    asset_balance                  double       default null comment '资产平衡项目',
    asset_balance_yoy              double       default null comment '资产平衡项目(同比%)',
    total_assets                   double       default null comment '资产总计',
    total_assets_yoy               double       default null comment '资产总计(同比%)',
    loan_pbc                       double       default null comment '向中央银行借款',
    loan_pbc_yoy                   double       default null comment '向中央银行借款(同比%)',
    iofi_deposit                   double       default null comment '同业及其他金融机构存放款项',
    iofi_deposit_yoy               double       default null comment '同业及其他金融机构存放款项(同比%)',
    borrow_fund                    double       default null comment '拆入资金',
    borrow_fund_yoy                double       default null comment '拆入资金(同比%)',
    trade_finliab_notfvtpl         double       default null comment '交易性金融负债',
    trade_finliab_notfvtpl_yoy     double       default null comment '交易性金融负债(同比%)',
    fvtpl_finliab                  double       default null comment '以公允价值计量且其变动计入当期损益的金融负债',
    fvtpl_finliab_yoy              double       default null comment '以公允价值计量且其变动计入当期损益的金融负债(同比%)',
    trade_finliab                  double       default null comment '交易性金融负债',
    trade_finliab_yoy              double       default null comment '交易性金融负债(同比%)',
    appoint_fvtpl_finliab          double       default null comment '指定以公允价值计量且其变动计入当期损益的金融负债',
    appoint_fvtpl_finliab_yoy      double       default null comment '指定以公允价值计量且其变动计入当期损益的金融负债(同比%)',
    derive_finliab                 double       default null comment '衍生金融负债',
    derive_finliab_yoy             double       default null comment '衍生金融负债(同比%)',
    sell_repo_finasset             double       default null comment '卖出回购金融资产款',
    sell_repo_finasset_yoy         double       default null comment '卖出回购金融资产款(同比%)',
    accept_deposit                 double       default null comment '吸收存款',
    accept_deposit_yoy             double       default null comment '吸收存款(同比%)',
    outward_remit                  double       default null comment '汇出汇款',
    outward_remit_yoy              double       default null comment '汇出汇款(同比%)',
    cd_note_payable                double       default null comment '存款证及应付票据',
    cd_note_payable_yoy            double       default null comment '存款证及应付票据(同比%)',
    deposit_certificate            double       default null comment '其中:存款证',
    deposit_certificate_yoy        double       default null comment '其中:存款证(同比%)',
    staff_salary_payable           double       default null comment '应付职工薪酬',
    staff_salary_payable_yoy       double       default null comment '应付职工薪酬(同比%)',
    tax_payable                    double       default null comment '应交税费',
    tax_payable_yoy                double       default null comment '应交税费(同比%)',
    interest_payable               double       default null comment '应付利息',
    interest_payable_yoy           double       default null comment '应付利息(同比%)',
    dividend_payable               double       default null comment '应付股利',
    dividend_payable_yoy           double       default null comment '应付股利(同比%)',
    predict_liab                   double       default null comment '预计负债',
    predict_liab_yoy               double       default null comment '预计负债(同比%)',
    defer_tax_liab                 double       default null comment '递延所得税负债',
    defer_tax_liab_yoy             double       default null comment '递延所得税负债(同比%)',
    amortize_cost_finliab          double       default null comment '以摊余成本计量的金融负债',
    amortize_cost_finliab_yoy      double       default null comment '以摊余成本计量的金融负债(同比%)',
    holdsale_liab                  double       default null comment '持有待售负债',
    holdsale_liab_yoy              double       default null comment '持有待售负债(同比%)',
    bond_payable                   double       default null comment '应付债券',
    bond_payable_yoy               double       default null comment '应付债券(同比%)',
    subbond_payable                double       default null comment '应付次级债券',
    subbond_payable_yoy            double       default null comment '应付次级债券(同比%)',
    preferred_shares_paybale       double       default null comment '优先股',
    preferred_shares_paybale_yoy   double       default null comment '优先股(同比%)',
    perpetual_bond_paybale         double       default null comment '永续债/应付债券',
    perpetual_bond_paybale_yoy     double       default null comment '永续债/应付债券(同比%)',
    lease_liab                     double       default null comment '租赁负债',
    lease_liab_yoy                 double       default null comment '租赁负债(同比%)',
    other_liab                     double       default null comment '其他负债',
    other_liab_yoy                 double       default null comment '其他负债(同比%)',
    liab_other                     double       default null comment '负债其他项目',
    liab_other_yoy                 double       default null comment '负债其他项目(同比%)',
    liab_balance                   double       default null comment '负债平衡项目',
    liab_balance_yoy               double       default null comment '负债平衡项目(同比%)',
    total_liabilities              double       default null comment '负债合计',
    total_liabilities_yoy          double       default null comment '负债合计(同比%)',
    share_capital                  double       default null comment '实收资本（或股本）',
    share_capital_yoy              double       default null comment '实收资本（或股本）(同比%)',
    other_equity_tool              double       default null comment '其他权益工具',
    other_equity_tool_yoy          double       default null comment '其他权益工具(同比%)',
    preferred_shares               double       default null comment '优先股',
    preferred_shares_yoy           double       default null comment '优先股(同比%)',
    perpetual_bond                 double       default null comment '永续债',
    perpetual_bond_yoy             double       default null comment '永续债(同比%)',
    other_equity_other             double       default null comment '其他权益工具',
    other_equity_other_yoy         double       default null comment '其他权益工具(同比%)',
    capital_reserve                double       default null comment '资本公积',
    capital_reserve_yoy            double       default null comment '资本公积(同比%)',
    invest_revalue_reserve         double       default null comment '投资重估储备',
    invest_revalue_reserve_yoy     double       default null comment '投资重估储备(同比%)',
    treasury_shares                double       default null comment '减:库存股',
    treasury_shares_yoy            double       default null comment '减:库存股(同比%)',
    other_compre_income            double       default null comment '其他综合收益',
    other_compre_income_yoy        double       default null comment '其他综合收益(同比%)',
    hedge_reserve                  double       default null comment '套期储备',
    hedge_reserve_yoy              double       default null comment '套期储备(同比%)',
    surplus_reserve                double       default null comment '盈余公积',
    surplus_reserve_yoy            double       default null comment '盈余公积(同比%)',
    general_risk_reserve           double       default null comment '一般风险准备',
    general_risk_reserve_yoy       double       default null comment '一般风险准备(同比%)',
    unassign_rpofit                double       default null comment '未分配利润',
    unassign_rpofit_yoy            double       default null comment '未分配利润(同比%)',
    advice_assign_dividend         double       default null comment '其中:建议分派股利',
    advice_assign_dividend_yoy     double       default null comment '其中:建议分派股利(同比%)',
    convert_diff                   double       default null comment '外币报表折算差额',
    convert_diff_yoy               double       default null comment '外币报表折算差额(同比%)',
    parent_equity_other            double       default null comment '归属于母公司股东权益其他项目',
    parent_equity_other_yoy        double       default null comment '归属于母公司股东权益其他项目(同比%)',
    parent_equity_balance          double       default null comment '归属于母公司股东权益平衡项目',
    parent_equity_balance_yoy      double       default null comment '归属于母公司股东权益平衡项目(同比%)',
    total_parent_equity            double       default null comment '归属于母公司股东权益总计',
    total_parent_equity_yoy        double       default null comment '归属于母公司股东权益总计(同比%)',
    minority_equity                double       default null comment '少数股东权益',
    minority_equity_yoy            double       default null comment '少数股东权益(同比%)',
    equity_other                   double       default null comment '股东权益其他项目',
    equity_other_yoy               double       default null comment '股东权益其他项目(同比%)',
    equity_balance                 double       default null comment '股东权益平衡项目',
    equity_balance_yoy             double       default null comment '股东权益平衡项目(同比%)',
    total_equity                   double       default null comment '股东权益合计',
    total_equity_yoy               double       default null comment '股东权益合计(同比%)',
    liab_equity_other              double       default null comment '负债和股东权益其他项目',
    liab_equity_other_yoy          double       default null comment '负债和股东权益其他项目(同比%)',
    liab_equity_balance            double       default null comment '负债及股东权益平衡项目',
    liab_equity_balance_yoy        double       default null comment '负债及股东权益平衡项目(同比%)',
    total_liab_equity              double       default null comment '负债和股东权益总计',
    total_liab_equity_yoy          double       default null comment '负债和股东权益总计(同比%)',
    monetaryfunds                  double       default null comment '货币资金',
    monetaryfunds_yoy              double       default null comment '货币资金(同比%)',
    settle_excess_reserve          double       default null comment '结算备付金',
    settle_excess_reserve_yoy      double       default null comment '结算备付金(同比%)',
    fin_fund                       double       default null comment '融出资金',
    fin_fund_yoy                   double       default null comment '融出资金(同比%)',
    note_accounts_rece             double       default null comment '应收票据及应收账款',
    note_accounts_rece_yoy         double       default null comment '应收票据及应收账款(同比%)',
    note_rece                      double       default null comment '应收票据',
    note_rece_yoy                  double       default null comment '应收票据(同比%)',
    finance_rece                   double       default null comment '应收款项融资',
    finance_rece_yoy               double       default null comment '应收款项融资(同比%)',
    prepayment                     double       default null comment '预付款项',
    prepayment_yoy                 double       default null comment '预付款项(同比%)',
    premium_rece                   double       default null comment '应收保费',
    premium_rece_yoy               double       default null comment '应收保费(同比%)',
    reinsure_rece                  double       default null comment '应收分保账款',
    reinsure_rece_yoy              double       default null comment '应收分保账款(同比%)',
    rc_reserve_rece                double       default null comment '应收分保合同准备金',
    rc_reserve_rece_yoy            double       default null comment '应收分保合同准备金(同比%)',
    total_other_rece               double       default null comment '其他应收款合计',
    total_other_rece_yoy           double       default null comment '其他应收款合计(同比%)',
    dividend_rece                  double       default null comment '应收股利',
    dividend_rece_yoy              double       default null comment '应收股利(同比%)',
    other_rece                     double       default null comment '其他应收款',
    other_rece_yoy                 double       default null comment '其他应收款(同比%)',
    export_refund_rece             double       default null comment '应收出口退税',
    export_refund_rece_yoy         double       default null comment '应收出口退税(同比%)',
    subsidy_rece                   double       default null comment '应收补贴款',
    subsidy_rece_yoy               double       default null comment '应收补贴款(同比%)',
    internal_rece                  double       default null comment '内部应收款',
    internal_rece_yoy              double       default null comment '内部应收款(同比%)',
    inventory                      double       default null comment '存货',
    inventory_yoy                  double       default null comment '存货(同比%)',
    contract_asset                 double       default null comment '合同资产',
    contract_asset_yoy             double       default null comment '合同资产(同比%)',
    noncurrent_asset_1year         double       default null comment '一年内到期的非流动资产',
    noncurrent_asset_1year_yoy     double       default null comment '一年内到期的非流动资产(同比%)',
    other_current_asset            double       default null comment '其他流动资产',
    other_current_asset_yoy        double       default null comment '其他流动资产(同比%)',
    current_asset_other            double       default null comment '流动资产其他项目',
    current_asset_other_yoy        double       default null comment '流动资产其他项目(同比%)',
    current_asset_balance          double       default null comment '流动资产平衡项目',
    current_asset_balance_yoy      double       default null comment '流动资产平衡项目(同比%)',
    total_current_assets           double       default null comment '流动资产合计',
    total_current_assets_yoy       double       default null comment '流动资产合计(同比%)',
    amortize_cost_ncfinasset       double       default null comment '以摊余成本计量的金融资产（非流动）',
    amortize_cost_ncfinasset_yoy   double       default null comment '以摊余成本计量的金融资产（非流动）(同比%)',
    fvtoci_ncfinasset              double       default null comment '以公允价值计量且其变动计入其他综合收益的金融资产（非流动）',
    fvtoci_ncfinasset_yoy          double       default null comment '以公允价值计量且其变动计入其他综合收益的金融资产（非流动）(同比%)',
    long_rece                      double       default null comment '长期应收款',
    long_rece_yoy                  double       default null comment '长期应收款(同比%)',
    other_noncurrent_finasset      double       default null comment '其他非流动金融资产',
    other_noncurrent_finasset_yoy  double       default null comment '其他非流动金融资产(同比%)',
    project_material               double       default null comment '工程物资',
    project_material_yoy           double       default null comment '工程物资(同比%)',
    fixed_asset_disposal           double       default null comment '固定资产清理',
    fixed_asset_disposal_yoy       double       default null comment '固定资产清理(同比%)',
    productive_biology_asset       double       default null comment '生产性生物资产',
    productive_biology_asset_yoy   double       default null comment '生产性生物资产(同比%)',
    oil_gas_asset                  double       default null comment '油气资产',
    oil_gas_asset_yoy              double       default null comment '油气资产(同比%)',
    develop_expense                double       default null comment '开发支出',
    develop_expense_yoy            double       default null comment '开发支出(同比%)',
    other_noncurrent_asset         double       default null comment '其他非流动资产',
    other_noncurrent_asset_yoy     double       default null comment '其他非流动资产(同比%)',
    noncurrent_asset_other         double       default null comment '非流动资产其他项目',
    noncurrent_asset_other_yoy     double       default null comment '非流动资产其他项目(同比%)',
    noncurrent_asset_balance       double       default null comment '非流动资产平衡项目',
    noncurrent_asset_balance_yoy   double       default null comment '非流动资产平衡项目(同比%)',
    total_noncurrent_assets        double       default null comment '非流动资产合计',
    total_noncurrent_assets_yoy    double       default null comment '非流动资产合计(同比%)',
    short_loan                     double       default null comment '短期借款',
    short_loan_yoy                 double       default null comment '短期借款(同比%)',
    accept_deposit_interba         double       default null comment '吸收存款及同业存放',
    accept_deposit_interba_yoy     double       default null comment '吸收存款及同业存放(同比%)',
    note_accounts_payable          double       default null comment '应付票据及应付账款',
    note_accounts_payable_yoy      double       default null comment '应付票据及应付账款(同比%)',
    note_payable                   double       default null comment '应付票据',
    note_payable_yoy               double       default null comment '应付票据(同比%)',
    accounts_payable               double       default null comment '应付账款',
    accounts_payable_yoy           double       default null comment '应付账款(同比%)',
    advance_receivables            double       default null comment '预收款项',
    advance_receivables_yoy        double       default null comment '预收款项(同比%)',
    contract_liab                  double       default null comment '合同负债',
    contract_liab_yoy              double       default null comment '合同负债(同比%)',
    fee_commission_payable         double       default null comment '应付手续费及佣金',
    fee_commission_payable_yoy     double       default null comment '应付手续费及佣金(同比%)',
    total_other_payable            double       default null comment '其他应付款合计',
    total_other_payable_yoy        double       default null comment '其他应付款合计(同比%)',
    other_payable                  double       default null comment '其他应付款',
    other_payable_yoy              double       default null comment '其他应付款(同比%)',
    reinsure_payable               double       default null comment '应付分保账款',
    reinsure_payable_yoy           double       default null comment '应付分保账款(同比%)',
    internal_payable               double       default null comment '内部应付款',
    internal_payable_yoy           double       default null comment '内部应付款(同比%)',
    predict_current_liab           double       default null comment '预计流动负债',
    predict_current_liab_yoy       double       default null comment '预计流动负债(同比%)',
    insurance_contract_reserve     double       default null comment '保险合同准备金',
    insurance_contract_reserve_yoy double       default null comment '保险合同准备金(同比%)',
    agent_trade_security           double       default null comment '代理买卖证券款',
    agent_trade_security_yoy       double       default null comment '代理买卖证券款(同比%)',
    agent_underwrite_security      double       default null comment '代理承销证券款',
    agent_underwrite_security_yoy  double       default null comment '代理承销证券款(同比%)',
    short_bond_payable             double       default null comment '应付短期债券',
    short_bond_payable_yoy         double       default null comment '应付短期债券(同比%)',
    noncurrent_liab_1year          double       default null comment '一年内到期的非流动负债',
    noncurrent_liab_1year_yoy      double       default null comment '一年内到期的非流动负债(同比%)',
    other_current_liab             double       default null comment '其他流动负债',
    other_current_liab_yoy         double       default null comment '其他流动负债(同比%)',
    current_liab_other             double       default null comment '流动负债其他项目',
    current_liab_other_yoy         double       default null comment '流动负债其他项目(同比%)',
    current_liab_balance           double       default null comment '流动负债平衡项目',
    current_liab_balance_yoy       double       default null comment '流动负债平衡项目(同比%)',
    total_current_liab             double       default null comment '流动负债合计',
    total_current_liab_yoy         double       default null comment '流动负债合计(同比%)',
    long_loan                      double       default null comment '长期借款',
    long_loan_yoy                  double       default null comment '长期借款(同比%)',
    amortize_cost_ncfinliab        double       default null comment '以摊余成本计量的金融负债（非流动）',
    amortize_cost_ncfinliab_yoy    double       default null comment '以摊余成本计量的金融负债（非流动）(同比%)',
    long_payable                   double       default null comment '长期应付款',
    long_payable_yoy               double       default null comment '长期应付款(同比%)',
    long_staffsalary_payable       double       default null comment '长期应付职工薪酬',
    long_staffsalary_payable_yoy   double       default null comment '长期应付职工薪酬(同比%)',
    special_payable                double       default null comment '专项应付款',
    special_payable_yoy            double       default null comment '专项应付款(同比%)',
    defer_income                   double       default null comment '递延收益',
    defer_income_yoy               double       default null comment '递延收益(同比%)',
    other_noncurrent_liab          double       default null comment '其他非流动负债',
    other_noncurrent_liab_yoy      double       default null comment '其他非流动负债(同比%)',
    noncurrent_liab_other          double       default null comment '非流动负债其他项目',
    noncurrent_liab_other_yoy      double       default null comment '非流动负债其他项目(同比%)',
    noncurrent_liab_balance        double       default null comment '非流动负债平衡项目',
    noncurrent_liab_balance_yoy    double       default null comment '非流动负债平衡项目(同比%)',
    total_noncurrent_liab          double       default null comment '非流动负债合计',
    total_noncurrent_liab_yoy      double       default null comment '非流动负债合计(同比%)',
    special_reserve                double       default null comment '专项储备',
    special_reserve_yoy            double       default null comment '专项储备(同比%)',
    unconfirm_invest_loss          double       default null comment '未确定的投资损失',
    unconfirm_invest_loss_yoy      double       default null comment '未确定的投资损失(同比%)',
    assign_cash_dividend           double       default null comment '拟分配现金股利',
    assign_cash_dividend_yoy       double       default null comment '拟分配现金股利(同比%)',
    customer_deposit               double       default null comment '客户资金存款',
    customer_deposit_yoy           double       default null comment '客户资金存款(同比%)',
    customer_credit_deposit        double       default null comment '客户信用资金存款',
    customer_credit_deposit_yoy    double       default null comment '客户信用资金存款(同比%)',
    customer_excess_reserve        double       default null comment '客户备付金',
    customer_excess_reserve_yoy    double       default null comment '客户备付金(同比%)',
    credit_excess_reserve          double       default null comment '信用备付金',
    credit_excess_reserve_yoy      double       default null comment '信用备付金(同比%)',
    fin_security                   double       default null comment '融出证券',
    fin_security_yoy               double       default null comment '融出证券(同比%)',
    receivables                    double       default null comment '应收款项',
    receivables_yoy                double       default null comment '应收款项(同比%)',
    refund_deposit_pay             double       default null comment '存出保证金',
    refund_deposit_pay_yoy         double       default null comment '存出保证金(同比%)',
    trade_seat_fee                 double       default null comment '其中:交易席位费',
    trade_seat_fee_yoy             double       default null comment '其中:交易席位费(同比%)',
    pledge_loan                    double       default null comment '其中:质押借款',
    pledge_loan_yoy                double       default null comment '其中:质押借款(同比%)',
    short_fin_payable              double       default null comment '应付短期融资款',
    short_fin_payable_yoy          double       default null comment '应付短期融资款(同比%)',
    credit_agent_security          double       default null comment '信用交易代理买卖证券款',
    credit_agent_security_yoy      double       default null comment '信用交易代理买卖证券款(同比%)',
    trade_risk_reserve             double       default null comment '交易风险准备',
    trade_risk_reserve_yoy         double       default null comment '交易风险准备(同比%)',
    rud_reserve_rece               double       default null comment '应收分保未到期责任准备金',
    rud_reserve_rece_yoy           double       default null comment '应收分保未到期责任准备金(同比%)',
    ruc_reserve_rece               double       default null comment '应收分保未决赔偿准备金',
    ruc_reserve_rece_yoy           double       default null comment '应收分保未决赔偿准备金(同比%)',
    rld_reserve_rece               double       default null comment '应收分保寿险责任准备金',
    rld_reserve_rece_yoy           double       default null comment '应收分保寿险责任准备金(同比%)',
    rhd_reserve_rece               double       default null comment '应收分保长期健康险责任准备金',
    rhd_reserve_rece_yoy           double       default null comment '应收分保长期健康险责任准备金(同比%)',
    insured_pledge_loan            double       default null comment '保户质押贷款',
    insured_pledge_loan_yoy        double       default null comment '保户质押贷款(同比%)',
    creditor_plan_invest           double       default null comment '债权计划投资',
    creditor_plan_invest_yoy       double       default null comment '债权计划投资(同比%)',
    time_deposit                   double       default null comment '定期存款',
    time_deposit_yoy               double       default null comment '定期存款(同比%)',
    refund_capital_deposit         double       default null comment '存出资本保证金',
    refund_capital_deposit_yoy     double       default null comment '存出资本保证金(同比%)',
    ind_acc_asset                  double       default null comment '独立账户资产',
    ind_acc_asset_yoy              double       default null comment '独立账户资产(同比%)',
    refund_deposit_rece            double       default null comment '存入保证金',
    refund_deposit_rece_yoy        double       default null comment '存入保证金(同比%)',
    advance_rece                   double       default null comment '预收账款',
    advance_rece_yoy               double       default null comment '预收账款(同比%)',
    advance_premium                double       default null comment '预收保费',
    advance_premium_yoy            double       default null comment '预收保费(同比%)',
    compensate_payable             double       default null comment '应付赔付款',
    compensate_payable_yoy         double       default null comment '应付赔付款(同比%)',
    policy_bonus_payable           double       default null comment '应付保单红利',
    policy_bonus_payable_yoy       double       default null comment '应付保单红利(同比%)',
    insured_deposit_invest         double       default null comment '保户储金及投资款',
    insured_deposit_invest_yoy     double       default null comment '保户储金及投资款(同比%)',
    ud_reserve                     double       default null comment '未到期责任准备金',
    ud_reserve_yoy                 double       default null comment '未到期责任准备金(同比%)',
    uc_reserve                     double       default null comment '未决赔款准备金',
    uc_reserve_yoy                 double       default null comment '未决赔款准备金(同比%)',
    ld_reserve                     double       default null comment '寿险责任准备金',
    ld_reserve_yoy                 double       default null comment '寿险责任准备金(同比%)',
    hd_reserve                     double       default null comment '长期健康险责任准备金',
    hd_reserve_yoy                 double       default null comment '长期健康险责任准备金(同比%)',
    ind_acc_liab                   double       default null comment '独立账户负债',
    ind_acc_liab_yoy               double       default null comment '独立账户负债(同比%)',
    primary key (id) using btree,
    key                            inv_finance_zcfz_index (security_code,report_type)
) engine=innodb default charset=utf8mb4 collate=utf8mb4_general_ci comment='财务分析-资产负债表';
