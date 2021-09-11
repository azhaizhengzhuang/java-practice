/**
 * @Author: 江桂煌
 * @Description: TODO
 * @DateTime: 2021/9/10 19:49
 **/
class Student {
    //封装
    //和封装相关的关键字：this（防止局部变量和成员变量命名重复 尽量使用它 代表当前对象的引用）
    private String name;
    private int age;

    public String getName() {
        return name;
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

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
public class Test2 {
    public static void main(String[] args) {
        Student stu = new Student();
        stu.setName("azhai");
        System.out.println(stu.getName());
        System.out.println(stu);
    }
}
