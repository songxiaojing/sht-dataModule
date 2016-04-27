package com.byw.stock.house.track.module.stock.module;

public class ListedStockFetchTask {
    private Long id;

    private String taskUuid;

    private String taskType;

    private Byte taskStatus;

    private String planStockCode;

    private String planTradingDate;

    private Long planFetchAt;

    private String fetchTradingDate;

    private Long fetchStartAt;

    private Long fetchFinishAt;

    private Boolean fetchResult;

    private String fetchMessage;

    private Long createAt;

    private Long lastUpdateAt;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTaskUuid() {
        return taskUuid;
    }

    public void setTaskUuid(String taskUuid) {
        this.taskUuid = taskUuid;
    }

    public String getTaskType() {
        return taskType;
    }

    public void setTaskType(String taskType) {
        this.taskType = taskType;
    }

    public Byte getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(Byte taskStatus) {
        this.taskStatus = taskStatus;
    }

    public String getPlanStockCode() {
        return planStockCode;
    }

    public void setPlanStockCode(String planStockCode) {
        this.planStockCode = planStockCode;
    }

    public String getPlanTradingDate() {
        return planTradingDate;
    }

    public void setPlanTradingDate(String planTradingDate) {
        this.planTradingDate = planTradingDate;
    }

    public Long getPlanFetchAt() {
        return planFetchAt;
    }

    public void setPlanFetchAt(Long planFetchAt) {
        this.planFetchAt = planFetchAt;
    }

    public String getFetchTradingDate() {
        return fetchTradingDate;
    }

    public void setFetchTradingDate(String fetchTradingDate) {
        this.fetchTradingDate = fetchTradingDate;
    }

    public Long getFetchStartAt() {
        return fetchStartAt;
    }

    public void setFetchStartAt(Long fetchStartAt) {
        this.fetchStartAt = fetchStartAt;
    }

    public Long getFetchFinishAt() {
        return fetchFinishAt;
    }

    public void setFetchFinishAt(Long fetchFinishAt) {
        this.fetchFinishAt = fetchFinishAt;
    }

    public Boolean getFetchResult() {
        return fetchResult;
    }

    public void setFetchResult(Boolean fetchResult) {
        this.fetchResult = fetchResult;
    }

    public String getFetchMessage() {
        return fetchMessage;
    }

    public void setFetchMessage(String fetchMessage) {
        this.fetchMessage = fetchMessage;
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