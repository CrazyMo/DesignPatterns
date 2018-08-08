package factorymethod;

public class AliPayFactory extends PayFactory {

	@Override
	public IPayApi createPayApi() {
		System.out.println("通过支付宝支付工厂类创建支付宝的支付Api对象");
		return new AliPayApi();
	}

}
