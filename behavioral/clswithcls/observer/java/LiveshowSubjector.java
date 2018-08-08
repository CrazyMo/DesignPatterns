package clswithcls.observer.java;

import java.util.Observable;

/**
 * �����ɫ���� ���۲�����
 * @author cmo
 */
public class LiveshowSubjector extends Observable {
	private String msg;
	public String getMsg(){
		return this.msg;
	}
	
	public void pushLiveShowMsg(String msg) {
		this.msg=msg;
		setChanged();//Observable �������ڱ�����ݷ����˸ı�
		notifyObservers(msg);//Observable ��������֪ͨ���й۲��������Ĺ۲��߷�������������������ʽ
	}

}
