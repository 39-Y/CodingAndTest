package org.example.Lv2.Cross_Star;


import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[][] coordinate = {{1, -1, 0}, {2, -1, 0}};
        Solution s = new Solution();
        System.out.println("----------s:"+s.solution(coordinate));

    }
}
class Solution {
    Long[] max=new Long[2];
    Long[] min=new Long[2];
    Map<Long, Set> integerPointersMap = new HashMap();
    public String[] solution(int[][] coordinate) {
        setIntegerPointersMap(coordinate);
        return draw();
    }
    public void setIntegerPointersMap(int[][] coordinate){
        for(int i=0; i<coordinate.length-1; i++ ){
            for(int n=i+1; n<coordinate.length; n++){
                Double[] pointer = calcIntersectionPoint(coordinate[i], coordinate[n]);
//                System.out.println(">>>>>>>>>>>>>교점:"+ Arrays.toString(pointer)+isInteger(pointer) );
                if(isInteger(pointer)){
                    long x = Math.round(pointer[0]);
                    long y = Math.round(pointer[1]);
                    if(integerPointersMap.containsKey(y))
                        integerPointersMap.get(y).add(x);
                    else
                        integerPointersMap.put(y, new HashSet(){{
                            add(x);
                        }});
                    comparePointerTo(pointer);
                }
//                System.out.println(String.format("Max:%s//Min:%s",Arrays.toString(max), Arrays.toString(min)));
            }
        }
    }
    private void comparePointerTo(Double[] pointer) {
        for(int i=0; i<pointer.length; i++){
            if(min[i] == null)
                min[i] = Math.round(pointer[i]) ;
            if(max[i] == null)
                max[i] = Math.round(pointer[i]);
            if(pointer[i]<min[i])
                min[i]=Math.round(pointer[i]);
            if(pointer[i]>max[i])
                max[i]=Math.round(pointer[i]);
        }
    }

    public Double[] calcIntersectionPoint(int[] formula_1, int[] formula_2){
        double A = formula_1[0];
        double B = formula_1[1];
        double C = formula_2[0];
        double D = formula_2[1];
        double E = formula_1[2];
        double F = formula_2[2];
        //System.out.println(String.format("A=%f/B=%f/C=%f/D=%f/E=%f/F=%f", A,B,C,D,E,F));
        double divisor = A*D - B*C;
        if(divisor==0)
            return new Double[]{0.1, 0.1};
        return new Double[]{(B*F - E*D) / divisor, (E*C - A*F) / divisor};
    }

    public boolean isInteger(Double[] pointer){
        return pointer[0]%1 == 0 && pointer[1]%1==0;
    }

    public String[] draw(){
        int colSize = (int)(max[1] - min[1] + 1);
        int rowSize = (int)(max[0] - min[0] + 1);
        String[] result = new String[(int)colSize];

        for(int i=0; i<colSize; i++){
            StringBuilder sb = new StringBuilder();
            for(int n=0; n<rowSize; n++){
                if(integerPointersMap.containsKey(i+min[1])
                 && integerPointersMap.get(i+min[1]).contains(n+min[0]))
                   sb.append("*");
                else
                    sb.append(".");

            }
            result[colSize-i-1]=sb.toString();
        }
        return result;
    }

}

