package clswithcls.responsibility;

public class ConcreteHanderA extends AbstractHander {

	@Override
	public void handle(String conditionStr) {
		//���������������ϣ����Լ�����
		if("HanderA".equals(conditionStr)){
			System.out.println("**�������ϣ���ConcreteHanderA�Լ������������");
			return;
		}else{
			System.out.println("##���������ϣ���ConcreteHanderAת�����������һ��������");
			if(nextHander!=null){
				nextHander.handle(conditionStr);//����ת����һ��������
			}
		}
	}

	@Override
	public void setNextHander(AbstractHander hander) {
		this.nextHander=hander;
	}

}
