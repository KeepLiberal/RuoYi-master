-- 菜单 SQL
insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('财务分析-重要指标-季度', '2090', '1', '/investment/invFinanceZyzbJd', 'C', '0', 'investment:invFinanceZyzbJd:view', '#', 'admin', sysdate(), '', null, '财务分析-重要指标-季度菜单');

-- 按钮父菜单ID
SELECT @parentId := LAST_INSERT_ID();

-- 按钮 SQL
insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('财务分析-重要指标-季度查询', @parentId, '1',  '#',  'F', '0', 'investment:invFinanceZyzbJd:list',         '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('财务分析-重要指标-季度新增', @parentId, '2',  '#',  'F', '0', 'investment:invFinanceZyzbJd:add',          '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('财务分析-重要指标-季度修改', @parentId, '3',  '#',  'F', '0', 'investment:invFinanceZyzbJd:edit',         '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('财务分析-重要指标-季度删除', @parentId, '4',  '#',  'F', '0', 'investment:invFinanceZyzbJd:remove',       '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('财务分析-重要指标-季度导出', @parentId, '5',  '#',  'F', '0', 'investment:invFinanceZyzbJd:export',       '#', 'admin', sysdate(), '', null, '');
