package it.prwe.thread08;

import com.sun.deploy.net.HttpResponse;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @Author zhengxr
 * @Date 2022/8/2 9:50
 */
public class TestExecutor {
    public static void main(String[] args) {
        /**
         * corePoolSize:核心线程数
         * maximumPoolSize:最大线程数
         * workQueue:任务队列
         */

        ThreadPoolExecutor poolExecutor =
                new ThreadPoolExecutor(10, 10, 5L, TimeUnit.MINUTES, new LinkedBlockingQueue<>(), new ThreadPoolExecutor.AbortPolicy());
        int tempCounter = 0;
        int realExeCount = 10000;
        ThreadLocal<Long> threadLocal = new ThreadLocal<>();
        while(tempCounter < realExeCount){
            poolExecutor.execute(() -> {
                threadLocal.set(System.currentTimeMillis());
                //执行具体逻辑
//                HttpResponse responseCommand = OkHttpClientRequestUtil.request("https://www.baidu.com/", "", "GET", "", null);
                Long time = System.currentTimeMillis() - threadLocal.get();
                System.out.println("test==="+time);
            });
            tempCounter++;
        }
    }
}
