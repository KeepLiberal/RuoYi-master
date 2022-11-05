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
import com.ruoyi.investment.domain.InvFinanceLr;
import com.ruoyi.investment.service.IInvFinanceLrService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 财务分析-利润Controller
 *
 * @author yangwenyang
 * @date 2022-11-05
 */
@Controller
@RequestMapping("/investment/invFinanceLr")
public class InvFinanceLrController extends BaseController
{
    private String prefix = "investment/invFinanceLr";

    @Autowired
    private IInvFinanceLrService invFinanceLrService;

    @RequiresPermissions("investment:invFinanceLr:view")
    @GetMapping()
    public String invFinanceLr()
    {
        return prefix + "/invFinanceLr";
    }

    /**
     * 查询财务分析-利润列表
     */
    @RequiresPermissions("investment:invFinanceLr:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(InvFinanceLr invFinanceLr)
    {
        startPage();
        List<InvFinanceLr> list = invFinanceLrService.selectInvFinanceLrList(invFinanceLr);
        return getDataTable(list);
    }

    /**
     * 导出财务分析-利润列表
     */
    @RequiresPermissions("investment:invFinanceLr:export")
    @Log(title = "财务分析-利润", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(InvFinanceLr invFinanceLr)
    {
        List<InvFinanceLr> list = invFinanceLrService.selectInvFinanceLrList(invFinanceLr);
        ExcelUtil<InvFinanceLr> util = new ExcelUtil<InvFinanceLr>(InvFinanceLr.class);
        return util.exportExcel(list, "财务分析-利润数据");
    }

    /**
     * 新增财务分析-利润
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存财务分析-利润
     */
    @RequiresPermissions("investment:invFinanceLr:add")
    @Log(title = "财务分析-利润", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(InvFinanceLr invFinanceLr)
    {
        return toAjax(invFinanceLrService.insertInvFinanceLr(invFinanceLr));
    }

    /**
     * 修改财务分析-利润
     */
    @RequiresPermissions("investment:invFinanceLr:edit")
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        InvFinanceLr invFinanceLr = invFinanceLrService.selectInvFinanceLrById(id);
        mmap.put("invFinanceLr", invFinanceLr);
        return prefix + "/edit";
    }

    /**
     * 修改保存财务分析-利润
     */
    @RequiresPermissions("investment:invFinanceLr:edit")
    @Log(title = "财务分析-利润", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(InvFinanceLr invFinanceLr)
    {
        return toAjax(invFinanceLrService.updateInvFinanceLr(invFinanceLr));
    }

    /**
     * 删除财务分析-利润
     */
    @RequiresPermissions("investment:invFinanceLr:remove")
    @Log(title = "财务分析-利润", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(invFinanceLrService.deleteInvFinanceLrByIds(ids));
    }
}
