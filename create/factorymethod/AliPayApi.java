package factorymethod;

public class AliPayApi implements IPayApi {

	public boolean pay(long money) {
		System.out.println("费用(元)："+money);
        System.out.println("通过支付宝完成了支付");
		return true;
	}
}
