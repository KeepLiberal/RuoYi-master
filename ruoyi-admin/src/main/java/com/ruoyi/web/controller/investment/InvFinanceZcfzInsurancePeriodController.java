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
import com.ruoyi.investment.domain.InvFinanceZcfzInsurancePeriod;
import com.ruoyi.investment.service.IInvFinanceZcfzInsurancePeriodService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 财务分析-资产负债-保险类-报告期Controller
 * 
 * @author yangwenyang
 * @date 2022-09-30
 */
@Controller
@RequestMapping("/investment/invFinanceZcfzInsurancePeriod")
public class InvFinanceZcfzInsurancePeriodController extends BaseController
{
    private String prefix = "investment/invFinanceZcfzInsurancePeriod";

    @Autowired
    private IInvFinanceZcfzInsurancePeriodService invFinanceZcfzInsurancePeriodService;

    @RequiresPermissions("investment:invFinanceZcfzInsurancePeriod:view")
    @GetMapping()
    public String invFinanceZcfzInsurancePeriod()
    {
        return prefix + "/invFinanceZcfzInsurancePeriod";
    }

    /**
     * 查询财务分析-资产负债-保险类-报告期列表
     */
    @RequiresPermissions("investment:invFinanceZcfzInsurancePeriod:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(InvFinanceZcfzInsurancePeriod invFinanceZcfzInsurancePeriod)
    {
        startPage();
        List<InvFinanceZcfzInsurancePeriod> list = invFinanceZcfzInsurancePeriodService.selectInvFinanceZcfzInsurancePeriodList(invFinanceZcfzInsurancePeriod);
        return getDataTable(list);
    }

    /**
     * 导出财务分析-资产负债-保险类-报告期列表
     */
    @RequiresPermissions("investment:invFinanceZcfzInsurancePeriod:export")
    @Log(title = "财务分析-资产负债-保险类-报告期", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(InvFinanceZcfzInsurancePeriod invFinanceZcfzInsurancePeriod)
    {
        List<InvFinanceZcfzInsurancePeriod> list = invFinanceZcfzInsurancePeriodService.selectInvFinanceZcfzInsurancePeriodList(invFinanceZcfzInsurancePeriod);
        ExcelUtil<InvFinanceZcfzInsurancePeriod> util = new ExcelUtil<InvFinanceZcfzInsurancePeriod>(InvFinanceZcfzInsurancePeriod.class);
        return util.exportExcel(list, "财务分析-资产负债-保险类-报告期数据");
    }

    /**
     * 新增财务分析-资产负债-保险类-报告期
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存财务分析-资产负债-保险类-报告期
     */
    @RequiresPermissions("investment:invFinanceZcfzInsurancePeriod:add")
    @Log(title = "财务分析-资产负债-保险类-报告期", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(InvFinanceZcfzInsurancePeriod invFinanceZcfzInsurancePeriod)
    {
        return toAjax(invFinanceZcfzInsurancePeriodService.insertInvFinanceZcfzInsurancePeriod(invFinanceZcfzInsurancePeriod));
    }

    /**
     * 修改财务分析-资产负债-保险类-报告期
     */
    @RequiresPermissions("investment:invFinanceZcfzInsurancePeriod:edit")
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        InvFinanceZcfzInsurancePeriod invFinanceZcfzInsurancePeriod = invFinanceZcfzInsurancePeriodService.selectInvFinanceZcfzInsurancePeriodById(id);
        mmap.put("invFinanceZcfzInsurancePeriod", invFinanceZcfzInsurancePeriod);
        return prefix + "/edit";
    }

    /**
     * 修改保存财务分析-资产负债-保险类-报告期
     */
    @RequiresPermissions("investment:invFinanceZcfzInsurancePeriod:edit")
    @Log(title = "财务分析-资产负债-保险类-报告期", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(InvFinanceZcfzInsurancePeriod invFinanceZcfzInsurancePeriod)
    {
        return toAjax(invFinanceZcfzInsurancePeriodService.updateInvFinanceZcfzInsurancePeriod(invFinanceZcfzInsurancePeriod));
    }

    /**
     * 删除财务分析-资产负债-保险类-报告期
     */
    @RequiresPermissions("investment:invFinanceZcfzInsurancePeriod:remove")
    @Log(title = "财务分析-资产负债-保险类-报告期", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(invFinanceZcfzInsurancePeriodService.deleteInvFinanceZcfzInsurancePeriodByIds(ids));
    }
}
