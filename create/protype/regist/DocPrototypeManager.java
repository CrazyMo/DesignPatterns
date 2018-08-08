package protype.regist;

import java.util.HashMap;
import java.util.Map;

public class DocPrototypeManager {
	   /**
     * 用来记录原型的编号和原型实例的对应关系
     */
    private static Map<String,MyCloneable2> map = new HashMap<String,MyCloneable2>();
    /**
     * 私有化构造方法，避免外部创建实例
     */
    private DocPrototypeManager(){}
    /**
     * 向原型管理器里面添加或是修改某个原型注册
     * @param MyCloneable2Id 原型编号
     * @param MyCloneable2    原型实例
     */
    public synchronized static void setMyCloneable2(String MyCloneable2Id , MyCloneable2 MyCloneable2){
        map.put(MyCloneable2Id, MyCloneable2);
    }
    /**
     * 从原型管理器里面删除某个原型注册
     * @param MyCloneable2Id 原型编号
     */
    public synchronized static void removeMyCloneable2(String MyCloneable2Id){
        map.remove(MyCloneable2Id);
    }
    /**
     * 获取某个原型编号对应的原型实例
     * @param MyCloneable2Id    原型编号
     * @return    原型编号对应的原型实例
     * @throws Exception    如果原型编号对应的实例不存在，则抛出异常
     */
    public synchronized static MyCloneable2 getMyCloneable2(String MyCloneable2Id) throws Exception{
        MyCloneable2 MyCloneable2 = map.get(MyCloneable2Id);
        if(MyCloneable2 == null){
            throw new Exception("您希望获取的原型还没有注册或已被销毁");
        }
        return MyCloneable2;
    }
}
