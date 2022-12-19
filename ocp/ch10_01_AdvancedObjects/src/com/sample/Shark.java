package com.sample;

public class Shark extends Fish {

    public Shark(String name) {
        super(name);
    }

    @Override
    public void swim() {
        System.out.printf("鯊魚：%s 在水中攻擊餵食員%n", name);
    }

}
