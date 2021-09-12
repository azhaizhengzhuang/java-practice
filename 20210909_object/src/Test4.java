/**
 * @Author: 江桂煌
 * @Description: TODO
 * @DateTime: 2021/9/11 23:49
 **/
class Fun {
    //类和对象的初始化全过程
    private static int num;



    public Fun() {
        System.out.println("我是构造方法");
    }

    {
        System.out.println("我是实例代码块");
    }

    static {
        System.out.println("我是静态代码块");

    }

}
class Num {
    private int num;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
public class Test4 {
    public static void swap(Num num1,Num num2) {
        int tmp = num1.getNum();
        num1.setNum(num2.getNum());
        num2.setNum(tmp);
    }
    public static void main(String[] args) {
        //实现两个实参的数值互换
        //学到的东西：只有堆中的地址取得到 换句话说 想要获得地址 只能创建对象了取引用了 在这个过程中 只能把对象看成一个个盒子
        Num num1 = new Num();
        Num num2 = new Num();
        num1.setNum(1);
        num1.setNum(1);
        System.out.println(num1.getNum());
        System.out.println(num2.getNum());
        swap(num1,num2);
        System.out.println(num1.getNum());
        System.out.println(num2.getNum());
    }
    public static void main1(String[] args) {
        System.out.println("hehe");
        System.out.println("=========================");
        Fun fun1 = new Fun();
        System.out.println("==========================");
        Fun fun2 = new Fun();
    }
}
