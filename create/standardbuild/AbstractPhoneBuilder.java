package standardbuild;

//Builder角色，也可以使用接口
public abstract class AbstractPhoneBuilder {
    public abstract void buildCpu(String cpu);
    public abstract void buildSreen(String screen);
    public abstract void buildOS();

    public abstract AbstractPhoneProduct create();
}