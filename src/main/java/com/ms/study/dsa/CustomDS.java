package com.ms.study.dsa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Random;

public class CustomDS {
    ArrayList<Integer> arr;
    HashMap<Integer, Integer> hash;

    public CustomDS() {
        this.arr = new ArrayList<>();
        this.hash = new HashMap<>();
    }

    public ArrayList<Integer> getArr() {
        return arr;
    }

    public HashMap<Integer, Integer> getHash() {
        return hash;
    }

    void add(int element) {
        if (hash.containsKey(element)) {
            return;
        }
        int index = arr.size();
        arr.add(element);
        hash.put(element, index);
    }

    void remove(int element) {
        if (hash.containsKey(element)) {
            Integer index = hash.get(element);
            if (index == null)
                return;
            hash.remove(element);

            int size = arr.size();
            int last = arr.get(size - 1);
            Collections.swap(arr, index, size - 1);

            arr.remove(size - 1);
            hash.put(last, index);
        }
    }

    int getRandom() {
        Random rand = new Random();
        int index = rand.nextInt(arr.size());
        return arr.get(index);
    }

    Integer search(int x)
    {
        return hash.get(x);
    }
}
