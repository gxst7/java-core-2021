package com.company.Home_Work_6.logic;

import com.company.Home_Work_6.entity.Country;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceMain {

    public ExecutorService executor = Executors.newCachedThreadPool();

    public ExecutorServiceMain() {

        System.out.println("Launch threads");
        executor.execute(new Country());
        executor.execute(new Country());
        executor.execute(new Factory());

        executor.shutdown();
    }
}