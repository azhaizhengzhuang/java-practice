/**
 * @Author: 江桂煌
 * @Description: try catch
 * @DateTime: 2021/10/2 11:13
 **/
public class Test1 {
    public static void func2(int a) throws MyException {
        if (a == 10) {
        throw  new MyException("这是一个自定义异常！");
        }
    }
    public static void main1(String[] args) throws MyException {

        try {
            func2(10);
        } catch (MyException e) {
            e.printStackTrace();
        }
        System.out.println("good");
    }
    public static void func() {
        String str = null;
        try {
            System.out.println(str.length());
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
        } finally {
            System.out.println("hehe");
        }
    }
    public static void main2(String[] args) {
        func();
        System.out.println("haha");
    }

    public static boolean uniqueOccurrences(int[] arr) {
        //差分数组
        int len = arr.length;
        int[] freq = new int[2001];
        int offset = 1000;
        for (int i = 0; i <len; i++) {
            freq[arr[i] + offset]++;
        }
        int[] existFreq = new int[2001];

        for (int i = 0; i < freq.length; i++) {
            if (freq[i] != 0 && existFreq[freq[i]] == 0) {
                existFreq[freq[i]] = 1;
            } else if (freq[i] != 0 && existFreq[freq[i]] == 1) {
                return false;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {-1000};
        System.out.println(uniqueOccurrences(arr));
    }
}
