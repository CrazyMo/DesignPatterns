package clswithcls.command;

//Receiver最终接收命令的角色，相当于是命令的真正执行者，是真正处理相关命令对应的逻辑实现，其他类或角色都是间接使用这个类
public class CrazyRobot {
	
	public void move(int type) {
		switch (type) {
		case 0:
			System.out.println("向上移动中...");
			break;
		case 1:
			System.out.println("向下移动中...");
			break;
		case 2:
			System.out.println("向左移动中...");
			break;
		case 3:
			System.out.println("向右移动中...");
			break;
		default:
			break;
		}
	}
	
	public void talk(){
		System.out.println("Hello CrazyBot...");
	}
}
