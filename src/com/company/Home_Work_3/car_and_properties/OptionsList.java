package com.company.Home_Work_3.car_and_properties;

import java.util.Arrays;

public class OptionsList {

    private String[] optionsList;

    OptionsList(String[] options) {
        optionsList = new String[options.length];
        for (int i = 0; i < options.length; i++) {
            optionsList[i] = new String(options[i]);
        }
    }

    public OptionsList() {
        optionsList = new String[]{};
    }

    // Return string representation of list of options
    String getOptions() {
        StringBuilder builder = new StringBuilder("Options of the car:");
        for (String s : optionsList) {
            builder.append("\n").append(s);
        }
        return builder.toString();
    }

    // Add an option to initial set of options
    void addOption(String option) {
        // checking if this option already exists
        for (String op: optionsList) {
            if (op.equals(option)) {
                System.out.println("Option already installed");
                return;
            }
        }
        // if not, then add the option
        String[] resAdd = new String[optionsList.length + 1];
        for (int i = 0; i < optionsList.length; i++) {
            resAdd[i] = optionsList[i];
        }
        resAdd[optionsList.length] = new String(option);
        optionsList = resAdd;
    }

    // Delete an option from the list
    void deleteOption(String option) {
        for (String op: optionsList) {
            if (op.equals(option)) {
                String[] resDel = new String[optionsList.length - 1];
                for (int i = 0; i < resDel.length; i++) {
                    if (optionsList[i].equals(option)) {
                        resDel[i] = optionsList[++i];
                    } else {
                        resDel[i] = optionsList[i];
                    }
                }
                optionsList = resDel;
            } else {
                System.out.println("There is no such option");
            }
        }

    }

    @Override
    public String toString() {
        return "OptionsList{" +
                "optionsList=" + Arrays.toString(optionsList) +
                '}';
    }
}
