package singleton.innerclass;

/**
 * 静态内部类(不能传参数)
 * 可以延迟加载，也能线程安全
 */
public class Singleton {

    private Singleton(){}

    private static class SingletonHolder{
        //静态内部类的静态属性实例化时，由JVM保证线程的安全
        private static Singleton instance=new Singleton();
    }
    //只有调用了getInstance方法之后，才会实例化Singleton instance属性
    public static Singleton getInstance(){
        return SingletonHolder.instance;
    }

}