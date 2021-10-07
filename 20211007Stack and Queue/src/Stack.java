import java.util.Arrays;

/**
 * @Author: 江桂煌
 * @Description: 用顺序表实现栈
 * @DateTime: 2021/10/7 18:27
 **/
public class Stack {
    private int[] elem;
    private int capacity;
    private int usedSize;

    public Stack() {
        this.elem = new int[10];
        this.capacity = 10;
    }
    private void isFull() {
        if (this.usedSize == this.capacity) {
            this.elem = Arrays.copyOf(this.elem, this.capacity * 2);
            this.capacity *= 2;
        }
    }
    //入栈
    public void StackPush(int num) {
        //扩容检查
        isFull();
        this.elem[this.usedSize] = num;
        this.usedSize++;
    }
    //出栈
    public void StackPop() {
        if (this.usedSize == 0) {
            throw new RuntimeException("栈中无元素！");
        }
        this.usedSize--;
    }
    //打印栈（仅用于测试）
    public void show() {
        if (this.elem == null) {
            System.out.println("null");
            return;
        }
        StringBuffer sb = new StringBuffer();
        sb.append("[");
        for (int i = 0; i < this.usedSize; i++) {
            if (i != this.usedSize - 1) {
                sb.append(this.elem[i] + ", ");
            } else {
                sb.append(this.elem[i] + "");
            }
        }
        sb.append("]");
        System.out.println(sb.toString());
    }
    //获得栈顶元素的值
    public int getStackTop() {
            if (this.usedSize == 0) {
                throw new RuntimeException("栈中无元素！");
            }
            return this.elem[this.usedSize - 1];
    }
    //获得栈有效元素个数
    public int getUsedSize() {
        return this.usedSize;
    }
    //栈是否为空
    public boolean isEmtpy() {
        if (this.usedSize == 0) {
            return true;
        } else {
            return false;
        }
    }
    public void destroy() {
        this.usedSize = 0;
    }
}
