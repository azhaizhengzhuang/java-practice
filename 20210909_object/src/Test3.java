/**
 * @Author: 江桂煌
 * @Description: 类和对象的初始化 主要围绕构造方法和代码块讲解
 * @DateTime: 2021/9/11 8:58
 **/
class Per {
    private String name;
    private int age;

    public Per() {
        //构造方法的嵌套：1只能在构造方法嵌套构造方法 2只能调用一次 3只能写在第一行 4尽量使用this
        this("liubei",112233);
    }

    public Per(String name, int age) {
        this("guanyu");
        this.name = name;
        this.age = age;
    }
    public Per(String name) {
        this.name = name;
        System.out.println(this.name);
    }


    public String getName(String name) {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void sleep() {
        System.out.println("sleep");
    }
   public void work() {
       this.sleep();
       System.out.println(this.name);
   }
    @Override
    public String toString() {
        return "Per{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
class Calculate {
    private int num1;
    private int num2;

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public Calculate(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    public int Add() {
        return this.num1 + this.num2;
    }
    public int Minus() {
        return this.num1 - this.num2;
    }
    public int Mul() {
        return this.num1 * this.num2;
    }
    public int Divide() {
        return this.num1 / this.num2;
    }
    public void swap() {
        int tmp = this.num1;
        this.num1 = this.num2;
        this.num2 = tmp;
    }
}
class Dog {
    private String name;
    private int age;

    public Dog(String name) {
        this.name = name;
    }

    public Dog(int age) {
        this.age = age;
    }

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class Test3 {

    public static void main3(String[] args) {
        Calculate cal = new Calculate(3,4);
        System.out.println(cal.getNum1());
        System.out.println(cal.getNum2());
        cal.swap();
        System.out.println(cal.getNum1());
        System.out.println(cal.getNum2());
    }
    public static void main2(String[] args) {
        Dog one = new Dog("黑鼻");
        Dog two = new Dog(123);
        Dog three = new Dog("黑鼻",123);
        System.out.println(one);
        System.out.println(two);
        System.out.println(three);
    }
    public static void main1(String[] args) {
//    Per per3 = new Per();//构造方法的嵌套是可行的
        Calculate cal = new Calculate(6,2);
        System.out.println(cal.Add());
        System.out.println(cal.Minus());
        System.out.println(cal.Mul());
        System.out.println(cal.Divide());
    }
}
