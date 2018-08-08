package basis.facade;

public class Client {

	public static void main(String[] args) {
		SystemFacade facade=new SystemFacade();//对于客户端来说仅仅知道Facade角色，而并不知道具体的子系统角色
		
		facade.methodA();//通过facade角色对外开放出来的方法去使用子系统的功能
		facade.methodB();
		facade.methodC();
	}

}
