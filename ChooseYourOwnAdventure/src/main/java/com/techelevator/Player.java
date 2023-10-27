package com.techelevator;

import java.util.ArrayList;
import java.util.List;

public class Player {

    private final int MAX_HEALTH = 100;
    private final int MIN_HEALTH = 0;
    private final int MAX_ARMOR = 50;
    private final int MIN_ARMOR = 0;

    private int armor = MAX_ARMOR;
    private int health = MAX_HEALTH;
    private int coin;
    private List<String> items = new ArrayList<>();

    private boolean hasArmor = false;

    public Player(){
        this.coin = 0;
    }
    public int getCoin(){
        return coin;
    }

    public int getHealth() {
        return health;
    }

    public int getArmor(){
        return armor;
    }
    public boolean getHasArmor(){
        return hasArmor;
    }

    public void setHasArmor(boolean hasArmor){
        this.hasArmor = hasArmor;
    }
    public void setArmor(int armor){
        if(armor > MAX_ARMOR){
            this.armor = MAX_ARMOR;
        } else if(armor < MIN_ARMOR){
            this.armor = MIN_ARMOR;
        } else {
            this.armor = armor;
        }
    }

    public void setHealth(int health) {
        if (health > MAX_HEALTH) {
            this.health = MAX_HEALTH;
        } else if (health < MIN_HEALTH) {
            this.health = MIN_HEALTH;
        } else {
            this.health = health;
        }
    }

    public boolean hasItem(String item) {
        return items.contains(item);
    }

    public void addItem(String item) {
        items.add(item);
    }
    public void addCoin(int coin) {
        this.coin += coin;
    }
    public void subtractCoin(int coin) {
        this.coin -= coin;
    }
    public void printCoin(){
        System.out.println("You have " + getCoin() + " coins remaining");
    }
}
