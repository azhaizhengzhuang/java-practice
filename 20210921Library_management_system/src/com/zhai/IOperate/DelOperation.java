package com.zhai.IOperate;

import com.zhai.book.BookList;

import java.util.Scanner;

/**
 * @Author: 江桂煌
 * @Description: TODO
 * @DateTime: 2021/9/21 20:15
 **/
public class DelOperation implements IOperate {
    @Override
    public void work(BookList bookList) {
        System.out.println("请输入您要删除的书:>");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        for (int i = 0; i < bookList.getUsedSize(); i++) {
            if (bookList.getBook(i).getName().equals(name)) {
                for (int j = i; j < bookList.getUsedSize() - 1; j++) {
                    bookList.setBook(j, bookList.getBook(j + 1));
                }
                bookList.setUsedSize(bookList.getUsedSize() - 1);
                System.out.println("删除成功");
                return;
            }
        }
        System.out.println("没有这本书！");
    }
}
