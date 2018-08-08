package clswithcls.responsibility;

//�������߽�ɫ��Ϊ���γ���ʽ�ṹ�����������һ�������ߵ����ú�ӵ���Լ������߼������������Գ�����һ�������ߵ������γ�˫������Ľṹ
public abstract class AbstractHander {
	protected AbstractHander nextHander;
	/**
	 * 
	 * @param conditionStr ����ѡ����һ�������ߵ������ַ���
	 */
	public abstract void handle(String conditionStr);
	/**
	 * ������һ�������ߵ�����
	 * @param hander
	 */
	public abstract  void setNextHander(AbstractHander hander);
}
