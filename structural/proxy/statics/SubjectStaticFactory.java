package proxy.statics;

/**
 * ��ƴ����Ŀ����Ϊ�˶��ڿͻ�������ȫȫ����
 */
public class SubjectStaticFactory {
	// �ͻ�����ô˹���������ô������,�Կͻ�����˵���䲢��֪�����ص��Ǵ���������Ǳ����������
	public static AbstractSubject getInstance() {
		return (AbstractSubject) new ProxySubject2(new RealSubject());
	}
}
