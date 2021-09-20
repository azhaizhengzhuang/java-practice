package com.zhai.test;

/**
 * @Author: 江桂煌
 * @Description: TODO
 * @DateTime: 2021/9/20 16:27
 **/
class Owener implements Cloneable{
    String name;
    int age;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();

    }
}
class Car1 implements Cloneable{
    String name;
    int speed;
    int age;
    Owener o = new Owener();
    public Car1(String name, int speed, int age) {
        this.name = name;
        this.speed = speed;
        this.age = age;
    }




    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", speed=" + speed +
                ", age=" + age +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {

        Car1 tmp = (Car1)super.clone();
        tmp.o = (Owener) this.o.clone();
        return tmp;
    }
}


public class Test5 {
    public static void main (String[] args) throws CloneNotSupportedException{
        //对象浅拷贝
        Car1 a = new Car1("xiaobai",100,15);
        Car1 b = (Car1)a.clone();
        System.out.println(a.o.name);
        System.out.println(b.o.name);
        a.o.name = "刘华强";
        System.out.println("===============");
        System.out.println(a.o.name);
        System.out.println(b.o.name);
    }
    public static void main2 (String[] args) throws CloneNotSupportedException{
        //对象浅拷贝
        Car1 a = new Car1("xiaobai",100,15);
        Car1 b = (Car1)a.clone();
        System.out.println(a.speed);
        System.out.println(b.speed);
        a.speed = 200;
        System.out.println("===============");
        System.out.println(a.speed);
        System.out.println(b.speed);
    }
    public static void main1(String[] args) {
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

}
