-- 菜单 SQL
insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('沪深A股基本信息', '2000', '1', '/investment/invStock', 'C', '0', 'investment:invStock:view', '#', 'admin', sysdate(), '', null, '沪深A股基本信息菜单');

-- 按钮父菜单ID
SELECT @parentId := LAST_INSERT_ID();

-- 按钮 SQL
insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('沪深A股基本信息查询', @parentId, '1',  '#',  'F', '0', 'investment:invStock:list',         '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('沪深A股基本信息新增', @parentId, '2',  '#',  'F', '0', 'investment:invStock:add',          '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('沪深A股基本信息修改', @parentId, '3',  '#',  'F', '0', 'investment:invStock:edit',         '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('沪深A股基本信息删除', @parentId, '4',  '#',  'F', '0', 'investment:invStock:remove',       '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('沪深A股基本信息导出', @parentId, '5',  '#',  'F', '0', 'investment:invStock:export',       '#', 'admin', sysdate(), '', null, '');
