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
import com.ruoyi.investment.domain.InvDzjyMrmx;
import com.ruoyi.investment.service.IInvDzjyMrmxService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 大宗交易-每日明细Controller
 * 
 * @author yangwenyang
 * @date 2023-01-24
 */
@Controller
@RequestMapping("/investment/invDzjyMrmx")
public class InvDzjyMrmxController extends BaseController {
    private String prefix = "investment/invDzjyMrmx";

    @Autowired
    private IInvDzjyMrmxService invDzjyMrmxService;

    @RequiresPermissions("investment:invDzjyMrmx:view")
    @GetMapping()
    public String invDzjyMrmx()
    {
        return prefix + "/invDzjyMrmx";
    }

    /**
     * 查询大宗交易-每日明细列表
     */
    @RequiresPermissions("investment:invDzjyMrmx:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(InvDzjyMrmx invDzjyMrmx) {
        startPage();
        List<InvDzjyMrmx> list = invDzjyMrmxService.selectInvDzjyMrmxList(invDzjyMrmx);
        return getDataTable(list);
    }

    /**
     * 导出大宗交易-每日明细列表
     */
    @RequiresPermissions("investment:invDzjyMrmx:export")
    @Log(title = "大宗交易-每日明细", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(InvDzjyMrmx invDzjyMrmx) {
        List<InvDzjyMrmx> list = invDzjyMrmxService.selectInvDzjyMrmxList(invDzjyMrmx);
        ExcelUtil<InvDzjyMrmx> util = new ExcelUtil<InvDzjyMrmx>(InvDzjyMrmx.class);
        return util.exportExcel(list, "大宗交易-每日明细数据");
    }

    /**
     * 新增大宗交易-每日明细
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存大宗交易-每日明细
     */
    @RequiresPermissions("investment:invDzjyMrmx:add")
    @Log(title = "大宗交易-每日明细", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(InvDzjyMrmx invDzjyMrmx) {
        return toAjax(invDzjyMrmxService.insertInvDzjyMrmx(invDzjyMrmx));
    }

    /**
     * 修改大宗交易-每日明细
     */
    @RequiresPermissions("investment:invDzjyMrmx:edit")
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Integer id, ModelMap mmap) {
        InvDzjyMrmx invDzjyMrmx = invDzjyMrmxService.selectInvDzjyMrmxById(id);
        mmap.put("invDzjyMrmx", invDzjyMrmx);
        return prefix + "/edit";
    }

    /**
     * 修改保存大宗交易-每日明细
     */
    @RequiresPermissions("investment:invDzjyMrmx:edit")
    @Log(title = "大宗交易-每日明细", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(InvDzjyMrmx invDzjyMrmx) {
        return toAjax(invDzjyMrmxService.updateInvDzjyMrmx(invDzjyMrmx));
    }

    /**
     * 删除大宗交易-每日明细
     */
    @RequiresPermissions("investment:invDzjyMrmx:remove")
    @Log(title = "大宗交易-每日明细", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids) {
        return toAjax(invDzjyMrmxService.deleteInvDzjyMrmxByIds(ids));
    }
}
