package statusofcls.memoto;

public class Client {

	public static void main(String[] args) {
		RiskGaming gaming=new RiskGaming();//����ԭʼ��Originator��ɫ
		gaming.play();//Originator��ɫ��ҵ���������״̬�����ı�
		MemotoManager manager=new MemotoManager();//����Caretaker��ɫ
		GameMemoto memoto=gaming.createMemoto();//Originator��ɫ������ɴ�������¼
		manager.archive(memoto);//ͨ��Caretaker ��ɱ���¼�Ĵ浵
		
		gaming.networkErro();//����˵ͻȻ�����ˣ����������϶��öԵ�ʱ��״̬���лָ�
		
		RiskGaming gaming2=new RiskGaming();//�ٴ���ԭʼ��Originator��ɫ
		gaming2.restore(manager.getMemoto());
		
	}

}
