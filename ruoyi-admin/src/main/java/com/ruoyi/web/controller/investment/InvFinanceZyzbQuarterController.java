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
import com.ruoyi.investment.domain.InvFinanceZyzbQuarter;
import com.ruoyi.investment.service.IInvFinanceZyzbQuarterService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 财务分析-重要指标-季度Controller
 * 
 * @author wenyong.yang
 * @date 2022-09-24
 */
@Controller
@RequestMapping("/investment/invFinanceZyzbQuarter")
public class InvFinanceZyzbQuarterController extends BaseController
{
    private String prefix = "investment/invFinanceZyzbQuarter";

    @Autowired
    private IInvFinanceZyzbQuarterService invFinanceZyzbQuarterService;

    @RequiresPermissions("investment:invFinanceZyzbQuarter:view")
    @GetMapping()
    public String invFinanceZyzbQuarter()
    {
        return prefix + "/invFinanceZyzbQuarter";
    }

    /**
     * 查询财务分析-重要指标-季度列表
     */
    @RequiresPermissions("investment:invFinanceZyzbQuarter:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(InvFinanceZyzbQuarter invFinanceZyzbQuarter)
    {
        startPage();
        List<InvFinanceZyzbQuarter> list = invFinanceZyzbQuarterService.selectInvFinanceZyzbQuarterList(invFinanceZyzbQuarter);
        return getDataTable(list);
    }

    /**
     * 导出财务分析-重要指标-季度列表
     */
    @RequiresPermissions("investment:invFinanceZyzbQuarter:export")
    @Log(title = "财务分析-重要指标-季度", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(InvFinanceZyzbQuarter invFinanceZyzbQuarter)
    {
        List<InvFinanceZyzbQuarter> list = invFinanceZyzbQuarterService.selectInvFinanceZyzbQuarterList(invFinanceZyzbQuarter);
        ExcelUtil<InvFinanceZyzbQuarter> util = new ExcelUtil<InvFinanceZyzbQuarter>(InvFinanceZyzbQuarter.class);
        return util.exportExcel(list, "财务分析-重要指标-季度数据");
    }

    /**
     * 新增财务分析-重要指标-季度
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存财务分析-重要指标-季度
     */
    @RequiresPermissions("investment:invFinanceZyzbQuarter:add")
    @Log(title = "财务分析-重要指标-季度", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(InvFinanceZyzbQuarter invFinanceZyzbQuarter)
    {
        return toAjax(invFinanceZyzbQuarterService.insertInvFinanceZyzbQuarter(invFinanceZyzbQuarter));
    }

    /**
     * 修改财务分析-重要指标-季度
     */
    @RequiresPermissions("investment:invFinanceZyzbQuarter:edit")
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        InvFinanceZyzbQuarter invFinanceZyzbQuarter = invFinanceZyzbQuarterService.selectInvFinanceZyzbQuarterById(id);
        mmap.put("invFinanceZyzbQuarter", invFinanceZyzbQuarter);
        return prefix + "/edit";
    }

    /**
     * 修改保存财务分析-重要指标-季度
     */
    @RequiresPermissions("investment:invFinanceZyzbQuarter:edit")
    @Log(title = "财务分析-重要指标-季度", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(InvFinanceZyzbQuarter invFinanceZyzbQuarter)
    {
        return toAjax(invFinanceZyzbQuarterService.updateInvFinanceZyzbQuarter(invFinanceZyzbQuarter));
    }

    /**
     * 删除财务分析-重要指标-季度
     */
    @RequiresPermissions("investment:invFinanceZyzbQuarter:remove")
    @Log(title = "财务分析-重要指标-季度", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(invFinanceZyzbQuarterService.deleteInvFinanceZyzbQuarterByIds(ids));
    }
}
