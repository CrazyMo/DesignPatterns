package clswithcls.command;

import java.util.ArrayList;
//Involkerֻ�Ǹ�����ת������������м��ɫ��������ʱ�洢�����������תվ�����ö�Ӧ��Command��ɫʵ����ת������һ����ʽ���������඼�浽������
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
