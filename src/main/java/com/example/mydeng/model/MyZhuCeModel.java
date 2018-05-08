package com.example.mydeng.model;

import com.example.mydeng.okhttp.OkHttp3Utils;

import java.util.HashMap;

import okhttp3.Callback;

public class MyZhuCeModel implements ZhuCeModel {
    @Override
    public void getlogin(String phone2, String mima2, Callback callback) {
        HashMap<String, String> map = new HashMap<>();
        map.put("mobile", phone2);
        map.put("password",mima2);
        OkHttp3Utils.doPost("http://120.27.23.105/user/reg",map,callback);
    }
}
