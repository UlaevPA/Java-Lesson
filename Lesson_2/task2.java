package Lesson_2;

public class task2 {
    public static void main(String[] args) {
        System.out.println(task02("aaaabbccd"));
    }


    public static String task02(String s)
    {
        StringBuilder result = new StringBuilder();
        char ch;
        int count = 0;
        ch = s.charAt(0);
        for(char temp : s.toCharArray())
        {
            if (temp != ch){
                result.append(ch);
                result.append(count);
                ch = temp;
                count = 1;
            
            }
            else{
                count++;
            } 
        }
                result.append(ch);
                result.append(count);

        return result.toString();
    }
}
