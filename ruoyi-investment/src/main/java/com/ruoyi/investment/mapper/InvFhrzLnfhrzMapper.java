package com.ruoyi.investment.mapper;

import java.util.List;
import com.ruoyi.investment.domain.InvFhrzLnfhrz;

/**
 * 历年分红融资Mapper接口
 * 
 * @author yangwenyang
 * @date 2023-04-06
 */
public interface InvFhrzLnfhrzMapper {
    /**
     * 查询历年分红融资
     * 
     * @param id 历年分红融资主键
     * @return 历年分红融资
     */
    public InvFhrzLnfhrz selectInvFhrzLnfhrzById(Integer id);

    /**
     * 查询历年分红融资列表
     * 
     * @param invFhrzLnfhrz 历年分红融资
     * @return 历年分红融资集合
     */
    public List<InvFhrzLnfhrz> selectInvFhrzLnfhrzList(InvFhrzLnfhrz invFhrzLnfhrz);

    /**
     * 新增历年分红融资
     * 
     * @param invFhrzLnfhrz 历年分红融资
     * @return 结果
     */
    public int insertInvFhrzLnfhrz(InvFhrzLnfhrz invFhrzLnfhrz);

    /**
     * 修改历年分红融资
     * 
     * @param invFhrzLnfhrz 历年分红融资
     * @return 结果
     */
    public int updateInvFhrzLnfhrz(InvFhrzLnfhrz invFhrzLnfhrz);

    /**
     * 删除历年分红融资
     * 
     * @param id 历年分红融资主键
     * @return 结果
     */
    public int deleteInvFhrzLnfhrzById(Integer id);

    /**
     * 批量删除历年分红融资
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteInvFhrzLnfhrzByIds(String[] ids);
}
