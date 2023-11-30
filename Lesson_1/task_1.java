package Lesson_1;


import java.time.LocalTime;
import java.util.Scanner;

/**
 * task_1
 */
public class task_1 {
    public static void main(String[] args) {
        System.err.println("Введите ваше имя: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        LocalTime time = LocalTime.now();
        int hour = time.getHour();
        if(hour >= 5 && hour < 12){
        System.out.println("Доброе утро, " + name + "!");
        } else if(hour >= 5 && hour < 12){
        System.out.println("Добрый день, " + name + "!");;
        
        } else if(hour >= 5 && hour < 12){
        System.out.println("Добрый вечер, " + name + "!");
        } else{
        System.out.println("Доброй ночи, " + name + "!");
        }

    }
    
       
}