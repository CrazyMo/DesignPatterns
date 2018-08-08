package clswithcls.observer.pull;

/**
 * 
 * @author Crazy.Mo ���⣬�� ���۲���
 */
public interface ISubject<T> {

	public void regist(IObserver<T> obj);// ע��۲���

	public void unregist(IObserver<T> obj);// ȡ��ע��

	public void notifyObservers();// ֪ͨ�۲���
}
