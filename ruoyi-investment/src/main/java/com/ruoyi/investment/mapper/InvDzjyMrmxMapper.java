package com.ruoyi.investment.mapper;

import java.util.List;
import com.ruoyi.investment.domain.InvDzjyMrmx;

/**
 * 大宗交易-每日明细Mapper接口
 * 
 * @author yangwenyang
 * @date 2023-01-24
 */
public interface InvDzjyMrmxMapper {
    /**
     * 查询大宗交易-每日明细
     * 
     * @param id 大宗交易-每日明细主键
     * @return 大宗交易-每日明细
     */
    public InvDzjyMrmx selectInvDzjyMrmxById(Integer id);

    /**
     * 查询大宗交易-每日明细列表
     * 
     * @param invDzjyMrmx 大宗交易-每日明细
     * @return 大宗交易-每日明细集合
     */
    public List<InvDzjyMrmx> selectInvDzjyMrmxList(InvDzjyMrmx invDzjyMrmx);

    /**
     * 新增大宗交易-每日明细
     * 
     * @param invDzjyMrmx 大宗交易-每日明细
     * @return 结果
     */
    public int insertInvDzjyMrmx(InvDzjyMrmx invDzjyMrmx);

    /**
     * 修改大宗交易-每日明细
     * 
     * @param invDzjyMrmx 大宗交易-每日明细
     * @return 结果
     */
    public int updateInvDzjyMrmx(InvDzjyMrmx invDzjyMrmx);

    /**
     * 删除大宗交易-每日明细
     * 
     * @param id 大宗交易-每日明细主键
     * @return 结果
     */
    public int deleteInvDzjyMrmxById(Integer id);

    /**
     * 批量删除大宗交易-每日明细
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteInvDzjyMrmxByIds(String[] ids);
}
