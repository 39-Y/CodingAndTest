package org.example.Lv2.Search;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;


class SolutionTest {
    String query;
    String[] info;
    @Test
    @DisplayName("Resume 객체 생성")
    void t1(){
        Resume r1 = Resume.of("java backend junior pizza 150");
        Assertions.assertThat(r1.isBE).isEqualTo(true);
        Assertions.assertThat(r1.language).isEqualTo("java");
        Assertions.assertThat(r1.isChicken).isEqualTo(false);
        Assertions.assertThat(r1.isJunior).isEqualTo(true);
        Assertions.assertThat(r1.score).isEqualTo(150);

    }

    @Test
    @DisplayName("q_Resume 객체 생성")
    void t2(){
        Resume qr1 = Resume.of("java and backend and junior and pizza 100");
        Assertions.assertThat(qr1.isBE).isEqualTo(true);
        Assertions.assertThat(qr1.language).isEqualTo("java");
        Assertions.assertThat(qr1.isChicken).isEqualTo(false);
        Assertions.assertThat(qr1.isJunior).isEqualTo(true);
        Assertions.assertThat(qr1.score).isEqualTo(100);

    }

    @Test
    @DisplayName("Resume 객체 와 q_Resume 객체 비교")
    void t3(){
        Resume r1 = Resume.of("java backend junior pizza 150");
        Resume qr1 = Resume.of("java and backend and junior and pizza 100");
        Assertions.assertThat(qr1.isBE).isEqualTo(r1.isBE);
        Assertions.assertThat(qr1.language).isEqualTo(r1.language);
        Assertions.assertThat(qr1.isChicken).isEqualTo(r1.isChicken);
        Assertions.assertThat(qr1.isJunior).isEqualTo(r1.isJunior);
        Assertions.assertThat(qr1.score).isLessThan(r1.score);
    }

    @Test
    @DisplayName("query 1 // count: 1")
    void t6(){
        Queue<String> queue = new LinkedList<>();
        query = "- and backend and senior and - 150";
        info = new String[]{
                "java backend junior pizza 150",
                "python frontend senior chicken 210",
                "python frontend senior chicken 150",
                "cpp backend senior pizza 260",
                "java backend junior chicken 80",
                "python backend senior chicken 50"};
        Resume qresume = Resume.of(query);
        for(String i:info){
            if(qresume.checkScore(i))
                queue.add(i);
        }
        for(int i=0; i<queue.size(); i++){
            if(qresume.language == null)
                break;
            String s=queue.poll();
            if(s.contains(qresume.language))
                queue.add(s);
        }
        for(int i=0; i<queue.size(); i++){
            if(qresume.isBE == null)
                break;
            String s=queue.poll();
            if(qresume.checkJob(s))
                queue.add(s);
        }
        for(int i=0; i<queue.size(); i++){
            if(qresume.isJunior == null)
                break;
            String s=queue.poll();
            if(qresume.checkExperience(s))
                queue.add(s);
        }
        for(int i=0; i<queue.size(); i++){
            if(qresume.isChicken == null)
                break;
            String s=queue.poll();
            if(qresume.checkFood(s))
                queue.add(s);
        }
        Assertions.assertThat(queue.size()).isEqualTo(1);
    }
    @Test
    @DisplayName("query 6 // result: {1,1,1,1,2,4}")
    void t7(){

        String[] queries = {
                "java and backend and junior and pizza 100",
                "python and frontend and senior and chicken 200",
                "cpp and - and senior and pizza 250",
                "- and backend and senior and - 150",
                "- and - and - and chicken 100",
                "- and - and - and - 150"
        };
        info = new String[]{
                "java backend junior pizza 150",
                "python frontend senior chicken 210",
                "python frontend senior chicken 150",
                "cpp backend senior pizza 260",
                "java backend junior chicken 80",
                "python backend senior chicken 50"
        };
        Assertions.assertThat(new Solution().solution(info, queries)).isEqualTo(new int[]{1,1,1,1,2,4});

    }

}