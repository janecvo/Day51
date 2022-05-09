import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfInteger {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ArrayList <Integer> listOfInts = new ArrayList<Integer>();
        System.out.println("Enter an integer! Entering 0 will end the program.");
    
        while(true){
            Integer num = Integer.valueOf(scanner.nextLine());
            if (num == 0){
                System.out.println("Done entering integers into the list.");
                break;
            }
            listOfInts.add(num);
            System.out.println(listOfInts);
        }
        System.out.println("What number are you looking for?");
        int numFind = Integer.valueOf(scanner.nextLine());
        for (int i = 0; i < listOfInts.size(); i++){
            if (listOfInts.get(i) == numFind){
                System.out.println("The index of  " +numFind + " is " + i);
            }
        }
    }
}



// for (int i = 0; i < listOfInts.size(); i++){
//     if (listOfInts.get(i) = numFind){
//         System.out.println(i);
//     }
// }