package bridge;

/**
 * ���̲��������Ϊ��,���������������̲衢�̲衢��衢ˮ����ȵȣ��ӹ��ά�������ֻ��д󱭡�С�����ȳ����Tea����
 * ��������ά��������������д󱭺�衢С�����ȵȶ��ֲ�Ʒ
 */

public abstract class AbstractTea {
	protected AbstractTeaIngredient teaIngredient;//�������϶��������
	
	public AbstractTea(AbstractTeaIngredient ingredient){
		this.teaIngredient=ingredient;
	}
	//�̲����ճ�Ʒ�����ӳٵ�����ȥʵ��
	public abstract void makeTea();
}
