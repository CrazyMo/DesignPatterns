package decorator;

//�������װ������ɫ
public abstract class Decorator extends ChatLogReport {
  // ���ն��壺��̬��չ�����Դ˴��ҵ�������ھ���ı�װ���ߵĻ����Ͻ���װ�Σ�������ȡ��ԭ�й��ܣ��������ջ���Ҫ����ԭ���屻װ����ȥʵ�ֺ��Ĺ���
  private ChatLogReport report;

  public Decorator(ChatLogReport r) {
      this.report = r;
  }
  public void showLog() {
      System.out.println(this.getClass().getSimpleName()+"����ChatLogReport��showLog");
      this.report.showLog();
  }
}
