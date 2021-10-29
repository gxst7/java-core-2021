package com.company.Home_Work_4_project.logic;

import com.company.Home_Work_3.entity.OptionsList;
import com.company.Home_Work_3.logic.CarWarehouse;
import com.company.Home_Work_3.logic.Service;
import com.company.Home_Work_4_project.entity.Colors;
import com.company.Home_Work_4_project.entity.Engines;
import com.company.Home_Work_4_project.entity.Wheels;

import java.util.ArrayList;
import java.util.Collections;

public abstract class Factory {

    private ArrayList<Engines> engines;
    private ArrayList<Colors> colors;
    private ArrayList<Wheels> wheels;
    private OptionsList options;
    private Service service;
    private CarWarehouse carWarehouse;

    public Factory() {
        Collections.addAll(engines, Engines.values());
        Collections.addAll(colors, Colors.values());
        Collections.addAll(wheels, Wheels.values());
        options = new OptionsList();
    }

    public abstract void createCar();

    public abstract void printModels();

    public abstract void change();
}
