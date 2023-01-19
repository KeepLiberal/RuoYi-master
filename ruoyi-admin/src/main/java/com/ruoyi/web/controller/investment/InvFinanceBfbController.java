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
import com.ruoyi.investment.domain.InvFinanceBfb;
import com.ruoyi.investment.service.IInvFinanceBfbService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 财务分析-百分比Controller
 * 
 * @author yangwenyang
 * @date 2023-01-19
 */
@Controller
@RequestMapping("/investment/invFinanceBfb")
public class InvFinanceBfbController extends BaseController {
    private String prefix = "investment/invFinanceBfb";

    @Autowired
    private IInvFinanceBfbService invFinanceBfbService;

    @RequiresPermissions("investment:invFinanceBfb:view")
    @GetMapping()
    public String invFinanceBfb()
    {
        return prefix + "/invFinanceBfb";
    }

    /**
     * 查询财务分析-百分比列表
     */
    @RequiresPermissions("investment:invFinanceBfb:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(InvFinanceBfb invFinanceBfb) {
        startPage();
        List<InvFinanceBfb> list = invFinanceBfbService.selectInvFinanceBfbList(invFinanceBfb);
        return getDataTable(list);
    }

    /**
     * 导出财务分析-百分比列表
     */
    @RequiresPermissions("investment:invFinanceBfb:export")
    @Log(title = "财务分析-百分比", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(InvFinanceBfb invFinanceBfb) {
        List<InvFinanceBfb> list = invFinanceBfbService.selectInvFinanceBfbList(invFinanceBfb);
        ExcelUtil<InvFinanceBfb> util = new ExcelUtil<InvFinanceBfb>(InvFinanceBfb.class);
        return util.exportExcel(list, "财务分析-百分比数据");
    }

    /**
     * 新增财务分析-百分比
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存财务分析-百分比
     */
    @RequiresPermissions("investment:invFinanceBfb:add")
    @Log(title = "财务分析-百分比", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(InvFinanceBfb invFinanceBfb) {
        return toAjax(invFinanceBfbService.insertInvFinanceBfb(invFinanceBfb));
    }

    /**
     * 修改财务分析-百分比
     */
    @RequiresPermissions("investment:invFinanceBfb:edit")
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Integer id, ModelMap mmap) {
        InvFinanceBfb invFinanceBfb = invFinanceBfbService.selectInvFinanceBfbById(id);
        mmap.put("invFinanceBfb", invFinanceBfb);
        return prefix + "/edit";
    }

    /**
     * 修改保存财务分析-百分比
     */
    @RequiresPermissions("investment:invFinanceBfb:edit")
    @Log(title = "财务分析-百分比", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(InvFinanceBfb invFinanceBfb) {
        return toAjax(invFinanceBfbService.updateInvFinanceBfb(invFinanceBfb));
    }

    /**
     * 删除财务分析-百分比
     */
    @RequiresPermissions("investment:invFinanceBfb:remove")
    @Log(title = "财务分析-百分比", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids) {
        return toAjax(invFinanceBfbService.deleteInvFinanceBfbByIds(ids));
    }
}
