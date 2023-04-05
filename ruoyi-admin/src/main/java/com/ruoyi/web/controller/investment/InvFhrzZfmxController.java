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
import com.ruoyi.investment.domain.InvFhrzZfmx;
import com.ruoyi.investment.service.IInvFhrzZfmxService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 增发明细Controller
 * 
 * @author yangwenyang
 * @date 2023-04-06
 */
@Controller
@RequestMapping("/investment/invFhrzZfmx")
public class InvFhrzZfmxController extends BaseController {
    private String prefix = "investment/invFhrzZfmx";

    @Autowired
    private IInvFhrzZfmxService invFhrzZfmxService;

    @RequiresPermissions("investment:invFhrzZfmx:view")
    @GetMapping()
    public String invFhrzZfmx()
    {
        return prefix + "/invFhrzZfmx";
    }

    /**
     * 查询增发明细列表
     */
    @RequiresPermissions("investment:invFhrzZfmx:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(InvFhrzZfmx invFhrzZfmx) {
        startPage();
        List<InvFhrzZfmx> list = invFhrzZfmxService.selectInvFhrzZfmxList(invFhrzZfmx);
        return getDataTable(list);
    }

    /**
     * 导出增发明细列表
     */
    @RequiresPermissions("investment:invFhrzZfmx:export")
    @Log(title = "增发明细", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(InvFhrzZfmx invFhrzZfmx) {
        List<InvFhrzZfmx> list = invFhrzZfmxService.selectInvFhrzZfmxList(invFhrzZfmx);
        ExcelUtil<InvFhrzZfmx> util = new ExcelUtil<InvFhrzZfmx>(InvFhrzZfmx.class);
        return util.exportExcel(list, "增发明细数据");
    }

    /**
     * 新增增发明细
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存增发明细
     */
    @RequiresPermissions("investment:invFhrzZfmx:add")
    @Log(title = "增发明细", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(InvFhrzZfmx invFhrzZfmx) {
        return toAjax(invFhrzZfmxService.insertInvFhrzZfmx(invFhrzZfmx));
    }

    /**
     * 修改增发明细
     */
    @RequiresPermissions("investment:invFhrzZfmx:edit")
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Integer id, ModelMap mmap) {
        InvFhrzZfmx invFhrzZfmx = invFhrzZfmxService.selectInvFhrzZfmxById(id);
        mmap.put("invFhrzZfmx", invFhrzZfmx);
        return prefix + "/edit";
    }

    /**
     * 修改保存增发明细
     */
    @RequiresPermissions("investment:invFhrzZfmx:edit")
    @Log(title = "增发明细", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(InvFhrzZfmx invFhrzZfmx) {
        return toAjax(invFhrzZfmxService.updateInvFhrzZfmx(invFhrzZfmx));
    }

    /**
     * 删除增发明细
     */
    @RequiresPermissions("investment:invFhrzZfmx:remove")
    @Log(title = "增发明细", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids) {
        return toAjax(invFhrzZfmxService.deleteInvFhrzZfmxByIds(ids));
    }
}
