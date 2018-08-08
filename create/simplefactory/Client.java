package simplefactory;

public class Client {

	public static void main(String[] args) {
		IProduct product=null;
		product=Factory.create(Factory.TYPE_A);
		product.produce();
		
		product=Factory.create(Factory.TYPE_B);
		product.produce();
		
		System.out.println("���÷���ͷ��ͷ�ʽ�Զ�ѡ��...");
		product=Factory.createProduct(ProductA.class);
		product.produce();
		product=Factory.createProduct(ProductB.class);
		product.produce();
	}

}
