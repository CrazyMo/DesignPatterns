package subclswithpcls.strategy;

public class MainStrategyClient {

	public static void main(String[] args) {
		ContextStrategy strategy=new ContextStrategy();
		strategy.setStrategy(new AliPayStrategy());
		strategy.payout(1000f);
		System.out.println();
		strategy.setStrategy(new WeChatPayStrategy());
		strategy.payout(20f);
	}

}
