package clswithcls.observer.pull;

//拉：由观察者自己主动去获取主题变化后的数据
public interface IObserver<T> {
	void pullData(ISubject subject);//主动拉数据
}
