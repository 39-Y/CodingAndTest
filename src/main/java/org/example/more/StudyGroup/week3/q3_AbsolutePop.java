package org.example.more.StudyGroup.week3;

import java.util.ArrayDeque;
import java.util.Deque;

public class q3_AbsolutePop {
    public Object[] crush(int[] nums) {
        Deque<Integer> dq = new ArrayDeque<>();
        for (int n : nums) {
            if (!dq.isEmpty() && dq.peekLast() * n < 0 && dq.peekLast() >= 0) {
                while (!dq.isEmpty() && Math.abs(dq.peekLast()) <= Math.abs(n)) {
                    if (Math.abs(dq.peekLast()) == Math.abs(n)) {
                        dq.removeLast();
                        break;
                    }
                    else
                        dq.removeLast();
                }
            }
            dq.add(n);
        }
        return dq.toArray();
    }
}
