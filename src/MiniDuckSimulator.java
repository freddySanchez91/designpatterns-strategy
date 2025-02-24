import behaviors.fly.impl.FlyNoWay;
import behaviors.fly.impl.FlyWithRocket;
import behaviors.fly.impl.FlyWithWings;
import models.Duck;
import models.MallardDuck;
import models.ModelDuck;

public class MiniDuckSimulator{
	
	public static void main(String[] args){

		Duck mallard = new MallardDuck();

		mallard.performQuack();
		mallard.performFly();


		Duck model = new ModelDuck();

		model.setFlyBehavior(new FlyWithRocket());
		model.performQuack();
		model.performFly();

	}
}