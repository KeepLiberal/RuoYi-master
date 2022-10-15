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
import com.ruoyi.investment.domain.InvFinanceZyzb;
import com.ruoyi.investment.service.IInvFinanceZyzbService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 财务分析-重要指标Controller
 * 
 * @author yangwenyang
 * @date 2022-10-15
 */
@Controller
@RequestMapping("/investment/invFinanceZyzb")
public class InvFinanceZyzbController extends BaseController
{
    private String prefix = "investment/invFinanceZyzb";

    @Autowired
    private IInvFinanceZyzbService invFinanceZyzbService;

    @RequiresPermissions("investment:invFinanceZyzb:view")
    @GetMapping()
    public String invFinanceZyzb()
    {
        return prefix + "/invFinanceZyzb";
    }

    /**
     * 查询财务分析-重要指标列表
     */
    @RequiresPermissions("investment:invFinanceZyzb:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(InvFinanceZyzb invFinanceZyzb)
    {
        startPage();
        List<InvFinanceZyzb> list = invFinanceZyzbService.selectInvFinanceZyzbList(invFinanceZyzb);
        return getDataTable(list);
    }

    /**
     * 导出财务分析-重要指标列表
     */
    @RequiresPermissions("investment:invFinanceZyzb:export")
    @Log(title = "财务分析-重要指标", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(InvFinanceZyzb invFinanceZyzb)
    {
        List<InvFinanceZyzb> list = invFinanceZyzbService.selectInvFinanceZyzbList(invFinanceZyzb);
        ExcelUtil<InvFinanceZyzb> util = new ExcelUtil<InvFinanceZyzb>(InvFinanceZyzb.class);
        return util.exportExcel(list, "财务分析-重要指标数据");
    }

    /**
     * 新增财务分析-重要指标
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存财务分析-重要指标
     */
    @RequiresPermissions("investment:invFinanceZyzb:add")
    @Log(title = "财务分析-重要指标", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(InvFinanceZyzb invFinanceZyzb)
    {
        return toAjax(invFinanceZyzbService.insertInvFinanceZyzb(invFinanceZyzb));
    }

    /**
     * 修改财务分析-重要指标
     */
    @RequiresPermissions("investment:invFinanceZyzb:edit")
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        InvFinanceZyzb invFinanceZyzb = invFinanceZyzbService.selectInvFinanceZyzbById(id);
        mmap.put("invFinanceZyzb", invFinanceZyzb);
        return prefix + "/edit";
    }

    /**
     * 修改保存财务分析-重要指标
     */
    @RequiresPermissions("investment:invFinanceZyzb:edit")
    @Log(title = "财务分析-重要指标", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(InvFinanceZyzb invFinanceZyzb)
    {
        return toAjax(invFinanceZyzbService.updateInvFinanceZyzb(invFinanceZyzb));
    }

    /**
     * 删除财务分析-重要指标
     */
    @RequiresPermissions("investment:invFinanceZyzb:remove")
    @Log(title = "财务分析-重要指标", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(invFinanceZyzbService.deleteInvFinanceZyzbByIds(ids));
    }
}
