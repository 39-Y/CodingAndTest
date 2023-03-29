package org.example.more.StudyGroup.week2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class q10_PickStudent {
    int[][] votes;
    int[] emailArr;
    int minimum;
    Map<Integer,List<Integer>> pickMap;
    public q10_PickStudent(int[][] votes, int minimum, int totalStudent) {
        this.votes = votes;
        this.minimum = minimum;
        emailArr = new int[totalStudent];
        pickMap = new HashMap<>();
    }

    public int[] countEmail(){
        ballotCount();
        for (int candidate : pickMap.keySet()) {
            if(pickMap.get(candidate).size()>=minimum){
                for(int elector:pickMap.get(candidate)){
                    ++emailArr[elector];
                }
            }
        }
        return emailArr;
    }
    private void ballotCount(){
        for(int[] vote: votes){
            int elector = vote[0];
            int candidate = vote[1];
            if(pickMap.containsKey(candidate))
                pickMap.get(candidate).add(elector);
            else
                pickMap.put(candidate, new ArrayList<>(){{add(elector);}});
        }
    }
}
