package standardbuild;

//Builder��ɫ��Ҳ����ʹ�ýӿ�
public abstract class AbstractPhoneBuilder {
    public abstract void buildCpu(String cpu);
    public abstract void buildSreen(String screen);
    public abstract void buildOS();

    public abstract AbstractPhoneProduct create();
}