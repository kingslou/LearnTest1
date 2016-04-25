package com.example.yimutian.myapplication;

/**
 * Created by YiMuTian on 2016/4/25.
 */
public class LaKaLaFactory extends FactoryCreator {
    @Override
    public ThirdPayment createThridPay() {
        return new LaKaLa();
    }
}
