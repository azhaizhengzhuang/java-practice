/**
 * @Author: 江桂煌
 * @Description: 字符串查找算法研究
 * @DateTime: 2021/9/26 15:45
 **/
public class Test6 {

    public static int myContains2(String str, String sub) {
        //朴素算法改进
        //1返回索引
        //2没有把主串转为字符数组

        if (str == null || sub == null) {
            return -1;
        }
        int strLen = str.length();
        int subLen = sub.length();
        if (strLen == 0 || subLen == 0 || subLen > strLen) {
            return -1;
        }
        int i = 0;
        int j = 0;
        while (i < strLen && j < subLen) {
            if (str.charAt(i) == sub.charAt(j)) {
                i++;
                j++;
            } else {
                i = i - j + 1;
                j = 0;
            }
        }
        if (j == subLen) {
            return  i - j;
        }
        return -1;
    }

    public static boolean myContains1(String str, String str1) {
        //朴素查找
        //1把字符串转为字符数组
        //2暴力查找
        char[] arr = str.toCharArray();
        char[] arr1 = str1.toCharArray();
        for (int i = 0; i <= arr.length - arr1.length; i++) {
            int j = 0;
                while (arr[i + j] == arr1[j]) {
                    if (j == arr1.length - 1) {
                        return true;
                    }
                j++;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String str = "aababcabcd";
        System.out.println(myContains2(str, "a"));
        System.out.println(myContains2(str, "abc"));
        System.out.println(myContains2(str, "aasd"));

    }
}
