package behaviors.fly.impl;

import behaviors.fly.FlyBehavior;

public class FlyWithRocket implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm flying with a rocket");
    }
}
