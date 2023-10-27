package com.techelevator.rooms;

import com.techelevator.Robot;
import com.techelevator.menu.MenuDisplay;
import com.techelevator.Player;

public class GreenRoom {

    private static final String INTRO = "Welcome to the green room! There is a robot powered by ChatGPT and it wants to fight you. What do you do?";

    private static final String OPTION_FIGHT = "Fight the robot";
    private static final String OPTION_LEAVE = "Leave room";
    private static final String[] OPTIONS = {OPTION_FIGHT, OPTION_LEAVE};

    public void onEnterRoom(Player player, Robot robot) {

        while(true) {
            System.out.println(INTRO);

            String selectedOption = MenuDisplay.prompt(OPTIONS);
            if(selectedOption.equals(OPTION_FIGHT)){
                onFightRobot(player, robot);
            }else if(selectedOption.equals(OPTION_LEAVE)){
                System.out.println("You exit the room");
                break;
            }
        }
    }

    private void onFightRobot(Player player, Robot robot) {

        boolean robotWins = ((int)(Math.random() * 10)) <= 5;
        int playerDamage = 0;

        if(player.hasItem("SWORD")){
            playerDamage = (int)(Math.random() * 100);
        } else {
            playerDamage = (int)(Math.random() * 20);
        }

        if(player.getHasArmor() && player.getArmor() > 0){

            if(robotWins) {

                int healthDeduction = (int) (Math.random() * 20);
                player.setArmor(player.getArmor() - healthDeduction);
                System.out.println("Oh no! The robot is too fast. Your armor is down to " + player.getArmor());

            } else {

                robot.setHealth(robot.getHealth() - playerDamage);
                System.out.println("You were faster than the robot! After doing " + playerDamage + " damage, his health is now" + robot.getHealth());

            }

            if(player.getArmor() == 0){
                System.out.println("                            ");
                System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
                System.out.println("Oh no! Your armor is broken!");
                System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
                System.out.println("                            ");
            }
        } else {


            if (robotWins) {
                int healthDeduction = (int) (Math.random() * 20);
                player.setHealth(player.getHealth() - healthDeduction);
                System.out.println("Oh no! The robot is too fast. Your health is down to " + player.getHealth());

            } else {
                robot.setHealth(robot.getHealth() - playerDamage);
                System.out.println("You were faster than the robot! After doing " + playerDamage + " damage, his health is now" + robot.getHealth());

            }

        }

        if(robot.getHealth() == 0){
            System.out.println("                       ");
            System.out.println("***********************");
            System.out.println("You defeated the Robot!");
            System.out.println("***********************");
            System.out.println("                       ");

        }
        if(player.getHealth() == 0){
            System.out.println("                       ");
            System.out.println("************************");
            System.out.println("You have been defeated!");
            System.out.println("Exit the game to restart");
            System.out.println("************************");
            System.out.println("                       ");
        }


    }
}
