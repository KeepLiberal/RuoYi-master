package com.ruoyi.investment.service.impl;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.ruoyi.investment.mapper.InvFhrzFhqkMapper;
import com.ruoyi.investment.domain.InvFhrzFhqk;
import com.ruoyi.investment.service.IInvFhrzFhqkService;
import com.ruoyi.common.core.text.Convert;

/**
 * 分红情况Service业务层处理
 * 
 * @author yangwenyang
 * @date 2023-04-06
 */
@Service
public class InvFhrzFhqkServiceImpl implements IInvFhrzFhqkService {
    @Resource
    private InvFhrzFhqkMapper invFhrzFhqkMapper;

    /**
     * 查询分红情况
     * 
     * @param id 分红情况主键
     * @return 分红情况
     */
    @Override
    public InvFhrzFhqk selectInvFhrzFhqkById(Integer id) {
        return invFhrzFhqkMapper.selectInvFhrzFhqkById(id);
    }

    /**
     * 查询分红情况列表
     * 
     * @param invFhrzFhqk 分红情况
     * @return 分红情况
     */
    @Override
    public List<InvFhrzFhqk> selectInvFhrzFhqkList(InvFhrzFhqk invFhrzFhqk) {
        return invFhrzFhqkMapper.selectInvFhrzFhqkList(invFhrzFhqk);
    }

    /**
     * 新增分红情况
     * 
     * @param invFhrzFhqk 分红情况
     * @return 结果
     */
    @Override
    public int insertInvFhrzFhqk(InvFhrzFhqk invFhrzFhqk) {
        return invFhrzFhqkMapper.insertInvFhrzFhqk(invFhrzFhqk);
    }

    /**
     * 修改分红情况
     * 
     * @param invFhrzFhqk 分红情况
     * @return 结果
     */
    @Override
    public int updateInvFhrzFhqk(InvFhrzFhqk invFhrzFhqk) {
        return invFhrzFhqkMapper.updateInvFhrzFhqk(invFhrzFhqk);
    }

    /**
     * 批量删除分红情况
     * 
     * @param ids 需要删除的分红情况主键
     * @return 结果
     */
    @Override
    public int deleteInvFhrzFhqkByIds(String ids) {
        return invFhrzFhqkMapper.deleteInvFhrzFhqkByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除分红情况信息
     * 
     * @param id 分红情况主键
     * @return 结果
     */
    @Override
    public int deleteInvFhrzFhqkById(Integer id) {
        return invFhrzFhqkMapper.deleteInvFhrzFhqkById(id);
    }
}
