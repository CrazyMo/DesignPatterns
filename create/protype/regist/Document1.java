package protype.regist;

public class Document1 implements MyCloneable2 {

	// ÎÄ±¾ 
	private String mText;

	@Override
	public MyCloneable2 myclone() {
		Document1 doc1 = new Document1();
		doc1.setName(mText);
		return doc1;

	}

	public String toString() {
		return "Now in Prototype1 , name = " + this.mText;
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
