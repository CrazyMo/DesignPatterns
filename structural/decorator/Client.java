package decorator;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ChatLogReport report=new RobotChatLogReport();
        report=new SexTypeDecorator(report);//�����Ҫͳ���Ա��ܾ͸�����
        report=new TypeDecorator(report);//��Ҫ���ͳ������͸�����
        report.showLog();

	}

}
