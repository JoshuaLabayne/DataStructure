import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListD {
    public static void main (String []args) {
        Scanner sc = new Scanner(System.in);
        
        LinkedList<Book> link = new LinkedList<Book>();

        Book b1 = new Book(101, "Let us C", "Yashwant", "BPB", 8);
        Book b2 = new Book(102, "Data", "Forouzan", "Mc Graw", 4);
        Book b3 = new Book(103, "Operating", "Galvin", "Wiley", 6);


        link.add(b1);
        link.add(b2);
        link.add(b3);
        link.remove(b3);

        for (Book a:link){
            System.out.println(a.id + " " + a.name+  " " + a.author + " " + a.publisher + " " + a.quantity);

        }

    }
}
