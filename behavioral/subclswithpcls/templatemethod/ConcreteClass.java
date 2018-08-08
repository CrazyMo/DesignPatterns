package subclswithpcls.templatemethod;

public class ConcreteClass extends AbstractClass {
	//实现基本方法
	protected void doOneStep() {
		System.out.println("第一步");
	}
	protected void doSecStep() {
		System.out.println("第二步");
	}
	protected void doThirdStep() {
		System.out.println("第三步");
	}
	
}