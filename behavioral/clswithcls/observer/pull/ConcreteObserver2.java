package clswithcls.observer.pull;

public class ConcreteObserver2<T> implements IObserver<T> {
	
	private String name;
	public ConcreteObserver2(String name){
		this.name=name;
	}

	@Override
	public void pullData(ISubject obj) {
		Subject subject=(Subject)obj;
		System.out.println(this.name+"�Ѿ����յ�����(ͨ��PULL�ķ�ʽ)��������"+subject.getData());
	}

}
