package com.byw.stock.house.track.module.trading.dao;

import com.byw.stock.house.track.module.trading.module.TradingRecord;

public interface TradingRecordMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TradingRecord record);

    int insertSelective(TradingRecord record);

    TradingRecord selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TradingRecord record);

    int updateByPrimaryKey(TradingRecord record);
}