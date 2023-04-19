package org.example.more.Make_List;

import java.util.Arrays;

public class MyList<T> {
    private int size;
    private T[] arr = (T[]) new Object[2];

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
        T[] newArr = (T[]) new Object[arr.length*2];
        int i=0;
        for(Object o : arr){
            newArr[i++] = (T) o;
        }
        arr = newArr;
    }

    public int size() {
        return size;
    }

    public T get(int i) {
        if(i>=size)
            return null;
        return arr[i];
    }

    @Override
    public String toString() {
        return "MyList{" +
                ", size=" + size +
                ", arr=" + Arrays.toString(arr) +
                '}';
    }

    public T remove(int idx) {
        T removed = arr[idx];
        for(int i=idx; i<size-1; i++){
            arr[idx]=arr[idx+1];
        }
        size--;
        return removed;
    }


    public boolean contains(String element) {
        for(int i=0; i<size; i++){
            if(arr[i].equals(element))
                return true;
        }
        return false;
    }


    public int indexOf(String element) {
        for(int i=0; i<size; i++){
            if(arr[i].equals(element))
                return i;
        }
        return -1;
    }

    public void clear() {
        size=0;
        arr= (T[]) new Object[2];
    }

    public boolean isEmpty() {
        return size==0;
    }
}
