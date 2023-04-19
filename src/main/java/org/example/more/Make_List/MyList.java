package org.example.more.Make_List;

public class MyList<T> {
    private int lastIdx;
    private int size;
    private T[] arr = (T[]) new Object[10];

    public MyList() {
        this.size = 0;
    }

    public boolean add(T element) {
        if(size == arr.length)
            expends();
        arr[size++]=element;
        return true;
    }

    private void expends() {
        T[] tmp = (T[]) new Object[size*2];
        int i=0;
        for(Object o : arr){
            tmp[i++] = (T) o;
        }
        arr = tmp;
    }

    public int size() {
        return size;
    }

    public T get(int i) {
        return arr[i];
    }
}
