package org.example.more.myHashMap;

import java.util.ArrayList;
import java.util.List;

public class MyHashMap <T,F>{
    int size;
    List[] hashArr;

    public MyHashMap() {
        init();
    }

    private void init(){
        size=0;
        hashArr = new List[12];
        for(int i=0; i<12; i++){
            hashArr[i]=new ArrayList<Object[]>();
        }
    }

    public F put(T key, F value) {
        Object[] currentNode = getNodeAndIndex(key);
        F preValue;
        int hashKey = key.hashCode()%12;
        if(currentNode !=null){
            preValue = (F)currentNode[1];
            currentNode[1] = value;
        }
        else{
            ++size;
            preValue = null;
            hashArr[hashKey].add(new Object[]{key, value});
        }
        return preValue;
    }

    public F get(T key){
        Object[] node = getNodeAndIndex(key);
        return node==null? null : (F)node[1];
    }
    private Object[] getNodeAndIndex(T key){
        List<Object[]> nodes = getSameHashcodeNodes(key);
        if(nodes.size()!=0){
            for(int i=0; i<nodes.size(); i++){
                Object[] node = nodes.get(i);
                if(((T)node[0]).equals((T)key))
                    return new Object[]{node[0], node[1], i};
            }
        }
        return null;
    }


    public int size(){
        return size;
    }

    private List<Object[]> getSameHashcodeNodes(T key){
        return hashArr[key.hashCode()%12];
    }

    public F remove(T key) {
        List<Object[]> nodes = getSameHashcodeNodes(key);
        Object[] nodeAndIdx = getNodeAndIndex(key);
        if(nodeAndIdx == null)
            return null;
        nodes.remove((int) nodeAndIdx[2]);
        --size;
        return (F)nodeAndIdx[1];
    }

    public boolean containsKey(T key) {
        return getNodeAndIndex(key) != null;
    }

    public boolean containsValue(F value) {
        for(List<Object[]> list:hashArr){
            if(list.size()!=0){
                for(int i=0; i<list.size(); i++){
                    Object[] node = list.get(i);
                    if(((F)node[1]).equals((F)value))
                        return true;
                }
            }
        }
        return false;
    }

    public void clear() {
        init();
    }

    public boolean isEmpty() {
        return size==0;
    }
}
