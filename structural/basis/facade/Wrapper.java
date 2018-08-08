package basis.facade;

public class Wrapper {
	//委托处理
	private ModuleA a = new ModuleA();
	private ModuleB b = new ModuleB();
	//复杂的计算
	public void complexMethod(){
		this.a.doSthA();
		this.b.doSthB();
	}
}
