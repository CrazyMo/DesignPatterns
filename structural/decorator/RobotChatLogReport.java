package decorator;

//实现具体的被装饰者角色，相当于是实现需要的核心功能,比如说我需要知道今天交互的次数，其他为附加的锦上添花的功能
public class RobotChatLogReport extends ChatLogReport{

    @Override
    public void showLog() {
        //统计交互次数略...
        System.out.println("今天智能机器人交互次数5000次");
    }
}
