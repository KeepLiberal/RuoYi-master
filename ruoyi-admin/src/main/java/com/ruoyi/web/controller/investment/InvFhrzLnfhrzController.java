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
import com.ruoyi.investment.domain.InvFhrzLnfhrz;
import com.ruoyi.investment.service.IInvFhrzLnfhrzService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 历年分红融资Controller
 * 
 * @author yangwenyang
 * @date 2023-04-06
 */
@Controller
@RequestMapping("/investment/invFhrzLnfhrz")
public class InvFhrzLnfhrzController extends BaseController {
    private String prefix = "investment/invFhrzLnfhrz";

    @Autowired
    private IInvFhrzLnfhrzService invFhrzLnfhrzService;

    @RequiresPermissions("investment:invFhrzLnfhrz:view")
    @GetMapping()
    public String invFhrzLnfhrz()
    {
        return prefix + "/invFhrzLnfhrz";
    }

    /**
     * 查询历年分红融资列表
     */
    @RequiresPermissions("investment:invFhrzLnfhrz:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(InvFhrzLnfhrz invFhrzLnfhrz) {
        startPage();
        List<InvFhrzLnfhrz> list = invFhrzLnfhrzService.selectInvFhrzLnfhrzList(invFhrzLnfhrz);
        return getDataTable(list);
    }

    /**
     * 导出历年分红融资列表
     */
    @RequiresPermissions("investment:invFhrzLnfhrz:export")
    @Log(title = "历年分红融资", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(InvFhrzLnfhrz invFhrzLnfhrz) {
        List<InvFhrzLnfhrz> list = invFhrzLnfhrzService.selectInvFhrzLnfhrzList(invFhrzLnfhrz);
        ExcelUtil<InvFhrzLnfhrz> util = new ExcelUtil<InvFhrzLnfhrz>(InvFhrzLnfhrz.class);
        return util.exportExcel(list, "历年分红融资数据");
    }

    /**
     * 新增历年分红融资
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存历年分红融资
     */
    @RequiresPermissions("investment:invFhrzLnfhrz:add")
    @Log(title = "历年分红融资", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(InvFhrzLnfhrz invFhrzLnfhrz) {
        return toAjax(invFhrzLnfhrzService.insertInvFhrzLnfhrz(invFhrzLnfhrz));
    }

    /**
     * 修改历年分红融资
     */
    @RequiresPermissions("investment:invFhrzLnfhrz:edit")
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Integer id, ModelMap mmap) {
        InvFhrzLnfhrz invFhrzLnfhrz = invFhrzLnfhrzService.selectInvFhrzLnfhrzById(id);
        mmap.put("invFhrzLnfhrz", invFhrzLnfhrz);
        return prefix + "/edit";
    }

    /**
     * 修改保存历年分红融资
     */
    @RequiresPermissions("investment:invFhrzLnfhrz:edit")
    @Log(title = "历年分红融资", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(InvFhrzLnfhrz invFhrzLnfhrz) {
        return toAjax(invFhrzLnfhrzService.updateInvFhrzLnfhrz(invFhrzLnfhrz));
    }

    /**
     * 删除历年分红融资
     */
    @RequiresPermissions("investment:invFhrzLnfhrz:remove")
    @Log(title = "历年分红融资", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids) {
        return toAjax(invFhrzLnfhrzService.deleteInvFhrzLnfhrzByIds(ids));
    }
}
