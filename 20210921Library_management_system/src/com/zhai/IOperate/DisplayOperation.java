package com.zhai.IOperate;

import com.zhai.book.BookList;

/**
 * @Author: 江桂煌
 * @Description: TODO
 * @DateTime: 2021/9/21 20:15
 **/
public class DisplayOperation implements IOperate{
    @Override
    public void work(BookList bookList) {
        if (bookList.getUsedSize() == 0) {
            System.out.println("空空如也！");
            return;
        }
        for (int i = 0; i < bookList.getUsedSize(); i++) {
            System.out.println(bookList.getBook(i));
        }
    }
}
