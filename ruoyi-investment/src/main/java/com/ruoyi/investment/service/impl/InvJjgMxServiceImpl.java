package com.ruoyi.investment.service.impl;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.ruoyi.investment.mapper.InvJjgMxMapper;
import com.ruoyi.investment.domain.InvJjgMx;
import com.ruoyi.investment.service.IInvJjgMxService;
import com.ruoyi.common.core.text.Convert;

/**
 * 解禁股明细Service业务层处理
 * 
 * @author yangwenyang
 * @date 2023-02-03
 */
@Service
public class InvJjgMxServiceImpl implements IInvJjgMxService {
    @Resource
    private InvJjgMxMapper invJjgMxMapper;

    /**
     * 查询解禁股明细
     * 
     * @param id 解禁股明细主键
     * @return 解禁股明细
     */
    @Override
    public InvJjgMx selectInvJjgMxById(Integer id) {
        return invJjgMxMapper.selectInvJjgMxById(id);
    }

    /**
     * 查询解禁股明细列表
     * 
     * @param invJjgMx 解禁股明细
     * @return 解禁股明细
     */
    @Override
    public List<InvJjgMx> selectInvJjgMxList(InvJjgMx invJjgMx) {
        return invJjgMxMapper.selectInvJjgMxList(invJjgMx);
    }

    /**
     * 新增解禁股明细
     * 
     * @param invJjgMx 解禁股明细
     * @return 结果
     */
    @Override
    public int insertInvJjgMx(InvJjgMx invJjgMx) {
        return invJjgMxMapper.insertInvJjgMx(invJjgMx);
    }

    /**
     * 修改解禁股明细
     * 
     * @param invJjgMx 解禁股明细
     * @return 结果
     */
    @Override
    public int updateInvJjgMx(InvJjgMx invJjgMx) {
        return invJjgMxMapper.updateInvJjgMx(invJjgMx);
    }

    /**
     * 批量删除解禁股明细
     * 
     * @param ids 需要删除的解禁股明细主键
     * @return 结果
     */
    @Override
    public int deleteInvJjgMxByIds(String ids) {
        return invJjgMxMapper.deleteInvJjgMxByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除解禁股明细信息
     * 
     * @param id 解禁股明细主键
     * @return 结果
     */
    @Override
    public int deleteInvJjgMxById(Integer id) {
        return invJjgMxMapper.deleteInvJjgMxById(id);
    }
}
