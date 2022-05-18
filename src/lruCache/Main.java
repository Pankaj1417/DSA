package lruCache;

public class Main {
    public static void main(String[] args) {
        LRUCache lruCache = new LRUCache(2);

//        ["LRUCache","put","get","put","get","get"]
//        [[1],[2,1],[2],[3,2],[2],[3]]
        /*
        ["LRUCache","put","put","get","put","put","get"]
        [[2],[2,1],[2,2],[2],[1,1],[4,1],[2]]
         */
        lruCache.put(2,1);
        lruCache.put(2,2);
        int x =   lruCache.get(2);
        lruCache.put(1,1);
        lruCache.put(4,1);
        int y =   lruCache.get(2);
    }
}
