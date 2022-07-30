package it.prwe.algorithm;

import java.util.Scanner;

/**
 * @Author zhengxr
 * @Date 2022/7/26 13:28
 */
public class Test02 {
    public static void main(String[] args) {
        /**
         * 鸡兔共35只,共94只脚,那么鸡和兔各几只
         */
//        test01();
        /**
         * 已知:斐波那契数列的前几个数分别为0,1,1,2,3,5…从第三项开始,每一项都等于前两项的和.请接收用户输入的整数n,求出此数列的前n项
         */
//        System.out.println("请输入您要测试的数:");
//        int n = new Scanner(System.in).nextInt();
//        test02(n);
        /**
         * 打印100以内除了尾数为3,5,7的所有数
         */
//        test03();
    }

    public static void test01(){
        for (int i=0,j=35;i<=35;i++,j--){
            if ((i*2 + j*4)==94){
                System.out.println("鸡："+i);
                System.out.println("兔："+j);
            }
        }
    }
    public static void test02(int n){
        if (n<1){
            System.out.println("输入数据必须为大于0的整数，请重新输入！");
        }
        if (n==1){
            System.out.println(0);
        }
        if (n==2){
            System.out.println(0+","+1);
        }
        if (n==3){
            System.out.println(0+","+1+","+1);
        }
        if (n>3){
            System.out.print(0+","+1+","+1+",");
        }

        int f1=1;
        int f2=1;
        int next = 0;
        for (int i=4;i<=n;i++){
            next = f1+f2;
            f1=f2;
            f2=next;
            System.out.print(next+",");
        }
    }
    public static void test03(){
        for (int i=0;i<=100;i++){
            if ((i%10)!=3&&(i%10)!=5&&(i%10)!=7){
                System.out.print(i+",");
            }
        }
    }

}
