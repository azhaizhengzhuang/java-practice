/**
 * @Author: 江桂煌
 * @Description: 独立实现无头双向链表第一次
 * @DateTime: 2021/9/17 17:36
 **/
class Node {
    int data;
    Node prev;
    Node next;

    public Node(int data) {
        this.data = data;
    }

}
public class DoubleLinkedList {
    Node head;
    Node tail;
    //头插法
    public void addFirst(int data){
        Node newNode = new Node(data);
       if (this.head == null) {
           this.head = newNode;
           this.tail = newNode;
           return;
       }
       newNode.next = this.head;
       this.head.prev = newNode;
       this.head = newNode;
    }
    //尾插法
    public void addLast(int data){
        Node newNode = new Node(data);
        if (this.head == null) {
            this.head = newNode;
            this.tail = newNode;
            return;
        }
        newNode.prev = this.tail;
        this.tail.next = newNode;
        this.tail = newNode;
    }
    private void indexCheck(int index) {
        if (index < 0 || index > this.size()) {
            throw new RuntimeException("index不合法！");
        }
    }
    private Node searchIndex(int index) {
        //返回不包含头结点和尾结点的任意结点
        Node cur = this.head;
        int pos = 0;
        while (pos < index) {
            pos++;
            cur = cur.next;
        }
        return cur;
    }
    //任意位置插入,第一个数据节点为0号下标
    public void addIndex(int index,int data){
        indexCheck(index);
        if (index == 0) {
            this.addFirst(data);
            return;
        }
        if (index == this.size()) {
            this.addLast(data);
            return;
        }
        Node targit = this.searchIndex(index);
        Node newNode = new Node(data);
        newNode.next = targit;
        newNode.prev = targit.prev;
        targit.prev.next = newNode;
        targit.prev = newNode;
    }
    //查找是否包含关键字key是否在单链表当中
    public boolean contains(int key){
        Node cur = this.head;
        while (cur != null) {
            if (cur.data == key) {
                return true;
            }
            cur = cur.next;
        }
        return false;
    }
    //删除第一次出现关键字为key的节点 删除成功返回true 删除失败返回false
    public boolean remove(int key){
        Node cur = this.head;
        while (cur != null) {
            if (cur.data == key) {
                //如果要删除的是头节点 那么头结点后移一位
                if (this.head.data == key) {
                    this.head = this.head.next;
                    //如果新的头结点是空 就不用移动
                    if (head != null) {
                        head.prev = null;
                    }
                } else if (this.tail.data == key) {
                    //如果要删除的是尾节点 那么尾节点前驱置空
                    this.tail = this.tail.prev;
                    this.tail.next = null;
                } else {
                    //如果要删除的是中间节点
                    cur.prev.next = cur.next;
                    cur.next.prev = cur.prev;
                }
                return true;
            }
            cur = cur.next;
        }
        return false;
    }
    //删除所有值为key的节点
    public void removeAllKey(int key){
        Node cur = this.head;
        while (cur != null) {
            if (cur.data == key) {
                //如果要删除的是头节点 那么头结点后移一位
                if (this.head.data == key) {
                    this.head = this.head.next;
                    //如果新的头结点是空 就不用移动
                    if (head != null) {
                        head.prev = null;
                    }
                } else if (this.tail.data == key) {
                    //如果要删除的是尾节点 那么尾节点前驱置空
                    this.tail = this.tail.prev;
                    this.tail.next = null;
                } else {
                    //如果要删除的是中间节点
                    cur.prev.next = cur.next;
                    cur.next.prev = cur.prev;
                }
            }
            cur = cur.next;
        }
    }
    //得到单链表的长度
    public int size(){
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
    public void clear(){
        //进行节点遍历
        Node cur = this.head;
        while(this.head != null) {
            Node next = this.head.next;
            this.head.prev = null;
            this.head.next = null;
            this.head = next;
        }
        this.tail = null;
    }
}
