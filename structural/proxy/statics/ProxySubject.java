package proxy.statics;

/**
 * 
 * @author Crazy.Mo
 * 代理角色即SubjectProxyer,所谓代理类，仅仅是代理，被委托的作用，在代理角色内部不涉及到具体的逻辑，仅仅是简单的调用被代理角色开放的方法
 */
public class ProxySubject {
	
	private AbstractSubject subject;
	public ProxySubject(AbstractSubject subject){
		this.subject=subject;
	}

	public void submit() {
		this.subject.submit();
		System.out.println("代理人接受被代理人的委托，拿到原告的事先写好的诉讼书并向法院提交...");
	}

	public void proof() {	
		this.subject.proof();
		System.out.println("代理人接受被代理人的委托，把原告准备的材料提交到法庭上...");
	}
}
