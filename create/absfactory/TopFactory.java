package absfactory;

public class TopFactory extends AbstractFactory {

	@Override
	public ICar manufactureCar() {
		System.out.println("通过高等工厂生产高等家轿");
		return new TopCar();
	}

	@Override
	public ISUV manufactureSUV() {
		System.out.println("通过高等工厂生产高等SUV");
		return new TopSUV();
	}

}
