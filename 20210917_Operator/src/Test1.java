/**
 * @Author: 江桂煌
 * @Description: TODO
 * @DateTime: 2021/9/17 15:58
 **/
import java.util.*;
class Tank {
    float x;
}
class Num {
    float f;
}
public class Test1 {
    static void f(Num y) {
        y.f = 2.56f;
    }
    public static void main(String[] args) {
        //对象调用的别名机制
//        Tank t1 = new Tank();
//        Tank t2 = new Tank();
//        t1.f = 3.14f;
//        t2.f = 4.56f;
//        System.out.print("t1.f = "  + t1.f);
//        System.out.println( ",t2.f = " + t2.f);
//        t1 = t2;
//        System.out.print("t1.f = "  + t1.f);
//        System.out.println( ",t2.f = " + t2.f);
//        t1.f = 2.33f;
//        System.out.print("t1.f = "  + t1.f);
//        System.out.println( ",t2.f = " + t2.f);

        //方法调用的别名机制
        Num num = new Num();
        num.f = 3.14f;
        System.out.println(num.f);
        f(num);
        System.out.println(num.f);

    }
}
