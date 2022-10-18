package com.ruoyi.web.controller.investment;

import java.util.List;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.investment.domain.InvFinanceReportDate;
import com.ruoyi.investment.service.IInvFinanceReportDateService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 财务分析-报告日期Controller
 * 
 * @author yangwenyang
 * @date 2022-10-18
 */
@Controller
@RequestMapping("/investment/invFinanceReportDate")
public class InvFinanceReportDateController extends BaseController
{
    private String prefix = "investment/invFinanceReportDate";

    @Autowired
    private IInvFinanceReportDateService invFinanceReportDateService;

    @RequiresPermissions("investment:invFinanceReportDate:view")
    @GetMapping()
    public String invFinanceReportDate()
    {
        return prefix + "/invFinanceReportDate";
    }

    /**
     * 查询财务分析-报告日期列表
     */
    @RequiresPermissions("investment:invFinanceReportDate:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(InvFinanceReportDate invFinanceReportDate)
    {
        startPage();
        List<InvFinanceReportDate> list = invFinanceReportDateService.selectInvFinanceReportDateList(invFinanceReportDate);
        return getDataTable(list);
    }

    /**
     * 导出财务分析-报告日期列表
     */
    @RequiresPermissions("investment:invFinanceReportDate:export")
    @Log(title = "财务分析-报告日期", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(InvFinanceReportDate invFinanceReportDate)
    {
        List<InvFinanceReportDate> list = invFinanceReportDateService.selectInvFinanceReportDateList(invFinanceReportDate);
        ExcelUtil<InvFinanceReportDate> util = new ExcelUtil<InvFinanceReportDate>(InvFinanceReportDate.class);
        return util.exportExcel(list, "财务分析-报告日期数据");
    }

    /**
     * 新增财务分析-报告日期
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存财务分析-报告日期
     */
    @RequiresPermissions("investment:invFinanceReportDate:add")
    @Log(title = "财务分析-报告日期", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(InvFinanceReportDate invFinanceReportDate)
    {
        return toAjax(invFinanceReportDateService.insertInvFinanceReportDate(invFinanceReportDate));
    }

    /**
     * 修改财务分析-报告日期
     */
    @RequiresPermissions("investment:invFinanceReportDate:edit")
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        InvFinanceReportDate invFinanceReportDate = invFinanceReportDateService.selectInvFinanceReportDateById(id);
        mmap.put("invFinanceReportDate", invFinanceReportDate);
        return prefix + "/edit";
    }

    /**
     * 修改保存财务分析-报告日期
     */
    @RequiresPermissions("investment:invFinanceReportDate:edit")
    @Log(title = "财务分析-报告日期", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(InvFinanceReportDate invFinanceReportDate)
    {
        return toAjax(invFinanceReportDateService.updateInvFinanceReportDate(invFinanceReportDate));
    }

    /**
     * 删除财务分析-报告日期
     */
    @RequiresPermissions("investment:invFinanceReportDate:remove")
    @Log(title = "财务分析-报告日期", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(invFinanceReportDateService.deleteInvFinanceReportDateByIds(ids));
    }
}
