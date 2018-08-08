package decorator;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ChatLogReport report=new RobotChatLogReport();
        report=new SexTypeDecorator(report);//如果需要统计性别功能就附加上
        report=new TypeDecorator(report);//需要类别统计问题就附加上
        report.showLog();

	}

}
