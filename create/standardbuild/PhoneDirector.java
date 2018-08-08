package standardbuild;

//Director对象
public class PhoneDirector {
    AbstractPhoneBuilder builder=null;
    public PhoneDirector(AbstractPhoneBuilder builder){
        this.builder=builder;
    }
    /**
    *统一规范组装流程
    */
    public void construct(String cpu,String screen){
        builder.buildCpu(cpu);
        builder.buildSreen(screen);
        builder.buildOS();
    }
}
