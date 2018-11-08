package xyz.korme.fastfation.model;

import java.util.List;

public class OrderRequset {
    private String timeAdd;
    private short statusDesc;
    private Integer idOrder;
    private List<SoldOutRequset> products;
    private String priceTtoal;

    public OrderRequset(String timeAdd, short statusDesc, Integer idOrder, List<SoldOutRequset> products, String priceTtoal) {
        this.timeAdd = timeAdd;
        this.statusDesc = statusDesc;
        this.idOrder = idOrder;
        this.products = products;
        this.priceTtoal = priceTtoal;
    }

    public OrderRequset() {
    }

    public String getTimeAdd() {
        return timeAdd;
    }

    public void setTimeAdd(String timeAdd) {
        this.timeAdd = timeAdd;
    }

    public short getStatusDesc() {
        return statusDesc;
    }

    public void setStatusDesc(short statusDesc) {
        this.statusDesc = statusDesc;
    }

    public Integer getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(Integer idOrder) {
        this.idOrder = idOrder;
    }

    public List<SoldOutRequset> getProducts() {
        return products;
    }

    public void setProducts(List<SoldOutRequset> products) {
        this.products = products;
    }

    public String getPriceTtoal() {
        return priceTtoal;
    }

    public void setPriceTtoal(String priceTtoal) {
        this.priceTtoal = priceTtoal;
    }
}
