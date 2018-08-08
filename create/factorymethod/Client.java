package factorymethod;

public class Client {

	public static void main(String[] args) {
		IPayApi api=null;
		PayFactory factory=new AliPayFactory();
		api=factory.createPayApi();
		api.pay(1688L);

		System.out.println("-----------------------------");
		factory=new UnionPayFactory();
		api=factory.createPayApi();
		api.pay(518L);
	}

}
