package statusofcls.memoto;
//以吃鸡游戏为例，简单模拟游戏过程对于玩家各种状态的存储和还原（真实游戏模型肯定不是这样）
public class RiskGaming {
	private String weapon;
	private String equip;
	private int life;
	private int goals;
	
	//自身的业务逻辑
	public void play(){
		System.out.println("努力吃鸡中... 进入仓库拿到 AK 一把,平底锅,棒球帽一顶");
		weapon="装备上武器：AK";
		equip="装备防具上：平底锅，棒球帽";
		System.out.println("被狙点了一枪，剩余生命值60");
		life=60;
		System.out.println("蛇形走位，冲上去点射干掉一枚小菜鸡");
		goals+=1;
	}
	
	public void networkErro(){
		System.out.println("突然掉线了...");
		System.out.println("掉线前状态..."+this.toString());
		System.out.println("---------------------------------------------------");
	}
	
	//创建备忘录
	public GameMemoto createMemoto(){
		GameMemoto memoto=new GameMemoto();
		memoto.setWeapon(weapon);
		memoto.setEquip(equip);
		memoto.setLife(life);
		memoto.setGoals(goals);
		return memoto;
	}
	
	//通过备忘录恢复保存的状态
	public void restore(GameMemoto memoto){
		this.weapon=memoto.getWeapon();
		this.equip=memoto.getEquip();
		this.life=memoto.getLife();
		this.goals=memoto.getGoals();
		System.out.println("通过备忘录恢复状态..."+this.toString());
	}
	
	@Override
	public String toString() {
		return "RiskGaming [weapon=" + weapon + ", equip=" + equip + ", life="
				+ life + ", goals=" + goals + "]";
	}
	
}
