package com.example.yimutian.myapplication;

/**
 * Created by YiMuTian on 2016/4/25.
 */
public interface ThirdPayment {

    public void cancleTrans(String transCode);

    public void printTrans(String transCode);

    public void reprintTrands(String transCode);

    public void bankCardPay(String money,String requestCode);

    public void weixinPay(String money,String requestCode);

    public void aliPay(String money,String requestCode);

}
