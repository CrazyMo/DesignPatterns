package protype.regist;

import java.util.HashMap;
import java.util.Map;

public class DocPrototypeManager {
	   /**
     * ������¼ԭ�͵ı�ź�ԭ��ʵ���Ķ�Ӧ��ϵ
     */
    private static Map<String,MyCloneable2> map = new HashMap<String,MyCloneable2>();
    /**
     * ˽�л����췽���������ⲿ����ʵ��
     */
    private DocPrototypeManager(){}
    /**
     * ��ԭ�͹�����������ӻ����޸�ĳ��ԭ��ע��
     * @param MyCloneable2Id ԭ�ͱ��
     * @param MyCloneable2    ԭ��ʵ��
     */
    public synchronized static void setMyCloneable2(String MyCloneable2Id , MyCloneable2 MyCloneable2){
        map.put(MyCloneable2Id, MyCloneable2);
    }
    /**
     * ��ԭ�͹���������ɾ��ĳ��ԭ��ע��
     * @param MyCloneable2Id ԭ�ͱ��
     */
    public synchronized static void removeMyCloneable2(String MyCloneable2Id){
        map.remove(MyCloneable2Id);
    }
    /**
     * ��ȡĳ��ԭ�ͱ�Ŷ�Ӧ��ԭ��ʵ��
     * @param MyCloneable2Id    ԭ�ͱ��
     * @return    ԭ�ͱ�Ŷ�Ӧ��ԭ��ʵ��
     * @throws Exception    ���ԭ�ͱ�Ŷ�Ӧ��ʵ�������ڣ����׳��쳣
     */
    public synchronized static MyCloneable2 getMyCloneable2(String MyCloneable2Id) throws Exception{
        MyCloneable2 MyCloneable2 = map.get(MyCloneable2Id);
        if(MyCloneable2 == null){
            throw new Exception("��ϣ����ȡ��ԭ�ͻ�û��ע����ѱ�����");
        }
        return MyCloneable2;
    }
}
