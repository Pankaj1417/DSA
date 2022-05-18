package dataStructures.linkedlist.singlyLinkedList;

public class LinkList {
    Node head;
    public LinkList(){
        head = new Node();
    }
    public LinkList(int[] arr){
        head = new Node();
        Node temp = head;
        int i=0;
        while (i<arr.length){
            temp.next = new Node(arr[i++]);
            temp = temp.next;
        }
    }
    public void addAtLast(int toAdd){
        Node temp = head;
        while (temp.next != null){
            temp = temp.next;
        }
        temp.next = new Node(toAdd);
    }
    public void addAtFront(int toAdd){
        Node node = new Node(toAdd);
        Node next = head.next;
        head.next = node;
        node.next = next;
    }
    public void addAll(int[] arr){
        Node temp = head;
        while (temp.next != null){
            temp = temp.next;
        }
        int i=0;
        while (i<arr.length){
            temp.next = new Node(arr[i++]);
            temp = temp.next;
        }
    }
    public int remove(){
        Node temp = head;
        Node toRemove = temp.next;
        if (toRemove == null){
            System.out.println("List is Empty");
            return -1;
        }
        temp.next = toRemove.next;
        return toRemove.val;
    }
    public void print(){
        Node temp = head.next;
        while (temp!=null){
            System.out.print(temp.val+ " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public int size(){
        Node temp = head;
        int size = 0;
        while (temp.next != null){
            size++;
            temp = temp.next;
        }
        return size;
    }
    static class Node {
        int val;
        Node next;
        public Node(){
            this.val = -1;
            this.next = null;
        }
        public Node(int val , Node next){
            this.val = val;
            this.next = next;
        }
        public Node(int val){
            this.val = val;
            this.next = null;
        }
    }
}
