package com.iss.user.impl;

import com.iss.user.api.User;

/**
 * Created by Jayiss on 2016/6/11.
 */
public class AbstractUser implements User {

    Long userId;
    String userName;

    public Long getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }
}
