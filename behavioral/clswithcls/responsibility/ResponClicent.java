package clswithcls.responsibility;

public class ResponClicent {

	public static void main(String[] args) {
		//初始化 责任链
		ConcreteHander hander=new ConcreteHander();
		
		ConcreteHanderA handerA=new ConcreteHanderA();
		hander.setNextHander(handerA);
		ConcreteHanderB handerB=new ConcreteHanderB();
		handerA.setNextHander(handerB);
		
		hander.handle("HanderB");
		//hander.handle("HanderC"); 此处为了掩饰仅仅是模拟了一个简单的条件
	}
	
}
