package basis.facade;

/**
 * ��۶����ɫ����ν�ĸ߲�ӿڣ���������ĳ��ϵͳ�������๹�ɣ�������֮�以�����������Ӱ���߼���û���κη�������
 * @author Crazy.Mo
 */
public class SystemFacade {
	//��ί�е���ϵͳ
	private IModuleA a = new ModuleA();
	private ModuleB b = new ModuleB();
	private ModuleC c = new ModuleC();
	
	//�ṩ���ⲿ���ʵķ���
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
