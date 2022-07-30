package it.prwe.se10_designmodel.model01_single;

/**
 * @Author zhengxr
 * @Date 2022/7/21 14:12
 */
public class Singleton {
    private static Singleton instance = null;

    private Singleton(){};

    public static Singleton getInstance(){
        if (instance == null){
            synchronized (Singleton.class){
                if (instance == null){
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
