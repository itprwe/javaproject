package it.prwe.thread08;

/**
 * @Author zhengxr
 * @Date 2022/6/29 10:32
 */
public class Test01 {

    public static void main(String[] args) {
        Thread myThread = new MyThread();
        System.out.println("main1方法主线程,,,,," + Thread.currentThread().getName());
        myThread.start();


        System.out.println("main2方法主线程,,,,," + Thread.currentThread().getName());
        MyRunnable myRunnable = new MyRunnable();

        Thread thread1 = new Thread(myRunnable);
        Thread thread2 = new Thread(myRunnable);
        thread1.start();
        thread2.start();
    }
}

class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("子线程run,,,,,,,,,,,,," + Thread.currentThread().getName());
    }
}

class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("runnable线程,,,,,," + Thread.currentThread().getName());
        for (int i = 0; i < 50; i++) {
            System.out.println("run thread name ====" + Thread.currentThread().getName());
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

