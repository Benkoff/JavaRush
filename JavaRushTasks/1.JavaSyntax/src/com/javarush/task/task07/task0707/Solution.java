package com.javarush.task.task07.task0707;

import java.util.ArrayList;

/* 
Что за список такой?
Программа не должна ничего считывать с клавиатуры.
2. Объяви переменную типа ArrayList (список строк) и сразу проинициализируй ee.
3. Программа должна добавить 5 любых строк в список. Строки придумай сам.
4. Программа должна вывести размер списка на экран.
5. Программа должна вывести содержимое списка на экран, каждое значение с новой строки.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 5; i++) list.add("Line#" + i);
        System.out.println(list.size());
        for (int i = 0; i < 5; i++) System.out.println(list.get(i));
    }
}
