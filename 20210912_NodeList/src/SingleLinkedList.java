/**
 * @Author: 江桂煌
 * @Description: 单链表
 * @DateTime: 2021/9/12 15:50
 **/
class Node {
   public int data;
   public Node next;

    public Node(int data) {
        this.data = data;
    }
}
public class SingleLinkedList {
    public Node head;
    //头插法
    public void addFirst(int data){
       Node newNode = new Node(data);
       newNode.next = this.head;
       this.head = newNode;
    }
    //尾插法
    public void addLast(int data){
        Node newNode = new Node(data);
        Node cur = this.head;
        if (cur == null) {
            this.head = newNode;
            return;
        }
        while (cur.next != null) {
            cur = cur.next;
        }
        cur.next = newNode;
    }
    //返回下标为index-1的节点
    private Node lastNode(int index) {
        if (index < 0 || index > this.size()) {
            throw new RuntimeException("index不合法！");
        }
        int count = 0;
        Node cur = this.head;
        while (count < index - 1) {
            cur = cur.next;
            count++;
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
                    return;
                } else {
                    prev.next = cur.next;
                    return;
                }
            } else {
                prev = cur;
                cur = cur.next;
            }
        }
        System.out.println("你要删除的节点不存在！");
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
        Node cur = this.head;
        int size = 0;
        while (cur != null) {
            size++;
            cur = cur.next;
        }
        return size;
    }
    public void display(){
        Node cur = this.head;
        while (cur != null) {
            System.out.print(cur.data + " ->");
            cur = cur.next;
        }
        System.out.println("null");
    }
    public void clear() {
        this.head = null;
    }
    
}



