package decorator;

public class TypeDecorator extends Decorator {

    public TypeDecorator(ChatLogReport r) {
        super(r);
    }

    public void showType(){
        System.out.println("ͨ��"+this.getClass().getSimpleName()+"���ӵ�װ�ι���ͳ�ƽ��������Ȼ���� 1200��  ������ѯ3000�� ����800��");
    }

    @Override
    public void showLog() {
        showType();
        System.out.println("****"+this.getClass().getSimpleName()+"����Decorator��showLog"+"****");
        super.showLog();
    }
}