package com.byw.stock.house.track.module.stock.dao;

import com.byw.stock.house.track.module.stock.module.ListedStock;

public interface ListedStockMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ListedStock record);

    int insertSelective(ListedStock record);

    ListedStock selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ListedStock record);

    int updateByPrimaryKey(ListedStock record);
}