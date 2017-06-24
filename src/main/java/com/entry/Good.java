package com.entry;

public class Good {
    @Override
    public String toString() {
        return "Good{" +
                "goodsId=" + goodsId +
                ", goodsName='" + goodsName + '\'' +
                ", goodsPrice=" + goodsPrice +
                ", goodsNum=" + goodsNum +
                ", goodsImg='" + goodsImg + '\'' +
                ", goodsMessage='" + goodsMessage + '\'' +
                ", goodsAuthor='" + goodsAuthor + '\'' +
                '}';
    }

    private Integer goodsId;

    private String goodsName;

    private Integer goodsPrice;

    private Integer goodsNum;

    private String goodsImg;

    private String goodsMessage;

    private String goodsAuthor;

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName == null ? null : goodsName.trim();
    }

    public Integer getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(Integer goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public Integer getGoodsNum() {
        return goodsNum;
    }

    public void setGoodsNum(Integer goodsNum) {
        this.goodsNum = goodsNum;
    }

    public String getGoodsImg() {
        return goodsImg;
    }

    public void setGoodsImg(String goodsImg) {
        this.goodsImg = goodsImg == null ? null : goodsImg.trim();
    }

    public String getGoodsMessage() {
        return goodsMessage;
    }

    public void setGoodsMessage(String goodsMessage) {
        this.goodsMessage = goodsMessage == null ? null : goodsMessage.trim();
    }

    public String getGoodsAuthor() {
        return goodsAuthor;
    }

    public void setGoodsAuthor(String goodsAuthor) {
        this.goodsAuthor = goodsAuthor == null ? null : goodsAuthor.trim();
    }
}