package com.zhai.User;

import com.zhai.IOperate.*;

import java.util.Scanner;

/**
 * @Author: 江桂煌
 * @Description: TODO
 * @DateTime: 2021/9/21 20:17
 **/
public class Admini extends User {
    public Admini(String name) {
        this.name = name;
        this.operations = new IOperate[]{
                new ExitOperation(),
                new FindOperation(),
                new AddOperation(),
                new DelOperation(),
                new DisplayOperation()
        };
    }

    @Override
    public int menu() {
        System.out.println("管理员" + this.name + ", 欢迎您 请选择您要进行的操作");
        System.out.println("1.查询书籍");
        System.out.println("2.增加书籍");
        System.out.println("3.删除书籍");
        System.out.println("4.书籍清单");
        System.out.println("0.退出系统");
        System.out.print("请选择:>");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}
