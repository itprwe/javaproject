package it.prwe.oop.duotai;

/**
 * @Author zhengxr
 * @Date 2022/7/22 11:22
 */
public class Father {
    public void eat(){
        System.out.println("eat fish! father method");
    }
    public void play(){
        System.out.println("钓鱼 father method");
    }
}

class Son extends Father implements Swimming{

    @Override
    public void play(){
        System.out.println("lol! son method");
    }

    public void eatChicken(){
        System.out.println("大吉大利！ son method");
    }

    @Override
    public void goSwimming() {
        System.out.println("impl Swimming");
    }
}
