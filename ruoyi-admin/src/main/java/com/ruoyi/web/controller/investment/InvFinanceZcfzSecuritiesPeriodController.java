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
import com.ruoyi.investment.domain.InvFinanceZcfzSecuritiesPeriod;
import com.ruoyi.investment.service.IInvFinanceZcfzSecuritiesPeriodService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 财务分析-资产负债-证劵类-报告期Controller
 * 
 * @author yangwenyang
 * @date 2022-09-30
 */
@Controller
@RequestMapping("/investment/invFinanceZcfzSecuritiesPeriod")
public class InvFinanceZcfzSecuritiesPeriodController extends BaseController
{
    private String prefix = "investment/invFinanceZcfzSecuritiesPeriod";

    @Autowired
    private IInvFinanceZcfzSecuritiesPeriodService invFinanceZcfzSecuritiesPeriodService;

    @RequiresPermissions("investment:invFinanceZcfzSecuritiesPeriod:view")
    @GetMapping()
    public String invFinanceZcfzSecuritiesPeriod()
    {
        return prefix + "/invFinanceZcfzSecuritiesPeriod";
    }

    /**
     * 查询财务分析-资产负债-证劵类-报告期列表
     */
    @RequiresPermissions("investment:invFinanceZcfzSecuritiesPeriod:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(InvFinanceZcfzSecuritiesPeriod invFinanceZcfzSecuritiesPeriod)
    {
        startPage();
        List<InvFinanceZcfzSecuritiesPeriod> list = invFinanceZcfzSecuritiesPeriodService.selectInvFinanceZcfzSecuritiesPeriodList(invFinanceZcfzSecuritiesPeriod);
        return getDataTable(list);
    }

    /**
     * 导出财务分析-资产负债-证劵类-报告期列表
     */
    @RequiresPermissions("investment:invFinanceZcfzSecuritiesPeriod:export")
    @Log(title = "财务分析-资产负债-证劵类-报告期", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(InvFinanceZcfzSecuritiesPeriod invFinanceZcfzSecuritiesPeriod)
    {
        List<InvFinanceZcfzSecuritiesPeriod> list = invFinanceZcfzSecuritiesPeriodService.selectInvFinanceZcfzSecuritiesPeriodList(invFinanceZcfzSecuritiesPeriod);
        ExcelUtil<InvFinanceZcfzSecuritiesPeriod> util = new ExcelUtil<InvFinanceZcfzSecuritiesPeriod>(InvFinanceZcfzSecuritiesPeriod.class);
        return util.exportExcel(list, "财务分析-资产负债-证劵类-报告期数据");
    }

    /**
     * 新增财务分析-资产负债-证劵类-报告期
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存财务分析-资产负债-证劵类-报告期
     */
    @RequiresPermissions("investment:invFinanceZcfzSecuritiesPeriod:add")
    @Log(title = "财务分析-资产负债-证劵类-报告期", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(InvFinanceZcfzSecuritiesPeriod invFinanceZcfzSecuritiesPeriod)
    {
        return toAjax(invFinanceZcfzSecuritiesPeriodService.insertInvFinanceZcfzSecuritiesPeriod(invFinanceZcfzSecuritiesPeriod));
    }

    /**
     * 修改财务分析-资产负债-证劵类-报告期
     */
    @RequiresPermissions("investment:invFinanceZcfzSecuritiesPeriod:edit")
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        InvFinanceZcfzSecuritiesPeriod invFinanceZcfzSecuritiesPeriod = invFinanceZcfzSecuritiesPeriodService.selectInvFinanceZcfzSecuritiesPeriodById(id);
        mmap.put("invFinanceZcfzSecuritiesPeriod", invFinanceZcfzSecuritiesPeriod);
        return prefix + "/edit";
    }

    /**
     * 修改保存财务分析-资产负债-证劵类-报告期
     */
    @RequiresPermissions("investment:invFinanceZcfzSecuritiesPeriod:edit")
    @Log(title = "财务分析-资产负债-证劵类-报告期", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(InvFinanceZcfzSecuritiesPeriod invFinanceZcfzSecuritiesPeriod)
    {
        return toAjax(invFinanceZcfzSecuritiesPeriodService.updateInvFinanceZcfzSecuritiesPeriod(invFinanceZcfzSecuritiesPeriod));
    }

    /**
     * 删除财务分析-资产负债-证劵类-报告期
     */
    @RequiresPermissions("investment:invFinanceZcfzSecuritiesPeriod:remove")
    @Log(title = "财务分析-资产负债-证劵类-报告期", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(invFinanceZcfzSecuritiesPeriodService.deleteInvFinanceZcfzSecuritiesPeriodByIds(ids));
    }
}
