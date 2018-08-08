package clswithcls.responsibility;

public class ConcreteHander extends AbstractHander {

	@Override
	public void handle(String conditionStr) {
		//���������������ϣ����Լ�����
		if("Hander".equals(conditionStr)){
			System.out.println("**�������ϣ���ConcreteHander�Լ������������");
			return;
		}else{
			System.out.println("##���������ϣ���ConcreteHanderת�����������һ��������");
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
