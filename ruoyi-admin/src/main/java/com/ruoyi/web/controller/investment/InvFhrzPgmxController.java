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
import com.ruoyi.investment.domain.InvFhrzPgmx;
import com.ruoyi.investment.service.IInvFhrzPgmxService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 配股明细Controller
 * 
 * @author yangwenyang
 * @date 2023-04-06
 */
@Controller
@RequestMapping("/investment/invFhrzPgmx")
public class InvFhrzPgmxController extends BaseController {
    private String prefix = "investment/invFhrzPgmx";

    @Autowired
    private IInvFhrzPgmxService invFhrzPgmxService;

    @RequiresPermissions("investment:invFhrzPgmx:view")
    @GetMapping()
    public String invFhrzPgmx()
    {
        return prefix + "/invFhrzPgmx";
    }

    /**
     * 查询配股明细列表
     */
    @RequiresPermissions("investment:invFhrzPgmx:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(InvFhrzPgmx invFhrzPgmx) {
        startPage();
        List<InvFhrzPgmx> list = invFhrzPgmxService.selectInvFhrzPgmxList(invFhrzPgmx);
        return getDataTable(list);
    }

    /**
     * 导出配股明细列表
     */
    @RequiresPermissions("investment:invFhrzPgmx:export")
    @Log(title = "配股明细", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(InvFhrzPgmx invFhrzPgmx) {
        List<InvFhrzPgmx> list = invFhrzPgmxService.selectInvFhrzPgmxList(invFhrzPgmx);
        ExcelUtil<InvFhrzPgmx> util = new ExcelUtil<InvFhrzPgmx>(InvFhrzPgmx.class);
        return util.exportExcel(list, "配股明细数据");
    }

    /**
     * 新增配股明细
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存配股明细
     */
    @RequiresPermissions("investment:invFhrzPgmx:add")
    @Log(title = "配股明细", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(InvFhrzPgmx invFhrzPgmx) {
        return toAjax(invFhrzPgmxService.insertInvFhrzPgmx(invFhrzPgmx));
    }

    /**
     * 修改配股明细
     */
    @RequiresPermissions("investment:invFhrzPgmx:edit")
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Integer id, ModelMap mmap) {
        InvFhrzPgmx invFhrzPgmx = invFhrzPgmxService.selectInvFhrzPgmxById(id);
        mmap.put("invFhrzPgmx", invFhrzPgmx);
        return prefix + "/edit";
    }

    /**
     * 修改保存配股明细
     */
    @RequiresPermissions("investment:invFhrzPgmx:edit")
    @Log(title = "配股明细", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(InvFhrzPgmx invFhrzPgmx) {
        return toAjax(invFhrzPgmxService.updateInvFhrzPgmx(invFhrzPgmx));
    }

    /**
     * 删除配股明细
     */
    @RequiresPermissions("investment:invFhrzPgmx:remove")
    @Log(title = "配股明细", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids) {
        return toAjax(invFhrzPgmxService.deleteInvFhrzPgmxByIds(ids));
    }
}
