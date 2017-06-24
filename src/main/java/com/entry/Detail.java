package com.entry;

public class Detail {
    @Override
    public String toString() {
        return "Detail{" +
                "detailsId=" + detailsId +
                ", detailsOrder='" + detailsOrder + '\'' +
                ", detailsGoods=" + detailsGoods +
                ", detailsPrice=" + detailsPrice +
                ", detailsNum=" + detailsNum +
                '}';
    }

    private Integer detailsId;

    private String detailsOrder;

    private Integer detailsGoods;

    private Integer detailsPrice;

    private Integer detailsNum;

    public Integer getDetailsId() {
        return detailsId;
    }

    public void setDetailsId(Integer detailsId) {
        this.detailsId = detailsId;
    }

    public String getDetailsOrder() {
        return detailsOrder;
    }

    public void setDetailsOrder(String detailsOrder) {
        this.detailsOrder = detailsOrder == null ? null : detailsOrder.trim();
    }

    public Integer getDetailsGoods() {
        return detailsGoods;
    }

    public void setDetailsGoods(Integer detailsGoods) {
        this.detailsGoods = detailsGoods;
    }

    public Integer getDetailsPrice() {
        return detailsPrice;
    }

    public void setDetailsPrice(Integer detailsPrice) {
        this.detailsPrice = detailsPrice;
    }

    public Integer getDetailsNum() {
        return detailsNum;
    }

    public void setDetailsNum(Integer detailsNum) {
        this.detailsNum = detailsNum;
    }
}