import java.util.Scanner;
import java.util.Arrays;

public class CommandReader {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] notes = new String[1000];
        int counter = 0;
        while(true) {
            System.out.println("Please enter command");
            String command = sc.nextLine();
            switch (command) {
                case "add":
                    counter = add(counter, notes, sc);
                    break;
                case "remove":
                    remove(notes, sc);
                    break;
                case "exit":
                    System.exit(0);
                    break;
                case "read":
                    read(notes, sc);
                    break;
                case "longest":
                    longest(notes);
                    break;
                default:
                    System.out.println("Unknown command! Try again");
            }
        System.out.println(notes.toString());
        }
    }

    public static int add(int counter, String[] notes, Scanner sc){
        System.out.println("Enter command you want to add");
        notes[counter] = sc.nextLine();
        counter++;
        return counter;
    }

    public static void remove(String[] notes, Scanner sc){
        System.out.println("Enter number of command you want to remove");
        int i = Integer.parseInt(sc.nextLine());
        notes[i] = null;
    }

    public static void read(String[] notes, Scanner sc){
        System.out.println("Enter number of command you want to read");
        int i = Integer.parseInt(sc.nextLine());
        System.out.println(notes[i]);
    }
    public static void longest(String[] notes){
        int length = -1;
        int i = -1;
        for(int j = 0; j < notes.length; j++)
        {
            if(notes[j] != null){
                if (notes[j].length() > length){
                    length = notes[j].length();
                    i = j;
                }
            }
        }
        if(i != -1)
            System.out.println(notes[i]);
    }
}
/*
class Counter{
    static int counter = 0;
    }
*/