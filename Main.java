import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main{
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("How many number do you want to enter : ");
        int count = scanner.nextInt();
        scanner.nextLine();
        int[] myArray = readInteger(count);
        System.out.println(Arrays.toString(myArray));
        reverse(myArray);
        
        
    }

    public static int[] readInteger(int count){
        int [] myArray = new int[count];
        for (int i = 0; i < count; i++) {
            System.out.print("Enter #" + (i + 1) + " : ");
            myArray[i] = scanner.nextInt();
        }
        return myArray;
    }

    public static void reverse(int[] myArray){
        int[] reverse = new int[myArray.length];

        for (int i = 0; i < myArray.length; i++) {
            reverse[i] = myArray[myArray.length-(i+1)]; 
        }
        System.out.println(Arrays.toString(reverse));
    }
}