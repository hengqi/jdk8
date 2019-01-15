package com.chenhl.base;

import java.util.Random;
import java.util.concurrent.*;

public class CompletionCallable {

    //存放处理结果的集合
    private static ConcurrentHashMap<Integer, Integer> map = new ConcurrentHashMap<Integer, Integer>();

    public static void main(String[] args) {
        try {
            completionServiceCount();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 使用completionService收集callable结果
     * @throws ExecutionException
     * @throws InterruptedException
     */
    public static void completionServiceCount() throws InterruptedException, ExecutionException {
        ExecutorService threadPool = Executors.newCachedThreadPool();
        CompletionService<Integer> cs = new ExecutorCompletionService<Integer>(threadPool);

        int threadNum = 5;
        for (int i = 0; i < threadNum; i++) {
            cs.submit(getTask(i));
        }
        int sum = 0, temp = 0;
        for(int i=0;i<threadNum;i++){
            //先执行完的线程,先返回结果
            temp = cs.take().get();
            sum += map.get(temp);
            System.out.print(temp + "\t");
        }

//        SleepUtils.sleep(1000);
        System.out.println("Result->" + sum);
        threadPool.shutdown();
    }

    public static Callable<Integer> getTask(final int no) {
        final Random rand = new Random();
        Callable<Integer> task = () -> {
            int time = rand.nextInt(100)*100;
            map.put(Integer.valueOf(no), time);
            System.out.println("Thread-"+ no +" sleep :"+ time);
            Thread.sleep(time);
            return no;
        };
        return task;
    }
}
