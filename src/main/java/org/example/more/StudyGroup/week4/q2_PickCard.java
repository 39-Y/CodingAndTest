package org.example.more.StudyGroup.week4;

import java.util.ArrayDeque;
import java.util.Deque;

public class q2_PickCard {
    private int count;
    private int[] cards;
    private Deque<Integer> headSumDeck;
    private Deque<Integer> tailSumDeck;
    int maxDeckValue = 0;

    public q2_PickCard(int count, int[] cards) {
        this.count = count;
        this.cards = cards;
        headSumDeck = new ArrayDeque<>();
        tailSumDeck = new ArrayDeque<>();

    }

    public int maxPick(){
        int cardSum=0;
        for(int i=0; i<count; i++){
            cardSum+=cards[i];
            headSumDeck.addFirst(cardSum);
        } //headSumDeck:[13, 12, 5, 2]

        cardSum=0;
        for(int i = cards.length-1; i>=cards.length-count; i--){
            cardSum+=cards[i];
            tailSumDeck.add(cardSum);
        } //tailSumDeck: [5, 6, 8, 9]
        maxDeckValue = Math.max(headSumDeck.removeFirst(), tailSumDeck.removeLast()); // 13 vs 9
        while(!tailSumDeck.isEmpty() && !headSumDeck.isEmpty()){
            int sum = headSumDeck.pop()+ tailSumDeck.pop();
            maxDeckValue = Math.max(maxDeckValue, sum);
        }
        return maxDeckValue;
    }
}
