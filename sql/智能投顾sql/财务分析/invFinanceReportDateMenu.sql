-- 菜单 SQL
insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('财务分析-报告日期', '4', '1', '/investment/invFinanceReportDate', 'C', '0', 'investment:invFinanceReportDate:view', '#', 'admin', sysdate(), '', null, '财务分析-报告日期菜单');

-- 按钮父菜单ID
SELECT @parentId := LAST_INSERT_ID();

-- 按钮 SQL
insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('财务分析-报告日期查询', @parentId, '1',  '#',  'F', '0', 'investment:invFinanceReportDate:list',         '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('财务分析-报告日期新增', @parentId, '2',  '#',  'F', '0', 'investment:invFinanceReportDate:add',          '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('财务分析-报告日期修改', @parentId, '3',  '#',  'F', '0', 'investment:invFinanceReportDate:edit',         '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('财务分析-报告日期删除', @parentId, '4',  '#',  'F', '0', 'investment:invFinanceReportDate:remove',       '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('财务分析-报告日期导出', @parentId, '5',  '#',  'F', '0', 'investment:invFinanceReportDate:export',       '#', 'admin', sysdate(), '', null, '');
