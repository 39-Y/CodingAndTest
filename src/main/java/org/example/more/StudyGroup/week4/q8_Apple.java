package org.example.more.StudyGroup.week4;

import java.util.stream.IntStream;

public class q8_Apple {
    int[] apples;
    int[] energy;
    int booster;
    public q8_Apple(int[] apples, int[] energy, int booster) {
        this.apples = apples;
        this.energy = energy;
        this.booster = booster;
    }

    public int max() {
        int max = 0;
        int sumMax = 0;
        for(int i=0; i<apples.length; i++){
            if(energy[i]==1){
                max+=apples[i];
                apples[i] = 0;
            }
        }
        for(int i=0; i<apples.length; i++) {
            int range = i+booster>apples.length ? apples.length : i+booster;
            int sum = IntStream.range(i, range)
                    .map(n -> apples[n])
                    .sum();
            sumMax = sumMax<sum? sum : sumMax;
        }
        return max+sumMax;
    }
}
