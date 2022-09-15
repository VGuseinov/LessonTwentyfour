package com.company;

import java.util.Collections;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        // Лямбда выражения (Java 8)
        /* если какой то метод треует на вход
        аргумент интерфейса или абстрактонго класса
        и в этом интерфейсе / абстрактном классе
        только ОДИН нереализованный метод
        то вместо передачи объекта этого типа
        можно указать Лямбда выражение.
         */

        // Лямбла выражение в Java:
        // (<arg1>, <arg2, ...>) -> { ...}
        // () - обязательны, даже если метод не принимает аргументов

        // типы аргументов при задании лямбды можно опустить,
        // можно опустить либо все, или не опускать вовсе
        // (a1, a2, ...) -> {...}

        // если в теле лямюды указано только одно выражение
        // и результат эетого выражения совпадает с типом возращаемого значения лямбды,
        // то ключевое слово и фигурные скобки можно опустить

        LinkedList<Integer> ls = new LinkedList<>();
        ls.add(1);
        ls.add(12);
        ls.add(2);
        ls.add(14);
        Collections.sort(ls, Integer::compare);
        Test t = new Test();
        Collections.sort(ls, t::diff);
        Collections.sort(ls, Test::diff2); // в случае если метот static
        System.out.println(ls);
        ls.stream().forEach(System.out::println);
    }
}
