package com.zhai.book;

/**
 * @Author: 江桂煌
 * @Description: 书架，复用了书这个类
 * @DateTime: 2021/9/21 20:06
 **/
public class BookList {
    Book books[];
    int usedSize;

    public BookList() {
        this.books = new Book[10];
        books[0] = new Book("三国演义", "罗贯中", 100, "小说");
        books[1] = new Book("水浒传", "施耐庵", 100, "小说");
        books[2] = new Book("西游记", "吴承恩", 100, "小说");
        this.usedSize = 3;
    }

    public Book getBook(int pos) {
        return this.books[pos];
    }

    public void setBook(int pos, Book book) {
        this.books[pos] = book;
    }

    public int getUsedSize() {
        return usedSize;
    }

    public void setUsedSize(int usedSize) {
        this.usedSize = usedSize;
    }
}
