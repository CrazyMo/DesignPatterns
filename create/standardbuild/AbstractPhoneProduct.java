package standardbuild;

/**
 * 
 * @author Crazy.Mo
 * 在标准建造者模式中充当Product角色，这里为了扩展性进行抽象，于是建造者模式中的Product 角色分成了抽象Phone和具体的Phone
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