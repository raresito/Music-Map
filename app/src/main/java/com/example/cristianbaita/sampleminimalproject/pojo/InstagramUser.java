package com.example.rares.raresbook.pojo;

import java.util.HashMap;

/**
 * Created by Rares - Desktop on 29.08.2016.
 */
public class InstagramUser {

    private static HashMap<String, String> userInfoHashmap = new HashMap<String, String>();

    public void setUserInfoHashmap(HashMap<String, String> userInfoHashmap) {
        this.userInfoHashmap = userInfoHashmap;
    }

    public HashMap<String, String> getUserInfoHashmap() {
        return userInfoHashmap;
    }
}
