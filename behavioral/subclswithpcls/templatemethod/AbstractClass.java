package subclswithpcls.templatemethod;

/*【父类与子类的关系】抽象模板角色：模板方法模式中作为父类的抽象类叫做抽象模板AbstractClass，抽象模板中的基本方法尽量设计为protected类型，符合迪米特法则，不需要暴露的属性或方法尽量不要设置为protected类型
 * 模板方法模式本质仅仅是使用了Java的继承机制，封装几个抽象方法和一个具体模板方法，简单里就是在模板中抽象定义几个抽象方法延迟到子类去实现，并且在模板中定义这些子类方法的调用顺序和逻辑
 */

public abstract class AbstractClass {
	//基本方法1
	protected abstract void doOneStep();
	//基本方法2
	protected abstract void doSecStep();
	//基本方法3
	protected abstract void doThirdStep();
	
	//模板方法,为了避免被子类覆写改变模板方法的算法骨架一般使用final修饰，可以有N个模板方法
	public final void work(){
		/*
		* 调用基本方法，完成相关的逻辑
		*/
		if(oneStepNeedRun()){//钩子方法控制基本方法是否执行
			this.doOneStep();
		}
		this.doSecStep();
		
		this.doThirdStep();
	}
	
	//钩子方法它在抽象类中不做事或者是默认的事情，子类可以选择覆盖它，可以有N个
	protected boolean oneStepNeedRun(){
		return true;
	}
}
