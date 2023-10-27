package com.techelevator;

import com.techelevator.rooms.GreenRoom;

public class Robot extends GreenRoom {

    private final int MAX_HEALTH = 200;
    private final int MIN_HEALTH = 0;
    private int health = MAX_HEALTH;

    public int getHealth(){
        return health;
    }

    public  void setHealth(int health){
        if(health > MAX_HEALTH){
            this.health = MAX_HEALTH;
        } else if(health < MIN_HEALTH){
            this.health = MIN_HEALTH;
        } else {
            this.health = health;
        }
    }
}
