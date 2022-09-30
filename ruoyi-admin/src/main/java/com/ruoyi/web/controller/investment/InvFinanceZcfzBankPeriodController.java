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
import com.ruoyi.investment.domain.InvFinanceZcfzBankPeriod;
import com.ruoyi.investment.service.IInvFinanceZcfzBankPeriodService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 财务分析-资产负债-银行类-报告期Controller
 * 
 * @author yangwenyang
 * @date 2022-09-30
 */
@Controller
@RequestMapping("/investment/invFinanceZcfzBankPeriod")
public class InvFinanceZcfzBankPeriodController extends BaseController
{
    private String prefix = "investment/invFinanceZcfzBankPeriod";

    @Autowired
    private IInvFinanceZcfzBankPeriodService invFinanceZcfzBankPeriodService;

    @RequiresPermissions("investment:invFinanceZcfzBankPeriod:view")
    @GetMapping()
    public String invFinanceZcfzBankPeriod()
    {
        return prefix + "/invFinanceZcfzBankPeriod";
    }

    /**
     * 查询财务分析-资产负债-银行类-报告期列表
     */
    @RequiresPermissions("investment:invFinanceZcfzBankPeriod:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(InvFinanceZcfzBankPeriod invFinanceZcfzBankPeriod)
    {
        startPage();
        List<InvFinanceZcfzBankPeriod> list = invFinanceZcfzBankPeriodService.selectInvFinanceZcfzBankPeriodList(invFinanceZcfzBankPeriod);
        return getDataTable(list);
    }

    /**
     * 导出财务分析-资产负债-银行类-报告期列表
     */
    @RequiresPermissions("investment:invFinanceZcfzBankPeriod:export")
    @Log(title = "财务分析-资产负债-银行类-报告期", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(InvFinanceZcfzBankPeriod invFinanceZcfzBankPeriod)
    {
        List<InvFinanceZcfzBankPeriod> list = invFinanceZcfzBankPeriodService.selectInvFinanceZcfzBankPeriodList(invFinanceZcfzBankPeriod);
        ExcelUtil<InvFinanceZcfzBankPeriod> util = new ExcelUtil<InvFinanceZcfzBankPeriod>(InvFinanceZcfzBankPeriod.class);
        return util.exportExcel(list, "财务分析-资产负债-银行类-报告期数据");
    }

    /**
     * 新增财务分析-资产负债-银行类-报告期
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存财务分析-资产负债-银行类-报告期
     */
    @RequiresPermissions("investment:invFinanceZcfzBankPeriod:add")
    @Log(title = "财务分析-资产负债-银行类-报告期", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(InvFinanceZcfzBankPeriod invFinanceZcfzBankPeriod)
    {
        return toAjax(invFinanceZcfzBankPeriodService.insertInvFinanceZcfzBankPeriod(invFinanceZcfzBankPeriod));
    }

    /**
     * 修改财务分析-资产负债-银行类-报告期
     */
    @RequiresPermissions("investment:invFinanceZcfzBankPeriod:edit")
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        InvFinanceZcfzBankPeriod invFinanceZcfzBankPeriod = invFinanceZcfzBankPeriodService.selectInvFinanceZcfzBankPeriodById(id);
        mmap.put("invFinanceZcfzBankPeriod", invFinanceZcfzBankPeriod);
        return prefix + "/edit";
    }

    /**
     * 修改保存财务分析-资产负债-银行类-报告期
     */
    @RequiresPermissions("investment:invFinanceZcfzBankPeriod:edit")
    @Log(title = "财务分析-资产负债-银行类-报告期", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(InvFinanceZcfzBankPeriod invFinanceZcfzBankPeriod)
    {
        return toAjax(invFinanceZcfzBankPeriodService.updateInvFinanceZcfzBankPeriod(invFinanceZcfzBankPeriod));
    }

    /**
     * 删除财务分析-资产负债-银行类-报告期
     */
    @RequiresPermissions("investment:invFinanceZcfzBankPeriod:remove")
    @Log(title = "财务分析-资产负债-银行类-报告期", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(invFinanceZcfzBankPeriodService.deleteInvFinanceZcfzBankPeriodByIds(ids));
    }
}
