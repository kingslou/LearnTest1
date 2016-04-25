package com.example;

/**
 * Created by YiMuTian on 2016/4/18.
 */
public class Test {

    public static void main(String[] args){
        Driver driver = new Driver();
        BenCi benCi = new BenCi();
        driver.drive(benCi);

        Idriver idriver = new Driver();
        idriver.driver(new BaoMa());
        idriver.driver(new BenCi());

    }
}
