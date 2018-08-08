package absfactory;

public class Client {

	public static void main(String[] args) {
		AbstractFactory topFactory=new TopFactory();
		AbstractFactory midFactory=new MidFactory();
		
		ICar car=topFactory.manufactureCar();
		car.run();
		car=midFactory.manufactureCar();
		car.run();
		
		ISUV suv=topFactory.manufactureSUV();
		suv.run();
		suv=midFactory.manufactureSUV();
		suv.run();
	}

}
