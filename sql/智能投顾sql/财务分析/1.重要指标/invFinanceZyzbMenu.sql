-- 菜单 SQL
insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('财务分析-重要指标', '4', '1', '/investment/invFinanceZyzb', 'C', '0', 'investment:invFinanceZyzb:view', '#', 'admin', sysdate(), '', null, '财务分析-重要指标菜单');

-- 按钮父菜单ID
SELECT @parentId := LAST_INSERT_ID();

-- 按钮 SQL
insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('财务分析-重要指标查询', @parentId, '1',  '#',  'F', '0', 'investment:invFinanceZyzb:list',         '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('财务分析-重要指标新增', @parentId, '2',  '#',  'F', '0', 'investment:invFinanceZyzb:add',          '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('财务分析-重要指标修改', @parentId, '3',  '#',  'F', '0', 'investment:invFinanceZyzb:edit',         '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('财务分析-重要指标删除', @parentId, '4',  '#',  'F', '0', 'investment:invFinanceZyzb:remove',       '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('财务分析-重要指标导出', @parentId, '5',  '#',  'F', '0', 'investment:invFinanceZyzb:export',       '#', 'admin', sysdate(), '', null, '');
