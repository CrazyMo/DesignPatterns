package proxy.statics;

/**
 * 
 * @author Crazy.Mo
 * ������ɫ��SubjectProxyer,��ν�����࣬�����Ǵ�������ί�е����ã��ڴ�����ɫ�ڲ����漰��������߼��������Ǽ򵥵ĵ��ñ�������ɫ���ŵķ���
 */
public class ProxySubject2 implements AbstractSubject {
	
	private AbstractSubject subject;
	public ProxySubject2(AbstractSubject subject){
		this.subject=subject;
	}

	@Override
	public void submit() {
		this.subject.submit();
		System.out.println("�����˽��ܱ������˵�ί�У��õ�ԭ�������д�õ������鲢��Ժ�ύ...");
	}
	@Override
	public void proof() {	
		this.subject.proof();
		System.out.println("�����˽��ܱ������˵�ί�У���ԭ��׼���Ĳ����ύ����ͥ��...");
	}
}