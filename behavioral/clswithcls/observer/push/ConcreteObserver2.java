package clswithcls.observer.push;

public class ConcreteObserver2<T> implements IObserver<T> {
	
	private String name;
	public ConcreteObserver2(String name){
		this.name=name;
	}

	@Override
	public void refresh(T data) {
		System.out.println(this.name+"�Ѿ����յ����ݡ�������"+data);
	}

}
