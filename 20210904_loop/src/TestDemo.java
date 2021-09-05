import org.omg.CORBA.MARSHAL;

import java.util.Random;
import java.util.Scanner;

/**
 * @Author: 江桂煌
 * @Description: TODO
 * @DateTime: 2021/9/4 10:38
 **/

public class TestDemo {
    public static void main12(String[] args) {
        //获取一个数二进制序列中所有的偶数位和奇数位（多画图）
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.print("二进制奇数位为");
        for (int i = 31; i >= 1; i -= 2) {
            System.out.print(((n >> i)&1)+" ");
        }
        System.out.print("二进制偶数位为");
        for (int i = 30; i >= 0; i -= 2) {
            System.out.print(((n >> i)&1)+" ");
        }
    }
    public static void main11(String[] args) {
        //写一个函数返回参数二进制中 1 的个数（层层剥离法）
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int count =0;
        while (n != 0) {
            n &= (n-1);
            count++;
        }
        System.out.println(count);
    }
    public static void main10(String[] args) {
        //模拟密码登录 三次输入错误 退出程序
        Scanner scan = new Scanner(System.in);
        int count = 3;
        while (count != 0) {
            System.out.println("请输入密码:>");
            String password = scan.nextLine();
            if (password.equals("123456")) {
                System.out.println("登录成功");
                break;
            } else {
                count--;
                System.out.println("密码错误，你还有"+count+"次机会");
            }
        }
    }
    public static void main9(String[] args) {
        //求一下六位数以内的自幂数
        //1 创建一个临时变量 求数字的十进制位数count
        //2 创建一个临时变量 求数字的各个十进制位的count次幂的和
        //3 把上面的结果和数字进行比较
        for (int i = 0; i <= 999999; i++ ) {
            int tmp = i;
            int count = 1;
            while (tmp / 10 != 0) {
                count++;
                tmp /= 10;
            }
            tmp = i;
            int sum = 0;
            while (tmp != 0) {
                sum += Math.pow(tmp % 10, count);
                tmp /= 10;
            }
            if (sum == i) {
                System.out.print(i+" ");
            }
        }
    }
    public static void main8(String[] args) {
        //数数看 0 到 100 里出现了几个数字9 注：只能循环一次
        int count = 0;
        for (int i = 0; i <= 99; i++) {
            if (i % 10 == 9) {
                count++;
            }
            if (i / 10 == 9) {
                count++;
            }
        }
        System.out.println(count);
    }
    public static void main7(String[] args) {
        // 计算1/1-1/2+1/3-1/4+1/5 …… + 1/99 - 1/100 的值
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int flg =1;
        double sum = 0;
        for (int i = 1; i < n; i++) {
            sum += 1.0 / i * flg;
            flg = -flg;
        }
        System.out.println(sum);
    }
    public static void main6(String[] args) {
        //两个数的最小公因数
        Scanner scan = new Scanner(System.in);
        System.out.print("请输入两个整数:>");
        int a = scan.nextInt();
        int b = scan.nextInt();
        while (a % b != 0) {
            int c = a % b;
            a = b;
            b = c;
        }
        System.out.println("两个数的最小公因数是" + b);
    }
    public static void main5(String[] args) {
        //输出1到n中的所有素数 记得要适当优化
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int i = 2; i <= n; i++) {
            int j = 2;
            for ( ; j <= (int) Math.sqrt(i); j++) {
                if (i % j == 0) {
                    break;
                }
            }
            if (j >(int) Math.sqrt(i)) {
                System.out.print(i+" ");
            }
        }
    }
    public static void main4(String[] args) {
        //猜数字
        Random random = new Random();
        Scanner scan = new Scanner(System.in);
        int randomNum = random.nextInt(100)+1;
        while (true) {
            System.out.print("请输入你要猜的数字:>");
            int num = scan.nextInt();
            if (num > randomNum) {
                System.out.println("猜大了哥哥");
            } else if (num < randomNum) {
                System.out.println("猜小了弟弟");
            } else {
                System.out.println("猜对了爷");
            }
        }

    }
    public static void main3(String[] args) {
        //使用Scannner读取n个数字
        Scanner scan = new Scanner(System.in);
        System.out.println("这是一个复读机");
        while (scan.hasNextInt()) {
            int num = scan.nextInt();
            System.out.println(num);
        }
    }

    public static void main2(String[] args) {
        //求1到n的阶乘的和
        //方法1 ：嵌套循环法
//        Scanner scan = new Scanner(System.in);
//        int n = scan.nextInt();
//        int sum = 0;
//        for (int i = 1; i <= n; i++) {
//            int tmp = 1;
//            for (int j = 1; j <= i; j++) {
//                tmp *= j;
//            }
//            sum += tmp;
//        }
//        System.out.println(sum);
        //方法2：单层循环法
        //方法1 ：嵌套循环法
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int sum = 0;
        int tmp = 1;
        for (int i = 1; i <= n; i++) {
            tmp *= i;
            sum += tmp;
        }
        System.out.println(sum);
    }
    public static void main1(String[] args) {
        //1到n之间第一个能被3又被5整除的数
        Scanner scan = new Scanner(System.in);
        int bound = scan.nextInt();
        for (int i = 1; i <= bound; i++) {
            if (i % 15 == 0){
                System.out.println(i);
                break;
            }
        }
    }
}
