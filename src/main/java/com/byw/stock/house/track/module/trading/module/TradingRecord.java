package com.byw.stock.house.track.module.trading.module;

import java.math.BigDecimal;

public class TradingRecord {
    private Long id;

    private Long tradingTime;

    private BigDecimal price;

    private BigDecimal priceFluctuation;

    private Integer volume;

    private Integer turnover;

    private String tradingType;

    private String fetchBatchCode;

    private Long createAt;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getTradingTime() {
        return tradingTime;
    }

    public void setTradingTime(Long tradingTime) {
        this.tradingTime = tradingTime;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getPriceFluctuation() {
        return priceFluctuation;
    }

    public void setPriceFluctuation(BigDecimal priceFluctuation) {
        this.priceFluctuation = priceFluctuation;
    }

    public Integer getVolume() {
        return volume;
    }

    public void setVolume(Integer volume) {
        this.volume = volume;
    }

    public Integer getTurnover() {
        return turnover;
    }

    public void setTurnover(Integer turnover) {
        this.turnover = turnover;
    }

    public String getTradingType() {
        return tradingType;
    }

    public void setTradingType(String tradingType) {
        this.tradingType = tradingType;
    }

    public String getFetchBatchCode() {
        return fetchBatchCode;
    }

    public void setFetchBatchCode(String fetchBatchCode) {
        this.fetchBatchCode = fetchBatchCode;
    }

    public Long getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Long createAt) {
        this.createAt = createAt;
    }
}