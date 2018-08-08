package statusofcls.memoto;

/**
 * 所谓的备忘录角色 ，本质上就是一个用于保存Originator角色状态的javaBean
 * @author Crazy.Mo
 *
 */
public class GameMemoto {
	private String weapon;
	private String equip;
	private int life;
	private int goals;
	public String getWeapon() {
		return weapon;
	}
	public void setWeapon(String weapon) {
		this.weapon = weapon;
	}
	public String getEquip() {
		return equip;
	}
	public void setEquip(String equip) {
		this.equip = equip;
	}
	public int getLife() {
		return life;
	}
	public void setLife(int life) {
		this.life = life;
	}
	public int getGoals() {
		return goals;
	}
	public void setGoals(int goals) {
		this.goals = goals;
	}
	@Override
	public String toString() {
		return "GameMemoto [weapon=" + weapon + ", equip=" + equip + ", life="
				+ life + ", goals=" + goals + "]";
	}
	
	
}
