package basis.facade;

//当子系统内部的某些对象的使用有限制
public class SecFacade {
	// 引用原有的门面
	private SystemFacade facade = new SystemFacade();

	// 对外提供唯一的访问子系统的方法
	public void methodB() {
		this.facade.methodB();
	}
}