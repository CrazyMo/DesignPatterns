package basis.facade;

public class Client {

	public static void main(String[] args) {
		SystemFacade facade=new SystemFacade();//���ڿͻ�����˵����֪��Facade��ɫ��������֪���������ϵͳ��ɫ
		
		facade.methodA();//ͨ��facade��ɫ���⿪�ų����ķ���ȥʹ����ϵͳ�Ĺ���
		facade.methodB();
		facade.methodC();
	}

}
