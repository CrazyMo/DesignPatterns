package clswithcls.observer.pull;

/**
 * 
 * @author Crazy.Mo 主题，即 被观察者
 */
public interface ISubject<T> {

	public void regist(IObserver<T> obj);// 注册观察者

	public void unregist(IObserver<T> obj);// 取消注册

	public void notifyObservers();// 通知观察者
}
