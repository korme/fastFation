package xyz.korme.fastfation.model;

public class User {
    private int userId;
    private String nickname;
    private String openid;
    private String sessionKey;
    private String createTime;

    public User(String nickname, String openid, String sessionKey, String createTime) {
        this.nickname = nickname;
        this.openid = openid;
        this.sessionKey = sessionKey;
        this.createTime = createTime;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public String getSessionKey() {
        return sessionKey;
    }

    public void setSessionKey(String sessionKey) {
        this.sessionKey = sessionKey;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }
}
