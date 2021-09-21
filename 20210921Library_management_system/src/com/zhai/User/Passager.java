package com.zhai.User;

import com.zhai.IOperate.*;

import java.util.Scanner;

/**
 * @Author: 江桂煌
 * @Description: TODO
 * @DateTime: 2021/9/21 20:17
 **/
public class Passager extends User{
    public Passager(String name) {
        this.name = name;
        this.operations = new IOperate[]{
                new ExitOperation(),
                new FindOperation(),
                new BorrowOperation(),
                new ReturnOperation()
        };
    }

    @Override
    public int menu() {
        System.out.println("游客" + this.name + ", 欢迎您 请选择您要进行的操作");
        System.out.println("1.查询书籍");
        System.out.println("2.借阅书籍");
        System.out.println("3.归还书籍");
        System.out.println("0.退出系统");
        System.out.print("请选择:>");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}
