package it.prwe.oop.abstr;

/**
 * @Author zhengxr
 * @Date 2022/7/22 14:19
 */
public abstract class Father {

    public abstract void eat();
    public void play(){
        System.out.println("father play");
    }
}

class Son extends Father{

    @Override
    public void eat() {
        System.out.println("son eat");
    }

    public void swimming(){
        System.out.println("son swimming");
    }

}
