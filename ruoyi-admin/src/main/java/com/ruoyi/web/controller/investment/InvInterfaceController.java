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
import com.ruoyi.investment.domain.InvInterface;
import com.ruoyi.investment.service.IInvInterfaceService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 接口配置Controller
 * 
 * @author yangwenyang
 * @date 2023-01-02
 */
@Controller
@RequestMapping("/investment/invInterface")
public class InvInterfaceController extends BaseController {
    private String prefix = "investment/invInterface";

    @Autowired
    private IInvInterfaceService invInterfaceService;

    @RequiresPermissions("investment:invInterface:view")
    @GetMapping()
    public String invInterface()
    {
        return prefix + "/invInterface";
    }

    /**
     * 查询接口配置列表
     */
    @RequiresPermissions("investment:invInterface:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(InvInterface invInterface) {
        startPage();
        List<InvInterface> list = invInterfaceService.selectInvInterfaceList(invInterface);
        return getDataTable(list);
    }

    /**
     * 导出接口配置列表
     */
    @RequiresPermissions("investment:invInterface:export")
    @Log(title = "接口配置", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(InvInterface invInterface) {
        List<InvInterface> list = invInterfaceService.selectInvInterfaceList(invInterface);
        ExcelUtil<InvInterface> util = new ExcelUtil<InvInterface>(InvInterface.class);
        return util.exportExcel(list, "接口配置数据");
    }

    /**
     * 新增接口配置
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存接口配置
     */
    @RequiresPermissions("investment:invInterface:add")
    @Log(title = "接口配置", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(InvInterface invInterface) {
        return toAjax(invInterfaceService.insertInvInterface(invInterface));
    }

    /**
     * 修改接口配置
     */
    @RequiresPermissions("investment:invInterface:edit")
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap) {
        InvInterface invInterface = invInterfaceService.selectInvInterfaceById(id);
        mmap.put("invInterface", invInterface);
        return prefix + "/edit";
    }

    /**
     * 修改保存接口配置
     */
    @RequiresPermissions("investment:invInterface:edit")
    @Log(title = "接口配置", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(InvInterface invInterface) {
        return toAjax(invInterfaceService.updateInvInterface(invInterface));
    }

    /**
     * 删除接口配置
     */
    @RequiresPermissions("investment:invInterface:remove")
    @Log(title = "接口配置", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids) {
        return toAjax(invInterfaceService.deleteInvInterfaceByIds(ids));
    }
}
