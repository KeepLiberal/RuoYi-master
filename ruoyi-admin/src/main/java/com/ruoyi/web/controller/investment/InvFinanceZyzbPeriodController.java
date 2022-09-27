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
import com.ruoyi.investment.domain.InvFinanceZyzbPeriod;
import com.ruoyi.investment.service.IInvFinanceZyzbPeriodService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 财务分析-重要指标-报告期Controller
 * 
 * @author ruoyi
 * @date 2022-09-26
 */
@Controller
@RequestMapping("/investment/invFinanceZyzbPeriod")
public class InvFinanceZyzbPeriodController extends BaseController
{
    private String prefix = "investment/invFinanceZyzbPeriod";

    @Autowired
    private IInvFinanceZyzbPeriodService invFinanceZyzbPeriodService;

    @RequiresPermissions("investment:invFinanceZyzbPeriod:view")
    @GetMapping()
    public String invFinanceZyzbPeriod()
    {
        return prefix + "/invFinanceZyzbPeriod";
    }

    /**
     * 查询财务分析-重要指标-报告期列表
     */
    @RequiresPermissions("investment:invFinanceZyzbPeriod:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(InvFinanceZyzbPeriod invFinanceZyzbPeriod)
    {
        startPage();
        List<InvFinanceZyzbPeriod> list = invFinanceZyzbPeriodService.selectInvFinanceZyzbPeriodList(invFinanceZyzbPeriod);
        return getDataTable(list);
    }

    /**
     * 导出财务分析-重要指标-报告期列表
     */
    @RequiresPermissions("investment:invFinanceZyzbPeriod:export")
    @Log(title = "财务分析-重要指标-报告期", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(InvFinanceZyzbPeriod invFinanceZyzbPeriod)
    {
        List<InvFinanceZyzbPeriod> list = invFinanceZyzbPeriodService.selectInvFinanceZyzbPeriodList(invFinanceZyzbPeriod);
        ExcelUtil<InvFinanceZyzbPeriod> util = new ExcelUtil<InvFinanceZyzbPeriod>(InvFinanceZyzbPeriod.class);
        return util.exportExcel(list, "财务分析-重要指标-报告期数据");
    }

    /**
     * 新增财务分析-重要指标-报告期
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存财务分析-重要指标-报告期
     */
    @RequiresPermissions("investment:invFinanceZyzbPeriod:add")
    @Log(title = "财务分析-重要指标-报告期", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(InvFinanceZyzbPeriod invFinanceZyzbPeriod)
    {
        return toAjax(invFinanceZyzbPeriodService.insertInvFinanceZyzbPeriod(invFinanceZyzbPeriod));
    }

    /**
     * 修改财务分析-重要指标-报告期
     */
    @RequiresPermissions("investment:invFinanceZyzbPeriod:edit")
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        InvFinanceZyzbPeriod invFinanceZyzbPeriod = invFinanceZyzbPeriodService.selectInvFinanceZyzbPeriodById(id);
        mmap.put("invFinanceZyzbPeriod", invFinanceZyzbPeriod);
        return prefix + "/edit";
    }

    /**
     * 修改保存财务分析-重要指标-报告期
     */
    @RequiresPermissions("investment:invFinanceZyzbPeriod:edit")
    @Log(title = "财务分析-重要指标-报告期", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(InvFinanceZyzbPeriod invFinanceZyzbPeriod)
    {
        return toAjax(invFinanceZyzbPeriodService.updateInvFinanceZyzbPeriod(invFinanceZyzbPeriod));
    }

    /**
     * 删除财务分析-重要指标-报告期
     */
    @RequiresPermissions("investment:invFinanceZyzbPeriod:remove")
    @Log(title = "财务分析-重要指标-报告期", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(invFinanceZyzbPeriodService.deleteInvFinanceZyzbPeriodByIds(ids));
    }
}
