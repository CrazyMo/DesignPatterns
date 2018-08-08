package proxy.statics;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DynamicProxySubject implements InvocationHandler {
	private Object obj;//���б�������������
	
	public DynamicProxySubject(Object obj){
		this.obj=obj;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		//���÷�����ƽ�������ɸ�ί���ദ��Method��invoke����Object������Ϊ����ִ�н����  ��Ϊʾ������û�з���ֵ��������������˷���ֵ����  
		if("submit".equals(method.getName())){
			
			method.invoke(obj, args);
			System.out.println("�����˽��ܱ������˵�ί�У��õ�ԭ�������д�õ������鲢��Ժ�ύ...");
			
		}else if("proof".equals(method.getName())){
			
			method.invoke(obj, args);
			System.out.println("�����˽��ܱ������˵�ί�У���ԭ��׼���Ĳ����ύ����ͥ��...");
		}
		return null;
	}

}
