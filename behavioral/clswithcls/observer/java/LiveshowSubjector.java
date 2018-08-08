package clswithcls.observer.java;

import java.util.Observable;

/**
 * 主题角色，即 被观察者类
 * @author cmo
 */
public class LiveshowSubjector extends Observable {
	private String msg;
	public String getMsg(){
		return this.msg;
	}
	
	public void pushLiveShowMsg(String msg) {
		this.msg=msg;
		setChanged();//Observable 自身用于标记数据发生了改变
		notifyObservers(msg);//Observable 自身用于通知所有观察这个主题的观察者方法，还有其他重载形式
	}

}
