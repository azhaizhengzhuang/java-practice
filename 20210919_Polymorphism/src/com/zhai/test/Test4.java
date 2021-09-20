package com.zhai.test;

import java.util.Arrays;

/**
 * @Author: 江桂煌
 * @Description: 通过接口来实现对象数组的比较
 * @DateTime: 2021/9/20 16:05
 **/
class Owen {
    String name;
    int age;
}
class Car implements Comparable<Car>{
    String name;
    int speed;
    int age;
    Owen o;
    public Car(String name, int speed, int age) {
        this.name = name;
        this.speed = speed;
        this.age = age;
    }


    @Override
    public int compareTo(Car o) {
        if (this.age > o.age) {
            return 1;
        } else if (this.age == o.age) {
            return 0;
        } else {
            return -1;
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", speed=" + speed +
                ", age=" + age +
                '}';
    }

}


public class Test4 {
    public static void main(String[] args) {
        //对象深拷贝

    }
    public static void main2(String[] args) {
        //对象浅拷贝
        Car a = new Car("xiaobai",100,15);
        Car b = a;
        System.out.println(a.speed);
        System.out.println(b.speed);
        a.speed = 200;
        System.out.println("===============");
        System.out.println(a.speed);
        System.out.println(b.speed);
    }

    public static void main1(String[] args) {
        //对象之间的比较
//        int[] array = {1, 8, 55, 44, 23, 11};
//        Arrays.sort(array);
//        System.out.println(Arrays.toString(array));


//        Car[] cars = {new Car("xiaobai",100,15),new Car("xiaohuang",50,2)
//        ,new Car("dahei",999,10)};
//        Arrays.sort(cars);
//        System.out.println(Arrays.toString(cars));


    }
}
