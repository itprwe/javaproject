package it.prwe.listener;


/**
 * @Author zhengxr
 * @Date 2021/12/13 14:06
 */

/**
 * 事件监听器
 * 监听Person事件源的eat和sleep方法
 */
public interface PersonListener {
    void doEat(Event event);

    void doSleep(Event event);
}
