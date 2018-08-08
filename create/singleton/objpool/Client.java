package singleton.objpool;

public class Client {

	public static void main(String[] args) {
		for(int i=0;i<20;i++){
            System.out.println(Connection.getConnection().hashCode());
        }
	}

}
