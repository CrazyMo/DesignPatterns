package clswithcls.observer.java;

public class Client {

	public static void main(String[] args) {
		LiveshowSubjector subject=new LiveshowSubjector();//定义主题 即被观察者
		
		UserObserver userA=new UserObserver("有位水友");//定义观察者角色
		UserObserver userB=new UserObserver("小龙人");
		UserObserver userC=new UserObserver("小僵尸");
		UserObserver userD=new UserObserver("小树人");
		UserObserver userE=new UserObserver("小火人");

		subject.addObserver(userA);//使用Observable 的方法注册 观察者
		subject.addObserver(userB);
		subject.addObserver(userC);
		subject.addObserver(userD);
		subject.addObserver(userE);
		subject.pushLiveShowMsg("DOTA大神来直播啦");//当主题更新的时候，通知观察者
		System.out.println("");
		subject.deleteObserver(userE);
		subject.pushLiveShowMsg("绿帽癖来直播啦");//当主题更新的时候，通知观察者
	}

}
