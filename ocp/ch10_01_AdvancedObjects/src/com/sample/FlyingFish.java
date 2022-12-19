package com.sample;

public class FlyingFish extends Fish implements Fly {

    public FlyingFish(String name) {
        super(name);
    }

    @Override
    public void swim() {
        System.out.printf("飛魚：%s 在水中游%n", name);
    }

    @Override
    public void fly() {
        System.out.printf("飛魚：%s 在水面上飄飛，速度：%d%n", name, FlySpeed.SPEED + MoveSpeed.SPEED);
    }

}
