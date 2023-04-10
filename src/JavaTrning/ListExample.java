package JavaTrning;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



public class ListExample {
    public static void main(String[] args) {
        String name ="elya";
         List <Integer> numbers = new ArrayList();

         numbers.add(2);
         numbers.add(300);
         numbers.add(280);
        System.out.printf("test end");

         List <String> students = Arrays.asList("elya","daniel","avi","shay","roi");
         int len = students.size();
         String nameSecond = students.get(1);
         for (String student : students){
             System.out.println(student);
             if (student.equals("elya")){
                 System.out.println("na na ");
                 continue;
             }
             if (student.equals("shay")){
                 System.out.println("shay found");
                 break;
             }
         }
    }
}
