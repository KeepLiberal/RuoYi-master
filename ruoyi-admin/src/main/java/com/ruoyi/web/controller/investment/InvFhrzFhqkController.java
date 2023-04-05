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
import com.ruoyi.investment.domain.InvFhrzFhqk;
import com.ruoyi.investment.service.IInvFhrzFhqkService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 分红情况Controller
 * 
 * @author yangwenyang
 * @date 2023-04-06
 */
@Controller
@RequestMapping("/investment/invFhrzFhqk")
public class InvFhrzFhqkController extends BaseController {
    private String prefix = "investment/invFhrzFhqk";

    @Autowired
    private IInvFhrzFhqkService invFhrzFhqkService;

    @RequiresPermissions("investment:invFhrzFhqk:view")
    @GetMapping()
    public String invFhrzFhqk()
    {
        return prefix + "/invFhrzFhqk";
    }

    /**
     * 查询分红情况列表
     */
    @RequiresPermissions("investment:invFhrzFhqk:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(InvFhrzFhqk invFhrzFhqk) {
        startPage();
        List<InvFhrzFhqk> list = invFhrzFhqkService.selectInvFhrzFhqkList(invFhrzFhqk);
        return getDataTable(list);
    }

    /**
     * 导出分红情况列表
     */
    @RequiresPermissions("investment:invFhrzFhqk:export")
    @Log(title = "分红情况", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(InvFhrzFhqk invFhrzFhqk) {
        List<InvFhrzFhqk> list = invFhrzFhqkService.selectInvFhrzFhqkList(invFhrzFhqk);
        ExcelUtil<InvFhrzFhqk> util = new ExcelUtil<InvFhrzFhqk>(InvFhrzFhqk.class);
        return util.exportExcel(list, "分红情况数据");
    }

    /**
     * 新增分红情况
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存分红情况
     */
    @RequiresPermissions("investment:invFhrzFhqk:add")
    @Log(title = "分红情况", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(InvFhrzFhqk invFhrzFhqk) {
        return toAjax(invFhrzFhqkService.insertInvFhrzFhqk(invFhrzFhqk));
    }

    /**
     * 修改分红情况
     */
    @RequiresPermissions("investment:invFhrzFhqk:edit")
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Integer id, ModelMap mmap) {
        InvFhrzFhqk invFhrzFhqk = invFhrzFhqkService.selectInvFhrzFhqkById(id);
        mmap.put("invFhrzFhqk", invFhrzFhqk);
        return prefix + "/edit";
    }

    /**
     * 修改保存分红情况
     */
    @RequiresPermissions("investment:invFhrzFhqk:edit")
    @Log(title = "分红情况", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(InvFhrzFhqk invFhrzFhqk) {
        return toAjax(invFhrzFhqkService.updateInvFhrzFhqk(invFhrzFhqk));
    }

    /**
     * 删除分红情况
     */
    @RequiresPermissions("investment:invFhrzFhqk:remove")
    @Log(title = "分红情况", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids) {
        return toAjax(invFhrzFhqkService.deleteInvFhrzFhqkByIds(ids));
    }
}
