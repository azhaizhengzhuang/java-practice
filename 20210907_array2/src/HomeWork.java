import java.util.Arrays;

/**
 * @Author: 江桂煌
 * @Description: TODO
 * @DateTime: 2021/9/7 16:03
 **/
public class HomeWork {
    /*
    1 数组转字符串
    2 数组拷贝 4种方式均实现
    3  找数组中的最大元素
    4 求数组中元素的平均值
    5 查找数组中指定元素(顺序查找)
    6 查找数组中指定元素(二分查找)
    7 检查数组的有序性（升序）
    8 数组排序(冒泡排序) 记得优化
    9 数组逆序
    10 数组数字排列
     */
    public static String myToString(int[] arr) {
        String str = "[";
        for (int i = 0; i < arr.length; i++) {
            str += arr[i];
            if (i != arr.length - 1) {
                str += ", ";
            }
        }
        str += "]";
        return str;
    }
    public static int[] copyArray(int[] arr) {
        int[] newArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        return newArr;
    }
    public static int maxOfArray(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
    public static double averageOfArray(int[] arr) {
        double sum = 0;
        for (int x : arr) {
            sum += x;
        }
        return  sum / arr.length;
    }
    public static int searchNum(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == key) {
                return i;
            }
        }
        return -1;
    }
    public static int binarySearch(int[] arr, int key) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) >>> 1;
            if(key > arr[mid]) {
                left = mid + 1;
            } else if (key < arr[mid]) {
                right = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
    public static  boolean isSorted (int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if(arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }
    public static void bubbleSort (int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            boolean flag = true;//默认本趟排序中数组已经有序
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                    flag = false;
                }
            }
            if(flag) {
                break;
            }
        }
    }
    public static void reverseArray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int tmp = arr[left];
            arr[left] = arr[right];
            arr[right] = tmp;
            left++;
            right--;
        }
    }
    public static void arrayMove(int[] arr) {
        //偶数在前 奇数在后
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            //前指针找奇数 后指针找偶数 两个指针指向的的元素对调；
            //任何时候只要两指针碰面 停止移动
            while (left < right && arr[left] % 2 == 0) {
                left++;
            }
            while (left < right && arr[right] % 2 != 0) {
                right--;
            }
            if(left < right) {
                int tmp = arr[left];
                arr[left] = arr[right];
                arr[right] = tmp;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int[] arr2 = copyArray(arr);
        int[] arr3 = Arrays.copyOfRange(arr2,0,7);
        System.arraycopy(arr,0,arr3,0,7);
        int[] arr4 = arr3.clone();
        System.out.println(myToString(arr4));

        int max = maxOfArray(arr);
        System.out.println(max);

        System.out.println(averageOfArray(arr));

        System.out.println(searchNum(arr, 7));
        System.out.println(binarySearch(arr, 7));

        System.out.println(isSorted(arr));

        int[] arr5 = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        bubbleSort(arr5);
        System.out.println(myToString(arr5));

        reverseArray(arr5);
        System.out.println(myToString(arr5));

        int[] arr6 = {1,2,3,4};
        arrayMove(arr6);
        System.out.println(myToString(arr6));
    }
}
