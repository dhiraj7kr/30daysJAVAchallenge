
1.
Here's a simple Java code snippet to find the sum of two numbers:

```java
import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the first number
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        // Prompt the user to enter the second number
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        // Calculate the sum of the two numbers
        int sum = num1 + num2;

        // Display the result
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);

        // Close the scanner
        scanner.close();
    }
}
```

### How it works:
1. The program uses the `Scanner` class to take input from the user.
2. It prompts the user to enter two integers.
3. It calculates the sum of the two numbers.
4. The result is displayed on the console.

### Example Output:
```
Enter the first number: 5
Enter the second number: 10
The sum of 5 and 10 is: 15
```


2.

Here's a Java program to calculate the CGPA based on three numbers (marks or grades):

```java
import java.util.Scanner;

public class CalculateCGPA {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the three numbers
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        System.out.print("Enter the third number: ");
        double num3 = scanner.nextDouble();

        // Calculate the CGPA
        double cgpa = (num1 + num2 + num3) / 3;

        // Display the CGPA
        System.out.printf("The CGPA of the three numbers is: %.2f%n", cgpa);

        // Close the scanner
        scanner.close();
    }
}
```

### How it works:
1. The program uses the `Scanner` class to take three numbers as input from the user.
2. It calculates the average of the three numbers to find the CGPA.
3. The CGPA is displayed up to two decimal places using `printf`.

### Example Output:
```
Enter the first number: 8.5
Enter the second number: 9.2
Enter the third number: 7.8
The CGPA of the three numbers is: 8.50
```

You can replace the three numbers with actual marks or grades to compute the CGPA.

3.

Here's a Java program to check if the number entered by the user is an integer:

```java
import java.util.Scanner;

public class CheckInteger {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        
        // Check if the input is an integer
        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            System.out.println("You entered an integer: " + number);
        } else {
            System.out.println("The input is not an integer.");
        }

        // Close the scanner
        scanner.close();
    }
}
```

### How it works:
1. **`scanner.hasNextInt()`**:
   - This method checks if the next input is an integer.
   - Returns `true` if the input can be parsed as an integer, otherwise `false`.

2. **Logic**:
   - If the user enters an integer, it is read using `scanner.nextInt()` and displayed.
   - If the input is not an integer, a message is displayed indicating that the input is invalid.

### Example Output:
#### Case 1: Input is an integer
```
Enter a number: 42
You entered an integer: 42
```

#### Case 2: Input is not an integer
```
Enter a number: hello
The input is not an integer.
```
