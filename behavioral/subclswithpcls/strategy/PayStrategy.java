package subclswithpcls.strategy;
//【父类与子类的关系】策略模式的决定权在用户，系统本身提供不同算法的实现，新增或者删除算法，对各种算法做封装。因此，策略模式多用在算法决策系统中，外部用户只需要决定用哪个算法即可（核心思想就是：用策略类去初始化统一接口实例，再用接口实例去调用统一方法）。
public interface PayStrategy {
	public void pay(float money);
}
