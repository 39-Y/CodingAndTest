package org.example.more.StudyGroup.week6;

public class q1_CatchTheCow {
    int man;
    int cow;

    public q1_CatchTheCow(int man, int cow) {
        this.man = man;
        this.cow = cow;
    }

    public int find() {
        int distance = cow-man;
        if (distance > 0) {
            int forward_5Steps = (int)Math.round(distance/5.0);
            int remainSteps = Math.abs(distance-forward_5Steps*5);
            return forward_5Steps+remainSteps;
        }
        else
            return Math.abs(distance);

    }
}
