package intermediary.mediator;

import java.util.Random;
/**
 * 
 * @author Crazy.Mo
 * ���۲��Ĺ����У��������ۡ��ۼ����ۣ������������������ǰ���ߵĹ����ܿ��Ͳɹ�����Լ������ͨ���н�����������
 */
public class Sale extends AbstractColleague {
	public Sale(AbstractMediator mediator) {
		super(mediator);
	}

	// ����IBM����
	public void sellIBMComputer(int number) {
		super.mediator.execute("sale.sell", number);
		System.out.println("����IBM����" + number + "̨");
	}

	// �������������0��100�仯��0����������û����100�����ǳ���������һ����һ��
	public int getSaleStatus() {
		Random rand = new Random(System.currentTimeMillis());
		int saleStatus = rand.nextInt(100);
		System.out.println("IBM���Ե��������Ϊ��" + saleStatus);
		return saleStatus;
	}

	// �ۼ۴���
	public void offSale() {
		super.mediator.execute("sale.offsell");
	}
}