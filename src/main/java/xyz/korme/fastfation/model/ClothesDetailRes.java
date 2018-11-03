package xyz.korme.fastfation.model;

import java.util.List;

public class ClothesDetailRes {
    private String productName;
    private List<String> swiperImgs;
    private String  price;
    private String description;
    private List<String> detailImgs;

    public ClothesDetailRes() {
    }

    public ClothesDetailRes(String productName, List<String> swiperImgs, String price, String description, List<String> detailImgs) {
        this.productName = productName;
        this.swiperImgs = swiperImgs;
        this.price = price;
        this.description = description;
        this.detailImgs = detailImgs;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public List<String> getSwiperImgs() {
        return swiperImgs;
    }

    public void setSwiperImgs(List<String> swiperImgs) {
        this.swiperImgs = swiperImgs;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<String> getDetailImgs() {
        return detailImgs;
    }

    public void setDetailImgs(List<String> detailImgs) {
        this.detailImgs = detailImgs;
    }
}
