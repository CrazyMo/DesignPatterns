package bridge;

/**
 * 以奶茶店卖饮料为例,从配料上区分有奶茶、绿茶、红茶、水果茶等等，从规格维度上区分还有大杯、小杯，先抽象出Tea对象
 * 于是两个维度组合起来可以有大杯红茶、小杯红茶等等多种产品
 */

public abstract class AbstractTea {
	protected AbstractTeaIngredient teaIngredient;//持有配料对象的引用
	
	public AbstractTea(AbstractTeaIngredient ingredient){
		this.teaIngredient=ingredient;
	}
	//奶茶最终成品都是延迟到子类去实现
	public abstract void makeTea();
}
