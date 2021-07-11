package me.sungbin.chapter3.ch03_16.quiz1;

public class PlayerTest {
    public static void main(String[] args) {

        Player player1 = new Player();
        player1.play(1);
        player1.upgradeLevel(new AdvancedLevel());
        player1.play(2);
        player1.upgradeLevel(new SuperLevel());
        player1.play(3);
    }
}
