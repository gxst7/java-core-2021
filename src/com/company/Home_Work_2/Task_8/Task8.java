package com.company.Home_Work_2.Task_8;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Задача 8:
 * Необходимо извлечь из строки и распечатать номер карты
 * (XXXX-XXXX-XXXX-XXXX) если он там есть.
 */
public class Task8 {

    public static void main(String[] args) {
        String regExp = "\\d{4}-\\d{4}-\\d{4}-\\d{4}";
        String text = "fdgwv5vsf5782-8554-4040-3254dgd";

        Pattern pattern = Pattern.compile(regExp);
        Matcher matcher = pattern.matcher(text);
        matcher.find();
        System.out.println(matcher.group());
    }
}
