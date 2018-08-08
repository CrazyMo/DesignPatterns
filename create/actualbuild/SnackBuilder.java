package actualbuild;

//现实开发和源码中采用的变种Build模式，Builder角色
public class SnackBuilder {
	private SnackBuilderParams params;
	
	public SnackBuilder() {
		this.params=new SnackBuilder.SnackBuilderParams();
	}
	
	//把Product 对象的属性封装到一个类中
	static class SnackBuilderParams{
		public String rice;
		public String meat;
		public String beef;
		public boolean isHot;
	}
	//返回自身，灵活实现链式调用
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
	//真正创建出Product
	public Snack build() {
        Snack snack=new Snack();
        snack.apply(params);
        return snack;
    }

}
