package clswithcls.responsibility;

public class ConcreteHanderB extends AbstractHander {

	@Override
	public void handle(String conditionStr) {
		//如果传入的条件符合，则自己处理
		if("HanderB".equals(conditionStr)){
			System.out.println("**条件符合，由ConcreteHanderB自己处理这个请求");
			return;
		}else{
			System.out.println("##条件不符合，由ConcreteHanderB转发这个请求到下一个处理者");
			if(nextHander!=null){
				nextHander.handle(conditionStr);//否则转到下一个处理者
			}
		}
	}
	@Override
	public void setNextHander(AbstractHander hander) {
		this.nextHander=hander;
	}

}
