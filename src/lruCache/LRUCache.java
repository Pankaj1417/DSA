package lruCache;

import java.util.HashMap;
import java.util.Map;

public class LRUCache {
    Map<Integer , Node> map;
    Node head;
    Node tail;
    int capacity;
    public LRUCache(int capacity) {
        map = new HashMap<>();
        head = new Node();
        tail = new Node();
        head.next = tail;
        tail.prev = head;
        this.capacity = capacity;
    }
    public int get(int key) {
        if(map.containsKey(key)){
            Node toAdd = map.get(key);
            remove(toAdd);
            add(toAdd);
            return map.get(key).val;
        }
        return -1;
    }

    public void put(int key, int value) {
        if(map.containsKey(key)){
            Node current = map.get(key);
            remove(current);
            Node toAdd = new Node(key,value);
            add(toAdd);
        }else{
            if(map.size() < capacity){
                Node toAdd = new Node(key,value);
                add(toAdd);
            }else{
                Node toRemove = head.next;
                remove(toRemove);
                Node toAdd = new Node(key,value);
                add(toAdd);
            }
        }
    }
    public void add(Node toAdd){
        toAdd.prev = tail.prev;
        toAdd.next = tail;
        tail.prev.next = toAdd;
        tail.prev = toAdd;
        map.put(toAdd.key , toAdd);
    }

    public void remove(Node toRemove){
        map.remove(toRemove.key);
        Node prev = toRemove.prev;
        Node next = toRemove.next;
        prev.next = next;
        next.prev = prev;
    }
    public void print(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.key+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    static class Node{
        int key;
        int val;
        Node next;
        Node prev;
        public Node(){
            this.next = null;
            this.prev = null;
            this.val = -1;
            this.key = -1;
        }
        public Node(int key , int val){
            this.val = val;
            this.key = key;
        }
    }
}

