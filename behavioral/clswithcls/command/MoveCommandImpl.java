package clswithcls.command;

//���������ɫ�����Ը����������������Ӧʵ���˶��������ɫ,��Ҫ����ִ���������ľ����������
public class MoveCommandImpl implements ICommand {
	private CrazyRobot robot;
	private int type;
	
	public MoveCommandImpl(CrazyRobot bot,int type){
		this.robot=bot;
		this.type=type;
	}
	
	@Override
	public void excute() {
		robot.move(type);
	}
	
	public void setType(int type){
		this.type=type;
	}

}
