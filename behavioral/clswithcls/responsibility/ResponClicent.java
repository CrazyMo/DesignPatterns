package clswithcls.responsibility;

public class ResponClicent {

	public static void main(String[] args) {
		//��ʼ�� ������
		ConcreteHander hander=new ConcreteHander();
		
		ConcreteHanderA handerA=new ConcreteHanderA();
		hander.setNextHander(handerA);
		ConcreteHanderB handerB=new ConcreteHanderB();
		handerA.setNextHander(handerB);
		
		hander.handle("HanderB");
		//hander.handle("HanderC"); �˴�Ϊ�����ν�����ģ����һ���򵥵�����
	}
	
}
