import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Arrays;

/**
 * @Author: 江桂煌
 * @Description: TODO
 * @DateTime: 2021/9/7 9:34
 **/
public class TestDemo {
    public static void main(String[] args) {
        //二维数组定义的三种方式
        int[][] arr1 = {{1,2,3},{4,5,6}};
        int[][] arr2 = new int[][]{{1,2,3},{4,5,6}};
        int[][] arr3 = new int[2][3];
        int[][] arr4 = new int[2][];//注意 引用类型的默认值为null 因此不能直接对null赋值（因为是地址） 所以应该创建印个新对象 并返回新对象的引用类型

        //数组的遍历
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                System.out.print(arr1[i][j]+" ");
            }
            System.out.println();
        }
        for (int[] tmp : arr1) {
            for (int x : tmp) {
                System.out.print(x+" ");
            }
            System.out.println();
        }
        //二维数组的元素打印方法
        System.out.println(Arrays.deepToString(arr1));
        //不规则二维数组 对于值为null的引用类型 应该创建新的对象
        arr4[0] = new int[]{1, 2, 3};
        arr4[1] = new int[]{1, 2, 3, 4};
        System.out.println(Arrays.deepToString(arr4));
    }
    public static void move (int[] arr) {
        //移动数组中的元素 使得奇数在前，偶数在后
        int left= 0;
        int right = arr.length - 1;
        while (left < right) {
            //左指针找到偶数，右指针找到奇数，两者对换。任何时候，只要left和right碰面，停止操作
            while (left <right && arr[left] % 2 == 1) {
                left++;
            }
            while (left <right && arr[right] % 2 == 0) {
                right--;
            }
            if (left <right) {
                int tmp = arr[left];
                arr[left] = arr[right];
                arr[right] = tmp;
            }
        }
    }
    public static void main6(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        move(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void arrayReverse(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int tmp = arr[left];
            arr[left] = arr[right];
            arr[right] = tmp;
            left ++;
            right --;
        }
    }
    public static void main5(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        arrayReverse(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void binarySearch0(int[] arr) {
        //冒泡排序优化版
        for (int i = 0; i < arr.length - 1; i++) {
            boolean flg = true;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                    flg = false;
                }
            }
            if (flg) {
                break;
            }
        }
    }
    public static void main4(String[] args) {
        int[] arr = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        binarySearch0(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void main3(String[] args) {
        //Arrays.copyOfRange
        int[] arr = {1, 2, 3, 4, 5, 6};
        int[] arr2 = Arrays.copyOfRange(arr,0,6);
        System.out.println(Arrays.toString(arr2));
        //Arrays.fill
        Arrays.fill(arr, 0, 6,10);
        System.out.println(Arrays.toString(arr));

    }
    public static int binarySearch(int[] arr,int key) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) >>> 1;
            if (key > arr[mid]) {
                left = mid + 1;
            } else if (key <arr[mid]) {
                right = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
    public static void main2(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
//        System.out.println(binarySearch(arr, 8));
        //左闭右开
        System.out.println(Arrays.binarySearch(arr, 2, 5, 5));
    }
    public static void main1(String[] args) {

        //拷贝数组的方法一：for
        //拷贝数组的方法二 copyOf
        //拷贝数组的方法三：arraycopy
        //拷贝数组的方法四：数组的clone
//        int[] arr = {1, 2, 3, 4, 5, 6, 7};
//        int[] arr2 = Arrays.copyOf(arr,6);
//        System.out.println(Arrays.toString(arr2));


//        int[] arr = {1, 2, 3, 4, 5, 6, 7};
//        int[] arr2 = new int[arr.length];
//        System.arraycopy(arr,0,arr2,0,arr.length-1);
//        System.out.println(Arrays.toString(arr2));

        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int[] arr2 = arr.clone();
        System.out.println(Arrays.toString(arr2));
    }
//    public static void bubbleSort(int[] arr) {
//        for (int i = 0; i < arr.length - 1; i++) {
//            boolean flg = true;
//            for(int j = 0; j < arr.length - 1 - i; j++) {
//                if(arr[j] > arr[j + 1]) {
//                    int tmp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = tmp;
//                    flg = false;
//                }
//            }
//            if (flg) {
//                break;
//            }
//        }
//    }
//    public static void main(String[] args) {
//        int[] arr = {1,242,543,234,55};
//        bubbleSort(arr);
//        System.out.println(Arrays.toString(arr));
//    }
//    public static boolean isSorted(int[] arr) {
//        for (int i = 0; i < arr.length-1; i++) {
//            if(arr[i] > arr[i + 1]) {
//                return false;
//            }
//        }
//        return true;
//    }
//    public static void main4(String[] args) {
//        int[] arr1 = {1,2,3,4,5,6,7};
//        int[] arr2 = {1,244,3,323,678,23};
//        System.out.println(isSorted(arr1));
//        System.out.println(isSorted(arr2));
//    }
//    public static int binarySearch(int[] arr, int num) {
//        //拓展：二分查找库函数的研究
//        //java底层的排序方法
//        int left = 0;
//        int right = arr.length - 1;
//        while (left <= right) {
//            int mid = (left + right) / 2;
//            if(arr[mid] > num) {
//                right = mid - 1;
//            } else if(arr[mid] < num) {
//                left = mid + 1;
//            } else {
//                return mid;
//            }
//        }
//        return -1;
//    }
//    public static void main3(String[] args) {
//        //常备IEDA和草稿纸 以防不时之需
//        int[] arr = {1,2,3,4,5,6,7};
//        int index = binarySearch(arr, 8);
//        System.out.println(index);
//    }
//    static int maxNumOf(int[] arr) {
//        int max = arr[0];
//        for (int i = 1; i < arr.length; i++) {
//            if(arr[i] > max) {
//                max = arr[i];
//            }
//        }
//        return max;
//    }
//    public static void main2(String[] args) {
//        int[] arr = {1,2,3,4,3,2,1};
//        int tmp = maxNumOf(arr);
//        System.out.println(tmp);
//    }
//    static int[] copyArray(int[] array) {
//        int[] newArray = new int[array.length];
//        for (int i = 0; i < array.length; i++) {
//            newArray[i] = array[i];
//        }
//        return newArray;
//    }
//    public static void main1(String[] args) {
//        int[] arr = {1, 2, 3, 4, 5, 6, 7};
//        int[] newArray = copyArray(arr);
//        System.out.println(Arrays.toString(newArray));
//    }
}
