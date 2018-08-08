package actualbuild;

public class Client {

	public static void main(String[] args) {
		SnackBuilder builder=new SnackBuilder().setRice("���׷�").setMeat("���Ｙ").setBeef("ţ��");
		Snack snack=builder.build();
		System.out.println(snack.toString());
		
		SnackBuilder builder2=new SnackBuilder().setRice("���׷�").setMeat("���Ｙ").setIsHot(true);
		Snack snack2=builder2.build();
		System.out.println(snack2.toString());
	}

}
