package com.sample;

public class MainClass {

    public static void main(String[] args) {
        // Fish fish = new Fish("小魚兒");
        // fish.swim();

        Anemonefish anemonefish = new Anemonefish("尼莫");
        anemonefish.swim();

        Shark shark = new Shark("大白鯊");
        shark.swim();

        Human human = new Human("小明");
        human.swim();

        Superman superman = new Superman("克拉克");
        superman.swim();
        superman.fly();

        FlyingFish flyingFish = new FlyingFish("非魚");
        flyingFish.swim();
        flyingFish.fly();
    }

}
