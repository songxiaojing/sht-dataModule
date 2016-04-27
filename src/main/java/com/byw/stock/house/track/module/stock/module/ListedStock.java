package com.byw.stock.house.track.module.stock.module;

public class ListedStock {
    private Long id;

    private String stockName;

    private String stockCode;

    private String searchCode;

    private String bourse;

    private Long listingTime;

    private Long totalMarketCapitalization;

    private Long circulationMarketValue;

    private String companyName;

    private String companyDesc;

    private String scopeOfBusiness;

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

    public String getSearchCode() {
        return searchCode;
    }

    public void setSearchCode(String searchCode) {
        this.searchCode = searchCode;
    }

    public String getBourse() {
        return bourse;
    }

    public void setBourse(String bourse) {
        this.bourse = bourse;
    }

    public Long getListingTime() {
        return listingTime;
    }

    public void setListingTime(Long listingTime) {
        this.listingTime = listingTime;
    }

    public Long getTotalMarketCapitalization() {
        return totalMarketCapitalization;
    }

    public void setTotalMarketCapitalization(Long totalMarketCapitalization) {
        this.totalMarketCapitalization = totalMarketCapitalization;
    }

    public Long getCirculationMarketValue() {
        return circulationMarketValue;
    }

    public void setCirculationMarketValue(Long circulationMarketValue) {
        this.circulationMarketValue = circulationMarketValue;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyDesc() {
        return companyDesc;
    }

    public void setCompanyDesc(String companyDesc) {
        this.companyDesc = companyDesc;
    }

    public String getScopeOfBusiness() {
        return scopeOfBusiness;
    }

    public void setScopeOfBusiness(String scopeOfBusiness) {
        this.scopeOfBusiness = scopeOfBusiness;
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