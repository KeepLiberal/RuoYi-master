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
import com.ruoyi.investment.domain.InvStock;
import com.ruoyi.investment.service.IInvStockService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * A股基本信息Controller
 * 
 * @author yangwenyang
 * @date 2022-10-14
 */
@Controller
@RequestMapping("/investment/invStock")
public class InvStockController extends BaseController
{
    private String prefix = "investment/invStock";

    @Autowired
    private IInvStockService invStockService;

    @RequiresPermissions("investment:invStock:view")
    @GetMapping()
    public String invStock()
    {
        return prefix + "/invStock";
    }

    /**
     * 查询A股基本信息列表
     */
    @RequiresPermissions("investment:invStock:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(InvStock invStock)
    {
        startPage();
        List<InvStock> list = invStockService.selectInvStockList(invStock);
        return getDataTable(list);
    }

    /**
     * 导出A股基本信息列表
     */
    @RequiresPermissions("investment:invStock:export")
    @Log(title = "A股基本信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(InvStock invStock)
    {
        List<InvStock> list = invStockService.selectInvStockList(invStock);
        ExcelUtil<InvStock> util = new ExcelUtil<InvStock>(InvStock.class);
        return util.exportExcel(list, "A股基本信息数据");
    }

    /**
     * 新增A股基本信息
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存A股基本信息
     */
    @RequiresPermissions("investment:invStock:add")
    @Log(title = "A股基本信息", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(InvStock invStock)
    {
        return toAjax(invStockService.insertInvStock(invStock));
    }

    /**
     * 修改A股基本信息
     */
    @RequiresPermissions("investment:invStock:edit")
    @GetMapping("/edit/{code}")
    public String edit(@PathVariable("code") String code, ModelMap mmap)
    {
        InvStock invStock = invStockService.selectInvStockByCode(code);
        mmap.put("invStock", invStock);
        return prefix + "/edit";
    }

    /**
     * 修改保存A股基本信息
     */
    @RequiresPermissions("investment:invStock:edit")
    @Log(title = "A股基本信息", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(InvStock invStock)
    {
        return toAjax(invStockService.updateInvStock(invStock));
    }

    /**
     * 删除A股基本信息
     */
    @RequiresPermissions("investment:invStock:remove")
    @Log(title = "A股基本信息", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(invStockService.deleteInvStockByCodes(ids));
    }
}
