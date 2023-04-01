package com.ruoyi.investment.service.impl;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.ruoyi.investment.mapper.InvKLineMapper;
import com.ruoyi.investment.domain.InvKLine;
import com.ruoyi.investment.service.IInvKLineService;
import com.ruoyi.common.core.text.Convert;

/**
 * 个股K线数据Service业务层处理
 * 
 * @author yangwenyang
 * @date 2023-04-01
 */
@Service
public class InvKLineServiceImpl implements IInvKLineService {
    @Resource
    private InvKLineMapper invKLineMapper;

    /**
     * 查询个股K线数据
     * 
     * @param id 个股K线数据主键
     * @return 个股K线数据
     */
    @Override
    public InvKLine selectInvKLineById(Integer id) {
        return invKLineMapper.selectInvKLineById(id);
    }

    /**
     * 查询个股K线数据列表
     * 
     * @param invKLine 个股K线数据
     * @return 个股K线数据
     */
    @Override
    public List<InvKLine> selectInvKLineList(InvKLine invKLine) {
        return invKLineMapper.selectInvKLineList(invKLine);
    }

    /**
     * 新增个股K线数据
     * 
     * @param invKLine 个股K线数据
     * @return 结果
     */
    @Override
    public int insertInvKLine(InvKLine invKLine) {
        return invKLineMapper.insertInvKLine(invKLine);
    }

    /**
     * 修改个股K线数据
     * 
     * @param invKLine 个股K线数据
     * @return 结果
     */
    @Override
    public int updateInvKLine(InvKLine invKLine) {
        return invKLineMapper.updateInvKLine(invKLine);
    }

    /**
     * 批量删除个股K线数据
     * 
     * @param ids 需要删除的个股K线数据主键
     * @return 结果
     */
    @Override
    public int deleteInvKLineByIds(String ids) {
        return invKLineMapper.deleteInvKLineByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除个股K线数据信息
     * 
     * @param id 个股K线数据主键
     * @return 结果
     */
    @Override
    public int deleteInvKLineById(Integer id) {
        return invKLineMapper.deleteInvKLineById(id);
    }
}
