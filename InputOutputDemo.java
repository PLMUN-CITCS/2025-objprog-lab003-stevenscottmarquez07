import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        
     
        System.out.print("Enter an integer: ");
        int integerInput = scanner.nextInt();
        
       
        System.out.print("Enter a decimal number: ");
        double decimalInput = scanner.nextDouble();
        
      
        scanner.nextLine(); 
        
      
        System.out.print("Enter a word or sentence: ");
        String stringInput = scanner.nextLine();
        
       
        System.out.println("Your integer: " + integerInput);
        System.out.printf("Your decimal number: %.2f\n", decimalInput);
        System.out.println("Your string: " + stringInput);
        
       
        scanner.close();
    }
}
