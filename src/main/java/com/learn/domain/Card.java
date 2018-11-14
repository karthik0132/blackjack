package com.learn.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Card {
    private int suite;
    private int face;

    public Card(int suite, int face){
        this.suite = suite;
        this.face = face;
    }
    @Override
    public boolean equals(Object o){
        Card card;
        System.out.println("In equals method of Card.java");
        if(o instanceof Card) {
            card = (Card) o;
            if((card.face == this.face) && (card.suite == this.suite)){
                return true;
            }else{
                System.out.println("this.face:"+this.getFace()+" this.suite"+this.getSuite()+ " card.face:"+card.getFace()+ " card.suite:"+card.getSuite());
                return false;
            }
        }else{
            return false;
        }
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
