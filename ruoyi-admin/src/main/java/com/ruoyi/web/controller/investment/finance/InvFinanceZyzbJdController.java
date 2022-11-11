package com.ruoyi.web.controller.investment.finance;

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
import com.ruoyi.investment.finance.domain.InvFinanceZyzbJd;
import com.ruoyi.investment.finance.service.IInvFinanceZyzbJdService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 财务分析-重要指标-季度Controller
 * 
 * @author yangwenyang
 * @date 2022-11-11
 */
@Controller
@RequestMapping("/investment/invFinanceZyzbJd")
public class InvFinanceZyzbJdController extends BaseController {
    private String prefix = "investment/invFinanceZyzbJd";

    @Autowired
    private IInvFinanceZyzbJdService invFinanceZyzbJdService;

    @RequiresPermissions("investment:invFinanceZyzbJd:view")
    @GetMapping()
    public String invFinanceZyzbJd()
    {
        return prefix + "/invFinanceZyzbJd";
    }

    /**
     * 查询财务分析-重要指标-季度列表
     */
    @RequiresPermissions("investment:invFinanceZyzbJd:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(InvFinanceZyzbJd invFinanceZyzbJd) {
        startPage();
        List<InvFinanceZyzbJd> list = invFinanceZyzbJdService.selectInvFinanceZyzbJdList(invFinanceZyzbJd);
        return getDataTable(list);
    }

    /**
     * 导出财务分析-重要指标-季度列表
     */
    @RequiresPermissions("investment:invFinanceZyzbJd:export")
    @Log(title = "财务分析-重要指标-季度", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(InvFinanceZyzbJd invFinanceZyzbJd) {
        List<InvFinanceZyzbJd> list = invFinanceZyzbJdService.selectInvFinanceZyzbJdList(invFinanceZyzbJd);
        ExcelUtil<InvFinanceZyzbJd> util = new ExcelUtil<InvFinanceZyzbJd>(InvFinanceZyzbJd.class);
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
    @RequiresPermissions("investment:invFinanceZyzbJd:add")
    @Log(title = "财务分析-重要指标-季度", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(InvFinanceZyzbJd invFinanceZyzbJd) {
        return toAjax(invFinanceZyzbJdService.insertInvFinanceZyzbJd(invFinanceZyzbJd));
    }

    /**
     * 修改财务分析-重要指标-季度
     */
    @RequiresPermissions("investment:invFinanceZyzbJd:edit")
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap) {
        InvFinanceZyzbJd invFinanceZyzbJd = invFinanceZyzbJdService.selectInvFinanceZyzbJdById(id);
        mmap.put("invFinanceZyzbJd", invFinanceZyzbJd);
        return prefix + "/edit";
    }

    /**
     * 修改保存财务分析-重要指标-季度
     */
    @RequiresPermissions("investment:invFinanceZyzbJd:edit")
    @Log(title = "财务分析-重要指标-季度", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(InvFinanceZyzbJd invFinanceZyzbJd) {
        return toAjax(invFinanceZyzbJdService.updateInvFinanceZyzbJd(invFinanceZyzbJd));
    }

    /**
     * 删除财务分析-重要指标-季度
     */
    @RequiresPermissions("investment:invFinanceZyzbJd:remove")
    @Log(title = "财务分析-重要指标-季度", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids) {
        return toAjax(invFinanceZyzbJdService.deleteInvFinanceZyzbJdByIds(ids));
    }
}
