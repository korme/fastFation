package xyz.korme.fastfation.model;

public class SmallClothes{
    public Integer idProduct;
    public Integer quantity;

    public SmallClothes() {

    }

    public SmallClothes(Integer idProduct, Integer quantity) {
        this.idProduct = idProduct;
        this.quantity = quantity;
    }

    public Integer getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(Integer idProduct) {
        this.idProduct = idProduct;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
