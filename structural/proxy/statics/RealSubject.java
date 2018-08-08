package proxy.statics;

/**
 * 
 * @author Crazy.Mo
 * 被代理角色，又称委托人即RealSuject角色，这才是业务逻辑实现的类，如果不采取代理模式，客户端应该直接调用的方法都在这里实现
 */
public class RealSubject implements AbstractSubject{

	@Override
	public void submit() {
		System.out.println("----被代理对象自己起草诉讼书，待提交到法院----");
		
	}

	@Override
	public void proof() {
		System.out.println("----被代理对象自己采集整理证据----");
	}
}
