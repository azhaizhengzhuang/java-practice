package com.zhai.test;

/**
 * @Author: 江桂煌
 * @Description: TODO
 * @DateTime: 2021/9/19 14:30
 **/
class Person {
    protected String name;

    public Person(String name) {
        this.name = name;
        System.out.println("人构造中");
        this.talk();
    }

    public void talk() {
        System.out.println(this.name + ":人在讲话");
    }

    public void walk() {
        System.out.println(this.name + ":人在走");
    }
    public Person born() {
        return new Person("baby");
    }
}

class Student extends Person{
    public int age;
    public Student(String name) {
        super(name);
        System.out.println("学生构造中");
    }
    public void talk() {
        System.out.println(this.name + ":学生在读书");
    }
    public Student born() {
        return new Student("baby");
    }
}

class Teacher extends Person{

    public Teacher(String name) {
        super(name);
        System.out.println("老师构造中");
    }
    public void teach() {
        System.out.println(this.name + ":老师在教书");
    }
}

public class Test1 {
    public static void main(String[] args) {
        //坑向：在构造方法中调用重写方法
        Student a = new Student("小绿");
    }
    public static void main4(String[] args) {
        //向下转型
        Person a = new Teacher("宅老师");
//        a.teach();
        ((Teacher) a).teach();

        //向下转型的不安全性 让学生变成了老师 转型异常
        Person b = new Student("明老师");
        if (b instanceof Teacher) {
            ((Teacher) b).teach();
        } else {
            System.out.println("别冒充老师");
        }
    }
    public static void main3(String[] args) {
        //方法覆盖
        Person a = new Student("小明");
        a.talk();
    }
    public static Person func(Person per) {
        //向上转型：传参、返回
        per.talk();
        Student a = new Student("小红");
        return a;
    }
    public static void main2(String[] args) {
        Student a = new Student("小红");
        Person b = func(a);
    }
    public static void main1(String[] args) {
        //向上转型:直接赋值
        Person a = new Student("小明");
        a.talk();

    }
}
