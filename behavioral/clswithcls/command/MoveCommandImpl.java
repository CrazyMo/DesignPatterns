package clswithcls.command;

//具体命令角色，可以根据命令的类型来对应实现运动命令类角色,需要持有执行这个命令的具体对象引用
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
