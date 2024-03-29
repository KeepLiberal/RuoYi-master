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
import com.ruoyi.investment.domain.InvCompany;
import com.ruoyi.investment.service.IInvCompanyService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 沪深A股公司概况Controller
 * 
 * @author yangwenyang
 * @date 2023-01-19
 */
@Controller
@RequestMapping("/investment/invCompany")
public class InvCompanyController extends BaseController {
    private String prefix = "investment/invCompany";

    @Autowired
    private IInvCompanyService invCompanyService;

    @RequiresPermissions("investment:invCompany:view")
    @GetMapping()
    public String invCompany()
    {
        return prefix + "/invCompany";
    }

    /**
     * 查询沪深A股公司概况列表
     */
    @RequiresPermissions("investment:invCompany:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(InvCompany invCompany) {
        startPage();
        List<InvCompany> list = invCompanyService.selectInvCompanyList(invCompany);
        return getDataTable(list);
    }

    /**
     * 导出沪深A股公司概况列表
     */
    @RequiresPermissions("investment:invCompany:export")
    @Log(title = "沪深A股公司概况", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(InvCompany invCompany) {
        List<InvCompany> list = invCompanyService.selectInvCompanyList(invCompany);
        ExcelUtil<InvCompany> util = new ExcelUtil<InvCompany>(InvCompany.class);
        return util.exportExcel(list, "沪深A股公司概况数据");
    }

    /**
     * 新增沪深A股公司概况
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存沪深A股公司概况
     */
    @RequiresPermissions("investment:invCompany:add")
    @Log(title = "沪深A股公司概况", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(InvCompany invCompany) {
        return toAjax(invCompanyService.insertInvCompany(invCompany));
    }

    /**
     * 修改沪深A股公司概况
     */
    @RequiresPermissions("investment:invCompany:edit")
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Integer id, ModelMap mmap) {
        InvCompany invCompany = invCompanyService.selectInvCompanyById(id);
        mmap.put("invCompany", invCompany);
        return prefix + "/edit";
    }

    /**
     * 修改保存沪深A股公司概况
     */
    @RequiresPermissions("investment:invCompany:edit")
    @Log(title = "沪深A股公司概况", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(InvCompany invCompany) {
        return toAjax(invCompanyService.updateInvCompany(invCompany));
    }

    /**
     * 删除沪深A股公司概况
     */
    @RequiresPermissions("investment:invCompany:remove")
    @Log(title = "沪深A股公司概况", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids) {
        return toAjax(invCompanyService.deleteInvCompanyByIds(ids));
    }
}
