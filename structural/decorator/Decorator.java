package decorator;

//定义抽象装饰器角色
public abstract class Decorator extends ChatLogReport {
  // 按照定义：动态扩展，所以此处我的设计是在具体的被装饰者的基础上进行装饰，而不是取代原有功能，所以最终还需要调用原具体被装饰者去实现核心功能
  private ChatLogReport report;

  public Decorator(ChatLogReport r) {
      this.report = r;
  }
  public void showLog() {
      System.out.println(this.getClass().getSimpleName()+"调用ChatLogReport的showLog");
      this.report.showLog();
  }
}
