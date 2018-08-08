package factorymethod;

public class UnionPayApi implements IPayApi {

	public boolean pay(long money) {
		System.out.println("费用(元)："+money);
        System.out.println("通过银联云闪付完成了支付");
		return true;
	}

}
