/**
 * @Author: 江桂煌
 * @Description: 第五次独立实现单链表
 * @DateTime: 2021/9/12 15:50
 **/
class Node {
    int data;
    Node next;
    public Node(int data) {
        this.data = data;
    }
}
public class SingleLinkedList {
    Node head;
    //头插法
    public void addFirst(int data){
       Node newNode = new Node(data);
       newNode.next = this.head;
       this.head = newNode;
    }
    //尾插法
    public void addLast(int data){
        Node newNode = new Node(data);
        if (this.head == null) {
            this.head = newNode;
            return;
        }
        Node cur = this.head;
        while (cur.next != null) {
            cur = cur.next;
        }
        cur.next = newNode;
    }
    //返回下标为index-1的节点
    private Node lastNode(int index) {
        if (index < 0 || index > this.size()) {
            throw new RuntimeException("index不合法");
        }
        Node cur = this.head;
        int pos = 0;
        while (pos < index - 1) {
            pos++;
            cur = cur.next;
        }
        return cur;
    }
    //任意位置插入,第一个数据节点为0号下标
    public void addIndex(int index,int data){
        if (index == 0) {
            this.addFirst(data);
            return;
        }

        if (index == this.size()) {
            this.addLast(data);
            return;
        }

        Node lastNode = this.lastNode(index);
        Node newNode = new Node(data);
        newNode.next = lastNode.next;
        lastNode.next = newNode;
    }
    //查找是否包含关键字key是否在单链表当中
    public boolean contains(int key) {
        Node cur = this.head;
        while (cur != null) {
            if (cur.data == key) {
                return true;
            }
            cur = cur.next;
        }
       return false;
    }
    //删除第一次出现关键字为key的节点
    public void remove(int key){
        Node cur = this.head;
        Node prev = null;
        while (cur != null) {
            if (cur.data == key) {
                if (this.head.data == key) {
                    this.head = this.head.next;
                } else {
                    prev.next = cur.next;
                }
                return;
            }
            prev = cur;
            cur = cur.next;
        }
    }
    //删除所有值为key的节点
    public void removeAllKey(int key) {
        Node cur = this.head;
        Node prev = null;
        while (cur != null) {
            if (cur.data == key) {
                if (this.head.data == key) {
                    this.head = this.head.next;
                } else {
                    prev.next = cur.next;
                }
            } else {
                prev = cur;
            }
            cur = cur.next;
        }
    }

    //得到单链表的长度
    public int size() {
       int count = 0;
       Node cur = this.head;
       while (cur != null) {
           count++;
           cur = cur.next;
       }
       return count;
    }
    public void display(){
       Node cur = this.head;
       while (cur != null) {
           System.out.print(cur.data + " -> ");
           cur = cur.next;
       }
        System.out.println("null");
    }
    public void clear() {
        this.head = null;
    }
    
}



