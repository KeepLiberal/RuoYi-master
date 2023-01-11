package com.ruoyi.investment.service.impl;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.ruoyi.investment.mapper.InvCompanyIndustryCsrcMapper;
import com.ruoyi.investment.domain.InvCompanyIndustryCsrc;
import com.ruoyi.investment.service.IInvCompanyIndustryCsrcService;
import com.ruoyi.common.core.text.Convert;

/**
 * 所属证监会行业Service业务层处理
 * 
 * @author yangwenyang
 * @date 2023-01-11
 */
@Service
public class InvCompanyIndustryCsrcServiceImpl implements IInvCompanyIndustryCsrcService {
    @Resource
    private InvCompanyIndustryCsrcMapper invCompanyIndustryCsrcMapper;

    /**
     * 查询所属证监会行业
     * 
     * @param id 所属证监会行业主键
     * @return 所属证监会行业
     */
    @Override
    public InvCompanyIndustryCsrc selectInvCompanyIndustryCsrcById(Integer id) {
        return invCompanyIndustryCsrcMapper.selectInvCompanyIndustryCsrcById(id);
    }

    /**
     * 查询所属证监会行业列表
     * 
     * @param invCompanyIndustryCsrc 所属证监会行业
     * @return 所属证监会行业
     */
    @Override
    public List<InvCompanyIndustryCsrc> selectInvCompanyIndustryCsrcList(InvCompanyIndustryCsrc invCompanyIndustryCsrc) {
        return invCompanyIndustryCsrcMapper.selectInvCompanyIndustryCsrcList(invCompanyIndustryCsrc);
    }

    /**
     * 新增所属证监会行业
     * 
     * @param invCompanyIndustryCsrc 所属证监会行业
     * @return 结果
     */
    @Override
    public int insertInvCompanyIndustryCsrc(InvCompanyIndustryCsrc invCompanyIndustryCsrc) {
        return invCompanyIndustryCsrcMapper.insertInvCompanyIndustryCsrc(invCompanyIndustryCsrc);
    }

    /**
     * 修改所属证监会行业
     * 
     * @param invCompanyIndustryCsrc 所属证监会行业
     * @return 结果
     */
    @Override
    public int updateInvCompanyIndustryCsrc(InvCompanyIndustryCsrc invCompanyIndustryCsrc) {
        return invCompanyIndustryCsrcMapper.updateInvCompanyIndustryCsrc(invCompanyIndustryCsrc);
    }

    /**
     * 批量删除所属证监会行业
     * 
     * @param ids 需要删除的所属证监会行业主键
     * @return 结果
     */
    @Override
    public int deleteInvCompanyIndustryCsrcByIds(String ids) {
        return invCompanyIndustryCsrcMapper.deleteInvCompanyIndustryCsrcByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除所属证监会行业信息
     * 
     * @param id 所属证监会行业主键
     * @return 结果
     */
    @Override
    public int deleteInvCompanyIndustryCsrcById(Integer id) {
        return invCompanyIndustryCsrcMapper.deleteInvCompanyIndustryCsrcById(id);
    }
}
