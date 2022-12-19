package com.sample;

public class Cpmputer {

    private PowerState state;

    public void setState(PowerState state) {

        this.state = state;

        switch (this.state) {
            case OFF:
                System.out.println(PowerState.OFF);
                break;
            case ON:
                System.out.println(PowerState.ON);
                break;
            case SUSPEND:
                System.out.println(PowerState.SUSPEND);
                break;
//            case SLEEP:
//                System.out.println("SLEEP 不可用，因為 PowerState 沒有這個選項");
//                break;                
        }
    }

}
