package bridge;

//从规格维度的实现
public class LargeCubTea extends AbstractTea {

	public LargeCubTea(AbstractTeaIngredient ingredient) {
		super(ingredient);
	}

	@Override
	public void makeTea() {
		System.out.println("制作大杯的"+teaIngredient.putIn());	
	}

}
