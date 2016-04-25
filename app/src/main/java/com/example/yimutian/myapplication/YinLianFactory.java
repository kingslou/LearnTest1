package com.example.yimutian.myapplication;

/**
 * Created by YiMuTian on 2016/4/25.
 */
public class YinLianFactory extends FactoryCreator {

    @Override
    public ThirdPayment createThridPay() {
        return new YinLian();
    }
}
