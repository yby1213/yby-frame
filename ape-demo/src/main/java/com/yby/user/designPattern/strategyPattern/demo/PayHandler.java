package com.yby.user.designPattern.strategyPattern.demo;

public interface PayHandler {

    PayChannelEnum getChannel();

    void dealPay();

}
