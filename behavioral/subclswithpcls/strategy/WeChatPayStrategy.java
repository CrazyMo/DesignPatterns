package subclswithpcls.strategy;

public class WeChatPayStrategy implements PayStrategy {

	@Override
	public void pay(float money) {
		//调用微信的接口略。。。。
		System.out.println("通过调用微信支付的接口支付了"+money+"\n\n");
		
	}

}
