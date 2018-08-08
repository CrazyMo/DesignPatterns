package factorymethod;

//抽象工厂，定义一个顶层抽象工厂，具体生产什么产品由其子类决定
public abstract class PayFactory {
	public abstract IPayApi createPayApi();//工厂方法，核心设计思想就是通过它把实例延迟到子类去各自实现
	
	public boolean payout(long money){
		IPayApi api=createPayApi();
		//api.other();
		return api.pay(money);
	}
}
