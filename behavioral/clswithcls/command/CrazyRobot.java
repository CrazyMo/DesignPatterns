package clswithcls.command;

//Receiver���ս�������Ľ�ɫ���൱�������������ִ���ߣ�������������������Ӧ���߼�ʵ�֣���������ɫ���Ǽ��ʹ�������
public class CrazyRobot {
	
	public void move(int type) {
		switch (type) {
		case 0:
			System.out.println("�����ƶ���...");
			break;
		case 1:
			System.out.println("�����ƶ���...");
			break;
		case 2:
			System.out.println("�����ƶ���...");
			break;
		case 3:
			System.out.println("�����ƶ���...");
			break;
		default:
			break;
		}
	}
	
	public void talk(){
		System.out.println("Hello CrazyBot...");
	}
}
