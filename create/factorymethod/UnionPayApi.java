package factorymethod;

public class UnionPayApi implements IPayApi {

	public boolean pay(long money) {
		System.out.println("����(Ԫ)��"+money);
        System.out.println("ͨ�����������������֧��");
		return true;
	}

}
