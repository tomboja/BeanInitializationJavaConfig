package edu.miu.cs544.temesgen.service;

/**
 * @ProjectName: BeanInitializationJavaConfig
 * @Author: Temesgen D.
 * @Date: 3/6/22
 */

public class Car implements Vehicle{
    private int year;
    private String make;
    private String model;
    private int millage;

    public Car(int year, String make, String model, int millage) {
        this.year = year;
        this.make = make;
        this.model = model;
        this.millage = millage;
    }


    @Override
    public void move() {
        System.out.println("Moving at 50 mph");
    }

    @Override
    public String toString() {
        return "Car{" +
                "type=" + year +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", millage=" + millage +
                '}';
    }
}
