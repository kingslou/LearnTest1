package com.example;

/**
 * Created by YiMuTian on 2016/4/18.
 */
public class BaoMa implements Icar {
    @Override
    public void run() {
        System.out.println("开"+BaoMa.this.getClass().getSimpleName());
    }
}
