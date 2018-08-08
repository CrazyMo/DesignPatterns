package subclswithpcls.strategy;
//辅助类用于给用户决定使用哪种策略（非必须）
public class ContextStrategy {
	private PayStrategy strategy;
	public ContextStrategy(){
		
	}
	public void payout(float money){
		strategy.pay(money);//调用策略
	}
	
	public void setStrategy(PayStrategy strategy){
		this.strategy=strategy;//设置策略类
	}
}
