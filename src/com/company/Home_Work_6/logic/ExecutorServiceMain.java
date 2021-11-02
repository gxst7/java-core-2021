package com.company.Home_Work_6.logic;

import com.company.Home_Work_6.entity.Country;

import java.util.concurrent.*;

public class ExecutorServiceMain {

    public ScheduledExecutorService executor = Executors.newScheduledThreadPool(3);

    public ExecutorServiceMain() {

        System.out.println("Launch threads");
        ScheduledFuture<?> t = executor.schedule(new Factory(), Long.MAX_VALUE, TimeUnit.SECONDS);
        executor.execute(new Country(t));
        executor.execute(new Country(t));

        // t send to constructor country

        t.cancel(true);

        executor.shutdown();
    }
}