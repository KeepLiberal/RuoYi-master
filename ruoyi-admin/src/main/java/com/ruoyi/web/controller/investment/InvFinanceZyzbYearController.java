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
import com.ruoyi.investment.domain.InvFinanceZyzbYear;
import com.ruoyi.investment.service.IInvFinanceZyzbYearService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 财务分析-重要指标-年度Controller
 * 
 * @author wenyong.yang
 * @date 2022-09-24
 */
@Controller
@RequestMapping("/investment/invFinanceZyzbYear")
public class InvFinanceZyzbYearController extends BaseController
{
    private String prefix = "investment/invFinanceZyzbYear";

    @Autowired
    private IInvFinanceZyzbYearService invFinanceZyzbYearService;

    @RequiresPermissions("investment:invFinanceZyzbYear:view")
    @GetMapping()
    public String invFinanceZyzbYear()
    {
        return prefix + "/invFinanceZyzbYear";
    }

    /**
     * 查询财务分析-重要指标-年度列表
     */
    @RequiresPermissions("investment:invFinanceZyzbYear:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(InvFinanceZyzbYear invFinanceZyzbYear)
    {
        startPage();
        List<InvFinanceZyzbYear> list = invFinanceZyzbYearService.selectInvFinanceZyzbYearList(invFinanceZyzbYear);
        return getDataTable(list);
    }

    /**
     * 导出财务分析-重要指标-年度列表
     */
    @RequiresPermissions("investment:invFinanceZyzbYear:export")
    @Log(title = "财务分析-重要指标-年度", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(InvFinanceZyzbYear invFinanceZyzbYear)
    {
        List<InvFinanceZyzbYear> list = invFinanceZyzbYearService.selectInvFinanceZyzbYearList(invFinanceZyzbYear);
        ExcelUtil<InvFinanceZyzbYear> util = new ExcelUtil<InvFinanceZyzbYear>(InvFinanceZyzbYear.class);
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
    @RequiresPermissions("investment:invFinanceZyzbYear:add")
    @Log(title = "财务分析-重要指标-年度", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(InvFinanceZyzbYear invFinanceZyzbYear)
    {
        return toAjax(invFinanceZyzbYearService.insertInvFinanceZyzbYear(invFinanceZyzbYear));
    }

    /**
     * 修改财务分析-重要指标-年度
     */
    @RequiresPermissions("investment:invFinanceZyzbYear:edit")
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        InvFinanceZyzbYear invFinanceZyzbYear = invFinanceZyzbYearService.selectInvFinanceZyzbYearById(id);
        mmap.put("invFinanceZyzbYear", invFinanceZyzbYear);
        return prefix + "/edit";
    }

    /**
     * 修改保存财务分析-重要指标-年度
     */
    @RequiresPermissions("investment:invFinanceZyzbYear:edit")
    @Log(title = "财务分析-重要指标-年度", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(InvFinanceZyzbYear invFinanceZyzbYear)
    {
        return toAjax(invFinanceZyzbYearService.updateInvFinanceZyzbYear(invFinanceZyzbYear));
    }

    /**
     * 删除财务分析-重要指标-年度
     */
    @RequiresPermissions("investment:invFinanceZyzbYear:remove")
    @Log(title = "财务分析-重要指标-年度", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(invFinanceZyzbYearService.deleteInvFinanceZyzbYearByIds(ids));
    }
}
