package actualbuild;

import actualbuild.SnackBuilder.SnackBuilderParams;

//Product 角色，声明可能拥有的属性，以及应用属性"集"(因为创建这个产品不是每次都需要这些成员属性，所以把这些属性都封装到一个类中)
public class Snack {
	private String rice;
	private String meat;
	private String beef;
	private boolean isHot;
	
	//真正给相应的成员属性设置值
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
		return "外卖一份："+rice +"、 "+meat+"、 "+beef+"、 是否加辣："+isHot;
	}
}
