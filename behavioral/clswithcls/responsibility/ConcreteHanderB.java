package clswithcls.responsibility;

public class ConcreteHanderB extends AbstractHander {

	@Override
	public void handle(String conditionStr) {
		//���������������ϣ����Լ�����
		if("HanderB".equals(conditionStr)){
			System.out.println("**�������ϣ���ConcreteHanderB�Լ������������");
			return;
		}else{
			System.out.println("##���������ϣ���ConcreteHanderBת�����������һ��������");
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
