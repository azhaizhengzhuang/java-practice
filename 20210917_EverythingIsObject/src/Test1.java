/**
 * @Author: 江桂煌
 * @Description: 一切都是对象
 * @DateTime: 2021/9/17 11:01
 **/
import java.util.ArrayList;
import java.util.*;

class ClassA {
    int i;
    char c;
    int storage(String s) {
        return s.length() * 2;
    }
}

class ATypeName {
    public void print() {
        System.out.println("I am ATypeName");
    }

}
class DataOnly {
    int i;
    double d;
    boolean b;
}

class StaticTest {
    static int i = 47;
}
class Incrementable {
    static void increment() {
        StaticTest.i++;
    }
}
class AllTheColorOfRainbow {
    int anInergerRepresentingColors;
    public void changeTheHueOfTheColor(int newHue) {
        this.anInergerRepresentingColors = newHue % 7 + 1;
    }
    void showColor() {
        switch(this.anInergerRepresentingColors) {
            case 1:
                System.out.println("RED");
                break;
            case 2:
                System.out.println("ORANGE");
                break;
            case 3:
                System.out.println("YELLOW");
                break;
            case 4:
                System.out.println("GREEN");
                break;
            case 5:
                System.out.println("CYAN");
                break;
            case 6:
                System.out.println("BLUE");
                break;
            case 7:
                System.out.println("PURPLE");
                break;
            default:
                System.out.println("WHITE");
                break;
        }
    }
    public AllTheColorOfRainbow() {
        this.anInergerRepresentingColors = 1;
    }
}
public class Test1 {
    public static void main(String[] args) {
        //打印命令行参数
//        System.out.println(args[0]);
//        System.out.println(args[1]);
//        System.out.println(args[2]);

        AllTheColorOfRainbow  a = new AllTheColorOfRainbow();
        a.showColor();
        a.changeTheHueOfTheColor(6);
        a.showColor();
    }
    public static void main1(String[] args) {
//        ClassA a = new ClassA();
//        System.out.println(a.i);
//        System.out.println(a.c);

//        System.out.println("Hello, World");

//        ATypeName b = new ATypeName();
//        b.print();

//        DataOnly c = new DataOnly();
//        c.i = 4399;
//        c.d = 3.14;
//        c.b = true;
//        System.out.println(c.i);
//        System.out.println(c.d);
//        System.out.println(c.b);

//        Incrementable.increment();
//        System.out.println(StaticTest.i);
//        Incrementable.increment();
//        System.out.println(StaticTest.i);
//        Incrementable.increment();
//        System.out.println(StaticTest.i);

//        StaticTest t1 = new StaticTest();
//        t1.i++;
//        System.out.println(t1.i);
//        StaticTest t2 = new StaticTest();
//        t2.i++;
//        System.out.println(t2.i);
//        StaticTest t3 = new StaticTest();
//        t3.i++;
//        System.out.println(t3.i);

//        String s = "abc";
//        ClassA a = new ClassA();
//        System.out.println(a.storage(s));

        //基本类型和包装类型的相互转换(自动包装功能)
//        Boolean Bool = false;
//        boolean bo = Bool;
//
//        Character ch = 'x';
//        char c = ch;
//
//        Byte B = 1;
//        byte bt = B;
//
//        Short sh = 1;
//        short s = sh;
//
//        Integer i = 1;
//        int in = i;
//
//        Long L = 10L;
//        long l = L;
//
//        Float F = 3.14f;
//        float f = F;
//
//        Double D = 3.14;
//        double d = D;









    }
}