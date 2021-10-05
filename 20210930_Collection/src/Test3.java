/**
 * @Author: 江桂煌
 * @Description: TODO
 * @DateTime: 2021/10/1 17:01
 **/
import java.util.Arrays;
public class Test3 {
    public static void func(int j) {
        System.out.println("haha");
        for (int i = 0; i < 50; i++) {
            System.out.println(i + j);
        }
    }
    public static void main(String[] args) {
        for (int i = 0; i < 50; i += 10) {
            Arrays.toString(new int[10]);
            func(i);
        }
    }
}
