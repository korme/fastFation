package xyz.korme.fastfation.model;

public class Order {
    private Integer orderId;
    private String openid;
    private Integer measureId;
    private short orderStatue;
    private Integer orderPrice;
    private Integer clothesId;
    private Integer quantity;
    private String createTime;
    private String idProduct;
    private Integer addressId;

    public Order(String openid, Integer measureId, short orderStatue, Integer orderPrice, String createTime, Integer addressId) {
        this.openid = openid;
        this.measureId = measureId;
        this.orderStatue = orderStatue;
        this.orderPrice = orderPrice;
        this.createTime = createTime;
        this.addressId = addressId;
    }

    public String getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(String idProduct) {
        this.idProduct = idProduct;
    }

    public Integer getAddressId() {
        return addressId;
    }

    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public Integer getMeasureId() {
        return measureId;
    }

    public void setMeasureId(Integer measureId) {
        this.measureId = measureId;
    }

    public short getOrderStatue() {
        return orderStatue;
    }

    public void setOrderStatue(short orderStatue) {
        this.orderStatue = orderStatue;
    }

    public Integer getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(Integer orderPrice) {
        this.orderPrice = orderPrice;
    }

    public Integer getClothesId() {
        return clothesId;
    }

    public void setClothesId(Integer clothesId) {
        this.clothesId = clothesId;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public Order() {
    }


}
