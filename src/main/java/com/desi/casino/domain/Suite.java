package com.desi.casino.domain;

public enum Suite {
    SPADES(1),
    HEARTS(2),
    DIAMONDS(3),
    CLUBS(4);
    Suite(int value){
        this.value = value;
    }
    int value;

    public int getValue(){
        return this.value;
    }
    public void setValue(int value){
        this.value = value;
    }
    public static Suite getSuiteFromVal(int value){
        Suite suite = null;
        switch (value){
            case 1:
                suite = SPADES;
                break;
            case 2:
                suite = HEARTS;
                break;
            case 3:
                suite = DIAMONDS;
                break;
            case 4:
                suite = CLUBS;
                break;
        }
        return suite;
    }
}
