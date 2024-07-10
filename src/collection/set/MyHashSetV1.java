package collection.set;

import java.util.Arrays;
import java.util.LinkedList;

public class MyHashSetV1 {

    static final int DEFAULT_INITIAL_CAPACITY = 16;
    LinkedList<Integer>[] buckets;

    private int size = 0;
    private int capacity = DEFAULT_INITIAL_CAPACITY;

    public MyHashSetV1() {
        initBuckets(capacity);
    }

    public MyHashSetV1(int capacity) {
        this.capacity = capacity;
        initBuckets(capacity);
    }

    private void initBuckets(int capacity1) {
        buckets = new LinkedList[capacity];
        for (int i = 0; i < capacity1; i++) {
            buckets[i] = new LinkedList<>();
        }
    }

    public boolean add(int value) {
        int hashIndex = hashIndex(value);
        LinkedList<Integer> bucket = buckets[hashIndex]; // O(1)
        if (bucket.contains(value)) { // O(n) -> O(1)
            return false;
        }

        bucket.add(value);
        size++;
        return true;
    }

    public boolean contains(int searchValue) {
        int hashIndex = hashIndex(searchValue);
        LinkedList<Integer> bucket = buckets[hashIndex];
        return bucket.contains(searchValue);
    }

    public boolean remove(int value) {
        int hashIndex = hashIndex(value);
        LinkedList<Integer> bucket = buckets[hashIndex];
        boolean result = bucket.remove(Integer.valueOf(value)); // 참조형으로 해야 값을 통해 지움(int로 하면 index로 인자를 받음)
        if (result) {
            size--;
            return true;
        } else {
            return false;
        }
    }

    private int hashIndex(int value) {
        return value % capacity;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "MyHashSetV1{" +
                "buckets=" + Arrays.toString(buckets) +
                ", size=" + size +
                ", capacity=" + capacity +
                '}';
    }
}
