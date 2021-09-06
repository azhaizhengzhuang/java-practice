import com.sun.org.apache.bcel.internal.generic.ARETURN;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

/**
 * @Author: 江桂煌
 * @Description: TODO
 * @DateTime: 2021/9/5 10:16
 **/


public class TestDemo {

    //青蛙跳台阶问题
    static int frogJump(int n) {
        if (n == 1) {
            return 1;
        } else if (n ==2) {
            return 2;
        } else {
            return frogJump(n-1) + frogJump(n - 2);
        }
    }

    public static void main(String[] args) {
        System.out.println(frogJump(7));
    }
    //写出需要移动N个盘子的汉诺塔问题的移动过程

    /**
     *
     * @param n 盘子的个数
     * @param a 起始柱子
     * @param b 过程柱子
     * @param c 目的地柱子
     */
    static void hanoi (int n, char a, char b, char c) {
        if (n == 1) {
            System.out.println(a+"->"+c);
        } else {
            hanoi(n-1,a,c,b);
            System.out.println(a+"->"+c);
            hanoi(n-1,b,a,c);
        }
    }

    public static void main8(String[] args) {
        hanoi(3,'A','B','C');
    }
    //用递归和迭代两种方法求第n项斐波那契数
    //递归
    static int fibonacci1(int n) {
        if ((n == 1) || (n == 2)) {
            return 1;
        } else {
            return fibonacci1( n-1 ) + fibonacci1( n-2 );
        }
    }
    //迭代
    static int fibonacci2(int n) {
        int a = 1;
        int b = 1;
        int c = 1;
        for (int i = 3;i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }
    public static void main7(String[] args) {
        System.out.println(fibonacci2(2));
    }
    //用递归打印按顺序打印十进制数的每一位
    static void print(int n) {
        if (n / 10 != 0)
        {
            print(n / 10);
        }
        System.out.println(n % 10);

    }

    public static void main6(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        print(num);
    }
    //用递归求n的阶乘

    static int fac(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * fac(n - 1);
        }
    }

    public static void main5(String[] args) {
        System.out.println(fac(5));
    }
    public static int func(int n) {
        //递归练习3
       if (n / 10 == 0) {
           return n;
       }
       return n % 10 + func(n / 10);
    }

    public static void main4(String[] args) {
        //递归练习3
        int num = 1729;
        System.out.println(func(num));
    }
    //累加

    public static int sum(int n) {
        if (n == 1)
        {
            return n;
        }
        return n + sum (n - 1);
    }
    public static void main3(String[] args) {
        System.out.println(sum(10));
    }
    public static void main2(String[] args) {
        //方法重载
        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;

        System.out.println(sum(a, b));
        System.out.println(sum(a, b, c));
        System.out.println(sum(a, b, c, d));

        double e = 3.14;
        double f = 4.56;
        System.out.println(sum(e, f));
    }
    public static int sum(int a, int b) {
        return a + b;
    }
    public static int sum(int a, int b,int c) {
        return a + b + c;
    }
    public static int sum(int a, int b,int c ,int d) {
        return a + b + c + d;
    }

    public static double sum(double a, double b) {
        return a + b;
    }
    public static void main1(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        System.out.println(max(a,b,c));
    }
    static int max (int a, int b,int c) {
        int max = 0;
        if (a > b) {
            max = a;
        } else {
            max = b;
        }
        if (b > c) {
            max = b;
        } else {
            max = c;
        }
        return max;
    }


}
