package org.example.Lv2.Search;

import java.util.LinkedList;
import java.util.Queue;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
}
class Solution{

    public int[] solution(String[] info, String[] queries){
        int[] counts = new int[queries.length];
        int idx = 0;
        for(String query:queries){
            Queue<String> queue = new LinkedList<>();
            Resume qresume = Resume.of(query);
            for(String i:info){
                if(qresume.checkScore(i))
                    queue.add(i);
            }
            int size = queue.size();
             for(int i=0; i<size; i++){
                if(qresume.language == null)
                    break;
                String s=queue.poll();
                if(s.contains(qresume.language))
                    queue.add(s);
            }
            size=queue.size();
            for(int i=0; i<size; i++){
                if(qresume.isBE == null)
                    break;
                String s=queue.poll();
                if(qresume.checkJob(s))
                    queue.add(s);
            }
            size=queue.size();
            for(int i=0; i<size; i++){
                if(qresume.isJunior == null)
                    break;
                String s=queue.poll();
                if(qresume.checkExperience(s))
                    queue.add(s);
            }
            size=queue.size();
            for(int i=0; i<size; i++){
                if(qresume.isChicken == null)
                    break;
                String s=queue.poll();
                if(qresume.checkFood(s))
                    queue.add(s);
            }
            counts[idx++]=queue.size();
        }
        return counts;
    }
}

class Resume{
    String language;
    Boolean isBE;
    Boolean isJunior;
    Boolean isChicken;
    int score;
    String info;

    public Resume(String info) {
        this.info=info;
        setLanguage();
        setIsBE();
        this.score = getScore(info);
        setIsJunior();
        setIsChicken();
    }
    public static Resume of(String info){
        return new Resume(info);
    }
    public boolean compareToQuery(Resume qresume){
        boolean result = this.score >= qresume.score;
        if(qresume.isBE != null)
            result = result && (this.isBE == qresume.isBE);
//        if(qresume.language != null)
//            result = result && (this.language.intValue() == qresume.language.intValue());
        if(qresume.isJunior != null)
            result = result && (this.isJunior == qresume.isJunior);
        if(qresume.isChicken != null)
            result = result && (this.isChicken == qresume.isChicken);
        return result;
    }
    private void setIsBE(){
        if(info.contains("backend") || info.contains("frontend"))
            this.isBE = info.contains("backend");
    }
    private void setIsJunior(){
        if(info.contains("junior") || info.contains("senior"))
            this.isJunior = info.contains("junior");
    }
    private void setIsChicken(){
        if(info.contains("chicken") || info.contains("pizza"))
            this.isChicken = info.contains("chicken");
    }

    private int getScore(String info){
        int score =0;
        Matcher matcher = Pattern.compile("\\d+")
                .matcher(info);
        if(matcher.find())
            score=Integer.parseInt(matcher.group());
        return score;
    }
    private void setLanguage(){
        if(info.contains("cpp"))
            this.language="cpp";
        else if(info.contains("java"))
            this.language="java";
        else if(info.contains("python"))
            this.language="python";
    }


    public boolean checkScore(String info) {
        return score<=getScore(info);
    }

    public boolean checkJob(String info) {
        return isBE == info.contains("backend");
    }

    public boolean checkFood(String info) {
        return isChicken == info.contains("chicken");
    }

    public boolean checkExperience(String info) {
        return isJunior == info.contains("junior");
    }
}