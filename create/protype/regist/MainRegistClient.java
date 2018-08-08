package protype.regist;

public class MainRegistClient {

	public static void main(String[] args) {
		try {
			MyCloneable2 doc1 = new Document1();
			DocPrototypeManager.setMyCloneable2("doc1", doc1);
			// 获取原型来创建对象
			MyCloneable2 doc3 = DocPrototypeManager.getMyCloneable2("doc1").myclone();
			doc3.setName("张三");
			System.out.println("第一个实例：" + doc3);
			// 有人动态的切换了实现
			MyCloneable2 doc2 = new Document2();
			DocPrototypeManager.setMyCloneable2("doc1", doc2);
			// 重新获取原型来创建对象
			MyCloneable2 doc4 = DocPrototypeManager.getMyCloneable2("doc1").myclone();
			doc4.setName("李四");
			System.out.println("第二个实例：" + doc4);
			// 有人注销了这个原型
			//DocPrototypeManager.removeMyCloneable2("doc1");
			// 再次获取原型来创建对象
			MyCloneable2 doc5 = DocPrototypeManager.getMyCloneable2("doc1").myclone();
			doc5.setName("王五");
			System.out.println("第三个实例：" + doc5);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
