package com.zhai.www;

import com.zhai.aaa.Animal;

/**
 * @Author: 江桂煌
 * @Description: TODO
 * @DateTime: 2021/9/18 19:37
 **/
class A {
    int i;//包访问权限
}
public class Test3 extends Animal {
    public void func() {
        Animal s = new Animal();
        System.out.println(super.name);
    }
    public static void main(String[] args) {
          Test3 t = new Test3();
          t.func();
//        A a = new A();
//        System.out.println(a.i);
//        Animal b = new Animal("hehe");
    }
}
