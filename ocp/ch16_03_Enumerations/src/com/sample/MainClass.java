package com.sample;

public class MainClass {

    public static void main(String[] args) {
        Cpmputer computer = new Cpmputer();
        computer.setState(PowerState.ON);
        computer.setState(PowerState.SUSPEND);
        computer.setState(PowerState.ON);
        computer.setState(PowerState.OFF);
    }

}
