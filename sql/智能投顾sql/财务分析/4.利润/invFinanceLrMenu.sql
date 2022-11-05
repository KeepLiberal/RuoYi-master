-- 菜单 SQL
insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('财务分析-利润', '4', '1', '/investment/invFinanceLr', 'C', '0', 'investment:invFinanceLr:view', '#', 'admin', sysdate(), '', null, '财务分析-利润菜单');

-- 按钮父菜单ID
SELECT @parentId := LAST_INSERT_ID();

-- 按钮 SQL
insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('财务分析-利润查询', @parentId, '1',  '#',  'F', '0', 'investment:invFinanceLr:list',         '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('财务分析-利润新增', @parentId, '2',  '#',  'F', '0', 'investment:invFinanceLr:add',          '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('财务分析-利润修改', @parentId, '3',  '#',  'F', '0', 'investment:invFinanceLr:edit',         '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('财务分析-利润删除', @parentId, '4',  '#',  'F', '0', 'investment:invFinanceLr:remove',       '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('财务分析-利润导出', @parentId, '5',  '#',  'F', '0', 'investment:invFinanceLr:export',       '#', 'admin', sysdate(), '', null, '');
