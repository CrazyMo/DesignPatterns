package decorator;

//在原有核心功能上扩展一个统计交互性别的功能，对应一个装饰器子类
public class SexTypeDecorator extends Decorator {

    public SexTypeDecorator(ChatLogReport r) {
        super(r);
    }

    public void showType(){
        System.out.println("通过"+this.getClass().getSimpleName()+"增加的装饰功能统计交互人员性别：男 1200次  女3800次");
    }

    @Override
    public void showLog() {
        showType();
        System.out.println("****"+this.getClass().getSimpleName()+"调用Decorator的showLog"+"****");
        super.showLog();
    }

}
