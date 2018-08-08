package singleton.objpool;

import java.util.HashMap;
import java.util.Map;

public class Connection {
    //ֻ�����������
    private static int max=5;

    //�����еĶ����ȴ���һ��map��
    private static Map<Integer,Connection> map=new HashMap<Integer,Connection>();

    private static int key=1;

    public static Connection getConnection(){
        Connection instance=map.get(key);
        if(instance==null){
            instance=new Connection();
            map.put(key,instance);
        }
        key++;
        if(key>max){
            key=1;
        }
        return instance;
    }


}
