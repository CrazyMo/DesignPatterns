package statusofcls.memoto;

//Caretaker ��ɫ��Ҫ�Ǹ��������¼��ɫ��
public class MemotoManager {
	GameMemoto memoto;

	public void archive(GameMemoto memoto) {
		this.memoto = memoto;
	}

	public GameMemoto getMemoto() {
		return memoto;
	}

}
