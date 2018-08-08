package clswithcls.observer.push;

import java.util.ArrayList;
import java.util.List;

public class Subject<T> implements ISubject<T> {
	
	private List<IObserver<T>> observers=new ArrayList<>();
	private T data;

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
		for(int i=0;i<observers.size();i++){//֪ͨ�������ݹ۲��߽�����Ӧ
			observers.get(i).refresh(data);
		}
	}

}
