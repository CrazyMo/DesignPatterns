package protype;

import java.util.ArrayList;

public class WordDocument implements Cloneable ,IProtype {
	// �ı�
	private String mText;
	// ͼƬ�б�
	private ArrayList<String> mImages = new ArrayList<>();

	public WordDocument() {
		System.out.println("********WordDocument���췽��������********");
	}

	@Override
	protected WordDocument clone() {
		try {
			WordDocument document = (WordDocument) super.clone();
			document.mText = this.mText;
			//document.mImages = this.mImages;//ǳ������ʽ��ֻ���𿽱���ֵ���ݵ����ݣ����������������int��long��char�ȶ��ᱻ������String����Ҳ�ᱻ�����������������������õĶ������ڲ�����������ö��󲻿�����
			document.mImages=(ArrayList<String>)this.mImages.clone();
			return document;
		} catch (Exception e) {

		}

		return null;
	}

	public String getmText() {
		return mText;
	}

	public void setmText(String mText) {
		this.mText = mText;
	}

	public ArrayList<String> getmImages() {
		return mImages;
	}

	public void setmImages(ArrayList<String> mImages) {
		this.mImages = mImages;
	}

	public void addImages(String image) {
		this.mImages.add(image);
	}

	// ��ӡ�ĵ�����
	public void showDocument() {
		
		System.out.println("Text: " + mText);
		System.out.print("Images List: ");
		for (String imgName : mImages) {
			System.out.print(imgName+"\t");
		}
		System.out.println("****Word Content End*****\n");

	}

	@Override
	public IProtype cloneProtype() {
		WordDocument doc2 = new WordDocument();
		doc2.mText = this.mText;
		//doc2.mImages = this.mImages;
		doc2.mImages=(ArrayList<String>)this.mImages.clone();
		return doc2;
	}
}
