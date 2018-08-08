package simplefactory;

//����ʵ������Ӧ��Ʒ�Ķ���
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
    
    //��Ϸ��ͺͷ�����������Զ����ɶ�Ӧ�Ķ���Java EE��ʹ�����ַ�ʽ�Ƚ϶࣬Android�н���ʹ�ã���Ϊ�����Ե��
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
