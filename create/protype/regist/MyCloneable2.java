package protype.regist;

import java.util.List;

public interface MyCloneable2 {
	public MyCloneable2 myclone();
	//定义一些具体原型所共有的操作
	public String getName();
    public void setName(String name);

}
