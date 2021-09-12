import java.util.Arrays;
import java.util.function.DoubleToIntFunction;

/**
 * @Author: 江桂煌
 * @Description: TODO
 * @DateTime: 2021/9/11 18:48
 **/
class MyArrayList {
    private int[] elem;
    private int usedSize;
    private static  int initCapacity = 10;
    private int capacity;


    public int getUsedSize() {
        return usedSize;
    }

    public int getCapacity() {
        return capacity;
    }

    //顺序表初始化
    public MyArrayList() {
        this.elem = new int[initCapacity];
        this.capacity = 10;
    }
    //插入位置合法性检查
    private void inserCheck(int pos) {
        if (pos < 0 || pos > this.usedSize) {
            throw new RuntimeException("坐标位置不合法！");
        }

    }
    //元素存在合法性检查
    private void existCheck(int pos) {
        if (pos < 0 || pos >= this.usedSize) {
            throw new RuntimeException("坐标位置不合法！");
        }
    }
    //顺序表扩容判断
    private void isFull() {
        if (this.usedSize == this.capacity) {
            this.elem = Arrays.copyOf(this.elem,2 * this.capacity);
            this.capacity *= 2;
        }
    }

    //打印顺序表
    public void display() {
        if (this.usedSize == 0) {
            System.out.println("顺序表为空");
        }
        for (int i = 0; i < this.usedSize; i++) {
            System.out.print(elem[i] +" ");
        }
        System.out.println();
    }
    //在pos位置新增元素

    public void add(int pos,int data) {
        inserCheck(pos);
        isFull();
        for (int i = this.usedSize - 1; i >= pos; i--) {
            elem[i + 1] = elem[i];
        }
        elem[pos] = data;
        this.usedSize++;
    }
    //判断某元素是否存在
    public boolean contains(int toFind){
        for (int i = 0; i < this.usedSize ; i++) {
            if (elem[i] == toFind) {
                return true;
            }
        }
        return false;
    }



    //返回某元素的下标 没有则返回-1
    public int search(int toFind) {
        for (int i = 0; i < this.usedSize ; i++) {
            if (elem[i] == toFind) {
                return i;
            }
        }
        return -1;
    }

    // 获取 pos 位置的元素 public int getPos(int pos)
    public int getPos(int pos) {
        existCheck(pos);

        return elem[pos];
    }
    // 给 pos 位置的元素设为 value
    public void setPos(int pos, int value) {
        existCheck(pos);
        elem[pos] = value;
    }
    //删除第一次出现的关键字key
    public void remove(int toRemove) {
        int pos = search(toRemove);
        if (pos < 0 || pos >= this.usedSize) {
            return;
        }
        for (int i = pos; i < this.usedSize - 1; i++) {
            elem[i] = elem[i + 1];
        }
        this.usedSize--;
    }
    // 获取顺序表长度
    public int size() {
        return this.usedSize;
    }
    // 清空顺序表
    public void clear() {
        this.usedSize = 1;
    }
    @Override
    public String toString() {
        return "MyArrayList{" +
                "elem=" + Arrays.toString(elem) +
                ", usedSize=" + usedSize +
                '}';
    }

}
public class Test1 {
    public static void main(String[] args) {
        MyArrayList list = new MyArrayList();
        for (int i = 0; i <= 10; i++) {
            list.add(i, i);
        }

        list.display();
        list.remove(1);
        list.display();
        list.remove(11);
        list.display();
    }
}


