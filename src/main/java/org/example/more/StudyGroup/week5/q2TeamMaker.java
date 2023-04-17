package org.example.more.StudyGroup.week5;

import java.util.Arrays;
import java.util.Comparator;

public class q2TeamMaker {
    Integer[] teamMember;
    int chance;
    public q2TeamMaker(Integer[] teamMember, int chance) {
        this.chance = chance;
        this.teamMember=teamMember;
    }

    public int grouping() {
        Integer[] sorted = teamMember;//[2, 8, 3, 6, 1, 9, 1, 9]
        Arrays.sort(sorted, Comparator.reverseOrder()); //[9, 9, 8, 6, 3, 2, 1, 1 ]
        Integer[] interval = new Integer[sorted.length/2+1]; // 5
        Arrays.fill(interval,0); //sort를 위한 초기화
        int sum = 0;
        for(int i=0; i<sorted.length; i++){
            if(i+1 == sorted.length)
                interval[i/2]=sorted[i]; //홀수일 경우 그냥 넣어줌
            else{
                interval[i/2]=sorted[i]-sorted[++i]; // 둘의 차이를 배열에 넣어줌
                sum+=sorted[i];// 짝수 번째 숫자를 더함 (9 + 6 + 2 + 1)
            }
        }
        Arrays.sort(interval, Comparator.reverseOrder()); // 차이 값이 들은 배열을 sort
        //[0, 2, 1, 0] => [2, 1, 0, 0]
        for(int i=0; i<chance; i++){
            sum+=interval[i];  //chance만큼 차이 값을 더해줌 (2+1)
        }
        return sum;
    }
}
