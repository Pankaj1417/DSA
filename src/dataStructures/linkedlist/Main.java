package dataStructures.linkedlist;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s =  new Scanner(System.in);

//        System.out.println("Enter number of elements");
//        int n = s.nextInt();
//        int[] arr = new int[n];

        int[] arr = {9,5,1,3,7};

//        System.out.println("Enter "+n+" elements");
//        for(int i=0;i<n;i++){
//            arr[i] = s.nextInt();
//        }
        System.out.println("Created list");
        ListNode head = ListNode.create(arr);
        ListNode.print(head);

//        System.out.println(ListNode.size(head));

        System.out.println("added 10 at last");
        ListNode.addAtEnd(head,10);
        ListNode.print(head);

        System.out.println("added 2 at front");
        ListNode.addAtFront(head , 2);
        ListNode.print(head);
        LinkedList<Integer> al = new LinkedList<>();
    }
}
