package subclswithpcls.strategy;

public class AliPayStrategy implements PayStrategy {

	@Override
	public void pay(float money) {
		//调用支付宝的接口具体代码 略...
		if(money<=200){
			System.out.println("通过调用支付宝的接口"+"直接支付了"+money);
		}else{
			System.out.println("通过调用支付宝的接口"+"输入密码验证再支付了"+money);
		}
	}

}
