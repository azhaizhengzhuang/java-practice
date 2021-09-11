import java.util.function.DoubleToIntFunction;

/**
 * @Author: 江桂煌
 * @Description:
 * 访问修饰限定符：
 * public：
 * private:
 * protected:
 * @DateTime: 2021/9/9 10:02
 **/


class Person {

    String name = "azhai";
    int age = 22;
    char c;
    boolean b;
    static int i = 999;
    public void eat() {
        System.out.println("吃！");
    }
    public void sleep() {
        System.out.println("睡！");
    }
    public static void work() {
        //静态方法内部 不能访问非静态的方法成员
        i = 22;
        System.out.println("码！");
    }
    public void show() {
        System.out.println("我叫" + name + ",我今年" + age + "岁");
    }
}
class Test {
    int i = 0;
    static int j = 0;
}
public class TestDemo {
    public static void main(String[] args) {
        //深入理解静态成员变量
        Test test1 = new Test();
        test1.i++;
        Test.j++;
        System.out.println("i:" + test1.i +" " + "j:" + Test.j);
        Test test2 = new Test();
        test2.i++;
        Test.j++;
        System.out.println("i:" + test2.i +" " + "j:" + Test.j);
    }
    public static void main3(String[] args) {
        //调用成员变量
        Person per = new Person();
        //调用实例成员变量
        per.eat();
        per.sleep();
        per.show();
        per.name = "sb";
        per.age = -1;
        per.show();
        //调用静态成员变量
//        per.work();//用对象调用静态成员方法会报警告
        Person.work();//正确的调用静态成员方法
    }
    public static void main2(String[] args) {
        //通过操作符 访问成员变量
        //实例成员变量
        Person per = new Person();
//      System.out.println(per.name);//默认值null
//      System.out.println(per.age);//默认值0
//      System.out.println(per.c);//'默认值\u0000'
//      System.out.println(per.b);//默认值false
//      System.out.println(per.name);//初始化之后的实例成员变量
//      per.name = "haha";
//      System.out.println(per.name);
//      System.out.println(per.age);

        //用对象实例访问静态成员变量会警告
//        System.out.println(per.i);
        //用类名访问静态成员变量才合理
        System.out.println(Person.i);

    }
    public static void main1(String[] args) {
        //实例化对象
        Person person1 = new Person();
        Person person2 = new Person();
        Person person3 = new Person();
        Person person4 = new Person();
    }
}
