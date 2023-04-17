package org.example.Lv2.Cross_Star;

import org.assertj.core.api.Assertions;
import org.example.more.StudyGroup.week2.q1_SqrtSort;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    int[][] coordinate;
    @Test
    @DisplayName("[[1, -1, 0], [2, -1, 0]]의 교점은 (0, 0)")
    void t1(){
        coordinate = new int[][]{{1, -1, 0}, {2, -1, 0}};
        Assertions.assertThat(new Solution().calcIntersectionPoint(coordinate[0], coordinate[1])).isEqualTo(new double[]{0, 0});
    }

    @Test
    @DisplayName("[0, 1, -1], [1, 0, -1], [1, 0, 1] => [*.*])")
    void t2(){
        coordinate = new int[][]{{0, 1, -1}, {1, 0, -1}, {1, 0, 1}};
        Assertions.assertThat(new Solution().solution(coordinate)).isEqualTo(new String[] {"*.*"});
    }

    @Test
    @DisplayName("[2, -1, 4], [-2, -1, 4], [0, -1, 1], [5, -8, -12] , [5, 8, 12]" +
            "=> [\"....*....\", " +
            "    \".........\", " +
            "    \".........\", " +
            "    \"*.......*\", " +
            "    \".........\", " +
            "    \".........\", " +
            "    \".........\", " +
            "    \".........\", " +
            "    \"*.......*\"]")
    void t3(){
        coordinate = new int[][]{{2, -1, 4}, {-2, -1, 4}, {0, -1, 1}, {5, -8, -12}, {5, 8, 12}};
        Assertions.assertThat(new Solution().solution(coordinate)).isEqualTo(new String[] {
                "....*....",
                ".........",
                ".........",
                "*.......*",
                ".........",
                ".........",
                ".........",
                ".........",
                "*.......*"});

    }

}