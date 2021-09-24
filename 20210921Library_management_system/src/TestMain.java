import com.zhai.User.Admini;
import com.zhai.User.Passager;
import com.zhai.User.User;
import com.zhai.book.BookList;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Author: 江桂煌
 * @Description: 图书管理系统框架整合
 * @DateTime: 2021/9/21 20:41
 **/
public class TestMain {

    public static User login() {
        System.out.println("欢迎来到图书管理系统，请输入您的用户名:>");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("请输入您的身份 1. 游客 2. 管理员:>");
        int chioce = scanner.nextInt();
        if (chioce == 2) {
            return new Admini(name);
        } else {
            return new Passager(name);
        }
    }
    public static void main(String[] args) {
        //1.建立书架
        BookList bookList = new BookList();
        //2.建立用户
        User user = login();
        //3.用户操作
        while (true) {
            int choice = user.menu();
            user.doOperation(bookList,choice);
        }
    }
}
