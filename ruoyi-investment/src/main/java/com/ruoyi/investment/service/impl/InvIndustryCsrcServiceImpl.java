package com.ruoyi.investment.service.impl;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.ruoyi.investment.mapper.InvIndustryCsrcMapper;
import com.ruoyi.investment.domain.InvIndustryCsrc;
import com.ruoyi.investment.service.IInvIndustryCsrcService;
import com.ruoyi.common.core.text.Convert;

/**
 * 证监会行业Service业务层处理
 * 
 * @author yangwenyang
 * @date 2023-01-11
 */
@Service
public class InvIndustryCsrcServiceImpl implements IInvIndustryCsrcService {
    @Resource
    private InvIndustryCsrcMapper invIndustryCsrcMapper;

    /**
     * 查询证监会行业
     * 
     * @param id 证监会行业主键
     * @return 证监会行业
     */
    @Override
    public InvIndustryCsrc selectInvIndustryCsrcById(Integer id) {
        return invIndustryCsrcMapper.selectInvIndustryCsrcById(id);
    }

    /**
     * 查询证监会行业列表
     * 
     * @param invIndustryCsrc 证监会行业
     * @return 证监会行业
     */
    @Override
    public List<InvIndustryCsrc> selectInvIndustryCsrcList(InvIndustryCsrc invIndustryCsrc) {
        return invIndustryCsrcMapper.selectInvIndustryCsrcList(invIndustryCsrc);
    }

    /**
     * 新增证监会行业
     * 
     * @param invIndustryCsrc 证监会行业
     * @return 结果
     */
    @Override
    public int insertInvIndustryCsrc(InvIndustryCsrc invIndustryCsrc) {
        return invIndustryCsrcMapper.insertInvIndustryCsrc(invIndustryCsrc);
    }

    /**
     * 修改证监会行业
     * 
     * @param invIndustryCsrc 证监会行业
     * @return 结果
     */
    @Override
    public int updateInvIndustryCsrc(InvIndustryCsrc invIndustryCsrc) {
        return invIndustryCsrcMapper.updateInvIndustryCsrc(invIndustryCsrc);
    }

    /**
     * 批量删除证监会行业
     * 
     * @param ids 需要删除的证监会行业主键
     * @return 结果
     */
    @Override
    public int deleteInvIndustryCsrcByIds(String ids) {
        return invIndustryCsrcMapper.deleteInvIndustryCsrcByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除证监会行业信息
     * 
     * @param id 证监会行业主键
     * @return 结果
     */
    @Override
    public int deleteInvIndustryCsrcById(Integer id) {
        return invIndustryCsrcMapper.deleteInvIndustryCsrcById(id);
    }
}
