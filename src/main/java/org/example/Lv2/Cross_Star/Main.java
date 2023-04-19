package org.example.Lv2.Cross_Star;


import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        int[][] formulas = {{1, -1, 0}, {2, -1, 0}};
        Solution s = new Solution();
        System.out.println(s.solution(formulas));

    }
}
class Pointer{
    public Double x;
    public Double y;

    public  Pointer(Double x, Double y) {
        this.x = x;
        this.y = y;
    }

    public static Pointer of(Double x, Double y) {
        return new Pointer(x,y);
    }

    public Long getRoundX() {
        return Math.round(x);
    }

    public Long getRoundY() {
        return Math.round(y);
    }

    @Override
    public boolean equals(Object pointer){
        if(pointer instanceof Pointer)
            return Double.compare(((Pointer) pointer).x, this.x)==0
                    && Double.compare(((Pointer) pointer).y , this.y) == 0;
        return false;
    }
}

class Pointers{
    private final Map<Long, Set> rows;
    private final Set<Pointer> pointerSet;

    public Pointers(Map<Long, Set> rows, Set<Pointer> pointerSet) {
        this.rows = rows;
        this.pointerSet = pointerSet;
    }

    public static Pointers of(Pointer ... pointerArr){
//        return new Pointers(Arrays.stream(pointerArr).collect(Collectors.toMap(Pointer::getRoundY,
//                p -> new HashSet<>(){{add(p.getRoundX());}})),
//                Arrays.stream(pointerArr).collect(Collectors.toCollection(HashSet::new)));
        return null;
    }
}
class Solution {
    private  Pointer max = Pointer.of(null, null);
    private Pointer min = Pointer.of(null, null);
    private Map<Long, Set> integerPointersMap = new HashMap();
    public String[] solution(int[][] coordinate) {
        setIntegerPointersMap(coordinate);
        return draw();
    }

    public List getIntegerPoints(int[][] formulas){
        List<Pointer> integerPoints = new ArrayList<>();
        for(int current=0; current<formulas.length-1; current++ ){
            for(int next=current+1; next<formulas.length; next++){
                //integerPoints.add();
            }
        }
        return integerPoints;
    }
    public void setIntegerPointersMap(int[][] formulas){
        for(int current=0; current<formulas.length-1; current++ ){
            for(int next=current+1; next<formulas.length; next++){
                Pointer pointer = calcIntersectionPoint(formulas[current], formulas[next]);
                if(isInteger(pointer)){
                    long point_x = pointer.getRoundX();
                    long point_y = pointer.getRoundY();
                    if(integerPointersMap.containsKey(point_y))
                        integerPointersMap.get(point_y).add(point_x);
                    else
                        integerPointersMap.put(point_y, new HashSet(){{
                            add(point_x);
                        }});
                    setMin(pointer);
                    setMax(pointer);
                }
//                System.out.println(String.format("Max:%s//Min:%s",Arrays.toString(max), Arrays.toString(min)));
            }
        }
    }

    private void setMin(Pointer pointer){
        if(min.x == null)
            min.x = pointer.x ;
        else if(pointer.x < min.x)
            min.x = pointer.x;
        if(min.y == null)
            min.y = pointer.y;
        else if(pointer.y < min.y)
            min.y = pointer.y;
    }

    private void setMax(Pointer pointer){
        if(max.x == null)
            max.x = pointer.x;
        else if(pointer.x > max.x)
            max.x=pointer.x;
        if(max.y == null)
            max.y = pointer.y;
        else if(pointer.y > max.y)
            max.y=pointer.y;
    }

    public Pointer calcIntersectionPoint(int[] formula_1, int[] formula_2){
        double A = formula_1[0];
        double B = formula_1[1];
        double C = formula_2[0];
        double D = formula_2[1];
        double E = formula_1[2];
        double F = formula_2[2];
        double divisor = A*D - B*C;
        if(divisor==0)
            return null;
        return new Pointer((B*F - E*D) / divisor, (E*C - A*F) / divisor);
    }

    public boolean isInteger(Pointer pointer){
        if(pointer==null)
            return false;
        return pointer.x%1 == 0 && pointer.y%1==0;
    }

    public String[] draw(){
        int colSize = (int)(max.y - min.y+ 1);
        int rowSize = (int)(max.x - min.x + 1);
        long minY = min.getRoundY();
        long minX = min.getRoundX();
        String[] result = new String[colSize];

        for(int i=0; i<colSize; i++){
            StringBuilder sb = new StringBuilder();
            for(int n=0; n<rowSize; n++){
                if(integerPointersMap.containsKey(i+minY)
                 && integerPointersMap.get(i+minY).contains(n+minX))
                   sb.append("*");
                else
                    sb.append(".");

            }
            result[colSize-i-1]=sb.toString();
        }
        return result;
    }

}

