package com.example.yimutian.myapplication;

/**
 * 具体工厂类
 * Created by YiMuTian on 2016/4/25.
 */
public class ConcreteCreator extends Creator {

    @Override
    public <T extends FactoryCreator> T creatorThridPay(Class<T> c) {
        FactoryCreator factoryCreator = null;
        try{
            factoryCreator = (FactoryCreator)Class.forName(c.getName()).newInstance();
        }catch (Exception e){
            e.printStackTrace();
        }
        return (T)factoryCreator;
    }
}
