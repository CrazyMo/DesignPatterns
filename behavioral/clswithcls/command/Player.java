package clswithcls.command;

public class Player {

	public static void main(String[] args) {
		//������������������ִ����
		CrazyRobot robot=new CrazyRobot();
		
		//��������������ʵ��
		MoveCommandImpl moveUp=new MoveCommandImpl(robot,0);
		MoveCommandImpl moveDown=new MoveCommandImpl(robot,1);
		MoveCommandImpl moveLeft=new MoveCommandImpl(robot,2);
		MoveCommandImpl moveRight=new MoveCommandImpl(robot,3);
		TalkCommandImpl talkCommandImpl=new TalkCommandImpl(robot);
		HandleControler controler=new HandleControler();
		
		controler.setTalkCommandImpl(talkCommandImpl);
		controler.setMoveUp(moveUp);
		controler.setMoveDown(moveDown);
		controler.setMoveLeft(moveLeft);
		controler.setMoveRight(moveRight);
		
		//��������ⷢ������ָ��
		controler.talk();
		controler.moveUp();
		controler.moveDown();
		controler.moveRight();
		controler.moveUp();
		controler.moveLeft();
		
		System.out.println("-----�Լ���-------");
		InvokerHandle invoker = new InvokerHandle();
        invoker.setCommand(0, talkCommandImpl);
        invoker.setCommand(1, moveUp);
        invoker.setCommand(2, moveDown);
        invoker.setCommand(3, moveLeft);
        invoker.setCommand(4, moveRight);

        invoker.dispatchCmd(3);
        invoker.dispatchCmd(0);
	}

}
