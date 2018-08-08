package intermediary.mediator;

public class MainMediatorClient {

	public static void main(String[] args) {
		AbstractMediator mediator = new Mediator();
		// 采购人员采购电脑
		System.out.println("------采购人员采购电脑--------");
		Purchase purchase = new Purchase(mediator);
		purchase.buyIBMcomputer(100);//采购人员想要采购电脑，首先会把这个信息传递到中介者，根据中介者的实现：首先根据销售部门反馈的状况良好则通知库房直接批准，情况不妙则折半采购
		
		
		// 销售人员销售电脑
		System.out.println("\n------销售人员销售电脑--------");
		Sale sale = new Sale(mediator);
		sale.sellIBMComputer(1);//销售人员想要卖电脑，首先会把这个信息传递到中介者，根据中介者的实现：首先根据库房状况，不够的话要求采购部采购，库存足够的话库房直接出库
		
		// 库房管理人员管理库存
		System.out.println("\n------库房管理人员清库处理--------");
		Stock stock = new Stock(mediator);
		stock.clearStock();//库房人员想要清库存，首先会把这个信息传递到中介者，根据中介者的实现：督促销售着才去折价销售采购部停止采购
	}

}
