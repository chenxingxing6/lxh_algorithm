package lru;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * created by lanxinghua@2dfire.com on 2020/6/27
 */
public class LRUTest1 extends LinkedHashMap {
    private int capacity;

    public static void main(String[] args) {
        LRUTest1 lru = new LRUTest1(2);
        lru.put("1", 1);
        lru.put("2", 2);
        System.out.println(lru.get("2"));
        lru.put("3", 3);
        System.out.println(lru.get("1"));
    }

    public LRUTest1(int capacity){
        super(capacity, 0.75f, true);
        this.capacity = capacity;
    }

    @Override
    public Object put(Object key, Object value) {
        return super.put(key, value);
    }

    @Override
    public Object get(Object key) {
        return super.getOrDefault(key, "-1");
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry eldest) {
        return super.size() > capacity;
    }
}
