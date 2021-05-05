package homeWorkWeek9;

import java.util.ArrayList;
import java.util.Collections;

/*
3. Write a Java program to reverse an array of integer values.
 */
public class Program3 {

    public static void main(String[] args) {

        // Array list declaration
        ArrayList arrList= new ArrayList();
        arrList.add("20");
        arrList.add("30");
        arrList.add("40");
        arrList.add("50");
        arrList.add("60");
        arrList.add("70");
        arrList.add("80");
        System.out.println("0rder Before Reverse:  "+arrList);
        Collections.reverse(arrList);                     //collection reverse method
        System.out.println("Order After Reverse: "+arrList);
    }

}
