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
import com.ruoyi.investment.domain.InvLhbStock;
import com.ruoyi.investment.service.IInvLhbStockService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 个股龙虎榜Controller
 * 
 * @author yangwenyang
 * @date 2023-01-27
 */
@Controller
@RequestMapping("/investment/invLhbStock")
public class InvLhbStockController extends BaseController {
    private String prefix = "investment/invLhbStock";

    @Autowired
    private IInvLhbStockService invLhbStockService;

    @RequiresPermissions("investment:invLhbStock:view")
    @GetMapping()
    public String invLhbStock()
    {
        return prefix + "/invLhbStock";
    }

    /**
     * 查询个股龙虎榜列表
     */
    @RequiresPermissions("investment:invLhbStock:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(InvLhbStock invLhbStock) {
        startPage();
        List<InvLhbStock> list = invLhbStockService.selectInvLhbStockList(invLhbStock);
        return getDataTable(list);
    }

    /**
     * 导出个股龙虎榜列表
     */
    @RequiresPermissions("investment:invLhbStock:export")
    @Log(title = "个股龙虎榜", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(InvLhbStock invLhbStock) {
        List<InvLhbStock> list = invLhbStockService.selectInvLhbStockList(invLhbStock);
        ExcelUtil<InvLhbStock> util = new ExcelUtil<InvLhbStock>(InvLhbStock.class);
        return util.exportExcel(list, "个股龙虎榜数据");
    }

    /**
     * 新增个股龙虎榜
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存个股龙虎榜
     */
    @RequiresPermissions("investment:invLhbStock:add")
    @Log(title = "个股龙虎榜", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(InvLhbStock invLhbStock) {
        return toAjax(invLhbStockService.insertInvLhbStock(invLhbStock));
    }

    /**
     * 修改个股龙虎榜
     */
    @RequiresPermissions("investment:invLhbStock:edit")
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Integer id, ModelMap mmap) {
        InvLhbStock invLhbStock = invLhbStockService.selectInvLhbStockById(id);
        mmap.put("invLhbStock", invLhbStock);
        return prefix + "/edit";
    }

    /**
     * 修改保存个股龙虎榜
     */
    @RequiresPermissions("investment:invLhbStock:edit")
    @Log(title = "个股龙虎榜", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(InvLhbStock invLhbStock) {
        return toAjax(invLhbStockService.updateInvLhbStock(invLhbStock));
    }

    /**
     * 删除个股龙虎榜
     */
    @RequiresPermissions("investment:invLhbStock:remove")
    @Log(title = "个股龙虎榜", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids) {
        return toAjax(invLhbStockService.deleteInvLhbStockByIds(ids));
    }
}
