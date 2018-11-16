package com.desi.casino.handler;

import com.desi.casino.domain.Suite;
import com.desi.casino.domain.Card;

import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
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
            while (setOfCards.size() < 52) {
                int random = ThreadLocalRandom.current().nextInt(1, 53);
                int suite = (random/13) +1;
                int face = random%13;
                if(face == 0){
                    face=13;
                    suite--;
                }
                Card card = new Card(suite, face);
                setOfCards.add(card);
                System.out.println("Size of Set"+setOfCards.size());
            }
            System.out.println("Done adding set:"+i);
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
