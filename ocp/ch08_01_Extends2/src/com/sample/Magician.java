package com.sample;

public class Magician extends Role {

    public Magician() {
        System.out.println("新魔法師誕生...");
    }

    public void cure() {
        System.out.printf("魔法師：%s 進行魔法治療%n", getName());
    }

    public void fight() {
        System.out.printf("魔法師：%s 進行魔法攻擊%n", getName());
    }

}
