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
import com.ruoyi.investment.domain.InvFinanceZcfz;
import com.ruoyi.investment.service.IInvFinanceZcfzService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 财务分析-资产负债Controller
 * 
 * @author yangwenyang
 * @date 2022-10-15
 */
@Controller
@RequestMapping("/investment/invFinanceZcfz")
public class InvFinanceZcfzController extends BaseController
{
    private String prefix = "investment/invFinanceZcfz";

    @Autowired
    private IInvFinanceZcfzService invFinanceZcfzService;

    @RequiresPermissions("investment:invFinanceZcfz:view")
    @GetMapping()
    public String invFinanceZcfz()
    {
        return prefix + "/invFinanceZcfz";
    }

    /**
     * 查询财务分析-资产负债列表
     */
    @RequiresPermissions("investment:invFinanceZcfz:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(InvFinanceZcfz invFinanceZcfz)
    {
        startPage();
        List<InvFinanceZcfz> list = invFinanceZcfzService.selectInvFinanceZcfzList(invFinanceZcfz);
        return getDataTable(list);
    }

    /**
     * 导出财务分析-资产负债列表
     */
    @RequiresPermissions("investment:invFinanceZcfz:export")
    @Log(title = "财务分析-资产负债", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(InvFinanceZcfz invFinanceZcfz)
    {
        List<InvFinanceZcfz> list = invFinanceZcfzService.selectInvFinanceZcfzList(invFinanceZcfz);
        ExcelUtil<InvFinanceZcfz> util = new ExcelUtil<InvFinanceZcfz>(InvFinanceZcfz.class);
        return util.exportExcel(list, "财务分析-资产负债数据");
    }

    /**
     * 新增财务分析-资产负债
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存财务分析-资产负债
     */
    @RequiresPermissions("investment:invFinanceZcfz:add")
    @Log(title = "财务分析-资产负债", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(InvFinanceZcfz invFinanceZcfz)
    {
        return toAjax(invFinanceZcfzService.insertInvFinanceZcfz(invFinanceZcfz));
    }

    /**
     * 修改财务分析-资产负债
     */
    @RequiresPermissions("investment:invFinanceZcfz:edit")
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        InvFinanceZcfz invFinanceZcfz = invFinanceZcfzService.selectInvFinanceZcfzById(id);
        mmap.put("invFinanceZcfz", invFinanceZcfz);
        return prefix + "/edit";
    }

    /**
     * 修改保存财务分析-资产负债
     */
    @RequiresPermissions("investment:invFinanceZcfz:edit")
    @Log(title = "财务分析-资产负债", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(InvFinanceZcfz invFinanceZcfz)
    {
        return toAjax(invFinanceZcfzService.updateInvFinanceZcfz(invFinanceZcfz));
    }

    /**
     * 删除财务分析-资产负债
     */
    @RequiresPermissions("investment:invFinanceZcfz:remove")
    @Log(title = "财务分析-资产负债", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(invFinanceZcfzService.deleteInvFinanceZcfzByIds(ids));
    }
}
