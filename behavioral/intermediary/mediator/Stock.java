package intermediary.mediator;
/**
 * 
 * @author Crazy.Mo
 *�ִ�����Ҫ���Ĺ����У���⡢���⡢������������������������۲��Ͳɹ���
 */
public class Stock extends AbstractColleague {
	public Stock(AbstractMediator mediator) {
		super(mediator);
	}

	// ����տ�ʼ��100̨����
	private static int COMPUTER_NUMBER = 100;

	// ���
	public void increase(int number) {
		COMPUTER_NUMBER = COMPUTER_NUMBER + number;
		System.out.println("�������Ϊ��" + COMPUTER_NUMBER);
	}

	// ����
	public void decrease(int number) {
		COMPUTER_NUMBER = COMPUTER_NUMBER - number;
		System.out.println("�������Ϊ��" + COMPUTER_NUMBER);
	}

	// ��ÿ������
	public int getStockNumber() {
		return COMPUTER_NUMBER;
	}

	//���ѹ�����ˣ���Ҫ֪ͨ�ɹ���Ա��Ҫ�ɹ���������ԱҪ��������
	public void clearStock() {
		System.out.println("����������Ϊ��" + COMPUTER_NUMBER);
		super.mediator.execute("stock.clear");//ֻ�ǰ���Ϣ��֪���н��ߣ���û��ֱ�Ӻ����ۡ��ɹ�����ϵ
	}
}