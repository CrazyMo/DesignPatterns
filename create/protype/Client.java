package protype;


public class Client {

	public static void main(String[] args) {
	       //构建文档对象
	       WordDocument originDoc = new WordDocument();
	       System.out.println("执行拷贝操作之前原始文档的内存地址: "+originDoc.hashCode());//因为hashcode从某种程度上说标示的就是对象的内存地址。 
	       originDoc.setmText("这是一篇最初的文本");
	       originDoc.addImages("图片1");
	       originDoc.addImages("图片2");
	       originDoc.addImages("图片3");
	       originDoc.showDocument();
	       System.out.println();
	       //以原始文档为模板,拷贝一份副本
	       //WordDocument doc2 = originDoc.clone();
	       WordDocument doc2=(WordDocument) originDoc.cloneProtype();
	       System.out.println("执行拷贝操作之后原始文档的内存地址: "+originDoc.hashCode()+"以下是执行了拷贝操作之后还未对副本对象进行初始化时，原始对象的值： ");
	       
	       originDoc.showDocument();
	       System.out.println();
	       System.out.println("执行拷贝操作之后原始文档的内存地址: "+originDoc.hashCode()+"以下是执行了拷贝操作之后还未对副本对象进行初始化时，副本对象的值： ");
	       doc2.showDocument();
	       
	       //修改文档副本,不会影响原始文档
	       doc2.setmText("这是修改过的文本");
	       doc2.addImages("修改副本加入的图片.jpg");
	       //doc2.getmImages().remove(0);
	       System.out.println("执行拷贝操作之后副本的内存地址:	"+doc2.hashCode()+"副本初始化后的值：");
	       doc2.showDocument();
	       System.out.println();
	       System.out.println("执行拷贝操作之后原始文档的内存地址: "+originDoc.hashCode()+"以下是执行了对副本对象进行初始化后，原始对象的值： ");
	       originDoc.showDocument();
	   }

}
