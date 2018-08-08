package subclswithpcls.templatemethod;

/*������������Ĺ�ϵ������ģ���ɫ��ģ�巽��ģʽ����Ϊ����ĳ������������ģ��AbstractClass������ģ���еĻ��������������Ϊprotected���ͣ����ϵ����ط��򣬲���Ҫ��¶�����Ի򷽷�������Ҫ����Ϊprotected����
 * ģ�巽��ģʽ���ʽ�����ʹ����Java�ļ̳л��ƣ���װ�������󷽷���һ������ģ�巽�������������ģ���г����弸�����󷽷��ӳٵ�����ȥʵ�֣�������ģ���ж�����Щ���෽���ĵ���˳����߼�
 */

public abstract class AbstractClass {
	//��������1
	protected abstract void doOneStep();
	//��������2
	protected abstract void doSecStep();
	//��������3
	protected abstract void doThirdStep();
	
	//ģ�巽��,Ϊ�˱��ⱻ���าд�ı�ģ�巽�����㷨�Ǽ�һ��ʹ��final���Σ�������N��ģ�巽��
	public final void work(){
		/*
		* ���û��������������ص��߼�
		*/
		if(oneStepNeedRun()){//���ӷ������ƻ��������Ƿ�ִ��
			this.doOneStep();
		}
		this.doSecStep();
		
		this.doThirdStep();
	}
	
	//���ӷ������ڳ������в����»�����Ĭ�ϵ����飬�������ѡ�񸲸�����������N��
	protected boolean oneStepNeedRun(){
		return true;
	}
}
