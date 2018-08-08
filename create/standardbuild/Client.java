package standardbuild;

public class Client {

	public static void main(String[] args) {
		AbstractPhoneBuilder builder=new AndroidPhoneBuilder();
        PhoneDirector director=new PhoneDirector(builder);
        director.construct("骁龙835", "LCD");//Director 统一管理组装流程
        AndroidPhone phone=(AndroidPhone) builder.create();//最后再通过Buidler生成复杂对象
        System.out.print(phone.toString());
	}

}
