package actualbuild;

public class Client {

	public static void main(String[] args) {
		SnackBuilder builder=new SnackBuilder().setRice("大米饭").setMeat("猪里脊").setBeef("牛肉");
		Snack snack=builder.build();
		System.out.println(snack.toString());
		
		SnackBuilder builder2=new SnackBuilder().setRice("大米饭").setMeat("猪里脊").setIsHot(true);
		Snack snack2=builder2.build();
		System.out.println(snack2.toString());
	}

}
