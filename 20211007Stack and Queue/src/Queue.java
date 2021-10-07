/**
 * @Author: 江桂煌
 * @Description: 用单链表实现队列
 * @DateTime: 2021/10/7 18:27
 **/
class Node {
    private int data;
    private Node next;

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node(int data) {
        this.data = data;
    }
}
public class Queue {
    private Node head;
    private Node tail;
    // 队尾入队列
    public void push(int data) {
        Node newNode = new Node(data);
        if (this.head == null) {
            this.head = newNode;
            this.tail = newNode;
            return;
        }
        this.tail.setNext(newNode);
        this.tail = this.tail.getNext();
    }
    //队列展示 仅用于测试
    public void show() {
        StringBuffer sb = new StringBuffer();
        Node cur = this.head;
        while (cur != null) {
            sb.append(cur.getData() + " -> ");
            cur = cur.getNext();
        }
        sb.append("null");
        System.out.println(sb.toString());
    }
    // 队头出队列
    public void pop() {
        //没结点
        if (this.head == null) {
            throw new RuntimeException("队列为空！！");
        }
        //只有一个结点
        if (this.head == this.tail) {
            this.head = null;
            this.tail = null;
            return;
        }
        this.head = this.head.getNext();

    }
    //返回对头的值
    public int getFront() {
        if (this.head == null) {
            throw new RuntimeException("队列为空！！");
        }
        return this.head.getData();
    }
    //返回对尾的值
    public int getBack() {
        if (this.head == null) {
            throw new RuntimeException("队列为空！！");
        }
        return this.tail.getData();
    }
    public int getSize() {
        Node cur = this.head;
        int count = 0;
        while (cur != null) {
            count++;
            cur = cur.getNext();
        }
        return count;
    }
    public boolean isEmtpy() {
        if (this.head == null) {
            return true;
        }
        return false;
    }
    public void destory() {
        this.head = null;
        this.tail = null;
    }
}
