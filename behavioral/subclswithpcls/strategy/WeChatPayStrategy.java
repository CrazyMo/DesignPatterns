package subclswithpcls.strategy;

public class WeChatPayStrategy implements PayStrategy {

	@Override
	public void pay(float money) {
		//����΢�ŵĽӿ��ԡ�������
		System.out.println("ͨ������΢��֧���Ľӿ�֧����"+money+"\n\n");
		
	}

}
