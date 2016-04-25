package com.example;

/**
 * Created by YiMuTian on 2016/4/18.
 */
public class Driver implements Idriver {
    public void drive(BenCi benCi){
        benCi.run();
    }

    @Override
    public void driver(Icar icar) {

    }
}
