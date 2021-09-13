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
        while (this.head == null) {
            this.head = newNode;
            return;
        }
        Node cur = this.head;
        while (cur.next != null) {
         cur = cur.next;
        }
        cur.next = newNode;
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
        Node newNode = new Node(data);
        Node lastNode = this.searchLastNode(index);
        newNode.next = lastNode.next;
        lastNode.next = newNode;
    }
    //返回下标为index - 1的节点的引用
    private Node searchLastNode(int index) {
        //对index进行合法性检测
        if (index < 0 || index > this.size()) {
            throw new RuntimeException("index不合法！");
        }
        int count = 0;
        Node cur = this.head;
        while (count < index - 1) {
            count++;
            cur= cur.next;
        }
        return cur;
    }
    //查找是否包含关键字key是否在单链表当中
    public boolean contains(int key) {
        Node cur = this.head;
        while (cur != null) {
            if (cur.data == key) {
                return true;
            }
        }
        return false;
    }
    //删除第一次出现关键字为key的节点
    public void remove(int key){
        Node cur = this.head;
        Node pre = null;
        while (cur != null) {
            if (cur.data == key) {
                //要删除头结点时
                if (cur == this.head) {
                    this.head = head.next;
                    return;
                }
                pre.next = cur.next;
                return;
            }
            pre = cur;
            cur = cur.next;
        }
        System.out.println("要删的结点不存在！");
    }
    //删除所有值为key的节点
    public void removeAllKey(int key){
        Node cur = this.head;
        Node pre = null;
        while (cur != null) {
            if (cur.data == key) {
                //要删除头结点时
                if (cur == this.head) {
                    this.head = head.next;
                } else {
                    pre.next = cur.next;
                }
            } else {
                pre = cur;
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
            System.out.print(cur.data + "->");
            cur = cur.next;
        }
        System.out.println("null");
    }
    public void clear() {
        this.head = null;
    }

}
