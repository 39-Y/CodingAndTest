package org.example.Lv1.uniform;

public class Solution {

    public int solution(int studentsNum, int[] lost, int[] reserve) {
        int[] uniforms = new int[studentsNum + 1];
        for (int loose : lost) {
            --uniforms[loose];
        }
        for (int remain : reserve) {
            ++uniforms[remain];
        }
        return Math.max(borrowToLeft(uniforms), borrowToRight(uniforms));
    }

    private int borrowToLeft(int[] uniforms) {
        for (int i = 1; i < uniforms.length; i++) {
            if (uniforms[i] > 0) {
                if (i - 1 != 0 && uniforms[i - 1] < 0) {
                    ++uniforms[i - 1];
                    --uniforms[i];
                } else if (i + 1 != uniforms.length && uniforms[i + 1] < 0) {
                    ++uniforms[i + 1];
                    --uniforms[i];
                }
            }

        }return countUniform(uniforms);
    }

    private int borrowToRight ( int[] uniforms){
        for (int i = 1; i < uniforms.length; i++) {
            if (uniforms[i] > 0) {
                if (i + 1 != uniforms.length && uniforms[i + 1] < 0) {
                    ++uniforms[i + 1];
                    --uniforms[i];

                } else if (i - 1 != 0 && uniforms[i - 1] < 0) {
                    ++uniforms[i - 1];
                    --uniforms[i];

                }
            }
        }
        return countUniform(uniforms);
    }
    private int countUniform ( int[] uniforms){
        int count = -1;
        for (int uniform : uniforms) {
            if (uniform < 0)
                continue;
            ++count;
        }
        return count;
    }

}