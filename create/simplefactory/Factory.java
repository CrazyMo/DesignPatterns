package simplefactory;

//负责实例化对应产品的对象
public class Factory {
	public static final String TYPE_A="a";
    public static final String TYPE_B="b";
    
    private Factory() {
	}

    public static IProduct create(String type){
        IProduct product=null;
        if(TYPE_A.equals(type)){
            product=new ProductA();
        }else if(TYPE_B.equals(type)){
            product=new ProductB();
        }
        return product;
    }
    
    //结合泛型和反射根据类名自动生成对应的对象，Java EE中使用这种方式比较多，Android中较少使用，因为反射的缘故
    @SuppressWarnings("unchecked")
	public static <T extends IProduct> T createProduct(Class<T> clz){
    	IProduct product=null;
        try {
        	product=(IProduct)Class.forName(clz.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return (T)product;
    }
}
