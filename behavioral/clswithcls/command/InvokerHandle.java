package clswithcls.command;

import java.util.ArrayList;
//Involker只是个负责转发命令请求的中间角色，用于暂时存储命令请求的中转站，调用对应的Command角色实例来转发，另一种形式所有命令类都存到集合中
public class InvokerHandle {
	private ArrayList<ICommand> commands;

    public InvokerHandle() {
        commands = new ArrayList<>();
    }

    public void setCommand(int i, ICommand command) {
        commands.add(i, command);
    }

    public void dispatchCmd(int i) {
        commands.get(i).excute();
    }
}
