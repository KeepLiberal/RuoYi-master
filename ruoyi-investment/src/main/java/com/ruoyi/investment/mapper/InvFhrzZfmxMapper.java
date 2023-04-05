package com.ruoyi.investment.mapper;

import java.util.List;
import com.ruoyi.investment.domain.InvFhrzZfmx;

/**
 * 增发明细Mapper接口
 * 
 * @author yangwenyang
 * @date 2023-04-06
 */
public interface InvFhrzZfmxMapper {
    /**
     * 查询增发明细
     * 
     * @param id 增发明细主键
     * @return 增发明细
     */
    public InvFhrzZfmx selectInvFhrzZfmxById(Integer id);

    /**
     * 查询增发明细列表
     * 
     * @param invFhrzZfmx 增发明细
     * @return 增发明细集合
     */
    public List<InvFhrzZfmx> selectInvFhrzZfmxList(InvFhrzZfmx invFhrzZfmx);

    /**
     * 新增增发明细
     * 
     * @param invFhrzZfmx 增发明细
     * @return 结果
     */
    public int insertInvFhrzZfmx(InvFhrzZfmx invFhrzZfmx);

    /**
     * 修改增发明细
     * 
     * @param invFhrzZfmx 增发明细
     * @return 结果
     */
    public int updateInvFhrzZfmx(InvFhrzZfmx invFhrzZfmx);

    /**
     * 删除增发明细
     * 
     * @param id 增发明细主键
     * @return 结果
     */
    public int deleteInvFhrzZfmxById(Integer id);

    /**
     * 批量删除增发明细
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteInvFhrzZfmxByIds(String[] ids);
}
