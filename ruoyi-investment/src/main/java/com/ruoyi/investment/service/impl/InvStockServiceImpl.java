package com.ruoyi.investment.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.investment.mapper.InvStockMapper;
import com.ruoyi.investment.domain.InvStock;
import com.ruoyi.investment.service.IInvStockService;
import com.ruoyi.common.core.text.Convert;

/**
 * 沪深A股基本信息Service业务层处理
 * 
 * @author wenyong.yang
 * @date 2022-09-24
 */
@Service
public class InvStockServiceImpl implements IInvStockService 
{
    @Autowired
    private InvStockMapper invStockMapper;

    /**
     * 查询沪深A股基本信息
     * 
     * @param code 沪深A股基本信息主键
     * @return 沪深A股基本信息
     */
    @Override
    public InvStock selectInvStockByCode(String code)
    {
        return invStockMapper.selectInvStockByCode(code);
    }

    /**
     * 查询沪深A股基本信息列表
     * 
     * @param invStock 沪深A股基本信息
     * @return 沪深A股基本信息
     */
    @Override
    public List<InvStock> selectInvStockList(InvStock invStock)
    {
        return invStockMapper.selectInvStockList(invStock);
    }

    /**
     * 新增沪深A股基本信息
     * 
     * @param invStock 沪深A股基本信息
     * @return 结果
     */
    @Override
    public int insertInvStock(InvStock invStock)
    {
        return invStockMapper.insertInvStock(invStock);
    }

    /**
     * 修改沪深A股基本信息
     * 
     * @param invStock 沪深A股基本信息
     * @return 结果
     */
    @Override
    public int updateInvStock(InvStock invStock)
    {
        return invStockMapper.updateInvStock(invStock);
    }

    /**
     * 批量删除沪深A股基本信息
     * 
     * @param codes 需要删除的沪深A股基本信息主键
     * @return 结果
     */
    @Override
    public int deleteInvStockByCodes(String codes)
    {
        return invStockMapper.deleteInvStockByCodes(Convert.toStrArray(codes));
    }

    /**
     * 删除沪深A股基本信息信息
     * 
     * @param code 沪深A股基本信息主键
     * @return 结果
     */
    @Override
    public int deleteInvStockByCode(String code)
    {
        return invStockMapper.deleteInvStockByCode(code);
    }
}
