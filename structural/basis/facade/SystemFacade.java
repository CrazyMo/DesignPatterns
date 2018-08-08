package basis.facade;

/**
 * 外观对象角色（所谓的高层接口），本例是某子系统由三个类构成，三个类之间互相独立，互不影响逻辑，没有任何访问限制
 * @author Crazy.Mo
 */
public class SystemFacade {
	//被委托的子系统
	private IModuleA a = new ModuleA();
	private ModuleB b = new ModuleB();
	private ModuleC c = new ModuleC();
	
	//提供给外部访问的方法
	public void methodA(){
		this.a.doSthA();
	}
	public void methodB(){
		this.b.doSthB();
	}
	public void methodC(){
		this.c.doSthC();
	}

}
