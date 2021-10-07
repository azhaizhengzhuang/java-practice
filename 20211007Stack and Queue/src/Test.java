/**
 * @Author: 江桂煌
 * @Description: TODO
 * @DateTime: 2021/10/7 18:28
 **/
public class Test {
    public static void stackTest() {
        Stack stack = new Stack();
        for (int i = 0; i < 20; i++) {
            stack.StackPush(i);
        }

        System.out.println(stack.isEmtpy());
        System.out.println(stack.getUsedSize());
        stack.destroy();
        System.out.println(stack.isEmtpy());
        System.out.println(stack.getUsedSize());
    }
    public static void queueTest() {
        Queue queue = new Queue();
        for (int i = 0; i < 10; i++) {
            queue.push(i);
            queue.show();
        }
        System.out.println(queue.getFront());
        System.out.println(queue.getBack());
        System.out.println(queue.getSize());
    }

    public static void main(String[] args) {
//        stackTest();
        queueTest();
    }
}
