package intermediary.mediator;

import java.util.Random;
/**
 * 
 * @author Crazy.Mo
 * 销售部的工作有：正常销售、折价销售，反馈销售情况，其中前两者的工作受库存和采购的制约，所以通过中介者来间接完成
 */
public class Sale extends AbstractColleague {
	public Sale(AbstractMediator mediator) {
		super(mediator);
	}

	// 销售IBM电脑
	public void sellIBMComputer(int number) {
		super.mediator.execute("sale.sell", number);
		System.out.println("销售IBM电脑" + number + "台");
	}

	// 反馈销售情况，0～100变化，0代表根本就没人买，100代表非常畅销，出一个卖一个
	public int getSaleStatus() {
		Random rand = new Random(System.currentTimeMillis());
		int saleStatus = rand.nextInt(100);
		System.out.println("IBM电脑的销售情况为：" + saleStatus);
		return saleStatus;
	}

	// 折价处理
	public void offSale() {
		super.mediator.execute("sale.offsell");
	}
}