package edu.iss.user.impl;

import edu.iss.user.api.User;

/**
 * Created by Jayiss on 2016/6/11.
 */
abstract public class AbstractUser implements User {
    abstract public Long getUserId();
    abstract public void setUserId(Long userId);

    abstract public String getUserName();
    abstract public void setUserName(String userName);
}
