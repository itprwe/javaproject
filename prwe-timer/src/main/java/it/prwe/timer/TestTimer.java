package it.prwe.timer;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * @Author zhengxr
 * @Date 2022/1/14 14:15
 */
public class TestTimer {
    public static void main(String[] args) {
        //1.new timer //任务开始启动了
        Timer timer = new Timer();
        for (int i = 0; i < 2; i++) {
            FooTimerTask fooTimerTask = new FooTimerTask("foo" + i);
            //任务添加，预设执行时间12:00:00 12:00:02 12:00:04
            //schedule 真正执行时间，取决上一个任务的结束时间，间隔2s秒，存在丢任务风险(本来应该在10s内执行5次，但是往后延迟了，导致10s内只执行了3次)
            //scheduleAtFixedRate 严格安装预设时间执行 （执行时间乱了）
//            timer.schedule(fooTimerTask, new Date(), 2000);
            timer.scheduleAtFixedRate(fooTimerTask, new Date(), 2000);
            //单线程任务阻塞，任务超时
            //在timer的run方法中，再起线程执行
        }

    }
}

class FooTimerTask extends TimerTask {
    private String name;

    public FooTimerTask(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        try {
            System.out.println("Timer = " + name + " ,startTime" + new Date());
            Thread.sleep(3000);
            System.out.println("Timer = " + name + " ,endTime" + new Date());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}