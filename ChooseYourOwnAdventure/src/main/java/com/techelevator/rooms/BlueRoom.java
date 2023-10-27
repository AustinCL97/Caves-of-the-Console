package com.techelevator.rooms;

import com.techelevator.menu.MenuDisplay;
import com.techelevator.Player;
import com.techelevator.constants.GameConstants;

public class BlueRoom {

    private static final String INTRO = "Welcome to the blue room! There are two boxes sitting on a table. What do you do?";

    private static final String OPTION_1 = "Open Box 1";
    private static final String OPTION_2 = "Open Box 2";
    private static final String OPTION_3 = "Leave room";
    private static final String[] OPTIONS = {OPTION_1, OPTION_2, OPTION_3};

    public void onEnterRoom(Player player) {

        while(true) {

            System.out.println(INTRO);

            String selectedOption = MenuDisplay.prompt(OPTIONS);
            if(selectedOption.equals(OPTION_1)){
                onOpenBox1(player);
            } else if(selectedOption.equals(OPTION_2)){
                onOpenBox2(player);
            } else if(selectedOption.equals(OPTION_3)){
                System.out.println("You exit the room");
                break;
            }
        }
    }

    private void onOpenBox1(Player player) {
        System.out.println("Congratulations! You found a red key!");
        player.addItem(GameConstants.RED_KEY);
    }

    private void onOpenBox2(Player player){
        System.out.println("Awesome! You found a sword!");
        player.addItem(GameConstants.SWORD);
    }
}
