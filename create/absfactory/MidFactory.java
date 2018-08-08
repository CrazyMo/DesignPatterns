package absfactory;

public class MidFactory extends AbstractFactory {

	@Override
	public ICar manufactureCar() {
		System.out.println("ͨ���еȹ��������еȼҽ�");
		return new MidCar();
	}

	@Override
	public ISUV manufactureSUV() {
		System.out.println("ͨ���еȹ��������е�SUV");
		return new MidSUV();
	}

}
