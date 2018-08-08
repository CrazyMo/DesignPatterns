package factorymethod;

public class AliPayFactory extends PayFactory {

	@Override
	public IPayApi createPayApi() {
		System.out.println("ͨ��֧����֧�������ഴ��֧������֧��Api����");
		return new AliPayApi();
	}

}
