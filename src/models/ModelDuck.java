package models;

import behaviors.fly.impl.FlyNoWay;
import behaviors.quack.impl.MuteQuack;

public class ModelDuck extends Duck {

    public ModelDuck(){
        flyBehavior = new FlyNoWay();
        quackBehavior = new MuteQuack();
    }

    @Override
    public void dispaly() {
        System.out.println("I'm a model duck");
    }
}
