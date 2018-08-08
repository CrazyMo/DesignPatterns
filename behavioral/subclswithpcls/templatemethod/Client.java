package subclswithpcls.templatemethod;

public class Client {

	public static void main(String[] args) {
		AbstractClass obj = new ConcreteClass();//多态构建
		//调用模板方法
		obj.work();
	}

}
