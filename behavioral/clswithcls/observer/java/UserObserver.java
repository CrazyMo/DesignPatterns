package clswithcls.observer.java;

import java.util.Observable;
import java.util.Observer;

public class UserObserver implements Observer {
	private String name;
	
	public UserObserver(String name) {
		this.name=name;
	}
	public void update(Observable obsered, Object arg) {
		LiveshowSubjector subject=(LiveshowSubjector)obsered;
		System.out.println(name+"弹幕大神，别划水啦"+subject.getMsg());//也可以直接从arg 获取，即所谓的拉数据形式
	}
	public String toString(){
		return "弹幕大神："+name;
	}
}