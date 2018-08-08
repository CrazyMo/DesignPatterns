package proxy.statics;

/**
 * AbstractSubject抽象主题，即这些方法都是需要通过被代理的形式来使用，为了扩展性先抽象出来
 */
public interface AbstractSubject {
	void submit();//提交诉讼申请
    void proof();//进行举证
}
