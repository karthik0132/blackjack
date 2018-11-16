package com.desi.casino.handler;

import com.desi.casino.domain.BlackJackTable;
import com.desi.casino.domain.GamblingTable;
import com.desi.casino.domain.GamblingTables;
import com.desi.casino.factory.GameTableFactory;

import java.io.Console;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class GuestHandler implements Callable<GuestHandler>{

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        GuestHandler guestHandler = new GuestHandler();
        executorService.submit(guestHandler);
    }

    private String promptForNewGame(){
        System.out.println(
                "Welcome!" +
                        "\n" +
                        "Please make your selection." +
                        "\n" +
                        "'1'. For BlackJack" +
                        "\n" +
                        "'2'. For Poker");

        Console console = System.console();
        String gameType = console.readLine();
        while (!gameType.matches("[12]")){
            System.out.println("Invalid input. Try again.");
            gameType = console.readLine();
        }
        return gameType;
    }

    private GamblingTable findANewTable(String gameType){
        Set<BlackJackTable> blackJackTables = GameTableFactory.GAME_TABLE_FACTORY.getBlackJackTables();
        for(BlackJackTable table:blackJackTables){
            if(table.getPlayers().size() < GamblingTable.TABLE_SIZE){
                return table;
            }
        }
        return GameTableFactory.GAME_TABLE_FACTORY.getANewTable(GamblingTables.valueOf(gameType));
    }

    @Override
    public GuestHandler call() throws Exception {
        String gameType = promptForNewGame();
        findANewTable(gameType);
        return null;
    }
}
