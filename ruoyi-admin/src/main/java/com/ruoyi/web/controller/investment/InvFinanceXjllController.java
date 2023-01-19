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
import com.ruoyi.investment.domain.InvFinanceXjll;
import com.ruoyi.investment.service.IInvFinanceXjllService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 财务分析-现金流量Controller
 * 
 * @author yangwenyang
 * @date 2023-01-19
 */
@Controller
@RequestMapping("/investment/invFinanceXjll")
public class InvFinanceXjllController extends BaseController {
    private String prefix = "investment/invFinanceXjll";

    @Autowired
    private IInvFinanceXjllService invFinanceXjllService;

    @RequiresPermissions("investment:invFinanceXjll:view")
    @GetMapping()
    public String invFinanceXjll()
    {
        return prefix + "/invFinanceXjll";
    }

    /**
     * 查询财务分析-现金流量列表
     */
    @RequiresPermissions("investment:invFinanceXjll:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(InvFinanceXjll invFinanceXjll) {
        startPage();
        List<InvFinanceXjll> list = invFinanceXjllService.selectInvFinanceXjllList(invFinanceXjll);
        return getDataTable(list);
    }

    /**
     * 导出财务分析-现金流量列表
     */
    @RequiresPermissions("investment:invFinanceXjll:export")
    @Log(title = "财务分析-现金流量", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(InvFinanceXjll invFinanceXjll) {
        List<InvFinanceXjll> list = invFinanceXjllService.selectInvFinanceXjllList(invFinanceXjll);
        ExcelUtil<InvFinanceXjll> util = new ExcelUtil<InvFinanceXjll>(InvFinanceXjll.class);
        return util.exportExcel(list, "财务分析-现金流量数据");
    }

    /**
     * 新增财务分析-现金流量
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存财务分析-现金流量
     */
    @RequiresPermissions("investment:invFinanceXjll:add")
    @Log(title = "财务分析-现金流量", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(InvFinanceXjll invFinanceXjll) {
        return toAjax(invFinanceXjllService.insertInvFinanceXjll(invFinanceXjll));
    }

    /**
     * 修改财务分析-现金流量
     */
    @RequiresPermissions("investment:invFinanceXjll:edit")
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Integer id, ModelMap mmap) {
        InvFinanceXjll invFinanceXjll = invFinanceXjllService.selectInvFinanceXjllById(id);
        mmap.put("invFinanceXjll", invFinanceXjll);
        return prefix + "/edit";
    }

    /**
     * 修改保存财务分析-现金流量
     */
    @RequiresPermissions("investment:invFinanceXjll:edit")
    @Log(title = "财务分析-现金流量", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(InvFinanceXjll invFinanceXjll) {
        return toAjax(invFinanceXjllService.updateInvFinanceXjll(invFinanceXjll));
    }

    /**
     * 删除财务分析-现金流量
     */
    @RequiresPermissions("investment:invFinanceXjll:remove")
    @Log(title = "财务分析-现金流量", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids) {
        return toAjax(invFinanceXjllService.deleteInvFinanceXjllByIds(ids));
    }
}
