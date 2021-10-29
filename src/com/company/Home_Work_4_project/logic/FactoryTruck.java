package com.company.Home_Work_4_project.logic;

import com.company.Home_Work_4_project.entity.TruckModels;

import java.util.ArrayList;
import java.util.Collections;

public class FactoryTruck extends Factory {

    private ArrayList<TruckModels> models;

    public FactoryTruck() {
        super();
        Collections.addAll(models, TruckModels.values());
    }

    @Override
    public void createCar() {

    }

    @Override
    public void printModels() {

    }

    @Override
    public void change() {

    }
}
