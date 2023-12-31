package com.techelevator.rooms;

import com.techelevator.menu.MenuDisplay;
import com.techelevator.Player;

public class PurpleRoom {

    private static final String INTRO = "You enter a purple room. You see your friends. They offer cake and armor!";

    private static final String OPTION_CAKE = "Eat the cake";
    private static final String OPTION_ARMOR = "Take the armor";
    private static final String OPTION_LEAVE = "Leave room";
    private static final String[] OPTIONS = {OPTION_CAKE, OPTION_LEAVE, OPTION_ARMOR};

    public void onEnterRoom(Player player) {

        while(true) {

            System.out.println(INTRO);

            String selectedOption = MenuDisplay.prompt(OPTIONS);
            if(selectedOption.equals(OPTION_CAKE)){
                onEatCake(player);
            } else if(selectedOption.equals(OPTION_ARMOR)){
                onGetArmor(player);
            } else if(selectedOption.equals(OPTION_LEAVE)){
                System.out.println("You exit the room");
                break;
            }


        }

    }

    private void onEatCake(Player player) {
        System.out.println("Congratulations! You eat cake and restore your health!");
        player.setHealth( player.getHealth() + 20);
    }

    private void onGetArmor(Player player){
        System.out.println("                                        ");
        System.out.println("****************************************");
        System.out.println("You got a shiny set of armor with 50 HP!");
        System.out.println("****************************************");
        System.out.println("                                        ");
        player.setHasArmor(true);
    }
}
