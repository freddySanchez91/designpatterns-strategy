import behaviors.fly.impl.FlyNoWay;
import behaviors.fly.impl.FlyWithRocket;
import behaviors.fly.impl.FlyWithWings;
import models.Duck;
import models.MallardDuck;
import models.ModelDuck;

public class MiniDuckSimulator{
	
	public static void main(String[] args){

		System.out.println("MiniDuck Simulator");

		System.out.println("\n\nMallardduck says");
		Duck mallard = new MallardDuck();

		mallard.dispaly();
		mallard.performQuack();
		mallard.performFly();

		System.out.println("\n\nModelDuck sayss");
		Duck model = new ModelDuck();

		model.dispaly();
		model.setFlyBehavior(new FlyWithRocket());
		model.performQuack();
		model.performFly();

	}
}