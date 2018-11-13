package xyz.korme.fastfation.model;

public class Homepage {
    private Integer adId;
    private Integer position;
    private Integer adStatus;
    private Integer adType;
    private Integer referTo;
    private String img;

    public Integer getReferTo() {
        return referTo;
    }

    public void setReferTo(Integer referTo) {
        this.referTo = referTo;
    }

    public Integer getAdId() {
        return adId;
    }

    public Integer getPosition() {
        return position;
    }

    public Integer getAdStatus() {
        return adStatus;
    }

    public Integer getAdType() {
        return adType;
    }

    public String getImg() {
        return img;
    }

    public void setAdId(Integer adId) {
        this.adId = adId;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public void setAdStatus(Integer adStatus) {
        this.adStatus = adStatus;
    }

    public void setAdType(Integer adType) {
        this.adType = adType;
    }

    public void setImg(String img) {
        this.img = img;
    }

}
