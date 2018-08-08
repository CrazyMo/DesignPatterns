package sigleton.lazy;
//单线程饿汉式
public class Singleton {
    private static  Singleton instance;
    private Singleton(){}
    public static Singleton getInstance(){
        if(instance==null) {
            instance = new Singleton();
        }
        return instance;
    }
}

