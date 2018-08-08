package proxy.statics;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DynamicProxySubject implements InvocationHandler {
	private Object obj;//持有被代理对象的引用
	
	public DynamicProxySubject(Object obj){
		this.obj=obj;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		//利用反射机制将请求分派给委托类处理。Method的invoke返回Object对象作为方法执行结果。  因为示例程序没有返回值，所以这里忽略了返回值处理  
		if("submit".equals(method.getName())){
			
			method.invoke(obj, args);
			System.out.println("代理人接受被代理人的委托，拿到原告的事先写好的诉讼书并向法院提交...");
			
		}else if("proof".equals(method.getName())){
			
			method.invoke(obj, args);
			System.out.println("代理人接受被代理人的委托，把原告准备的材料提交到法庭上...");
		}
		return null;
	}

}
