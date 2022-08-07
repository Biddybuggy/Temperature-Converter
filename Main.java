import java.util.*;

class Main {
  public static void main(String[] args) {
    Integer choice;
    Double celsius, fahrenheit;

    Scanner sc = new Scanner(System.in);

    System.out.println("1. Celsius to Fahrenheit \n2. Fahrenheit to Celsius \n \nYour Input:");
    choice = sc.nextInt();

    switch (choice) {
      case 1:
        System.out.println("\nEnter temperature in Celsius: ");
        celsius = sc.nextDouble();

        fahrenheit = (celsius * 9/5) + 32;

        System.out.println("\nTemperature in Celsius: " + celsius + "\nTemperature in Fahrenheit: " + fahrenheit);
        break;

      case 2:
        System.out.println("\nEnter temperature in Fahrenheit: ");
        fahrenheit = sc.nextDouble();

        celsius = (fahrenheit - 32)*5/9;

        System.out.println("\nTemperature in Fahrenheit: " + fahrenheit + "\nTemperature in Celsius: " + celsius);
        break;

      default:
        System.out.println("\nInvalid input.");      
        break;
    }
    
  }
}
