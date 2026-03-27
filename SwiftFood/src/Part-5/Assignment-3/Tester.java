import java.util.Scanner;
class Calculator {
    // Instance variable
    public int num;

    // Method should not take parameters, as it uses the instance variable 'num'
    public int sumOfDigits() {
        int sum = 0;
        int tempNum = num; // Use a temporary variable so we don't destroy the original 'num'
        
        while (tempNum != 0) {
            sum += tempNum % 10;
            tempNum /= 10;
        }
        return sum;
    }
}

class Tester {
    public static void main(String args[]) {
        Calculator calculator = new Calculator();
        Scanner scn =new Scanner(System.in);

        System.out.println("Enter The Number");
        // Assign a value to the member variable num
        calculator.num = scn.nextInt();

        // Invoke the method (no arguments needed now)
        int sum = calculator.sumOfDigits();
        
        System.out.println(sum);
    }
}
