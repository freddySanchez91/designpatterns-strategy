package models;

import behaviors.fly.impl.FlyWithWings;
import behaviors.quack.impl.Quack;

public class MallardDuck extends Duck{

	public MallardDuck(){
		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();
	}

	@Override
	public void dispaly() {
		System.out.println("I'm a real Mallard duck");
	}

}