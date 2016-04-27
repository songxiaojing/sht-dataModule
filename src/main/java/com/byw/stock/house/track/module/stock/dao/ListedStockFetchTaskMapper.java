package com.byw.stock.house.track.module.stock.dao;

import com.byw.stock.house.track.module.stock.module.ListedStockFetchTask;

public interface ListedStockFetchTaskMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ListedStockFetchTask record);

    int insertSelective(ListedStockFetchTask record);

    ListedStockFetchTask selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ListedStockFetchTask record);

    int updateByPrimaryKey(ListedStockFetchTask record);
}