package xyz.korme.fastfation.model;

import java.util.ArrayList;
import java.util.List;

public class OrderInsert {
    List<SmallClothes> productList =new ArrayList<SmallClothes>();
    public String productLists;
    public String openid;
    public Integer measureId;
    public String test;

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }

    public List<SmallClothes> getProductList() {
        return productList;
    }

    public void setProductList(List<SmallClothes> productList) {
        this.productList = productList;
    }

    public String getProductLists() {
        return productLists;
    }

    public void setProductLists(String productLists) {
        this.productLists = productLists;
    }

    public Integer getMeasureId() {
        return measureId;
    }

    public void setMeasureId(Integer measureId) {
        this.measureId = measureId;
    }


    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }
}


