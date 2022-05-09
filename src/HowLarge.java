import java.util.ArrayList;
import java.util.Scanner;

public class HowLarge {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ArrayList <String> list = new ArrayList<String>();
        System.out.println("Enter a string to be added to the array!");
        
        while(true){
            String element = scanner.nextLine();
            if (element.equals("")){
                System.out.println("The total amount of items in the list was : " + list.size());
                break;
            }
            list.add(element);
            System.out.println(list);
        }
    }
}