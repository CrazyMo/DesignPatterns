package bridge;

public class SmallCubTea extends AbstractTea {

	public SmallCubTea(AbstractTeaIngredient ingredient) {
		super(ingredient);
	}

	@Override
	public void makeTea() {
		System.out.println("制作小杯的"+teaIngredient.putIn());	
	}

}
