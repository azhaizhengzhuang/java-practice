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
    //顺序表初始化
    public MyArrayList() {
       this.elem = new int[10];
       this.usedSize = 0;
    }
    private void inserCheck(int pos) {
        if (pos < 0 || pos > this.usedSize) {
            throw new RuntimeException("下标不合法！");
        }
    }
    private void existCheck(int pos) {
        if (pos < 0 || pos >= this.usedSize) {
            throw new RuntimeException("下标不合法！");
        }
    }
    private void isFull() {
        if (this.elem.length == this.usedSize) {
            this.elem = Arrays.copyOf(this.elem, 2 * this.elem.length);
        }
   }
    //在pos位置新增元素

    public void add(int pos,int data) {
        isFull();
        inserCheck(pos);
        for (int i = this.usedSize - 1; i >= pos; i--) {
            this.elem[i + 1] = this.elem[i];
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
       existCheck(pos);
       return this.elem[pos];
    }
    // 给 pos 位置的元素设为 value
    public void setPos(int pos, int value) {
        int tmp = this.search(pos);
        if (pos == -1) {
            return;
        }
        this.elem[tmp] = value;
    }
    //删除第一次出现的关键字key
    public void remove(int toRemove) {
        int pos = this.search(toRemove);
        if (pos == -1) {
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

    @Override
    public String toString() {
        String str = "";
        for (int i = 0; i < this.usedSize; i++) {
            str += this.elem[i];
            if (i != this.usedSize - 1) {
                str += ", ";
            }
        }
        return "MyArrayList{" +
                "elem=" + str +
                '}';
    }
}
public class Test1 {
    public static void main(String[] args) {
       MyArrayList list = new MyArrayList();
        for (int i = 0; i < 19; i++) {
            list.add(i,i);
        }
        System.out.println(list);
        System.out.println(list.size());
        list.clear();
        System.out.println(list);
    }
}


