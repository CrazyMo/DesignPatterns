package clswithcls.observer.java;

public class Client {

	public static void main(String[] args) {
		LiveshowSubjector subject=new LiveshowSubjector();//�������� �����۲���
		
		UserObserver userA=new UserObserver("��λˮ��");//����۲��߽�ɫ
		UserObserver userB=new UserObserver("С����");
		UserObserver userC=new UserObserver("С��ʬ");
		UserObserver userD=new UserObserver("С����");
		UserObserver userE=new UserObserver("С����");

		subject.addObserver(userA);//ʹ��Observable �ķ���ע�� �۲���
		subject.addObserver(userB);
		subject.addObserver(userC);
		subject.addObserver(userD);
		subject.addObserver(userE);
		subject.pushLiveShowMsg("DOTA������ֱ����");//��������µ�ʱ��֪ͨ�۲���
		System.out.println("");
		subject.deleteObserver(userE);
		subject.pushLiveShowMsg("��ñ���ֱ����");//��������µ�ʱ��֪ͨ�۲���
	}

}
