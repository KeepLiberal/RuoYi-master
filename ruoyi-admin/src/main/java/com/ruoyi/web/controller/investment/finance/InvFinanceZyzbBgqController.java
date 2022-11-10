package com.ruoyi.web.controller.investment.finance;

import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.investment.finance.domain.InvFinanceZyzbBgq;
import com.ruoyi.investment.finance.service.IInvFinanceZyzbBgqService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 财务分析-重要指标-报告期Controller
 * 
 * @author yangwenyang
 * @date 2022-11-10
 */
@Controller
@RequestMapping("/investment/invFinanceZyzbBgq")
public class InvFinanceZyzbBgqController extends BaseController
{
    private String prefix = "investment/invFinanceZyzbBgq";

    @Autowired
    private IInvFinanceZyzbBgqService invFinanceZyzbBgqService;

    @RequiresPermissions("investment:invFinanceZyzbBgq:view")
    @GetMapping()
    public String invFinanceZyzbBgq()
    {
        return prefix + "/invFinanceZyzbBgq";
    }

    /**
     * 查询财务分析-重要指标-报告期列表
     */
    @RequiresPermissions("investment:invFinanceZyzbBgq:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(InvFinanceZyzbBgq invFinanceZyzbBgq)
    {
        startPage();
        List<InvFinanceZyzbBgq> list = invFinanceZyzbBgqService.selectInvFinanceZyzbBgqList(invFinanceZyzbBgq);
        return getDataTable(list);
    }

    /**
     * 导出财务分析-重要指标-报告期列表
     */
    @RequiresPermissions("investment:invFinanceZyzbBgq:export")
    @Log(title = "财务分析-重要指标-报告期", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(InvFinanceZyzbBgq invFinanceZyzbBgq)
    {
        List<InvFinanceZyzbBgq> list = invFinanceZyzbBgqService.selectInvFinanceZyzbBgqList(invFinanceZyzbBgq);
        ExcelUtil<InvFinanceZyzbBgq> util = new ExcelUtil<InvFinanceZyzbBgq>(InvFinanceZyzbBgq.class);
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
    @RequiresPermissions("investment:invFinanceZyzbBgq:add")
    @Log(title = "财务分析-重要指标-报告期", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(InvFinanceZyzbBgq invFinanceZyzbBgq)
    {
        return toAjax(invFinanceZyzbBgqService.insertInvFinanceZyzbBgq(invFinanceZyzbBgq));
    }

    /**
     * 修改财务分析-重要指标-报告期
     */
    @RequiresPermissions("investment:invFinanceZyzbBgq:edit")
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        InvFinanceZyzbBgq invFinanceZyzbBgq = invFinanceZyzbBgqService.selectInvFinanceZyzbBgqById(id);
        mmap.put("invFinanceZyzbBgq", invFinanceZyzbBgq);
        return prefix + "/edit";
    }

    /**
     * 修改保存财务分析-重要指标-报告期
     */
    @RequiresPermissions("investment:invFinanceZyzbBgq:edit")
    @Log(title = "财务分析-重要指标-报告期", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(InvFinanceZyzbBgq invFinanceZyzbBgq)
    {
        return toAjax(invFinanceZyzbBgqService.updateInvFinanceZyzbBgq(invFinanceZyzbBgq));
    }

    /**
     * 删除财务分析-重要指标-报告期
     */
    @RequiresPermissions("investment:invFinanceZyzbBgq:remove")
    @Log(title = "财务分析-重要指标-报告期", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(invFinanceZyzbBgqService.deleteInvFinanceZyzbBgqByIds(ids));
    }
}
