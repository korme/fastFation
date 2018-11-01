package xyz.korme.fastfation.model;

public class MeasureInfo {
    private Integer measureId;
    private String openid;
    private String sizeName;
    private Integer weight;
    private Integer height;
    private Integer bust;
    private Integer neck;
    private Integer sleeve;
    private Integer waist;
    private Integer trousers;
    private String notes;
    private short types;

    public MeasureInfo(String openid, String sizeName, Integer weight, Integer height, Integer bust, Integer neck, Integer sleeve, Integer waist, Integer trousers, String notes, short types) {
        this.openid = openid;
        this.sizeName = sizeName;
        this.weight = weight;
        this.height = height;
        this.bust = bust;
        this.neck = neck;
        this.sleeve = sleeve;
        this.waist = waist;
        this.trousers = trousers;
        this.notes = notes;
        this.types = types;
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

    public String getSizeName() {
        return sizeName;
    }

    public void setSizeName(String sizeName) {
        this.sizeName = sizeName;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Integer getBust() {
        return bust;
    }

    public void setBust(Integer bust) {
        this.bust = bust;
    }

    public Integer getNeck() {
        return neck;
    }

    public void setNeck(Integer neck) {
        this.neck = neck;
    }

    public Integer getSleeve() {
        return sleeve;
    }

    public void setSleeve(Integer sleeve) {
        this.sleeve = sleeve;
    }

    public Integer getWaist() {
        return waist;
    }

    public void setWaist(Integer waist) {
        this.waist = waist;
    }

    public Integer getTrousers() {
        return trousers;
    }

    public void setTrousers(Integer trousers) {
        this.trousers = trousers;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public short getTypes() {
        return types;
    }

    public void setTypes(short types) {
        this.types = types;
    }
}
