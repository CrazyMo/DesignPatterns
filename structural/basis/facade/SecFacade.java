package basis.facade;

//����ϵͳ�ڲ���ĳЩ�����ʹ��������
public class SecFacade {
	// ����ԭ�е�����
	private SystemFacade facade = new SystemFacade();

	// �����ṩΨһ�ķ�����ϵͳ�ķ���
	public void methodB() {
		this.facade.methodB();
	}
}