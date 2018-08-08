package bridge;

public class Client {

	public static void main(String[] args) {
		AbstractTea tea=null;
		AbstractTeaIngredient ingredient=null;
		//制作大杯红茶
		ingredient=new RedTeaIngredient();
		tea=new LargeCubTea(ingredient);
		tea.makeTea();
		//制作大杯绿茶
		ingredient=new GreenTeaIngredient();
		tea=new LargeCubTea(ingredient);
		tea.makeTea();
		
		//制作小杯红茶
		ingredient=new RedTeaIngredient();
		tea=new SmallCubTea(ingredient);
		tea.makeTea();
		//制作小杯绿茶
		ingredient=new GreenTeaIngredient();
		tea=new SmallCubTea(ingredient);
		tea.makeTea();
	}

}
