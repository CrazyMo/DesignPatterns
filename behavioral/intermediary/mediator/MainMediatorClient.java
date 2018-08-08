package intermediary.mediator;

public class MainMediatorClient {

	public static void main(String[] args) {
		AbstractMediator mediator = new Mediator();
		// �ɹ���Ա�ɹ�����
		System.out.println("------�ɹ���Ա�ɹ�����--------");
		Purchase purchase = new Purchase(mediator);
		purchase.buyIBMcomputer(100);//�ɹ���Ա��Ҫ�ɹ����ԣ����Ȼ�������Ϣ���ݵ��н��ߣ������н��ߵ�ʵ�֣����ȸ������۲��ŷ�����״��������֪ͨ�ֱⷿ����׼������������۰�ɹ�
		
		
		// ������Ա���۵���
		System.out.println("\n------������Ա���۵���--------");
		Sale sale = new Sale(mediator);
		sale.sellIBMComputer(1);//������Ա��Ҫ�����ԣ����Ȼ�������Ϣ���ݵ��н��ߣ������н��ߵ�ʵ�֣����ȸ��ݿⷿ״���������Ļ�Ҫ��ɹ����ɹ�������㹻�Ļ��ֱⷿ�ӳ���
		
		// �ⷿ������Ա������
		System.out.println("\n------�ⷿ������Ա��⴦��--------");
		Stock stock = new Stock(mediator);
		stock.clearStock();//�ⷿ��Ա��Ҫ���棬���Ȼ�������Ϣ���ݵ��н��ߣ������н��ߵ�ʵ�֣����������Ų�ȥ�ۼ����۲ɹ���ֹͣ�ɹ�
	}

}
