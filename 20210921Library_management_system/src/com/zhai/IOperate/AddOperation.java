package com.zhai.IOperate;

import com.zhai.book.Book;
import com.zhai.book.BookList;

import java.util.Scanner;

/**
 * @Author: 江桂煌
 * @Description: TODO
 * @DateTime: 2021/9/21 20:15
 **/
public class AddOperation implements IOperate{

    @Override
    public void work(BookList bookList) {
        //如果书架已满 则返回
        if (bookList.getUsedSize() == 10) {
            System.out.println("书架已满！请先删除一些书籍！");
            return;
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入书籍姓名:>");
        String name = scanner.nextLine();
        System.out.println("请输入书籍作者:>");
        String author = scanner.nextLine();
        System.out.println("请输入书籍价格:>");
        int price = scanner.nextInt();
        System.out.println("请输入书籍类型:>");
        String type = scanner.next();//读到有效字符才结束 因此会忽略前面输入int后的回车
        Book newBook = new Book(name, author, price, type);
        //尾插
        bookList.setBook(bookList.getUsedSize(), newBook);
        bookList.setUsedSize(bookList.getUsedSize() + 1);
        System.out.println("添加成功！");
    }
}
