package com.byw.stock.house.track.module.stock.module;

public class ListedStockFetchPlan {
    private Long id;

    private String stockName;

    private String stockCode;

    private Long listingTime;

    private Long lastTradingDate;

    private String lastTaskUuid;

    private Long createAt;

    private Long lastUpdateAt;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStockName() {
        return stockName;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName;
    }

    public String getStockCode() {
        return stockCode;
    }

    public void setStockCode(String stockCode) {
        this.stockCode = stockCode;
    }

    public Long getListingTime() {
        return listingTime;
    }

    public void setListingTime(Long listingTime) {
        this.listingTime = listingTime;
    }

    public Long getLastTradingDate() {
        return lastTradingDate;
    }

    public void setLastTradingDate(Long lastTradingDate) {
        this.lastTradingDate = lastTradingDate;
    }

    public String getLastTaskUuid() {
        return lastTaskUuid;
    }

    public void setLastTaskUuid(String lastTaskUuid) {
        this.lastTaskUuid = lastTaskUuid;
    }

    public Long getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Long createAt) {
        this.createAt = createAt;
    }

    public Long getLastUpdateAt() {
        return lastUpdateAt;
    }

    public void setLastUpdateAt(Long lastUpdateAt) {
        this.lastUpdateAt = lastUpdateAt;
    }
}