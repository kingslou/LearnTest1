package com.example.yimutian.myapplication;

/**
 * 具体工厂类
 * Created by YiMuTian on 2016/4/25.
 */
public class ConcreteCreator extends Creator {

    @Override
    public <T extends ThirdPayment> T creatorThridPay(Class<T> c) {
        ThirdPayment factoryCreator = null;
        try{
            factoryCreator = (ThirdPayment)Class.forName(c.getName()).newInstance();
        }catch (Exception e){
            e.printStackTrace();
        }
        return (T)factoryCreator;
    }
}
