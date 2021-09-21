package com.zhai.IOperate;

import com.zhai.book.BookList;

import java.util.Scanner;

/**
 * @Author: 江桂煌
 * @Description: TODO
 * @DateTime: 2021/9/21 20:15
 **/
public class FindOperation implements IOperate {
    @Override
    public void work(BookList bookList) {
        System.out.println("请输入您要借的书:>");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        for (int i = 0; i < bookList.getUsedSize(); i++) {
            if (bookList.getBook(i).getName().equals(name)) {
                System.out.println("找到了！");
                System.out.println(bookList.getBook(i));
                return;
            }
        }
        System.out.println("没有这本书！");
    }
}
