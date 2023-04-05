package com.ruoyi.investment.service.impl;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.ruoyi.investment.mapper.InvFhrzLnfhrzMapper;
import com.ruoyi.investment.domain.InvFhrzLnfhrz;
import com.ruoyi.investment.service.IInvFhrzLnfhrzService;
import com.ruoyi.common.core.text.Convert;

/**
 * 历年分红融资Service业务层处理
 * 
 * @author yangwenyang
 * @date 2023-04-06
 */
@Service
public class InvFhrzLnfhrzServiceImpl implements IInvFhrzLnfhrzService {
    @Resource
    private InvFhrzLnfhrzMapper invFhrzLnfhrzMapper;

    /**
     * 查询历年分红融资
     * 
     * @param id 历年分红融资主键
     * @return 历年分红融资
     */
    @Override
    public InvFhrzLnfhrz selectInvFhrzLnfhrzById(Integer id) {
        return invFhrzLnfhrzMapper.selectInvFhrzLnfhrzById(id);
    }

    /**
     * 查询历年分红融资列表
     * 
     * @param invFhrzLnfhrz 历年分红融资
     * @return 历年分红融资
     */
    @Override
    public List<InvFhrzLnfhrz> selectInvFhrzLnfhrzList(InvFhrzLnfhrz invFhrzLnfhrz) {
        return invFhrzLnfhrzMapper.selectInvFhrzLnfhrzList(invFhrzLnfhrz);
    }

    /**
     * 新增历年分红融资
     * 
     * @param invFhrzLnfhrz 历年分红融资
     * @return 结果
     */
    @Override
    public int insertInvFhrzLnfhrz(InvFhrzLnfhrz invFhrzLnfhrz) {
        return invFhrzLnfhrzMapper.insertInvFhrzLnfhrz(invFhrzLnfhrz);
    }

    /**
     * 修改历年分红融资
     * 
     * @param invFhrzLnfhrz 历年分红融资
     * @return 结果
     */
    @Override
    public int updateInvFhrzLnfhrz(InvFhrzLnfhrz invFhrzLnfhrz) {
        return invFhrzLnfhrzMapper.updateInvFhrzLnfhrz(invFhrzLnfhrz);
    }

    /**
     * 批量删除历年分红融资
     * 
     * @param ids 需要删除的历年分红融资主键
     * @return 结果
     */
    @Override
    public int deleteInvFhrzLnfhrzByIds(String ids) {
        return invFhrzLnfhrzMapper.deleteInvFhrzLnfhrzByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除历年分红融资信息
     * 
     * @param id 历年分红融资主键
     * @return 结果
     */
    @Override
    public int deleteInvFhrzLnfhrzById(Integer id) {
        return invFhrzLnfhrzMapper.deleteInvFhrzLnfhrzById(id);
    }
}
