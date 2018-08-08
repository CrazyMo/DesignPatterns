package clswithcls.responsibility;

//抽象处理者角色，为了形成链式结构，必须持有下一个处理者的引用和拥有自己处理逻辑，甚至还可以持有上一个处理者的引用形成双向链表的结构
public abstract class AbstractHander {
	protected AbstractHander nextHander;
	/**
	 * 
	 * @param conditionStr 用于选择下一个处理者的条件字符串
	 */
	public abstract void handle(String conditionStr);
	/**
	 * 设置下一个处理者的引用
	 * @param hander
	 */
	public abstract  void setNextHander(AbstractHander hander);
}
