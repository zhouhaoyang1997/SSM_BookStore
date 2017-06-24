package com.entry;

public class Shopping {
    @Override
    public String toString() {
        return "Shopping{" +
                "shoppingId=" + shoppingId +
                ", shoppingGoods=" + shoppingGoods +
                ", shoppingPrice=" + shoppingPrice +
                ", shoppingNum=" + shoppingNum +
                ", shoppingUsersid=" + shoppingUsersid +
                '}';
    }

    private Integer shoppingId;

    private Integer shoppingGoods;

    private Integer shoppingPrice;

    private Integer shoppingNum;

    private Integer shoppingUsersid;

    public Integer getShoppingId() {
        return shoppingId;
    }

    public void setShoppingId(Integer shoppingId) {
        this.shoppingId = shoppingId;
    }

    public Integer getShoppingGoods() {
        return shoppingGoods;
    }

    public void setShoppingGoods(Integer shoppingGoods) {
        this.shoppingGoods = shoppingGoods;
    }

    public Integer getShoppingPrice() {
        return shoppingPrice;
    }

    public void setShoppingPrice(Integer shoppingPrice) {
        this.shoppingPrice = shoppingPrice;
    }

    public Integer getShoppingNum() {
        return shoppingNum;
    }

    public void setShoppingNum(Integer shoppingNum) {
        this.shoppingNum = shoppingNum;
    }

    public Integer getShoppingUsersid() {
        return shoppingUsersid;
    }

    public void setShoppingUsersid(Integer shoppingUsersid) {
        this.shoppingUsersid = shoppingUsersid;
    }
}