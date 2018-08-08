package proxy.statics;

import java.lang.reflect.Proxy;

public class Client {

	public static void main(String[] args) {
		AbstractSubject subject = new RealSubject();
		ProxySubject proxy = new ProxySubject(subject);
		proxy.submit();
		proxy.proof();
		System.out.println("**********����ȫȫ�Կͻ�������****************");
		// ��ȫ����
		AbstractSubject proxy2 = SubjectStaticFactory.getInstance();
		proxy2.submit();
		proxy2.proof();
		System.out.println("**********��̬����****************");
		//��̬����
		AbstractSubject suiter=new RealSubject();//����һ�����������
		
		DynamicProxySubject dynaProxyer=new DynamicProxySubject(suiter);//����һ����̬����
		ClassLoader loader=suiter.getClass().getClassLoader();
		//��̬����һ������Ĵ��������������˱��������
		AbstractSubject dynaSuiter=(AbstractSubject) Proxy.newProxyInstance(loader, new Class[]{AbstractSubject.class}, dynaProxyer);
		dynaSuiter.submit();
		dynaSuiter.proof();
		
	}

}
