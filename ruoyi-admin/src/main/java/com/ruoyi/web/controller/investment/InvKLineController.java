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
import com.ruoyi.investment.domain.InvKLine;
import com.ruoyi.investment.service.IInvKLineService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 个股K线数据Controller
 * 
 * @author yangwenyang
 * @date 2023-04-01
 */
@Controller
@RequestMapping("/investment/invKLine")
public class InvKLineController extends BaseController {
    private String prefix = "investment/invKLine";

    @Autowired
    private IInvKLineService invKLineService;

    @RequiresPermissions("investment:invKLine:view")
    @GetMapping()
    public String invKLine()
    {
        return prefix + "/invKLine";
    }

    /**
     * 查询个股K线数据列表
     */
    @RequiresPermissions("investment:invKLine:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(InvKLine invKLine) {
        startPage();
        List<InvKLine> list = invKLineService.selectInvKLineList(invKLine);
        return getDataTable(list);
    }

    /**
     * 导出个股K线数据列表
     */
    @RequiresPermissions("investment:invKLine:export")
    @Log(title = "个股K线数据", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(InvKLine invKLine) {
        List<InvKLine> list = invKLineService.selectInvKLineList(invKLine);
        ExcelUtil<InvKLine> util = new ExcelUtil<InvKLine>(InvKLine.class);
        return util.exportExcel(list, "个股K线数据数据");
    }

    /**
     * 新增个股K线数据
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存个股K线数据
     */
    @RequiresPermissions("investment:invKLine:add")
    @Log(title = "个股K线数据", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(InvKLine invKLine) {
        return toAjax(invKLineService.insertInvKLine(invKLine));
    }

    /**
     * 修改个股K线数据
     */
    @RequiresPermissions("investment:invKLine:edit")
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Integer id, ModelMap mmap) {
        InvKLine invKLine = invKLineService.selectInvKLineById(id);
        mmap.put("invKLine", invKLine);
        return prefix + "/edit";
    }

    /**
     * 修改保存个股K线数据
     */
    @RequiresPermissions("investment:invKLine:edit")
    @Log(title = "个股K线数据", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(InvKLine invKLine) {
        return toAjax(invKLineService.updateInvKLine(invKLine));
    }

    /**
     * 删除个股K线数据
     */
    @RequiresPermissions("investment:invKLine:remove")
    @Log(title = "个股K线数据", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids) {
        return toAjax(invKLineService.deleteInvKLineByIds(ids));
    }
}
