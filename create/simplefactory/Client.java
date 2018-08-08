package simplefactory;

public class Client {

	public static void main(String[] args) {
		IProduct product=null;
		product=Factory.create(Factory.TYPE_A);
		product.produce();
		
		product=Factory.create(Factory.TYPE_B);
		product.produce();
		
		System.out.println("利用反射和泛型方式自动选择...");
		product=Factory.createProduct(ProductA.class);
		product.produce();
		product=Factory.createProduct(ProductB.class);
		product.produce();
	}

}
