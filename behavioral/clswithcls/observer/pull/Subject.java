package clswithcls.observer.pull;

import java.util.ArrayList;
import java.util.List;

public class Subject<T> implements ISubject<T> {
	
	private List<IObserver<T>> observers=new ArrayList<>();
	private T data;
	

	protected T getData() {
		return data;
	}

	public void setData(T data){
		this.data=data;
	}
	
	@Override
	public void regist(IObserver<T> obj) {
		observers.add(obj);
	}

	@Override
	public void unregist(IObserver<T> obj) {
		if(observers.contains(obj)){
			observers.remove(obj);
		}
	}

	@Override
	public void notifyObservers() {
		for(int i=0;i<observers.size();i++){//通知所有数据观察者进行响应
			observers.get(i).pullData(this);
		}
	}

}
