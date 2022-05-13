package dataStructures.linkedlist;

import java.util.List;

public class ListNode {
    ListNode next;
    int val;
    public ListNode(int val , ListNode next){
        this.val = val;
        this.next = next;
    }
    public ListNode(int val){
        this.val = val;
        this.next = null;
    }
    public ListNode(){
        this.val = -1;
        this.next = null;
    }
    static ListNode create(int[] arr){
        ListNode head = new ListNode();
        ListNode temp = head;
        for(int x : arr){
            temp.next = new ListNode(x);
            temp = temp.next;
        }
        return head.next;
    }
    static void addAtEnd(ListNode head , int x){
        ListNode toAdd = new ListNode(x);
        if(head == null){
            head = toAdd;
        }
        ListNode temp = head;
        while (temp.next != null){
            temp = temp.next;
        }
        temp.next = toAdd;
    }
    static void addAtFront(ListNode head , int x){
        ListNode toAdd = new ListNode(x);
        ListNode temp = head;
        head = toAdd;
        head.next = temp;
    }
    static void print(ListNode head){
        ListNode temp = head;
        while(temp != null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    static int size(ListNode head){
        ListNode temp = head;
        int size = 0;
        while (temp != null){
            size++;
            temp = temp.next;
        }
        return size;
    }
}
