package proxy.statics;

/**
 * 
 * @author Crazy.Mo
 * �������ɫ���ֳ�ί���˼�RealSuject��ɫ�������ҵ���߼�ʵ�ֵ��࣬�������ȡ����ģʽ���ͻ���Ӧ��ֱ�ӵ��õķ�����������ʵ��
 */
public class RealSubject implements AbstractSubject{

	@Override
	public void submit() {
		System.out.println("----����������Լ���������飬���ύ����Ժ----");
		
	}

	@Override
	public void proof() {
		System.out.println("----����������Լ��ɼ�����֤��----");
	}
}
