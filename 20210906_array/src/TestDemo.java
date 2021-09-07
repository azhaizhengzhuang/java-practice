import java.util.Arrays;

/**
 * @Author: 江桂煌
 * @Description: TODO
 * @DateTime: 2021/9/6 13:22
 **/
public class TestDemo {
    static String myToString1(int[] arr) {
        //myToString实现2 使用了字符串操作符+=
        String str = "[";
        for (int i = 0; i < arr.length; i++) {
            str += arr[i];
            if(i != arr.length - 1) {
                str += ", ";
            }
        }
        str += "]";
        return str;
    }

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,0};
        System.out.println(myToString1(arr));
    }
    static int[] doubleArr(int[] arr) {
        //数组作为返回值
        int[] newArr = new int[arr.length];//唯一能给定数组长度且初始化的数组定义方式
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i] * 2;
        }
        return newArr;
    }
    public static void main9(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int[] arr2 = doubleArr(arr);
        System.out.println(Arrays.toString(arr2));
    }
    public static void main8(String[] args) {
        //理解数组的默认值null
        int[] arr = null;
        System.out.println(arr);
        //java中并没有定义null是0地址，只定义了null和 NULL一样 都表示无效的地址
        //用java的角度理解 null指的是空对象
    }
    public static void main7(String[] args) {
        //数组的另一种遍历打印的方式
        int[] arr = {1, 2, 3, 4};
        String str = Arrays.toString(arr);
        System.out.println(str);
    }
    static void swap(int[] arr) {
        //通过传参交换数组的前两个元素
        int tmp = arr[0];
        arr[0] = arr[1];
        arr[1] = tmp;
    }
    public static void main6(String[] args) {
        int[] arr = {10, 20};
        swap(arr);
        for (int val : arr
             ) {
            System.out.print(val + " ");
        }
    }
    static void change(int x) {
        //java的形参是实参的临时拷贝的证明
        x = 20;
        System.out.println("x = " + x);
    }
    public static void main5(String[] args) {
        int a = 10;
        change(a);
        System.out.println("a = " + a);
    }
    public static void main4(String[] args) {
        //数组的越界 抛出：ArrayIndexOutOfBoundsException
//        int[] arr = {1,2,3,4};
//        System.out.println(arr[100]);
    }
    public static void main3(String[] args) {
        //数组的长度与数组的遍历
        int[] arr = {1,2,3,4};
        System.out.println(arr.length);
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
        for (int val : arr) {
            System.out.print(val+" ");
        }
    }
    public static void main2(String[] args) {
        //一维数组额的定义
        int[] arr1 = {1,2,3,4};
        int[] arr2 = new int[] {1,2,3,4};
        int[] arr3= new int[4];
        arr3[0] = 0;
        arr3[1] = 1;
        arr3[2] = 2;
        arr3[3] = 3;
//        System.out.println(arr3[0]);
//        System.out.println(arr1);
    }
    public static String myToString(int[] arr) {
        //模拟toString
        String str = "[";
        for (int i = 0; i < arr.length; i++) {
            if (i != arr.length - 1) {
                str = str + arr[i] + " ,";
            } else {
                str = str + arr[i] + "]";
            }
        }
        return str;
    }
    public static void main1(String[] args) {
        int[] arr = {1, 23, 4, 5, 6, 7};
        System.out.println(myToString(arr));
    }
}
