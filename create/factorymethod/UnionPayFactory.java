package factorymethod;

public class UnionPayFactory extends PayFactory {

	@Override
	public IPayApi createPayApi() {
		System.out.println("ͨ�����������������ഴ����������֧��Api����");
		return new UnionPayApi();
	}

}
