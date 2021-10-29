package com.company.Home_Work_4_project.entity;

import java.util.ArrayList;
        import java.util.Arrays;

public class OptionList {

    private ArrayList<String> optionsList = new ArrayList<>();

    OptionList(String[] options) {
        optionsList.addAll(Arrays.asList(options));
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
        optionsList.add(option);
    }

    // Delete an option from the list
    void deleteOption(String option) {
        for (String op: optionsList) {
            if (op.equals(option)) {
                optionsList.remove(option);
            } else {
                System.out.println("There is no such option");
            }
        }

    }

    @Override
    public String toString() {
        return "OptionsList{" +
                "optionsList=" + optionsList +
                '}';
    }
}
