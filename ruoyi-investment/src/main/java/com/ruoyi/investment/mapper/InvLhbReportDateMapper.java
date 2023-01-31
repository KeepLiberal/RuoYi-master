package com.ruoyi.investment.mapper;

import java.util.Date;
import java.util.List;
import com.ruoyi.investment.domain.InvLhbReportDate;

/**
 * 龙虎榜上榜日期Mapper接口
 * 
 * @author yangwenyang
 * @date 2023-01-26
 */
public interface InvLhbReportDateMapper {
    /**
     * 查询龙虎榜上榜日期
     * 
     * @param id 龙虎榜上榜日期主键
     * @return 龙虎榜上榜日期
     */
    public InvLhbReportDate selectInvLhbReportDateById(Integer id);

    /**
     * 查询龙虎榜上榜日期列表
     * 
     * @param invLhbReportDate 龙虎榜上榜日期
     * @return 龙虎榜上榜日期集合
     */
    public List<InvLhbReportDate> selectInvLhbReportDateList(InvLhbReportDate invLhbReportDate);

    /**
     * 新增龙虎榜上榜日期
     * 
     * @param invLhbReportDate 龙虎榜上榜日期
     * @return 结果
     */
    public int insertInvLhbReportDate(InvLhbReportDate invLhbReportDate);

    /**
     * 修改龙虎榜上榜日期
     * 
     * @param invLhbReportDate 龙虎榜上榜日期
     * @return 结果
     */
    public int updateInvLhbReportDate(InvLhbReportDate invLhbReportDate);

    /**
     * 删除龙虎榜上榜日期
     * 
     * @param id 龙虎榜上榜日期主键
     * @return 结果
     */
    public int deleteInvLhbReportDateById(Integer id);

    /**
     * 批量删除龙虎榜上榜日期
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteInvLhbReportDateByIds(String[] ids);

    /**
     * 查询未抓取龙虎榜每日明细数据的龙虎榜日期
     *
     * @param securityCode 股票代码
     * @return 上榜日期集合
     */
    public List<InvLhbReportDate> selectInvLhbReportDateListPendingMrmx(String securityCode);

    /**
     * 查询未抓取龙虎榜每日统计数据的龙虎榜日期
     *
     * @param securityCode 股票代码
     * @return 上榜日期集合
     */
    public List<InvLhbReportDate> selectInvLhbReportDateListPendingMrtj(String securityCode);


}
