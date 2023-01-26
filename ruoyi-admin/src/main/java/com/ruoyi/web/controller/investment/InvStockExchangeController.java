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
import com.ruoyi.investment.domain.InvStockExchange;
import com.ruoyi.investment.service.IInvStockExchangeService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 证劵交易所Controller
 * 
 * @author yangwenyang
 * @date 2023-01-26
 */
@Controller
@RequestMapping("/investment/invStockExchange")
public class InvStockExchangeController extends BaseController {
    private String prefix = "investment/invStockExchange";

    @Autowired
    private IInvStockExchangeService invStockExchangeService;

    @RequiresPermissions("investment:invStockExchange:view")
    @GetMapping()
    public String invStockExchange()
    {
        return prefix + "/invStockExchange";
    }

    /**
     * 查询证劵交易所列表
     */
    @RequiresPermissions("investment:invStockExchange:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(InvStockExchange invStockExchange) {
        startPage();
        List<InvStockExchange> list = invStockExchangeService.selectInvStockExchangeList(invStockExchange);
        return getDataTable(list);
    }

    /**
     * 导出证劵交易所列表
     */
    @RequiresPermissions("investment:invStockExchange:export")
    @Log(title = "证劵交易所", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(InvStockExchange invStockExchange) {
        List<InvStockExchange> list = invStockExchangeService.selectInvStockExchangeList(invStockExchange);
        ExcelUtil<InvStockExchange> util = new ExcelUtil<InvStockExchange>(InvStockExchange.class);
        return util.exportExcel(list, "证劵交易所数据");
    }

    /**
     * 新增证劵交易所
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存证劵交易所
     */
    @RequiresPermissions("investment:invStockExchange:add")
    @Log(title = "证劵交易所", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(InvStockExchange invStockExchange) {
        return toAjax(invStockExchangeService.insertInvStockExchange(invStockExchange));
    }

    /**
     * 修改证劵交易所
     */
    @RequiresPermissions("investment:invStockExchange:edit")
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Integer id, ModelMap mmap) {
        InvStockExchange invStockExchange = invStockExchangeService.selectInvStockExchangeById(id);
        mmap.put("invStockExchange", invStockExchange);
        return prefix + "/edit";
    }

    /**
     * 修改保存证劵交易所
     */
    @RequiresPermissions("investment:invStockExchange:edit")
    @Log(title = "证劵交易所", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(InvStockExchange invStockExchange) {
        return toAjax(invStockExchangeService.updateInvStockExchange(invStockExchange));
    }

    /**
     * 删除证劵交易所
     */
    @RequiresPermissions("investment:invStockExchange:remove")
    @Log(title = "证劵交易所", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids) {
        return toAjax(invStockExchangeService.deleteInvStockExchangeByIds(ids));
    }
}
