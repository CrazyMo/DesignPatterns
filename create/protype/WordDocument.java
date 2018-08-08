package protype;

import java.util.ArrayList;

public class WordDocument implements Cloneable ,IProtype {
	// 文本
	private String mText;
	// 图片列表
	private ArrayList<String> mImages = new ArrayList<>();

	public WordDocument() {
		System.out.println("********WordDocument构造方法被调用********");
	}

	@Override
	protected WordDocument clone() {
		try {
			WordDocument document = (WordDocument) super.clone();
			document.mText = this.mText;
			//document.mImages = this.mImages;//浅拷贝形式：只负责拷贝按值传递的数据（比如基本数据类型int、long、char等都会被拷贝、String类型也会被拷贝），而不复制它所引用的对象（如内部的数组和引用对象不拷贝）
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

	// 打印文档内容
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
