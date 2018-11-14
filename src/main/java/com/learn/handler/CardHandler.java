package com.learn.handler;

import com.learn.domain.Card;
import com.learn.domain.Suite;
import org.w3c.dom.ranges.Range;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class CardHandler {
    public final static int MAX_DECK_SIZE = 6;
    public List<Card> shuffle(List<Card> cards){

        return cards;
    }
    public static List<Card> freshPack(){
        List<Card> newPack = new LinkedList<Card>();
        Set<Card> setOfCards = new LinkedHashSet<>();
        for(int i=0;i< MAX_DECK_SIZE; i++) {
            while (setOfCards.size() <= 52) {
                int suite = ThreadLocalRandom.current().nextInt(1, 5);
                int face = ThreadLocalRandom.current().nextInt(1, 13);
                Card card = new Card(suite, face);
                setOfCards.add(card);
            }
            newPack.addAll(newPack.size(), setOfCards);
            setOfCards = new LinkedHashSet<>();
        }
        return newPack;
    }
    public List<Card> orderFresh(){
        return null;
    }

    public static void main(String[] args) {
        List<Card> cards = freshPack();
        for(int i=0; i<53;i++){
            Card card = cards.get(i);
            System.out.println("Card:"+ i+ " Suite:"+ Suite.getSuiteFromVal(card.getSuite()).name()+ " Face:" + card.getFace());
        }
    }
}
