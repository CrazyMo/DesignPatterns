package standardbuild;

//具体的Builder角色
public class AndroidPhoneBuilder extends AbstractPhoneBuilder {
    private AbstractPhoneProduct product=new AndroidPhone();
    public void buildCpu(String cpu) {
        product.setCpu(cpu);

    }

    public void buildSreen(String screen) {
        product.setScreen(screen);

    }
    public void buildOS() {
        product.setOs();
    }
    public AbstractPhoneProduct create() {
        return product;
    }
}
