package com.learning.ds.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class PlayerFactory {

    private static final Map<String,Player> players = new HashMap<String, Player>();

    public static Player getPlayer(final String type) {
        Player player = null;

        if (players.containsKey(type)) {
            player = players.get(type);
        } else {
            switch (type) {
                case "Terrorist" :
                    System.out.println("Creating Terrorist player.....");
                    player = new Terrorist();
                    break;
                case "CounterTerrorist" :
                    System.out.println("Creating Counter Terrorist player.....");
                    player = new CounterTerrorist();
                    break;
                default:
                    System.out.println("No such player found");
            }
            players.put(type, player);
        }

        return player;
    }
}
