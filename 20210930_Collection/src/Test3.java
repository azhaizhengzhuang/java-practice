/**
 * @Author: 江桂煌
 * @Description: TODO
 * @DateTime: 2021/10/1 17:01
 **/
import java.util.Arrays;
public class Test3 {


        public static int[] sortByBits(int[] arr) {
            //高位密码值
            int len = arr.length;
            for (int i = 0; i < len; i++) {
                //存储密码
                int ret = arr[i];
                int count = 0;
                while (ret != 0) {
                    ret &= ret - 1;
                    count++;
                }
                arr[i] |= (count << 20);
            }
            Arrays.sort(arr);
            for (int i = 0; i < len; i++) {
                arr[i] %= (1 << 20);
            }
            return arr;

        }

    public static void main(String[] args) {
        int[] test = {1, 2, 3, 4, 5, 6};
        System.out.println(Arrays.toString(sortByBits(test)));
    }
}
