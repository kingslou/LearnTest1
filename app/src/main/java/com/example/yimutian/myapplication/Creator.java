package com.example.yimutian.myapplication;

/**
 * 抽象工厂类
 * Created by YiMuTian on 2016/4/25.
 */
public abstract class Creator {
    public abstract  <T extends ThirdPayment> T creatorThridPay(Class<T> c);
}
