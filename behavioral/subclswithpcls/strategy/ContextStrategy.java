package subclswithpcls.strategy;
//���������ڸ��û�����ʹ�����ֲ��ԣ��Ǳ��룩
public class ContextStrategy {
	private PayStrategy strategy;
	public ContextStrategy(){
		
	}
	public void payout(float money){
		strategy.pay(money);//���ò���
	}
	
	public void setStrategy(PayStrategy strategy){
		this.strategy=strategy;//���ò�����
	}
}
