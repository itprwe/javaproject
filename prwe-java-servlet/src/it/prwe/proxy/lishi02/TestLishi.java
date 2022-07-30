package it.prwe.proxy.lishi02;

import java.util.HashMap;

/**
 * @Author zhengxr
 * @Date 2021/12/15 9:52
 */
public class TestLishi {
    public static void invoker() {
//        Father father = new Father();

        Son son = new Son();

        HashMap hashMap = new HashMap();
        son.doSomething(hashMap);
    }

    public static void main(String[] args) {
        invoker();
    }
}
