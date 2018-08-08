package absfactory;

public class MidFactory extends AbstractFactory {

	@Override
	public ICar manufactureCar() {
		System.out.println("通过中等工厂生产中等家轿");
		return new MidCar();
	}

	@Override
	public ISUV manufactureSUV() {
		System.out.println("通过中等工厂生产中等SUV");
		return new MidSUV();
	}

}
