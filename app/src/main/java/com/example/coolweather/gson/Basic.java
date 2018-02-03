package com.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by lzj on 2018/2/3.
 */

public class Basic {
    @SerializedName("city")
    public String ciryName;

    @SerializedName("id")
    public String weatherId;

    public Update update;


    public class Update {
        @SerializedName("loc")
        public String  updateTime;
    }
}
