package intermediary.mediator;

//具体中介者角色，正在处理各对象交互的处理逻辑
public class Mediator extends AbstractMediator {
	// 中介者最重要的方法
	public void execute(String str, Object... objects) {
		if (str.equals("purchase.buy")) { // 当中介者接到采购人员的采购请求时
			this.buyComputer((Integer) objects[0]);
		} else if (str.equals("sale.sell")) { // 当中介者接到采购人员的采购请求时销售人员销售请求时
			this.sellComputer((Integer) objects[0]);
		} else if (str.equals("sale.offsell")) { // 当中介者接到采购人员的采购请求时销售人员时折价销售请求时
			this.offSell();
		} else if (str.equals("stock.clear")) { // 当中介者接到库存人员清仓处理请求时
			this.clearStock();
		}
	}

	// 采购电脑
	private void buyComputer(int number) {
		int saleStatus = super.sale.getSaleStatus();
		if (saleStatus > 80) { // 销售情况良好
			System.out.println("采购IBM电脑:" + number + "台");
			super.stock.increase(number);
		} else { // 销售情况不好
			int buyNumber = number / 2; // 折半采购
			System.out.println("采购IBM电脑：" + buyNumber + "台");
		}
	}

	// 销售电脑
	private void sellComputer(int number) {
		if (super.stock.getStockNumber() < number) { // 库存数量不够销售
			super.purchase.buyIBMcomputer(number);//通知采购部采购
		}
		super.stock.decrease(number);//库存直接减少
	}

	// 折价销售电脑
	private void offSell() {
		System.out.println("折价销售IBM电脑" + stock.getStockNumber() + "台");
	}

	// 清仓处理
	private void clearStock() {
		// 要求清仓销售
		super.sale.offSale();
		// 要求采购人员不要采购
		super.purchase.refuseBuyIBM();
	}
}
