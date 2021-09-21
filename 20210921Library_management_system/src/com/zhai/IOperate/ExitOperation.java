package com.zhai.IOperate;

import com.zhai.book.BookList;

/**
 * @Author: 江桂煌
 * @Description: TODO
 * @DateTime: 2021/9/21 20:16
 **/
public class ExitOperation implements IOperate{
    @Override
    public void work(BookList bookList) {
        System.out.println("退出系统");
        System.exit(1);
    }
}
