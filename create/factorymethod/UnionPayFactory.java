package factorymethod;

public class UnionPayFactory extends PayFactory {

	@Override
	public IPayApi createPayApi() {
		System.out.println("通过银联云闪付工厂类创建云闪付的支付Api对象");
		return new UnionPayApi();
	}

}
