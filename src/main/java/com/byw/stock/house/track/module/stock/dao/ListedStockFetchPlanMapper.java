package com.byw.stock.house.track.module.stock.dao;

import com.byw.stock.house.track.module.stock.module.ListedStockFetchPlan;

public interface ListedStockFetchPlanMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ListedStockFetchPlan record);

    int insertSelective(ListedStockFetchPlan record);

    ListedStockFetchPlan selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ListedStockFetchPlan record);

    int updateByPrimaryKey(ListedStockFetchPlan record);
}