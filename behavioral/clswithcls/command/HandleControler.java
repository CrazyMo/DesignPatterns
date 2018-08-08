package clswithcls.command;

//Involker角色的一种形式：分别持有所有具体命令类的引用
public class HandleControler {

	private MoveCommandImpl moveUp;
	private MoveCommandImpl moveDown;
	private MoveCommandImpl moveLeft;
	private MoveCommandImpl moveRight;
	private TalkCommandImpl talkCommandImpl;
	

	public void setMoveUp(MoveCommandImpl moveUp) {
		this.moveUp = moveUp;
	}

	public void setMoveDown(MoveCommandImpl moveDown) {
		this.moveDown = moveDown;
	}

	public void setMoveLeft(MoveCommandImpl moveLeft) {
		this.moveLeft = moveLeft;
	}

	public void setMoveRight(MoveCommandImpl moveRight) {
		this.moveRight = moveRight;
	}

	public void setTalkCommandImpl(TalkCommandImpl talkCommandImpl) {
		this.talkCommandImpl = talkCommandImpl;
	}
	
	public void moveUp(){
		moveUp.excute();
	}
	
	public void moveDown(){
		moveDown.excute();
	}
	
	public void moveLeft(){
		moveLeft.excute();
	}
	
	public void moveRight(){
		moveRight.excute();
	}
	
	public void talk(){
		talkCommandImpl.excute();
	}

}
