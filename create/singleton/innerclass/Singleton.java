package singleton.innerclass;

/**
 * ��̬�ڲ���(���ܴ�����)
 * �����ӳټ��أ�Ҳ���̰߳�ȫ
 */
public class Singleton {

    private Singleton(){}

    private static class SingletonHolder{
        //��̬�ڲ���ľ�̬����ʵ����ʱ����JVM��֤�̵߳İ�ȫ
        private static Singleton instance=new Singleton();
    }
    //ֻ�е�����getInstance����֮�󣬲Ż�ʵ����Singleton instance����
    public static Singleton getInstance(){
        return SingletonHolder.instance;
    }

}