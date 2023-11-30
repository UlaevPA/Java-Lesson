// Напишите метод, который находит самую длинную строку общего
// префикса среди массива строк.
// Если общего префикса нет, вернуть пустую строку ""


package Lesson_1;

public class task_4 {
    public static void main(String[] args) {
    String phrase = "Добро пожаловать на курс по Java";
    String[] arr = phrase.split(" ");
    StringBuilder result = new StringBuilder();
    for (int i = arr.length - 1; i >= 0 ; i--) {
        result.append(arr[i]).append(" ");
    }
    System.out.println(result.toString().trim());
    
}
