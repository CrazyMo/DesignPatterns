package subclswithpcls.strategy;

public class AliPayStrategy implements PayStrategy {

	@Override
	public void pay(float money) {
		//����֧�����Ľӿھ������ ��...
		if(money<=200){
			System.out.println("ͨ������֧�����Ľӿ�"+"ֱ��֧����"+money);
		}else{
			System.out.println("ͨ������֧�����Ľӿ�"+"����������֤��֧����"+money);
		}
	}

}
