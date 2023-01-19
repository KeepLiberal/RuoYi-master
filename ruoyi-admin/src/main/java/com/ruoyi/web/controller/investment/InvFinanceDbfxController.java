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
import com.ruoyi.investment.domain.InvFinanceDbfx;
import com.ruoyi.investment.service.IInvFinanceDbfxService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 财务分析-杜邦分析Controller
 * 
 * @author yangwenyang
 * @date 2023-01-19
 */
@Controller
@RequestMapping("/investment/invFinanceDbfx")
public class InvFinanceDbfxController extends BaseController {
    private String prefix = "investment/invFinanceDbfx";

    @Autowired
    private IInvFinanceDbfxService invFinanceDbfxService;

    @RequiresPermissions("investment:invFinanceDbfx:view")
    @GetMapping()
    public String invFinanceDbfx()
    {
        return prefix + "/invFinanceDbfx";
    }

    /**
     * 查询财务分析-杜邦分析列表
     */
    @RequiresPermissions("investment:invFinanceDbfx:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(InvFinanceDbfx invFinanceDbfx) {
        startPage();
        List<InvFinanceDbfx> list = invFinanceDbfxService.selectInvFinanceDbfxList(invFinanceDbfx);
        return getDataTable(list);
    }

    /**
     * 导出财务分析-杜邦分析列表
     */
    @RequiresPermissions("investment:invFinanceDbfx:export")
    @Log(title = "财务分析-杜邦分析", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(InvFinanceDbfx invFinanceDbfx) {
        List<InvFinanceDbfx> list = invFinanceDbfxService.selectInvFinanceDbfxList(invFinanceDbfx);
        ExcelUtil<InvFinanceDbfx> util = new ExcelUtil<InvFinanceDbfx>(InvFinanceDbfx.class);
        return util.exportExcel(list, "财务分析-杜邦分析数据");
    }

    /**
     * 新增财务分析-杜邦分析
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存财务分析-杜邦分析
     */
    @RequiresPermissions("investment:invFinanceDbfx:add")
    @Log(title = "财务分析-杜邦分析", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(InvFinanceDbfx invFinanceDbfx) {
        return toAjax(invFinanceDbfxService.insertInvFinanceDbfx(invFinanceDbfx));
    }

    /**
     * 修改财务分析-杜邦分析
     */
    @RequiresPermissions("investment:invFinanceDbfx:edit")
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Integer id, ModelMap mmap) {
        InvFinanceDbfx invFinanceDbfx = invFinanceDbfxService.selectInvFinanceDbfxById(id);
        mmap.put("invFinanceDbfx", invFinanceDbfx);
        return prefix + "/edit";
    }

    /**
     * 修改保存财务分析-杜邦分析
     */
    @RequiresPermissions("investment:invFinanceDbfx:edit")
    @Log(title = "财务分析-杜邦分析", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(InvFinanceDbfx invFinanceDbfx) {
        return toAjax(invFinanceDbfxService.updateInvFinanceDbfx(invFinanceDbfx));
    }

    /**
     * 删除财务分析-杜邦分析
     */
    @RequiresPermissions("investment:invFinanceDbfx:remove")
    @Log(title = "财务分析-杜邦分析", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids) {
        return toAjax(invFinanceDbfxService.deleteInvFinanceDbfxByIds(ids));
    }
}
