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
		System.out.println(name+"��Ļ���񣬱�ˮ��"+subject.getMsg());//Ҳ����ֱ�Ӵ�arg ��ȡ������ν����������ʽ
	}
	public String toString(){
		return "��Ļ����"+name;
	}
}