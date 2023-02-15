package com.yby.user.designPattern.builderPattern.demo;

public interface SkuVOFunction<T extends SkuVO> {

    T newInstance();

}
