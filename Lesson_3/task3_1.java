package Lesson_3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

// Задание №1
// Заполнить список десятью случайными числами.
// Отсортировать список методом sort() и вывести его на
// экран.

public class task3_1 {
    public static void main(String[] args) {
        int num = 10;
        int min = 0;
        int max = 10;
        List<Integer> userList = createList(num, min, max);
        System.out.println(userList);
        userList.sort(Comparator.reverseOrder());
        System.out.println(userList);

    }
    static List<Integer> createList(int num, int min, int max){
        List<Integer> resList = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < num; i++) {
            int tmp = random.nextInt(min, max+1);
            resList.add(tmp);
        }
        return resList;
    }
}
    

