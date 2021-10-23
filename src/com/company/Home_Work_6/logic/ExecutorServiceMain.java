package com.company.Home_Work_6.logic;

import com.company.Home_Work_6.entity.Country;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceMain {

    public ExecutorService executor = Executors.newCachedThreadPool();

    Country c1 = new Country();
    Country c2 = new Country();
    Factory f = new Factory();

    public ExecutorServiceMain() {

        System.out.println("Launch threads");
        executor.execute(c1);
        executor.execute(c2);
        executor.execute(f);

        executor.shutdown();
    }
}
