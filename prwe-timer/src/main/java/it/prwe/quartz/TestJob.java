package it.prwe.quartz;

import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;

/**
 * @Author zhengxr
 * @Date 2022/1/14 15:46
 */
public class TestJob {
    public static void main(String[] args) throws SchedulerException {
        //jobName任务名字，一个调度器里面名字唯一，哪些任务归为一个组
        //scheduler每次执行任务，都会根据jobDetail生成新的job对象，这样可以规避并发访问的问题
        int count = 0;
        JobDetail jobDetail = JobBuilder.newJob(MyJob.class)
                .withIdentity("job1","group1")
                .usingJobData("job", "jobDetail1")
                .usingJobData("name", "jobDetail1")
                .usingJobData("count",count)
                .build();

        Trigger trigger = TriggerBuilder.newTrigger()
                .withIdentity("trigger1","trigger1")
                .usingJobData("trigger","trigger1")
                .usingJobData("name","trigger1")

                .startNow()
                .withSchedule(SimpleScheduleBuilder.simpleSchedule().withIntervalInSeconds(1).repeatForever())
                .build();
        try {
            Scheduler scheduler = StdSchedulerFactory.getDefaultScheduler();
            scheduler.scheduleJob(jobDetail,trigger);
            //启动
            scheduler.start();
        } catch (SchedulerException e) {
            e.printStackTrace();
        }
    }
}
