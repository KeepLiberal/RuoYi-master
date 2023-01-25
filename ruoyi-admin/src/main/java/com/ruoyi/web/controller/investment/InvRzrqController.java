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
import com.ruoyi.investment.domain.InvRzrq;
import com.ruoyi.investment.service.IInvRzrqService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 融资融券Controller
 * 
 * @author yangwenyang
 * @date 2023-01-22
 */
@Controller
@RequestMapping("/investment/invRzrq")
public class InvRzrqController extends BaseController {
    private String prefix = "investment/invRzrq";

    @Autowired
    private IInvRzrqService invRzrqService;

    @RequiresPermissions("investment:invRzrq:view")
    @GetMapping()
    public String invRzrq()
    {
        return prefix + "/invRzrq";
    }

    /**
     * 查询融资融券列表
     */
    @RequiresPermissions("investment:invRzrq:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(InvRzrq invRzrq) {
        startPage();
        List<InvRzrq> list = invRzrqService.selectInvRzrqList(invRzrq);
        return getDataTable(list);
    }

    /**
     * 导出融资融券列表
     */
    @RequiresPermissions("investment:invRzrq:export")
    @Log(title = "融资融券", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(InvRzrq invRzrq) {
        List<InvRzrq> list = invRzrqService.selectInvRzrqList(invRzrq);
        ExcelUtil<InvRzrq> util = new ExcelUtil<InvRzrq>(InvRzrq.class);
        return util.exportExcel(list, "融资融券数据");
    }

    /**
     * 新增融资融券
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存融资融券
     */
    @RequiresPermissions("investment:invRzrq:add")
    @Log(title = "融资融券", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(InvRzrq invRzrq) {
        return toAjax(invRzrqService.insertInvRzrq(invRzrq));
    }

    /**
     * 修改融资融券
     */
    @RequiresPermissions("investment:invRzrq:edit")
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Integer id, ModelMap mmap) {
        InvRzrq invRzrq = invRzrqService.selectInvRzrqById(id);
        mmap.put("invRzrq", invRzrq);
        return prefix + "/edit";
    }

    /**
     * 修改保存融资融券
     */
    @RequiresPermissions("investment:invRzrq:edit")
    @Log(title = "融资融券", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(InvRzrq invRzrq) {
        return toAjax(invRzrqService.updateInvRzrq(invRzrq));
    }

    /**
     * 删除融资融券
     */
    @RequiresPermissions("investment:invRzrq:remove")
    @Log(title = "融资融券", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids) {
        return toAjax(invRzrqService.deleteInvRzrqByIds(ids));
    }
}
