package clswithcls.observer.push;

public class Client {
	public static void main(String[] args) {
		//�������⣨���۲��ߣ��ͳ�ʼ���۲���
		Subject<String> subject=new Subject<String>();
		subject.setData("������������");
		IObserver<String> observer=new ConcreteObserver<String>("�۲���1��");
		IObserver<String> observer2=new ConcreteObserver2<String>("�۲���2��");
		IObserver<String> observer3=new ConcreteObserver3<String>("�۲���3��");
		System.out.println("������һ�����⣬����ע������λ�۲���");
		//2������ָ���۲���
		subject.regist(observer);
		subject.regist(observer2);
		subject.regist(observer3);
		System.out.println("֪ͨ�۲��ߣ�");
		//3������֪ͨ�۲���
		subject.notifyObservers();
		System.out.println("��̬ȡ���۲���2�ŵĹ۲�Ȩ��");
		subject.unregist(observer2);
		//��֪ͨ�۲���
		subject.notifyObservers();
	}
}
