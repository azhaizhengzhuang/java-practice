package com.zhai.test;

/**
 * @Author: 江桂煌
 * @Description: 多态、抽象类
 * @DateTime: 2021/9/20 11:14
 **/

abstract class  Tool {
    public int a;
    private double b;

    public  abstract void use();
}

class Gun extends Tool {
    @Override
    public void use() {
        System.out.println("枪可以射击");
    }
}

class Pen extends Tool {
    @Override
    public void use() {
        System.out.println("笔可以写字");
    }
}

class Phone extends Tool {
    @Override
    public void use() {
        System.out.println("手机可以上网");
    }
}

public class Test2 {
    public static void useTool(Tool tool) {
        tool.use();
    }
    public static void main(String[] args) {
        Tool a = new Gun();
        Tool b = new Pen();
        Tool c = new Phone();
        useTool(a);
        useTool(b);
        useTool(c);
    }
}
