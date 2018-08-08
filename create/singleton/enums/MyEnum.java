package singleton.enums;

/**
 * Effective Java <java高效编程>
 */

public enum MyEnum {
    //a,b,c,d
    RED(1,"红色");
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
