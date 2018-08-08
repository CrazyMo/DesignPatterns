package protype.regist;

public class MainRegistClient {

	public static void main(String[] args) {
		try {
			MyCloneable2 doc1 = new Document1();
			DocPrototypeManager.setMyCloneable2("doc1", doc1);
			// ��ȡԭ������������
			MyCloneable2 doc3 = DocPrototypeManager.getMyCloneable2("doc1").myclone();
			doc3.setName("����");
			System.out.println("��һ��ʵ����" + doc3);
			// ���˶�̬���л���ʵ��
			MyCloneable2 doc2 = new Document2();
			DocPrototypeManager.setMyCloneable2("doc1", doc2);
			// ���»�ȡԭ������������
			MyCloneable2 doc4 = DocPrototypeManager.getMyCloneable2("doc1").myclone();
			doc4.setName("����");
			System.out.println("�ڶ���ʵ����" + doc4);
			// ����ע�������ԭ��
			//DocPrototypeManager.removeMyCloneable2("doc1");
			// �ٴλ�ȡԭ������������
			MyCloneable2 doc5 = DocPrototypeManager.getMyCloneable2("doc1").myclone();
			doc5.setName("����");
			System.out.println("������ʵ����" + doc5);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
