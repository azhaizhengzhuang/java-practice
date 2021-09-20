package com.zhai.www;



/**
 * @Author: 江桂煌
 * @Description: 包和继承
 * @DateTime: 2021/9/18 18:42
 **/
class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
        System.out.println("Animal(String)");
    }

    public void eat() {
        System.out.println(this.name + "Animal::eat()");
    }
    public void sleep() {
        System.out.println(this.name + "Animal::sleep()");
    }
}

class Cat extends Animal{
    public Cat(String name) {
        super(name);
        System.out.println("Cat(String)");
    }
}

class Bird extends Animal{
    public Bird(String name) {
        super(name);
    }

    public void fly() {
        System.out.println(this.name + "Bird::fly()");
    }
}

class ChineseGardenCat extends Cat {
    public ChineseGardenCat(String name) {
        super(name);
        System.out.println("田园猫构造");
    }

}
class Orange extends ChineseGardenCat {

    public Orange(String name) {
        super(name);
        System.out.println("橘猫构造");
    }
//    super.name = "猪皮";
}
public class Test1 {
    public static void main(String[] args) {
        Orange  o = new Orange("猪皮");
        o.sleep();
    }
    public static void main2(String[] args) {
//        Cat cat = new Cat("mimi");
//        cat.eat();
//        cat.sleep();
        Bird bird = new Bird("haha");
        bird.fly();
    }

    public static void main1(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        java.util.Date date1 = new java.util.Date();
        java.sql.Date date = new java.sql.Date(1);
    }
}
