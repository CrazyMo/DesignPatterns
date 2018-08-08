package basis.facade;

public class WrapperFacade {
	//被委托的子系统
		private IModuleA a = new ModuleA();
		private Wrapper b = new Wrapper();
		private ModuleC c = new ModuleC();
		
		//提供给外部访问的方法
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
