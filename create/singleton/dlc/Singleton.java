package singleton.dlc;

/**
 * ˫�ؼ�飺�ɴ���
 */
public class Singleton {
    //�̲߳���ʱ�����������Ķ��ˣ����е��̶߳��ܼ�ʱ���ʵ����µ�����
    //�����ε��������һЩ�����Ż�,volatile ���漰�����߳�û��Ҫ���ã����������Ƿ�ֹcpu����ָ�����ţ��Ӷ�ȷ�������ǵ��̻߳��Ƕ��̶߳�����ͬһ˳��ִ��
    private volatile static Singleton instance;
    private Singleton(){}
    public   static Singleton getInstance(){
        if(instance==null) {
            synchronized (Singleton.class) {
                if(instance==null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}

class Singleton2 {
	private Object obj;
    //�̲߳���ʱ�����������Ķ��ˣ����е��̶߳��ܼ�ʱ���ʵ����µ�����
    //�����ε��������һЩ�����Ż�,volatile ���漰�����߳�û��Ҫ���ã����������Ƿ�ֹcpu����ָ�����ţ��Ӷ�ȷ�������ǵ��̻߳��Ƕ��̶߳�����ͬһ˳��ִ��
    private volatile static Singleton2 instance;
    private Singleton2(Object obj){}
    public   static Singleton2 getInstance(Object obj){
        if(instance==null) {
            synchronized (Singleton.class) {
                if(instance==null) {
                    instance = new Singleton2(obj);
                }
            }
        }
        return instance;
    }
}
