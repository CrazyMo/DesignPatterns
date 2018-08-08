package decorator;

public class TypeDecorator extends Decorator {

    public TypeDecorator(ChatLogReport r) {
        super(r);
    }

    public void showType(){
        System.out.println("通过"+this.getClass().getSimpleName()+"增加的装饰功能统计交互类别：自然聊天 1200次  政务咨询3000次 其他800次");
    }

    @Override
    public void showLog() {
        showType();
        System.out.println("****"+this.getClass().getSimpleName()+"调用Decorator的showLog"+"****");
        super.showLog();
    }
}