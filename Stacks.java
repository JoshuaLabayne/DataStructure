import java.util.Scanner;
import java.util.Stack;

public class Stacks {
    public static void main (String []args) {
        Scanner sc = new Scanner(System.in);
        Stack <String> stack = new Stack<>();


        System.out.print("Enter how many names: ");
        int length = sc.nextInt();

        sc.nextLine();

        String array [] = new String[length];

        for (int i = 0; i < length; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = sc.nextLine();
            
            stack.push(array[i]);
        }

        System.out.print(stack);

        System.out.println();
        System.out.print("Enter the name you are looking for: ");
        String se = sc.nextLine();

        int look = stack.search(se);
        
        if (look == -1) {
            System.out.print("It is empty");    
        } else {
            System.out.print(look);
        }

    }
}
