package com.sample;

public class Soldier extends Role {

    public Soldier() {
        System.out.println("新士兵誕生...");
    }

    public void fight() {
        System.out.printf("士兵：%s 進行火炮攻擊%n", getName());
    }

}
