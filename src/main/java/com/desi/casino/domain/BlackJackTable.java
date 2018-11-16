package com.desi.casino.domain;

import com.desi.casino.dealer.Dealer;
import com.desi.casino.dealer.Player;
import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
public class BlackJackTable implements GamblingTable{
    private Dealer dealer;
    private Set<Player> players;
    public BlackJackTable(){
        dealer = new Dealer();
        players = new HashSet<>();
    }
}
