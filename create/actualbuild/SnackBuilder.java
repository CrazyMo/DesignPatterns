package actualbuild;

//��ʵ������Դ���в��õı���Buildģʽ��Builder��ɫ
public class SnackBuilder {
	private SnackBuilderParams params;
	
	public SnackBuilder() {
		this.params=new SnackBuilder.SnackBuilderParams();
	}
	
	//��Product ��������Է�װ��һ������
	static class SnackBuilderParams{
		public String rice;
		public String meat;
		public String beef;
		public boolean isHot;
	}
	//�����������ʵ����ʽ����
	public SnackBuilder setRice(String rice){
		params.rice=rice;
		return this;
	}
	
	public SnackBuilder setMeat(String meat){
		params.meat=meat;
		return this;
	}
	
	public SnackBuilder setBeef(String beef){
		params.beef=beef;
		return this;
	}
	
	public SnackBuilder setIsHot(boolean isHot){
		params.isHot=isHot;
		return this;
	}
	//����������Product
	public Snack build() {
        Snack snack=new Snack();
        snack.apply(params);
        return snack;
    }

}
