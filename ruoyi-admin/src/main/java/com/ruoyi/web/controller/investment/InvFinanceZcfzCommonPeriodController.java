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
import com.ruoyi.investment.domain.InvFinanceZcfzCommonPeriod;
import com.ruoyi.investment.service.IInvFinanceZcfzCommonPeriodService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 财务分析-资产负债-普通类-报告期Controller
 * 
 * @author yangwenyang
 * @date 2022-09-30
 */
@Controller
@RequestMapping("/investment/invFinanceZcfzCommonPeriod")
public class InvFinanceZcfzCommonPeriodController extends BaseController
{
    private String prefix = "investment/invFinanceZcfzCommonPeriod";

    @Autowired
    private IInvFinanceZcfzCommonPeriodService invFinanceZcfzCommonPeriodService;

    @RequiresPermissions("investment:invFinanceZcfzCommonPeriod:view")
    @GetMapping()
    public String invFinanceZcfzCommonPeriod()
    {
        return prefix + "/invFinanceZcfzCommonPeriod";
    }

    /**
     * 查询财务分析-资产负债-普通类-报告期列表
     */
    @RequiresPermissions("investment:invFinanceZcfzCommonPeriod:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(InvFinanceZcfzCommonPeriod invFinanceZcfzCommonPeriod)
    {
        startPage();
        List<InvFinanceZcfzCommonPeriod> list = invFinanceZcfzCommonPeriodService.selectInvFinanceZcfzCommonPeriodList(invFinanceZcfzCommonPeriod);
        return getDataTable(list);
    }

    /**
     * 导出财务分析-资产负债-普通类-报告期列表
     */
    @RequiresPermissions("investment:invFinanceZcfzCommonPeriod:export")
    @Log(title = "财务分析-资产负债-普通类-报告期", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(InvFinanceZcfzCommonPeriod invFinanceZcfzCommonPeriod)
    {
        List<InvFinanceZcfzCommonPeriod> list = invFinanceZcfzCommonPeriodService.selectInvFinanceZcfzCommonPeriodList(invFinanceZcfzCommonPeriod);
        ExcelUtil<InvFinanceZcfzCommonPeriod> util = new ExcelUtil<InvFinanceZcfzCommonPeriod>(InvFinanceZcfzCommonPeriod.class);
        return util.exportExcel(list, "财务分析-资产负债-普通类-报告期数据");
    }

    /**
     * 新增财务分析-资产负债-普通类-报告期
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存财务分析-资产负债-普通类-报告期
     */
    @RequiresPermissions("investment:invFinanceZcfzCommonPeriod:add")
    @Log(title = "财务分析-资产负债-普通类-报告期", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(InvFinanceZcfzCommonPeriod invFinanceZcfzCommonPeriod)
    {
        return toAjax(invFinanceZcfzCommonPeriodService.insertInvFinanceZcfzCommonPeriod(invFinanceZcfzCommonPeriod));
    }

    /**
     * 修改财务分析-资产负债-普通类-报告期
     */
    @RequiresPermissions("investment:invFinanceZcfzCommonPeriod:edit")
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        InvFinanceZcfzCommonPeriod invFinanceZcfzCommonPeriod = invFinanceZcfzCommonPeriodService.selectInvFinanceZcfzCommonPeriodById(id);
        mmap.put("invFinanceZcfzCommonPeriod", invFinanceZcfzCommonPeriod);
        return prefix + "/edit";
    }

    /**
     * 修改保存财务分析-资产负债-普通类-报告期
     */
    @RequiresPermissions("investment:invFinanceZcfzCommonPeriod:edit")
    @Log(title = "财务分析-资产负债-普通类-报告期", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(InvFinanceZcfzCommonPeriod invFinanceZcfzCommonPeriod)
    {
        return toAjax(invFinanceZcfzCommonPeriodService.updateInvFinanceZcfzCommonPeriod(invFinanceZcfzCommonPeriod));
    }

    /**
     * 删除财务分析-资产负债-普通类-报告期
     */
    @RequiresPermissions("investment:invFinanceZcfzCommonPeriod:remove")
    @Log(title = "财务分析-资产负债-普通类-报告期", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(invFinanceZcfzCommonPeriodService.deleteInvFinanceZcfzCommonPeriodByIds(ids));
    }
}
