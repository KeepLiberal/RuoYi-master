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
import com.ruoyi.investment.domain.InvDzjyMrtj;
import com.ruoyi.investment.service.IInvDzjyMrtjService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 大宗交易-每日统计Controller
 * 
 * @author yangwenyang
 * @date 2023-01-26
 */
@Controller
@RequestMapping("/investment/invDzjyMrtj")
public class InvDzjyMrtjController extends BaseController {
    private String prefix = "investment/invDzjyMrtj";

    @Autowired
    private IInvDzjyMrtjService invDzjyMrtjService;

    @RequiresPermissions("investment:invDzjyMrtj:view")
    @GetMapping()
    public String invDzjyMrtj()
    {
        return prefix + "/invDzjyMrtj";
    }

    /**
     * 查询大宗交易-每日统计列表
     */
    @RequiresPermissions("investment:invDzjyMrtj:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(InvDzjyMrtj invDzjyMrtj) {
        startPage();
        List<InvDzjyMrtj> list = invDzjyMrtjService.selectInvDzjyMrtjList(invDzjyMrtj);
        return getDataTable(list);
    }

    /**
     * 导出大宗交易-每日统计列表
     */
    @RequiresPermissions("investment:invDzjyMrtj:export")
    @Log(title = "大宗交易-每日统计", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(InvDzjyMrtj invDzjyMrtj) {
        List<InvDzjyMrtj> list = invDzjyMrtjService.selectInvDzjyMrtjList(invDzjyMrtj);
        ExcelUtil<InvDzjyMrtj> util = new ExcelUtil<InvDzjyMrtj>(InvDzjyMrtj.class);
        return util.exportExcel(list, "大宗交易-每日统计数据");
    }

    /**
     * 新增大宗交易-每日统计
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存大宗交易-每日统计
     */
    @RequiresPermissions("investment:invDzjyMrtj:add")
    @Log(title = "大宗交易-每日统计", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(InvDzjyMrtj invDzjyMrtj) {
        return toAjax(invDzjyMrtjService.insertInvDzjyMrtj(invDzjyMrtj));
    }

    /**
     * 修改大宗交易-每日统计
     */
    @RequiresPermissions("investment:invDzjyMrtj:edit")
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Integer id, ModelMap mmap) {
        InvDzjyMrtj invDzjyMrtj = invDzjyMrtjService.selectInvDzjyMrtjById(id);
        mmap.put("invDzjyMrtj", invDzjyMrtj);
        return prefix + "/edit";
    }

    /**
     * 修改保存大宗交易-每日统计
     */
    @RequiresPermissions("investment:invDzjyMrtj:edit")
    @Log(title = "大宗交易-每日统计", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(InvDzjyMrtj invDzjyMrtj) {
        return toAjax(invDzjyMrtjService.updateInvDzjyMrtj(invDzjyMrtj));
    }

    /**
     * 删除大宗交易-每日统计
     */
    @RequiresPermissions("investment:invDzjyMrtj:remove")
    @Log(title = "大宗交易-每日统计", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids) {
        return toAjax(invDzjyMrtjService.deleteInvDzjyMrtjByIds(ids));
    }
}
