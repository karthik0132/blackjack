package com.desi.casino.domain;

import lombok.Getter;

@Getter
public enum GamblingTables {
    BLACK_JACK("1",BlackJackTable.class),
    POKER("2", PokerTable.class);
    GamblingTables(String type, Class aClass){
        this.type = type;
        this.aClass = aClass;
    }
    private String type;
    private Class aClass;
}
