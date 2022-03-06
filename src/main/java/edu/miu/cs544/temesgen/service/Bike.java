package edu.miu.cs544.temesgen.service;

/**
 * @ProjectName: BeanInitializationJavaConfig
 * @Author: Temesgen D.
 * @Date: 3/6/22
 */

public class Bike implements Vehicle{
    @Override
    public void move() {
        System.out.println("Bike moving...");
    }

}
