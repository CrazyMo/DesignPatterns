package actualbuild;

import actualbuild.SnackBuilder.SnackBuilderParams;

//Product ��ɫ����������ӵ�е����ԣ��Լ�Ӧ������"��"(��Ϊ���������Ʒ����ÿ�ζ���Ҫ��Щ��Ա���ԣ����԰���Щ���Զ���װ��һ������)
public class Snack {
	private String rice;
	private String meat;
	private String beef;
	private boolean isHot;
	
	//��������Ӧ�ĳ�Ա��������ֵ
	public void apply(SnackBuilderParams params){
		if(params.rice!=null){
			this.rice=params.rice;
		}
		if(params.meat!=null){
			this.meat=params.meat;
		}
		if(params.beef!=null){
		this.beef=params.beef;
		}
		this.isHot=params.isHot;
	}
	
	@Override
	public String toString() {
		return "����һ�ݣ�"+rice +"�� "+meat+"�� "+beef+"�� �Ƿ������"+isHot;
	}
}
