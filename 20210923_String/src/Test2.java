/**
 * @Author: 江桂煌
 * @Description: TODO
 * @DateTime: 2021/9/25 11:30
 **/
public class Test2 {
    public static String reverse(String str,int left, int right) {
        char[] arr = str.toCharArray();
        while (left < right) {
            char tmp = arr[left];
            arr[left] = arr[right];
            arr[right] = tmp;
            left++;
            right--;
        }
        return new String(arr);
    }

    public static String leftRotate(String str, int count) {
        count %= str.length();
        str = reverse(str, 0, count - 1);
        str = reverse(str, count, str.length() - 1);
        str =reverse(str, 0, str.length() - 1);
        return str;
    }
    public static void main(String[] args) {
        String str = "abcdef";
        String ret = leftRotate(str, 8);
        System.out.println(ret);
    }
}
