import java.util.Scanner;

public class task_1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String usersName = input.nextLine();
        System.out.println("Hello, " + usersName + "!" );
        System.out.println("Enter array length: ");
        int size = input.nextInt(); 
        int array[] = new int[size]; 
        System.out.println("Insert array elements:");
        /*Пройдёмся по всему массиву, заполняя его*/
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt(); 
        }
        
        int sum=0;
        int mult=0;
        for (int i = 0; i < size; i++) {
            sum=sum+array[i]; 
            mult=mult*array[i];
        }
        System.out.print ("Summ of the array elements: ");
        System.out.println(sum);
        System.out.print ("Product of the array elements: ");
        System.out.println(mult);
    }
}