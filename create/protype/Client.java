package protype;


public class Client {

	public static void main(String[] args) {
	       //�����ĵ�����
	       WordDocument originDoc = new WordDocument();
	       System.out.println("ִ�п�������֮ǰԭʼ�ĵ����ڴ��ַ: "+originDoc.hashCode());//��Ϊhashcode��ĳ�̶ֳ���˵��ʾ�ľ��Ƕ�����ڴ��ַ�� 
	       originDoc.setmText("����һƪ������ı�");
	       originDoc.addImages("ͼƬ1");
	       originDoc.addImages("ͼƬ2");
	       originDoc.addImages("ͼƬ3");
	       originDoc.showDocument();
	       System.out.println();
	       //��ԭʼ�ĵ�Ϊģ��,����һ�ݸ���
	       //WordDocument doc2 = originDoc.clone();
	       WordDocument doc2=(WordDocument) originDoc.cloneProtype();
	       System.out.println("ִ�п�������֮��ԭʼ�ĵ����ڴ��ַ: "+originDoc.hashCode()+"������ִ���˿�������֮��δ�Ը���������г�ʼ��ʱ��ԭʼ�����ֵ�� ");
	       
	       originDoc.showDocument();
	       System.out.println();
	       System.out.println("ִ�п�������֮��ԭʼ�ĵ����ڴ��ַ: "+originDoc.hashCode()+"������ִ���˿�������֮��δ�Ը���������г�ʼ��ʱ�����������ֵ�� ");
	       doc2.showDocument();
	       
	       //�޸��ĵ�����,����Ӱ��ԭʼ�ĵ�
	       doc2.setmText("�����޸Ĺ����ı�");
	       doc2.addImages("�޸ĸ��������ͼƬ.jpg");
	       //doc2.getmImages().remove(0);
	       System.out.println("ִ�п�������֮�󸱱����ڴ��ַ:	"+doc2.hashCode()+"������ʼ�����ֵ��");
	       doc2.showDocument();
	       System.out.println();
	       System.out.println("ִ�п�������֮��ԭʼ�ĵ����ڴ��ַ: "+originDoc.hashCode()+"������ִ���˶Ը���������г�ʼ����ԭʼ�����ֵ�� ");
	       originDoc.showDocument();
	   }

}
