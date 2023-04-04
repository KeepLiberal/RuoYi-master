package com.ruoyi.investment.mapper;

import java.util.List;
import java.util.Map;

/**
 * 沪深A股公司概况Mapper接口
 * 
 * @author yangwenyang
 * @date 2023-01-19
 */
public interface InvCommonMapper {

    /**
     * 查询公司概况列表
     *
     * @param sql 自定义sql
     * @return 沪深A股公司概况集合
     */
    List<Map<String,Object>> commonSelect(String sql);
}
