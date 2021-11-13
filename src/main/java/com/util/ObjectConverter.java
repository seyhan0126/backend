package com.util;

import com.google.gson.Gson;

public class ObjectConverter {

    private static Gson gson = new Gson();

    public static <T> T convertJsonStringToObject(String jsonStr, Class<T> targetObject){
        return gson.fromJson(jsonStr,targetObject);
    }
}