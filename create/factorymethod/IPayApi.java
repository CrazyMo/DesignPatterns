package factorymethod;

//以第三方支付为例，支付方式可能有支付宝、银联云闪付、微信支付等多种方式，把这些都抽象为顶层操作
public interface IPayApi {
	public boolean pay(long money);
	
//  public void other();
}
