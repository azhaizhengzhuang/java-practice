package com.zhai.User;

import com.zhai.IOperate.IOperate;
import com.zhai.book.BookList;

/**
 * @Author: 江桂煌
 * @Description: 对用户的抽象
 * @DateTime: 2021/9/21 20:17
 **/
abstract public class User {
    protected String name;
    protected IOperate[] operations;

    abstract public int menu();

    public void doOperation(BookList bookList, int input) {
        this.operations[input].work(bookList);
    }
}
