package bridge;

public class Client {

	public static void main(String[] args) {
		AbstractTea tea=null;
		AbstractTeaIngredient ingredient=null;
		//�����󱭺��
		ingredient=new RedTeaIngredient();
		tea=new LargeCubTea(ingredient);
		tea.makeTea();
		//�������̲�
		ingredient=new GreenTeaIngredient();
		tea=new LargeCubTea(ingredient);
		tea.makeTea();
		
		//����С�����
		ingredient=new RedTeaIngredient();
		tea=new SmallCubTea(ingredient);
		tea.makeTea();
		//����С���̲�
		ingredient=new GreenTeaIngredient();
		tea=new SmallCubTea(ingredient);
		tea.makeTea();
	}

}
