package simplefactory;

/**
 * 
 * @author Crazy.Mo
 * 以生产产品为例，由于生产产品种类可能有所不同，把这一操作抽象为顶层操作produce（也可以定义为抽象类）,至于produce具体生产什么产品，由其子类去决定
 */
public interface IProduct {
	public void produce();
}
