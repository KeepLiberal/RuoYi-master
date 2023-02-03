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
import com.ruoyi.investment.domain.InvJjgMx;
import com.ruoyi.investment.service.IInvJjgMxService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 解禁股明细Controller
 * 
 * @author yangwenyang
 * @date 2023-02-03
 */
@Controller
@RequestMapping("/investment/invJjgMx")
public class InvJjgMxController extends BaseController {
    private String prefix = "investment/invJjgMx";

    @Autowired
    private IInvJjgMxService invJjgMxService;

    @RequiresPermissions("investment:invJjgMx:view")
    @GetMapping()
    public String invJjgMx()
    {
        return prefix + "/invJjgMx";
    }

    /**
     * 查询解禁股明细列表
     */
    @RequiresPermissions("investment:invJjgMx:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(InvJjgMx invJjgMx) {
        startPage();
        List<InvJjgMx> list = invJjgMxService.selectInvJjgMxList(invJjgMx);
        return getDataTable(list);
    }

    /**
     * 导出解禁股明细列表
     */
    @RequiresPermissions("investment:invJjgMx:export")
    @Log(title = "解禁股明细", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(InvJjgMx invJjgMx) {
        List<InvJjgMx> list = invJjgMxService.selectInvJjgMxList(invJjgMx);
        ExcelUtil<InvJjgMx> util = new ExcelUtil<InvJjgMx>(InvJjgMx.class);
        return util.exportExcel(list, "解禁股明细数据");
    }

    /**
     * 新增解禁股明细
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存解禁股明细
     */
    @RequiresPermissions("investment:invJjgMx:add")
    @Log(title = "解禁股明细", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(InvJjgMx invJjgMx) {
        return toAjax(invJjgMxService.insertInvJjgMx(invJjgMx));
    }

    /**
     * 修改解禁股明细
     */
    @RequiresPermissions("investment:invJjgMx:edit")
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Integer id, ModelMap mmap) {
        InvJjgMx invJjgMx = invJjgMxService.selectInvJjgMxById(id);
        mmap.put("invJjgMx", invJjgMx);
        return prefix + "/edit";
    }

    /**
     * 修改保存解禁股明细
     */
    @RequiresPermissions("investment:invJjgMx:edit")
    @Log(title = "解禁股明细", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(InvJjgMx invJjgMx) {
        return toAjax(invJjgMxService.updateInvJjgMx(invJjgMx));
    }

    /**
     * 删除解禁股明细
     */
    @RequiresPermissions("investment:invJjgMx:remove")
    @Log(title = "解禁股明细", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids) {
        return toAjax(invJjgMxService.deleteInvJjgMxByIds(ids));
    }
}
