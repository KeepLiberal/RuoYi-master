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
import com.ruoyi.investment.domain.InvLhbStockMrmx;
import com.ruoyi.investment.service.IInvLhbStockMrmxService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 个股龙虎榜明细Controller
 * 
 * @author yangwenyang
 * @date 2023-01-31
 */
@Controller
@RequestMapping("/investment/invLhbStockMrmx")
public class InvLhbStockMrmxController extends BaseController {
    private String prefix = "investment/invLhbStockMrmx";

    @Autowired
    private IInvLhbStockMrmxService invLhbStockMrmxService;

    @RequiresPermissions("investment:invLhbStockMrmx:view")
    @GetMapping()
    public String invLhbStockMrmx()
    {
        return prefix + "/invLhbStockMrmx";
    }

    /**
     * 查询个股龙虎榜明细列表
     */
    @RequiresPermissions("investment:invLhbStockMrmx:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(InvLhbStockMrmx invLhbStockMrmx) {
        startPage();
        List<InvLhbStockMrmx> list = invLhbStockMrmxService.selectInvLhbStockMrmxList(invLhbStockMrmx);
        return getDataTable(list);
    }

    /**
     * 导出个股龙虎榜明细列表
     */
    @RequiresPermissions("investment:invLhbStockMrmx:export")
    @Log(title = "个股龙虎榜明细", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(InvLhbStockMrmx invLhbStockMrmx) {
        List<InvLhbStockMrmx> list = invLhbStockMrmxService.selectInvLhbStockMrmxList(invLhbStockMrmx);
        ExcelUtil<InvLhbStockMrmx> util = new ExcelUtil<InvLhbStockMrmx>(InvLhbStockMrmx.class);
        return util.exportExcel(list, "个股龙虎榜明细数据");
    }

    /**
     * 新增个股龙虎榜明细
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存个股龙虎榜明细
     */
    @RequiresPermissions("investment:invLhbStockMrmx:add")
    @Log(title = "个股龙虎榜明细", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(InvLhbStockMrmx invLhbStockMrmx) {
        return toAjax(invLhbStockMrmxService.insertInvLhbStockMrmx(invLhbStockMrmx));
    }

    /**
     * 修改个股龙虎榜明细
     */
    @RequiresPermissions("investment:invLhbStockMrmx:edit")
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Integer id, ModelMap mmap) {
        InvLhbStockMrmx invLhbStockMrmx = invLhbStockMrmxService.selectInvLhbStockMrmxById(id);
        mmap.put("invLhbStockMrmx", invLhbStockMrmx);
        return prefix + "/edit";
    }

    /**
     * 修改保存个股龙虎榜明细
     */
    @RequiresPermissions("investment:invLhbStockMrmx:edit")
    @Log(title = "个股龙虎榜明细", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(InvLhbStockMrmx invLhbStockMrmx) {
        return toAjax(invLhbStockMrmxService.updateInvLhbStockMrmx(invLhbStockMrmx));
    }

    /**
     * 删除个股龙虎榜明细
     */
    @RequiresPermissions("investment:invLhbStockMrmx:remove")
    @Log(title = "个股龙虎榜明细", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids) {
        return toAjax(invLhbStockMrmxService.deleteInvLhbStockMrmxByIds(ids));
    }
}
