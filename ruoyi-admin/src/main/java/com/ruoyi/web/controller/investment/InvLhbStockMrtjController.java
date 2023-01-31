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
import com.ruoyi.investment.domain.InvLhbStockMrtj;
import com.ruoyi.investment.service.IInvLhbStockMrtjService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 个股龙虎榜统计Controller
 * 
 * @author yangwenyang
 * @date 2023-01-31
 */
@Controller
@RequestMapping("/investment/invLhbStockMrtj")
public class InvLhbStockMrtjController extends BaseController {
    private String prefix = "investment/invLhbStockMrtj";

    @Autowired
    private IInvLhbStockMrtjService invLhbStockMrtjService;

    @RequiresPermissions("investment:invLhbStockMrtj:view")
    @GetMapping()
    public String invLhbStockMrtj()
    {
        return prefix + "/invLhbStockMrtj";
    }

    /**
     * 查询个股龙虎榜统计列表
     */
    @RequiresPermissions("investment:invLhbStockMrtj:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(InvLhbStockMrtj invLhbStockMrtj) {
        startPage();
        List<InvLhbStockMrtj> list = invLhbStockMrtjService.selectInvLhbStockMrtjList(invLhbStockMrtj);
        return getDataTable(list);
    }

    /**
     * 导出个股龙虎榜统计列表
     */
    @RequiresPermissions("investment:invLhbStockMrtj:export")
    @Log(title = "个股龙虎榜统计", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(InvLhbStockMrtj invLhbStockMrtj) {
        List<InvLhbStockMrtj> list = invLhbStockMrtjService.selectInvLhbStockMrtjList(invLhbStockMrtj);
        ExcelUtil<InvLhbStockMrtj> util = new ExcelUtil<InvLhbStockMrtj>(InvLhbStockMrtj.class);
        return util.exportExcel(list, "个股龙虎榜统计数据");
    }

    /**
     * 新增个股龙虎榜统计
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存个股龙虎榜统计
     */
    @RequiresPermissions("investment:invLhbStockMrtj:add")
    @Log(title = "个股龙虎榜统计", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(InvLhbStockMrtj invLhbStockMrtj) {
        return toAjax(invLhbStockMrtjService.insertInvLhbStockMrtj(invLhbStockMrtj));
    }

    /**
     * 修改个股龙虎榜统计
     */
    @RequiresPermissions("investment:invLhbStockMrtj:edit")
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Integer id, ModelMap mmap) {
        InvLhbStockMrtj invLhbStockMrtj = invLhbStockMrtjService.selectInvLhbStockMrtjById(id);
        mmap.put("invLhbStockMrtj", invLhbStockMrtj);
        return prefix + "/edit";
    }

    /**
     * 修改保存个股龙虎榜统计
     */
    @RequiresPermissions("investment:invLhbStockMrtj:edit")
    @Log(title = "个股龙虎榜统计", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(InvLhbStockMrtj invLhbStockMrtj) {
        return toAjax(invLhbStockMrtjService.updateInvLhbStockMrtj(invLhbStockMrtj));
    }

    /**
     * 删除个股龙虎榜统计
     */
    @RequiresPermissions("investment:invLhbStockMrtj:remove")
    @Log(title = "个股龙虎榜统计", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids) {
        return toAjax(invLhbStockMrtjService.deleteInvLhbStockMrtjByIds(ids));
    }
}
