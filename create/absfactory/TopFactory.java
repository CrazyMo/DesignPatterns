package absfactory;

public class TopFactory extends AbstractFactory {

	@Override
	public ICar manufactureCar() {
		System.out.println("ͨ���ߵȹ��������ߵȼҽ�");
		return new TopCar();
	}

	@Override
	public ISUV manufactureSUV() {
		System.out.println("ͨ���ߵȹ��������ߵ�SUV");
		return new TopSUV();
	}

}
