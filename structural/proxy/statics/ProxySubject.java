package proxy.statics;

/**
 * 
 * @author Crazy.Mo
 * �����ɫ��SubjectProxyer,��ν�����࣬�����Ǵ�����ί�е����ã��ڴ����ɫ�ڲ����漰��������߼��������Ǽ򵥵ĵ��ñ������ɫ���ŵķ���
 */
public class ProxySubject {
	
	private AbstractSubject subject;
	public ProxySubject(AbstractSubject subject){
		this.subject=subject;
	}

	public void submit() {
		this.subject.submit();
		System.out.println("�����˽��ܱ������˵�ί�У��õ�ԭ�������д�õ������鲢��Ժ�ύ...");
	}

	public void proof() {	
		this.subject.proof();
		System.out.println("�����˽��ܱ������˵�ί�У���ԭ��׼���Ĳ����ύ����ͥ��...");
	}
}
