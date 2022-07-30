package it.prwe.proxy.lishi02;

import java.util.Collection;
import java.util.HashMap;

/**
 * @Author zhengxr
 * @Date 2021/12/15 9:53
 */
public class Father {
    public Collection doSomething(HashMap hashMap){
        System.out.println("父类被执行");
        return hashMap.values();
    }
}
