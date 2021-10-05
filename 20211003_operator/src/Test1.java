import java.util.Random;
import java.util.Scanner;

/**
 * @Author: 江桂煌
 * @Description: TODO
 * @DateTime: 2021/10/3 21:42
 **/


public class Test1 {
    public static void stringFunc(String str1, String str2) {
        System.out.println("str1 == str2 : " + str1 == str2);
        System.out.println("str1 == str2 : " + str1 != str2);
        System.out.println("str1 equals str2 : " + str1.equals(str2));

    }
    public static void main(String[] args) {
        //字符串赋值操作符相关的练习
        stringFunc("hehe", "haha");
        stringFunc("xixi", "gaga");
        stringFunc("ahah", "ouou");
    }
    public static void showCharBinaryString(char ch) {
        //移位操作符练习3
        System.out.println(Integer.toBinaryString(ch));
    }
    public static void main8(String[] args) {
        showCharBinaryString('a');
        showCharBinaryString('b');
        showCharBinaryString('c');
        showCharBinaryString('d');
    }
    public static void main7(String[] args) {
        //移位操作符练习2
        int i = 0xffffffff;
        System.out.println(Integer.toBinaryString(i));

        i >>= 1;
        System.out.println(Integer.toBinaryString(i));

        while (i != 0) {
            i >>>= 1;
            System.out.println(Integer.toBinaryString(i));
        }

    }
    public static void main6(String[] args) {
        //移位操作符练习1
        int i = 0x40000000;
        while (i != 0) {
            System.out.println(Integer.toBinaryString(i));
            i >>= 1;
        }
        System.out.println(Integer.toBinaryString(i));
    }
    public static void main5(String[] args) {
        //按位操作符
        int num1 = 0xaaaaaa;
        int num2 = 0x555555;
        System.out.println(Integer.toBinaryString(num1));
        System.out.println(Integer.toBinaryString(num2));

        System.out.println(Integer.toBinaryString(num1 & num2));
        System.out.println(Integer.toBinaryString(num1 | num2));
        System.out.println(Integer.toBinaryString(num1 ^ num2));
    }
    public static void main4(String[] args) {
        System.out.println(Float.MAX_VALUE);
        System.out.println(Float.MIN_VALUE);
        System.out.println(Double.MAX_VALUE);
        System.out.println(Double.MIN_VALUE);
    }
    public static void main3(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = 07;
        System.out.println( Long.toBinaryString(a));
    }

    public static void main2(String[] args) {
        //模拟扔硬币
        Random random = new Random();
        int result = random.nextInt() % 2;
        if (result == 1) {
            System.out.println("正面！");
        } else {
            System.out.println("反面！");
        }
    }

    public static void main1(String[] args) {
        Dog dog1 = new Dog("spot", "Ruff!");
        Dog dog2 = new Dog("scruffy", "Wurf!");
//        System.out.println(dog1.name);
//        System.out.println(dog1.says);
//        System.out.println(dog2.name);
//        System.out.println(dog2.says);
        Dog dog3 = dog1;
        System.out.println(dog1 == dog2);
        System.out.println(dog1 == dog3);
        System.out.println(dog2 == dog3);
        //由于没有重写Dog的equals方法 所以Dog的equals方法仍比较引用的值
        System.out.println(dog1.equals(dog2));
        System.out.println(dog1.equals(dog3));
        System.out.println(dog2.equals(dog3));
    }
}
