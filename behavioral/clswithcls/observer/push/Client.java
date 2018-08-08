package clswithcls.observer.push;

public class Client {
	public static void main(String[] args) {
		//建立主题（被观察者）和初始化观察者
		Subject<String> subject=new Subject<String>();
		subject.setData("主题来数据了");
		IObserver<String> observer=new ConcreteObserver<String>("观察者1号");
		IObserver<String> observer2=new ConcreteObserver2<String>("观察者2号");
		IObserver<String> observer3=new ConcreteObserver3<String>("观察者3号");
		System.out.println("创建了一个主题，并且注册了三位观察者");
		//2、主题指定观察者
		subject.regist(observer);
		subject.regist(observer2);
		subject.regist(observer3);
		System.out.println("通知观察者：");
		//3、主题通知观察者
		subject.notifyObservers();
		System.out.println("动态取消观察者2号的观察权利");
		subject.unregist(observer2);
		//再通知观察者
		subject.notifyObservers();
	}
}
