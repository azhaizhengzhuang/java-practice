package com.zhai.www;

/**
 * @Author: 江桂煌
 * @Description: TODO
 * @DateTime: 2021/9/18 19:11
 **/
class Base{
    public int a;
}

class Derive extends Base{
    public int b;
}
public class Test2 {
    public static void main(String[] args) {
//        Derive d = new Derive();
//        d.a = 10;
//        d.b = 20;
//        System.out.println(d.a + " " + d.b);
        A a = new A();
        System.out.println(a.i);
    }
}
