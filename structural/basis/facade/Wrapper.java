package basis.facade;

public class Wrapper {
	//ί�д���
	private ModuleA a = new ModuleA();
	private ModuleB b = new ModuleB();
	//���ӵļ���
	public void complexMethod(){
		this.a.doSthA();
		this.b.doSthB();
	}
}
