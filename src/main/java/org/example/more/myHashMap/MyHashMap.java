package org.example.more.myHashMap;

public class MyHashMap <T,F>{
    int size;

    public MyHashMap() {
    }


    public F put(T key, F value) {
        System.out.println(value.hashCode());
        return value;
    }

    public int size(){
        return size;
    }
}
