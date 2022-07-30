package it.prwe.timer;

import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * @Author zhengxr
 * @Date 2022/1/14 14:41
 */
public class TimerPoolTest {
    public static void main(String[] args) {
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(5);
        for (int i = 0; i < 2; i++) {
//            scheduledExecutorService.schedule(new Task("task=" + i), 2, TimeUnit.SECONDS);
            scheduledExecutorService.scheduleAtFixedRate(new Task("task=" + i), 0, 2, TimeUnit.SECONDS);

        }
    }

}

class Task implements Runnable {

    private String name;

    public Task(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        try {
            System.out.println(name + " ,startTime" + new Date());
            Thread.sleep(3000);
            System.out.println(name + " ,endTime" + new Date());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}