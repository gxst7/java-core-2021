package com.company.Home_Work_6.main;

import com.company.Home_Work_6.logic.Conflict;

/**
 * Есть две страны (Можно больше).
 * Они создают армии роботов, чтобы напасть друг на друга.
 *
 * Робот состоит из 6 частей:
 * 1. руки(левая, правая);
 * 2. ноги(левая, правая);
 * 3. тело;
 * 4. голова.
 *
 * Есть нейтральный завод. Который производит одну случайную часть
 * в какую-то единицу времени, например раз в 5 секунд.
 *
 * Соответственно эти страны пытаются взять с завода нужные им части
 * для составления робота (лишние не брать, то что не забрали - хранятся
 * на заводе).
 *
 * Кто первый соберёт армию из 20 роботов тот и победил.
 * О чем должно быть написано в консоль.
 *
 *
 * Программа должна корректно завершиться.
 */
public class Main {

    public static void main(String[] args) {
        Conflict conflict = new Conflict();
        conflict.start();   // начинает конфликт между N стран
    }
}