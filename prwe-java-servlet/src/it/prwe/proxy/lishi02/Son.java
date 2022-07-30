package it.prwe.proxy.lishi02;

import java.util.Collection;
import java.util.Map;

/**
 * @Author zhengxr
 * @Date 2021/12/15 9:54
 */
public class Son extends Father {
    public Collection doSomething(Map map) {
        System.out.println("子类被执行");
        return map.values();
    }
}
