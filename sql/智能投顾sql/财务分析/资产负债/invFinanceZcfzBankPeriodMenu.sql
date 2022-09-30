-- 菜单 SQL
insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('资产负债-银行类-报告期', '6', '1', '/investment/invFinanceZcfzBankPeriod', 'C', '0', 'investment:invFinanceZcfzBankPeriod:view', '#', 'admin', sysdate(), '', null, '财务分析-资产负债-银行类-报告期菜单');

-- 按钮父菜单ID
SELECT @parentId := LAST_INSERT_ID();

-- 按钮 SQL
insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('财务分析-资产负债-银行类-报告期查询', @parentId, '1',  '#',  'F', '0', 'investment:invFinanceZcfzBankPeriod:list',         '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('财务分析-资产负债-银行类-报告期新增', @parentId, '2',  '#',  'F', '0', 'investment:invFinanceZcfzBankPeriod:add',          '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('财务分析-资产负债-银行类-报告期修改', @parentId, '3',  '#',  'F', '0', 'investment:invFinanceZcfzBankPeriod:edit',         '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('财务分析-资产负债-银行类-报告期删除', @parentId, '4',  '#',  'F', '0', 'investment:invFinanceZcfzBankPeriod:remove',       '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('财务分析-资产负债-银行类-报告期导出', @parentId, '5',  '#',  'F', '0', 'investment:invFinanceZcfzBankPeriod:export',       '#', 'admin', sysdate(), '', null, '');
