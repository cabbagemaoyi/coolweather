package com.coolweather.android.gson;

/**
 * Created by fengj on 2017/1/27.
 */

public class AQI {
    public AQICity city;
    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
