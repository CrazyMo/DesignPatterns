package absfactory;

//抽象顶层工厂，定义要生产产品的系列
public abstract class AbstractFactory {
	public abstract ICar manufactureCar();//生产ICar
	public abstract ISUV manufactureSUV();//生产ISUV
}
