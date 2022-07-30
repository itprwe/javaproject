package it.prwe.proxy;

/**
 * @Author zhengxr
 * @Date 2021/12/14 10:53
 */

/**
 * 第二步定义目标业务对象类
 */
public class LiuDeHua implements Person{
    @Override
    public String sing(String name) {
        System.out.println("刘德华唱"+name+"歌！！");
        return "歌唱完了，谢谢大家！";
    }

    @Override
    public String dance(String name) {
        System.out.println("刘德华跳"+name+"舞！！");
        return "舞跳完了，多谢各位观众！";
    }
}
