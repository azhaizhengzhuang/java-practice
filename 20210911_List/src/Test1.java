import java.util.Arrays;
import java.util.function.DoubleToIntFunction;

/**
 * @Author: 江桂煌
 * @Description: 第四次独立实现顺序表
 * @DateTime: 2021/9/11 18:48
 **/
class MyArrayList {
    int[] elem;
    int usedSize;
    //顺序表初始化
    public MyArrayList() {
        this.elem = new int[10];
    }

    private void insertCheck(int pos) {
        if (pos < 0 || pos > this.usedSize) {
            throw new RuntimeException("pos不合法");
        }
    }

    private void existCheck(int pos) {
        if (pos < 0 || pos >= this.usedSize) {
            throw new RuntimeException("pos不合法");
        }
    }

    private void isFull() {
        if (this.usedSize == this.elem.length) {
            this.elem = Arrays.copyOf(this.elem,this.elem.length * 2);
        }
    }


    //在pos位置新增元素

    public void add(int pos,int data) {
       this.insertCheck(pos);
       isFull();
        for (int i = this.usedSize; i > pos; i--) {
            this.elem[i] = this.elem[i - 1];
        }
        this.elem[pos] = data;
        this.usedSize++;
    }
    //判断某元素是否存在
    public boolean contains(int toFind){

        for (int i = 0; i < this.usedSize; i++) {
            if (this.elem[i] == toFind) {
                return true;
            }
        }
        return false;
    }



    //返回某元素的下标 没有则返回-1
    public int search(int toFind) {
        for (int i = 0; i < this.usedSize; i++) {
            if (this.elem[i] == toFind) {
                return i;
            }
        }
        return -1;
    }

    // 获取 pos 位置的元素 public int getPos(int pos)
    public int getPos(int pos) {
        this.existCheck(pos);
        return this.elem[pos];
    }
    // 给 pos 位置的元素设为 value
    public void setPos(int pos, int value) {
        this.existCheck(pos);
        this.elem[pos] = value;
    }
    //删除第一次出现的关键字key
    public void remove(int toRemove) {
        int pos = this.search(toRemove);
        if (pos == -1) {
            System.out.println("要删除的关键字不存在！");
            return;
        }
        for (int i = pos; i < this.usedSize - 1; i++) {
            this.elem[i] = this.elem[i + 1];
        }
        this.usedSize--;
    }
    // 获取顺序表长度
    public int size() {
        return this.usedSize;
    }
    // 清空顺序表
    public void clear() {
        this.usedSize = 0;
    }
    public void display() {
        for (int i = 0; i < this.usedSize; i++) {
            System.out.print(this.elem[i] + " ");
        }
        System.out.println();
    }

}
public class Test1 {
    public static void main(String[] args) {
        MyArrayList list = new MyArrayList();
        for (int i = 0; i < 12; i++) {
            list.add(i,i);
        }
        list.display();
        list.remove(0);
        list.remove(11);
        list.remove(7);
        list.display();
        list.remove(999);

    }
}


