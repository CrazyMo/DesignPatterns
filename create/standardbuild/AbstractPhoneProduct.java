package standardbuild;

/**
 * 
 * @author Crazy.Mo
 * �ڱ�׼������ģʽ�г䵱Product��ɫ������Ϊ����չ�Խ��г������ǽ�����ģʽ�е�Product ��ɫ�ֳ��˳���Phone�;����Phone
 */
public abstract class AbstractPhoneProduct {
    protected String cpu;
    protected String screen;
    protected String os;
    public void setCpu(String cpu) {
        this.cpu = cpu;
    }
    public void setScreen(String screen) {
        this.screen = screen;
    }
    public abstract void setOs();
    public String toString() {
        return "PhoneProduc:"+" cpu:"+cpu+" screen:"+screen+"   OS:"+os;
    }
}