package bridge;

//�ӹ��ά�ȵ�ʵ��
public class LargeCubTea extends AbstractTea {

	public LargeCubTea(AbstractTeaIngredient ingredient) {
		super(ingredient);
	}

	@Override
	public void makeTea() {
		System.out.println("�����󱭵�"+teaIngredient.putIn());	
	}

}
