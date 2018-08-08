package decorator;

//��ԭ�к��Ĺ�������չһ��ͳ�ƽ����Ա�Ĺ��ܣ���Ӧһ��װ��������
public class SexTypeDecorator extends Decorator {

    public SexTypeDecorator(ChatLogReport r) {
        super(r);
    }

    public void showType(){
        System.out.println("ͨ��"+this.getClass().getSimpleName()+"���ӵ�װ�ι���ͳ�ƽ�����Ա�Ա��� 1200��  Ů3800��");
    }

    @Override
    public void showLog() {
        showType();
        System.out.println("****"+this.getClass().getSimpleName()+"����Decorator��showLog"+"****");
        super.showLog();
    }

}
