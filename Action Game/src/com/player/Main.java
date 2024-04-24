package com.player;

public class Main {
    public static void main(String[] args) {
        Player1 player1 =new Player1("Roki","Sword",-500);
//        System.out.println(player1.getName());
//        System.out.println(player1.getHealth());
//        System.out.println(player1.getWeapon());

        player1.damageByGun1();
        player1.damageByGun2();
        player1.damageByGun2();
        player1.heal();


//        Player2 player2= new Player2("Jhon","Gun",80,true);
//        player2.damageByGun1();
    }
}