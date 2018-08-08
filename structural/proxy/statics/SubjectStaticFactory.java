package proxy.statics;

/**
 * 设计此类的目的是为了对于客户端完完全全隐藏
 */
public class SubjectStaticFactory {
	// 客户类调用此工厂方法获得代理对象,对客户类来说，其并不知道返回的是代理类对象还是被代理类对象。
	public static AbstractSubject getInstance() {
		return (AbstractSubject) new ProxySubject2(new RealSubject());
	}
}
