package it.prwe.lambda;

/**
 * @Author zhengxr
 * @Date 2022/1/11 19:31
 */
public class TestLambda01 {
    public static void main(String[] args) {
        Runnable runnable = () -> {
            System.out.println("test lambda");
        };


        int add = add(2, 3);
        System.out.println(add);


        /**
         * (int x, int y) -> x + y;
         * (x, y) -> x + y;
         * (x, y) ->{return x + y};
         *
         * ()->{System.out.println("Lambda!");}
         *
         * 参数列表，箭头，表达式（语句块）
         *
         * lambda表达式的目标类型是”函数式接口“
         * 一个接口，如果只有一个显示声明的抽象方法，那么它就是一个函数式接口
         *
         * λ表达式主要用于替换以前广泛使用的内部匿名类，各种回调，比如事件响应器、传入Thread类的Runnable等
         *
         */

    }


    public static int add(int x, int y) {
        return x = y;
    }

}
