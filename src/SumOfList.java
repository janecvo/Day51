import java.util.ArrayList;
import java.util.Scanner;

public class SumOfList {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> listOfInts = new ArrayList<Integer>();
        System.out.println("Enter some integers. When you are done, enter 0.");

        while (true){
            Integer num = Integer.valueOf(scanner.nextLine());
                if(num == 0){
                    System.out.println("Done entering integers into the list.");
                    break;
                }

                listOfInts.add(num);
                System.out.println(listOfInts);
            }
                int sum = 0;
                for (int i = 0; i < listOfInts.size(); i++){
                    sum += listOfInts.get(i);  
                    }
                    System.out.println("The sum is: " + sum);
        }        
    }