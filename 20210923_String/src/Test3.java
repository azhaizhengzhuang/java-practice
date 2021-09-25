import java.util.Arrays;

/**
 * @Author: 江桂煌
 * @Description: 各种字符串的方法使用
 * @DateTime: 2021/9/25 22:14
 **/
public class Test3 {


    public static void main(String[] args) {
        //字符串其他方法
//        String str = "   abc   def     ";
//        System.out.println(str.trim());

//        String str = "abcDef";
//        System.out.println(str.toLowerCase());
//        System.out.println(str.toUpperCase());
//        System.out.println(str);

//        String str = new String("abc".intern());
//        System.out.println(str);

//        String str = "abc";
//        System.out.println(str.concat("def"));
//        System.out.println(str);

//        String str = "";
//        String str2 = null; //NullPointerException
//        System.out.println(str2.isEmpty());
    }
    public static void main7(String[] args) {
        //字符串截取
        String str = "abcdefghi";
        str.substring(1);
        System.out.println(str);

        System.out.println(str.substring(1, 2));
    }
    public static void main6(String[] args) {
        //字符串拆分1
//        String str = "abc def ghi";
//        String[] arr = str.split(" ");
//        for (String s:arr) {
//            System.out.println(s);
//        }
        //字符串拆分2
//        String str = "abc def ghi";
//        String[] arr = str.split("");
//        for (String s:arr) {
//            System.out.println(s);
//        }

        //字符串拆分3
//        String str = "abc def ghi";
//        String[] arr = str.split("sss");
//        for (String s:arr) {
//            System.out.println(s);
//        }

        //字符串拆分4
//        String str = "abc def@g h i";
//        String[] arr = str.split(" |@");
//        for (String s:arr) {
//            System.out.println(s);
//        }

        //字符串拆分5
//        String str = "abc def@g h i";
//        String[] arr = str.split(" ");
//        for (String s:arr) {
//            String[] i = s.split("@");
//            for (String j:i) {
//                System.out.println(j);
//            }
//        }

        //字符串拆分6（转义字符）
        String str = "abc.ef@g.h.i";
        String[] arr = str.split("\\.");
        for (String s:arr) {
            String[] i = s.split("@");
            for (String j:i) {
                System.out.println(j);
            }
        }
    }
    public static void main5(String[] args) {
        String str = "hehehahahehehaha";
        System.out.println(str.replace("h", "bb"));
        System.out.println(str.replaceAll("h", "a"));
        System.out.println(str);
        //替换方法是不会改变原字符串的
        // 而会把新字符串进行返回
        System.out.println(str.replaceFirst("he", "bb"));
    }
    public static void main4(String[] args) {
        //字符串查找 包含 索引 头找 尾找
        String str = "abcbabcbhhabchhh";

//        System.out.println(str.contains("abc"));
//        System.out.println(str.contains("ccc"));
//        System.out.println(str.contains("cba"));

//        System.out.println(str.indexOf("haha"));
//        System.out.println(str.indexOf("cba"));

//        System.out.println(str.lastIndexOf("bc"));
//        System.out.println(str.lastIndexOf("bc", 5));

//        System.out.println(str.startsWith("abc"));
//        System.out.println(str.startsWith("ha"));
//        System.out.println(str.startsWith("ha", 9));

        System.out.println(str.endsWith("haha"));
        System.out.println(str.endsWith("hhh"));
    }
    public static void main3(String[] args) {
        //字符串比较 判断相等和判断大小
        String str1 = "abcde";
        String str2= "abcde";
        String str3= "abcdef";
        String str4 = "Abcde";

//        System.out.println(str1.equals(str2));
//        System.out.println(str1.equals(str4));

//        System.out.println(str1.equalsIgnoreCase(str4));

//        System.out.println(str1.compareTo(str2));
//        System.out.println(str1.compareTo(str3));
//        System.out.println(str1.compareTo(str4));

        System.out.println(str1.compareToIgnoreCase(str4));
    }
    public static void main2(String[] args) {
        //字节和字符串互转
//        byte[] arr = {97, 98, 99, 100};
//        String str1 = new String(arr);
//        String str2 = new String(arr, 1, 3);
//        System.out.println(str2);

        String str3 = "abcde";
        System.out.println(Arrays.toString(str3.getBytes()));
    }

    public static void main1(String[] args) {
        //字符和字符串互转
        char[] arr = {'a', 'z', 'h', 'a', 'i'};
        String str1 = new String(arr);
        System.out.println(str1);
//        String str2 = new String(arr, 1, 4);
//        System.out.println(str2);

        System.out.println(str1.charAt(1));
        char[] arr2 = str1.toCharArray();
//        for (char i : arr2) {
//            System.out.println(i);
//        }
        System.out.println(Arrays.toString(arr2));
    }
}
