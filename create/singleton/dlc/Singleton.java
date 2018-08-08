package singleton.dlc;

/**
 * 双重检查：可传参
 */
public class Singleton {
    //线程并发时，当变量被改动了，所有的线程都能即时访问到最新的数据
    //会屏蔽掉虚拟机的一些代码优化,volatile 不涉及到多线程没必要设置，本质作用是防止cpu进行指令重排，从而确保无论是单线程还是多线程都按照同一顺序执行
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
    //线程并发时，当变量被改动了，所有的线程都能即时访问到最新的数据
    //会屏蔽掉虚拟机的一些代码优化,volatile 不涉及到多线程没必要设置，本质作用是防止cpu进行指令重排，从而确保无论是单线程还是多线程都按照同一顺序执行
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
