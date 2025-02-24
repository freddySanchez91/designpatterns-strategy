package behaviors.quack.impl;

import behaviors.quack.QuackBehavior;

public class Squeak implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("behaviors.quack.impl.Squeak");
	}
}