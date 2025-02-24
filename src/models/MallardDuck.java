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

	}

}