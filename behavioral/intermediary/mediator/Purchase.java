package intermediary.mediator;

/**
 * 
 * @author Crazy.Mo
 *�ɹ�����Ҫ�����У���ʼ�ɹ���ֹͣ�ɹ�
 */
public class Purchase extends AbstractColleague {
	public Purchase(AbstractMediator mediator) {
		super(mediator);
	}

	// �ɹ�IBM����
	public void buyIBMcomputer(int number) {
		super.mediator.execute("purchase.buy", number);
	}

	// ���ٲɹ�IBM����
	public void refuseBuyIBM() {
		System.out.println("���ٲɹ�IBM����");
	}
}
