package clswithcls.observer.pull;

public class ConcreteObserver<T> implements IObserver<T> {
	
	private String name;
	public ConcreteObserver(String name){
		this.name=name;
	}

	@Override
	public void pullData(ISubject obj) {
		Subject subject=(Subject)obj;
		System.out.println(this.name+"已经接收到数据(通过PULL的方式)————"+subject.getData());
	}
}
