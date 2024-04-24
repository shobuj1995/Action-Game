package com.player;

public class Player2 extends Player1{
    private int health;
    private boolean armour;
    public Player2(String name, String weapon, int health, boolean armour) {
        super(name, weapon, health);
        this.health = health;
        this.armour = armour;
    }
    @Override
    public void damageByGun1() {
       if(armour){
           this.health-=20;
           if (this.health<=0)this.health=0;
           System.out.println("Armour is on. Got hit by gun1. Health is reduced by 20"+" new health is "+this.health);
       }if(!armour){
           this.health -=30;
           if(this.health<=0)this.health=0;
            System.out.println("Armour is not on.Got hit by gun1. Health is reduced by 30"+" New health is "+this.health);
        }
        if(this.health==0){
            System.out.println(getName()+" is dead");
        }
    }

    @Override
    public void damageByGun2() {
        if(armour){
            this.health-=40;
            if (this.health<=0)this.health=0;
            System.out.println("Armour is on. Got hit by gun2. Health is reduced by 40"+"new health is"+this.health);
        }if(!armour){
            this.health -=50;
            if(this.health<=0)this.health=0;
            System.out.println("Armour is not on.Got hit by gun2. Health is reduced by 50"+"New health is "+this.health);
        }
        if(this.health==0){
            System.out.println(getName()+" is dead");
        }
    }

    @Override
    public void heal() {
        super.heal();
    }

    public void testMethod(){
        System.out.println("This is for test dynamic ditchpatch");
    }
}
