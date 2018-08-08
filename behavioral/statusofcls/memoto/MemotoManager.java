package statusofcls.memoto;

//Caretaker 角色主要是负责管理备忘录角色的
public class MemotoManager {
	GameMemoto memoto;

	public void archive(GameMemoto memoto) {
		this.memoto = memoto;
	}

	public GameMemoto getMemoto() {
		return memoto;
	}

}
