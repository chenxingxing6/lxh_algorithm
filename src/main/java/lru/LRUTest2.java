package lru;

import java.util.HashMap;
import java.util.LinkedList;

/**
 * created by lanxinghua@2dfire.com on 2020/6/27
 */
public class LRUTest2 {
    private HashMap<Integer, Integer> cacheMap = new HashMap<>();
    // 链表尾部表示最近使用的元素
    private LinkedList<Integer> recentlyList = new LinkedList<>();
    private int capacity;

    public LRUTest2(int capacity){
        this.capacity = capacity;
    }

    public static void main(String[] args) {
        LRUTest2 lru = new LRUTest2(2);
        lru.put(1, 1);
        lru.put(2, 2);
        System.out.println(lru.get(2));
        lru.put(3, 3);
        System.out.println(lru.get(1));
    }

    public void put(Integer key, Integer value){
        if (cacheMap.containsKey(key)){
            recentlyList.remove(key);
        }else if (capacity == cacheMap.size()){
            Integer integer = recentlyList.removeFirst();
            cacheMap.remove(integer);
        }
        recentlyList.add(key);
        cacheMap.put(key, value);
    }


    public Integer get(Integer key){
        if (!cacheMap.containsKey(key)){
            return -1;
        }
        recentlyList.remove(key);
        recentlyList.add(key);
        return cacheMap.get(key);
    }
}
