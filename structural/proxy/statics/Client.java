package proxy.statics;

import java.lang.reflect.Proxy;

public class Client {

	public static void main(String[] args) {
		AbstractSubject subject = new RealSubject();
		ProxySubject proxy = new ProxySubject(subject);
		proxy.submit();
		proxy.proof();
		System.out.println("**********完完全全对客户端隐藏****************");
		// 完全隐藏
		AbstractSubject proxy2 = SubjectStaticFactory.getInstance();
		proxy2.submit();
		proxy2.proof();
		System.out.println("**********动态代理****************");
		//动态代理
		AbstractSubject suiter=new RealSubject();//构造一个被代理对象
		
		DynamicProxySubject dynaProxyer=new DynamicProxySubject(suiter);//构造一个动态代理
		ClassLoader loader=suiter.getClass().getClassLoader();
		//动态构造一个具体的代理对象，在这绑定上了被代理对象
		AbstractSubject dynaSuiter=(AbstractSubject) Proxy.newProxyInstance(loader, new Class[]{AbstractSubject.class}, dynaProxyer);
		dynaSuiter.submit();
		dynaSuiter.proof();
		
	}

}
