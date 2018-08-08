package standardbuild;

public class Client {

	public static void main(String[] args) {
		AbstractPhoneBuilder builder=new AndroidPhoneBuilder();
        PhoneDirector director=new PhoneDirector(builder);
        director.construct("����835", "LCD");//Director ͳһ������װ����
        AndroidPhone phone=(AndroidPhone) builder.create();//�����ͨ��Buidler���ɸ��Ӷ���
        System.out.print(phone.toString());
	}

}
