package decorator;

//ʵ�־���ı�װ���߽�ɫ���൱����ʵ����Ҫ�ĺ��Ĺ���,����˵����Ҫ֪�����콻���Ĵ���������Ϊ���ӵĽ������Ĺ���
public class RobotChatLogReport extends ChatLogReport{

    @Override
    public void showLog() {
        //ͳ�ƽ���������...
        System.out.println("�������ܻ����˽�������5000��");
    }
}
