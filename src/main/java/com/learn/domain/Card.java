package com.learn.domain;

import lombok.Data;

@Data
public class Card {
    private Suite suite;
    private Face face;

    @Override
    public boolean equals(Object o){
        if(o instanceof Card) {
            Card card = (Card) o;
            return (card.face.name().equals(this.face.name()) && card.suite.name().equals(this.suite.name()));
        }else{
            return false;
        }
    }
}
