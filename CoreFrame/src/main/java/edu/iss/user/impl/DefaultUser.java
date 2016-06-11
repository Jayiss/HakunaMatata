package edu.iss.user.impl;

/**
 * Created by Jayiss on 2016/6/11.
 */
public class DefaultUser extends AbstractUser {
    private Long userId;
    private String userName;
    @Override
    public Long getUserId() {
        return userId;
    }

    @Override
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    @Override
    public String getUserName() {
        return userName;
    }

    @Override
    public void setUserName(String userName) {
        this.userName = userName;
    }
}
