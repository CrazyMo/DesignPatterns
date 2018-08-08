package clswithcls.command;

public class TalkCommandImpl implements ICommand {
	private CrazyRobot robot;
	
	public TalkCommandImpl(CrazyRobot robot) {
		this.robot = robot;
	}

	@Override
	public void excute() {
		robot.talk();
	}

}
