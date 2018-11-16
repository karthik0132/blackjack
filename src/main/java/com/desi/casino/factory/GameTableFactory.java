package com.desi.casino.factory;

import com.desi.casino.domain.BlackJackTable;
import com.desi.casino.domain.GamblingTable;
import com.desi.casino.domain.GamblingTables;
import com.desi.casino.domain.PokerTable;
import lombok.Getter;

import java.util.HashSet;
import java.util.Set;

@Getter
public enum  GameTableFactory {
    GAME_TABLE_FACTORY;
    private Set<BlackJackTable> blackJackTables;
    GameTableFactory(){
        blackJackTables = new HashSet<>();
    }
    public GamblingTable getANewTable(GamblingTables tableType ){
        switch (tableType){
            case BLACK_JACK:
                BlackJackTable gamblingTable = new BlackJackTable();
                blackJackTables.add(gamblingTable);
                return gamblingTable;
            case POKER:
                return new PokerTable();
             default:
                 return null;
        }
    }
}
