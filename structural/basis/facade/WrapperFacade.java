package basis.facade;

public class WrapperFacade {
	//��ί�е���ϵͳ
		private IModuleA a = new ModuleA();
		private Wrapper b = new Wrapper();
		private ModuleC c = new ModuleC();
		
		//�ṩ���ⲿ���ʵķ���
		public void methodA(){
			this.a.doSthA();
		}
		public void methodB(){
			this.b.complexMethod();
		}
		public void methodC(){
			this.c.doSthC();
		}
}
