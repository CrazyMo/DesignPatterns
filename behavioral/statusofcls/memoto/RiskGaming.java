package statusofcls.memoto;
//�ԳԼ���ϷΪ������ģ����Ϸ���̶�����Ҹ���״̬�Ĵ洢�ͻ�ԭ����ʵ��Ϸģ�Ϳ϶�����������
public class RiskGaming {
	private String weapon;
	private String equip;
	private int life;
	private int goals;
	
	//�����ҵ���߼�
	public void play(){
		System.out.println("Ŭ���Լ���... ����ֿ��õ� AK һ��,ƽ�׹�,����ñһ��");
		weapon="װ����������AK";
		equip="װ�������ϣ�ƽ�׹�������ñ";
		System.out.println("���ѵ���һǹ��ʣ������ֵ60");
		life=60;
		System.out.println("������λ������ȥ����ɵ�һöС�˼�");
		goals+=1;
	}
	
	public void networkErro(){
		System.out.println("ͻȻ������...");
		System.out.println("����ǰ״̬..."+this.toString());
		System.out.println("---------------------------------------------------");
	}
	
	//��������¼
	public GameMemoto createMemoto(){
		GameMemoto memoto=new GameMemoto();
		memoto.setWeapon(weapon);
		memoto.setEquip(equip);
		memoto.setLife(life);
		memoto.setGoals(goals);
		return memoto;
	}
	
	//ͨ������¼�ָ������״̬
	public void restore(GameMemoto memoto){
		this.weapon=memoto.getWeapon();
		this.equip=memoto.getEquip();
		this.life=memoto.getLife();
		this.goals=memoto.getGoals();
		System.out.println("ͨ������¼�ָ�״̬..."+this.toString());
	}
	
	@Override
	public String toString() {
		return "RiskGaming [weapon=" + weapon + ", equip=" + equip + ", life="
				+ life + ", goals=" + goals + "]";
	}
	
}
