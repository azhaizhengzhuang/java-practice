import java.util.Arrays;

/**
 * @Author: 江桂煌
 * @Description: TODO
 * @DateTime: 2021/9/23 15:02
 **/
public class Test1 {
    public static void main(String[] args) {
        //字符串修剪
        String str1 = "           abc        def          ";
        System.out.println(str1.trim());

    }
    public static void main12(String[] args) {
        //字符串截取
        String str1 = "abcdef";
        System.out.println(str1.substring(2));
        System.out.println(str1.substring(2, 5));
    }
    public static void main11(String[] args) {
        //字符串替换
        String str1 = "abcabc";
//        System.out.println(str1.replace('a', 'b'));
//        System.out.println(str1.replaceAll("ab", "hh"));
        //System.out.println(str1.replace('e', 'f'));
        //System.out.println(str1.replace("aaa", "bbb"));
        System.out.println(str1.replaceFirst("ab", "hh"));

    }
    public static void main10(String[] args) {
        //字符串比较相等
        String str1 = "abcdef";
        String str2 = "ABcdEf";
        System.out.println(str1.equals(str2));
        System.out.println(str1.equalsIgnoreCase(str2));

        //大小
        System.out.println(str1.compareTo(str2));
        System.out.println(str1.compareToIgnoreCase(str2));

        String str3 = "abcdefghi";
        String str4 = "abcdef";
        System.out.println(str3.compareTo(str4));
        System.out.println("啊".compareTo("必"));
    }
    public static void main9(String[] args) {
        //字节和字符串的转换
        byte[] b = {97, 98,99,100};
        String str = new String(b);
        System.out.println(str);

        String str2 = "hahaha";
        byte[] b2 = str2.getBytes();
        System.out.println(Arrays.toString(b2));
    }
    public static void main8(String[] args) {
        //字符数组和字符串的转换
        char[] val = {'a', 'b', 'c', 'd'};
        String str3 = new String(val, 1, 3);
        System.out.println(str3);

        String str ="abcdef";
        System.out.println(str.charAt(0));
        System.out.println(str.charAt(1));
        System.out.println(str.charAt(2));
    }
    public static void main7(String[] args) {
        //通过拼接理解字符串不可变性
        String str1 = "abc";
        str1 += "def";
        str1 += "ghi";
        //由于字符串不可改变且唯一 所以一共有五个字符串常量

    }
    public static void main6(String[] args) {
        //手动入池
        String str1 = "abc";
        String str2 = new String("abc").intern();
        System.out.println(str1 == str2);
    }
    public static void main5(String[] args) {
        //字符串相等
        String str1 = "abc";
        String str2 = new String("abc");
        String str3  = "abc";
        System.out.println(str1.equals(null));
        System.out.println(str1.equals(str3));
        System.out.println("abc".equals(str3));

        //启示
        //1 常量池里的对象的内存结构没有本质区别
        //2 用字符串equa方法时 不要对null调用equals方法
    }
    public static void func(String str2, int[] val) {
        str2 = "def";
        val[0] = 2;
    }
    public static void main4(String[] args) {
        //深入理解引用
        String str1 = "abc";
        int[] val = {3};
        System.out.println(str1);
        System.out.println(val[0]);
        func(str1, val);
        System.out.println("===============");
        System.out.println(str1);
        System.out.println(val[0]);
    }
    public static void main3(String[] args) {
        String str1 = "abc";
        String str2 = "ab" + "c";
        System.out.println(str1 == str2);//true
        String str3 = new String("ab") + "c";//false 后者在堆上创建
        System.out.println(str1 == str3);
    }
    public static void main2(String[] args) {
        String str1 = "abc";
        String str2 = new String("abc");
        System.out.println(str1 == str2);//false

        String str3 = "abc";
        System.out.println(str1 == str3);//true
    }
    public static void main1(String[] args) {
        //字符串的三种构造方法
        //1.直接赋值
        String str1 = "abc";
        //2.使用origin
        String str2 = new String("abc");
        //3、把字符数组转换为字符串
        char[] val = {'a', 'b', 'c'};
        String str3 = new String(val);
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
    }
}
