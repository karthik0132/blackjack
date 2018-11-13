package com.learn.dealer;

import com.learn.domain.Card;
import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;

import java.util.LinkedHashSet;
import java.util.Set;

@Slf4j
public class Dealer {

    public void shuffle(Set<Card> cards){
        if(cards.size() == 52){
            LinkedHashSet<Card> shuffeledSet = new LinkedHashSet();
            //shuffeledSet.add(Math.random())
        }else{

        }
    }
}
