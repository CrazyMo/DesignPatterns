package protype.regist;

public class Document2 implements MyCloneable2 {

	// ÎÄ±¾
	private String mText;

	@Override
	public MyCloneable2 myclone() {
		Document2 doc2 = new Document2();
		doc2.setName(mText);
		return doc2;

	}

	@Override
	public String getName() {
		return mText;
	}

	@Override
	public void setName(String name) {
		this.mText = name;
	}

}
