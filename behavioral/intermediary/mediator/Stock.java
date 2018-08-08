package intermediary.mediator;
/**
 * 
 * @author Crazy.Mo
 *仓储部需要做的工作有：入库、出库、库存数量、库存情况反馈到销售部和采购部
 */
public class Stock extends AbstractColleague {
	public Stock(AbstractMediator mediator) {
		super(mediator);
	}

	// 假设刚开始有100台电脑
	private static int COMPUTER_NUMBER = 100;

	// 入库
	public void increase(int number) {
		COMPUTER_NUMBER = COMPUTER_NUMBER + number;
		System.out.println("库存数量为：" + COMPUTER_NUMBER);
	}

	// 出库
	public void decrease(int number) {
		COMPUTER_NUMBER = COMPUTER_NUMBER - number;
		System.out.println("库存数量为：" + COMPUTER_NUMBER);
	}

	// 获得库存数量
	public int getStockNumber() {
		return COMPUTER_NUMBER;
	}

	//存货压力大了，就要通知采购人员不要采购，销售人员要尽快销售
	public void clearStock() {
		System.out.println("清理存货数量为：" + COMPUTER_NUMBER);
		super.mediator.execute("stock.clear");//只是把消息告知给中介者，并没有直接和销售、采购部联系
	}
}