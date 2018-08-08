package clswithcls.observer.push;

//推：主题对象主动将数据传递给观察者对象
public interface IObserver<T> {
	public void refresh(T data);//用于给主题调用
}
