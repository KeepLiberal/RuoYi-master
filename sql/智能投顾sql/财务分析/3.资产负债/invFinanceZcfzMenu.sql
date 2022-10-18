-- 菜单 SQL
insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('财务分析-资产负债', '4', '1', '/investment/invFinanceZcfz', 'C', '0', 'investment:invFinanceZcfz:view', '#', 'admin', sysdate(), '', null, '财务分析-资产负债菜单');

-- 按钮父菜单ID
SELECT @parentId := LAST_INSERT_ID();

-- 按钮 SQL
insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('财务分析-资产负债查询', @parentId, '1',  '#',  'F', '0', 'investment:invFinanceZcfz:list',         '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('财务分析-资产负债新增', @parentId, '2',  '#',  'F', '0', 'investment:invFinanceZcfz:add',          '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('财务分析-资产负债修改', @parentId, '3',  '#',  'F', '0', 'investment:invFinanceZcfz:edit',         '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('财务分析-资产负债删除', @parentId, '4',  '#',  'F', '0', 'investment:invFinanceZcfz:remove',       '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('财务分析-资产负债导出', @parentId, '5',  '#',  'F', '0', 'investment:invFinanceZcfz:export',       '#', 'admin', sysdate(), '', null, '');
