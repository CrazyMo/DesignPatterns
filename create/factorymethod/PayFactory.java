package factorymethod;

//���󹤳�������һ��������󹤳�����������ʲô��Ʒ�����������
public abstract class PayFactory {
	public abstract IPayApi createPayApi();//�����������������˼�����ͨ������ʵ���ӳٵ�����ȥ����ʵ��
	
	public boolean payout(long money){
		IPayApi api=createPayApi();
		//api.other();
		return api.pay(money);
	}
}
