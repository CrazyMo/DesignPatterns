package singleton.objpool;

import java.util.HashMap;
import java.util.Map;

public class Connection {
    //只能有五个对象
    private static int max=5;

    //把所有的对象先存在一个map中
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
