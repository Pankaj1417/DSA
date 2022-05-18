package dataStructures.linkedlist.singlyLinkedList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arr = {9,5,1,3,7};
        LinkList linkList = new LinkList(arr);
        linkList.addAtLast(5);
        linkList.addAtLast(6);
        linkList.print();
        linkList.addAtFront(10);
        linkList.addAll(arr);
        linkList.print();
        linkList.size();
       int first =  linkList.remove();
        System.out.println("removed -> "+first);
        linkList.print();
        System.out.println("Size of list is "+linkList.size());
    }
}
