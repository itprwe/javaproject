package it.prwe.quartz;

import org.quartz.*;

/**
 * @Author zhengxr
 * @Date 2022/1/14 15:11
 */
@DisallowConcurrentExecution
@PersistJobDataAfterExecution
public class MyJob implements Job {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void execute(JobExecutionContext jobExecutionContext) {
        /*
        System.out.println("myjob excute" + new Date());
        JobDataMap detailMap = jobExecutionContext.getJobDetail().getJobDataMap();
        JobDataMap triggerMap = jobExecutionContext.getTrigger().getJobDataMap();
        //合到一起，key相同则会被覆盖
        JobDataMap mergedJobDataMap = jobExecutionContext.getMergedJobDataMap();
        System.out.println(detailMap.getString("job"));
        System.out.println(triggerMap.getString("trigger"));
        System.out.println(mergedJobDataMap.getString("job"));

        System.out.println("name:" + name);

         */
        /*System.out.println("jobDetail:"+jobExecutionContext.getJobDetail());
        System.out.println("job："+jobExecutionContext.getJobInstance());*/

        //并发执行，不会等待3s再执行
        /*System.out.println("excute" + new Date());
        try {
            Thread.sleep(3000);
            System.out.println("ttttest");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/

        //对trigger中的dataMap无效
        /*JobDataMap jobDataMap = jobExecutionContext.getTrigger().getJobDataMap();
        int count = jobDataMap.getInt("count") + 1;
        jobDataMap.put("count", count);
        System.out.println("triggerMap Count:"+jobDataMap.getInt("count"));*/

        //
        JobDataMap jobDataMap = jobExecutionContext.getJobDetail().getJobDataMap();
        int count = jobDataMap.getInt("count") + 1;
        jobDataMap.put("count", count);
        System.out.println("jobDetailMap Count:"+jobDataMap.getInt("count"));
    }
}
