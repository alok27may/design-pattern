package com.learning.ds.structural.flyweight;

import java.util.Random;

public class CounterStrikeTest {
    private static String[] playerType = {"Terrorist", "CounterTerrorist"};
    private static String[] weapons = {"AK-47", "Maverick", "Gut Knife", "Desert Eagle"};

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++)
        {
            Player p = PlayerFactory.getPlayer(getRandPlayerType());

            p.assignWeapon(getRandWeapon());

            // Send this player on a mission
            p.mission();
        }
    }

    private static String getRandWeapon() {
        final Random random = new Random();
        final int randomNo = random.nextInt(weapons.length);
        return weapons[randomNo];
    }

    private static String getRandPlayerType() {
        final Random random = new Random();
        final int randomNo = random.nextInt(playerType.length);
        return playerType[randomNo];
    }
}
