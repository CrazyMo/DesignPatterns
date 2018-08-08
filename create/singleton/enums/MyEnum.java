package singleton.enums;

/**
 * Effective Java <java��Ч���>
 */

public enum MyEnum {
    //a,b,c,d
    RED(1,"��ɫ");
    private int index;
    private String name;
    MyEnum(int index,String name){
        this.index=index;
        this.name=name;
    }
    public int getIndex(){
        return index;
    }
    public String getName(){
        return name;
    }
}
