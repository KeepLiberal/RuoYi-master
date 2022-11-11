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
import com.ruoyi.investment.finance.domain.InvFinanceZyzbNd;
import com.ruoyi.investment.finance.service.IInvFinanceZyzbNdService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 财务分析-重要指标-年度Controller
 * 
 * @author yangwenyang
 * @date 2022-11-11
 */
@Controller
@RequestMapping("/investment/invFinanceZyzbNd")
public class InvFinanceZyzbNdController extends BaseController {
    private String prefix = "investment/invFinanceZyzbNd";

    @Autowired
    private IInvFinanceZyzbNdService invFinanceZyzbNdService;

    @RequiresPermissions("investment:invFinanceZyzbNd:view")
    @GetMapping()
    public String invFinanceZyzbNd()
    {
        return prefix + "/invFinanceZyzbNd";
    }

    /**
     * 查询财务分析-重要指标-年度列表
     */
    @RequiresPermissions("investment:invFinanceZyzbNd:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(InvFinanceZyzbNd invFinanceZyzbNd) {
        startPage();
        List<InvFinanceZyzbNd> list = invFinanceZyzbNdService.selectInvFinanceZyzbNdList(invFinanceZyzbNd);
        return getDataTable(list);
    }

    /**
     * 导出财务分析-重要指标-年度列表
     */
    @RequiresPermissions("investment:invFinanceZyzbNd:export")
    @Log(title = "财务分析-重要指标-年度", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(InvFinanceZyzbNd invFinanceZyzbNd) {
        List<InvFinanceZyzbNd> list = invFinanceZyzbNdService.selectInvFinanceZyzbNdList(invFinanceZyzbNd);
        ExcelUtil<InvFinanceZyzbNd> util = new ExcelUtil<InvFinanceZyzbNd>(InvFinanceZyzbNd.class);
        return util.exportExcel(list, "财务分析-重要指标-年度数据");
    }

    /**
     * 新增财务分析-重要指标-年度
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存财务分析-重要指标-年度
     */
    @RequiresPermissions("investment:invFinanceZyzbNd:add")
    @Log(title = "财务分析-重要指标-年度", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(InvFinanceZyzbNd invFinanceZyzbNd) {
        return toAjax(invFinanceZyzbNdService.insertInvFinanceZyzbNd(invFinanceZyzbNd));
    }

    /**
     * 修改财务分析-重要指标-年度
     */
    @RequiresPermissions("investment:invFinanceZyzbNd:edit")
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap) {
        InvFinanceZyzbNd invFinanceZyzbNd = invFinanceZyzbNdService.selectInvFinanceZyzbNdById(id);
        mmap.put("invFinanceZyzbNd", invFinanceZyzbNd);
        return prefix + "/edit";
    }

    /**
     * 修改保存财务分析-重要指标-年度
     */
    @RequiresPermissions("investment:invFinanceZyzbNd:edit")
    @Log(title = "财务分析-重要指标-年度", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(InvFinanceZyzbNd invFinanceZyzbNd) {
        return toAjax(invFinanceZyzbNdService.updateInvFinanceZyzbNd(invFinanceZyzbNd));
    }

    /**
     * 删除财务分析-重要指标-年度
     */
    @RequiresPermissions("investment:invFinanceZyzbNd:remove")
    @Log(title = "财务分析-重要指标-年度", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids) {
        return toAjax(invFinanceZyzbNdService.deleteInvFinanceZyzbNdByIds(ids));
    }
}
