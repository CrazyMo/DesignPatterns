package standardbuild;

//Director����
public class PhoneDirector {
    AbstractPhoneBuilder builder=null;
    public PhoneDirector(AbstractPhoneBuilder builder){
        this.builder=builder;
    }
    /**
    *ͳһ�淶��װ����
    */
    public void construct(String cpu,String screen){
        builder.buildCpu(cpu);
        builder.buildSreen(screen);
        builder.buildOS();
    }
}
