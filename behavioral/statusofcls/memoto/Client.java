package statusofcls.memoto;

public class Client {

	public static void main(String[] args) {
		RiskGaming gaming=new RiskGaming();//创建原始的Originator角色
		gaming.play();//Originator角色因业务导致自身的状态发生改变
		MemotoManager manager=new MemotoManager();//创建Caretaker角色
		GameMemoto memoto=gaming.createMemoto();//Originator角色主动完成创建备忘录
		manager.archive(memoto);//通过Caretaker 完成备忘录的存档
		
		gaming.networkErro();//假如说突然掉线了，重连回来肯定得对当时的状态进行恢复
		
		RiskGaming gaming2=new RiskGaming();//再创建原始的Originator角色
		gaming2.restore(manager.getMemoto());
		
	}

}
