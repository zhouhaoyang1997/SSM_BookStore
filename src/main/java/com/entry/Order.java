package com.entry;

public class Order {
    @Override
    public String toString() {
        return "Order{" +
                "ordersId='" + ordersId + '\'' +
                ", ordersUser=" + ordersUser +
                ", ordersAddress='" + ordersAddress + '\'' +
                ", ordersTel=" + ordersTel +
                ", ordersStatus='" + ordersStatus + '\'' +
                ", ordersConsignee='" + ordersConsignee + '\'' +
                '}';
    }

    private String ordersId;

    private Integer ordersUser;

    private String ordersAddress;

    private Integer ordersTel;

    private String ordersStatus;

    private String ordersConsignee;

    public String getOrdersId() {
        return ordersId;
    }

    public void setOrdersId(String ordersId) {
        this.ordersId = ordersId == null ? null : ordersId.trim();
    }

    public Integer getOrdersUser() {
        return ordersUser;
    }

    public void setOrdersUser(Integer ordersUser) {
        this.ordersUser = ordersUser;
    }

    public String getOrdersAddress() {
        return ordersAddress;
    }

    public void setOrdersAddress(String ordersAddress) {
        this.ordersAddress = ordersAddress == null ? null : ordersAddress.trim();
    }

    public Integer getOrdersTel() {
        return ordersTel;
    }

    public void setOrdersTel(Integer ordersTel) {
        this.ordersTel = ordersTel;
    }

    public String getOrdersStatus() {
        return ordersStatus;
    }

    public void setOrdersStatus(String ordersStatus) {
        this.ordersStatus = ordersStatus == null ? null : ordersStatus.trim();
    }

    public String getOrdersConsignee() {
        return ordersConsignee;
    }

    public void setOrdersConsignee(String ordersConsignee) {
        this.ordersConsignee = ordersConsignee == null ? null : ordersConsignee.trim();
    }
}