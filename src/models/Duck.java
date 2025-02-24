package models;

import behaviors.fly.FlyBehavior;
import behaviors.quack.QuackBehavior;

public abstract class Duck {

	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;

	public Duck(){}

	public abstract void dispaly();

	public void performFly(){

		flyBehavior.fly();
	}

	public void performQuack(){

		quackBehavior.quack();
	}

	public FlyBehavior getFlyBehavior() {
		return flyBehavior;
	}

	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}

	public void swim(){
		System.out.println("All ducs float, even decoys!!!");
	}
	
}