-- 菜单 SQL
insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('财务分析-重要指标-年度', '6', '1', '/investment/invFinanceZyzbYear', 'C', '0', 'investment:invFinanceZyzbYear:view', '#', 'admin', sysdate(), '', null, '财务分析-重要指标-年度菜单');

-- 按钮父菜单ID
SELECT @parentId := LAST_INSERT_ID();

-- 按钮 SQL
insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('财务分析-重要指标-年度查询', @parentId, '1',  '#',  'F', '0', 'investment:invFinanceZyzbYear:list',         '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('财务分析-重要指标-年度新增', @parentId, '2',  '#',  'F', '0', 'investment:invFinanceZyzbYear:add',          '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('财务分析-重要指标-年度修改', @parentId, '3',  '#',  'F', '0', 'investment:invFinanceZyzbYear:edit',         '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('财务分析-重要指标-年度删除', @parentId, '4',  '#',  'F', '0', 'investment:invFinanceZyzbYear:remove',       '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('财务分析-重要指标-年度导出', @parentId, '5',  '#',  'F', '0', 'investment:invFinanceZyzbYear:export',       '#', 'admin', sysdate(), '', null, '');
