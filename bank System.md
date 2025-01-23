Certainly! Here's an updated version of the README with code explanations included:

---

# Bank System - Java Application

## Overview

This is a simple Java-based Bank System that simulates the basic functionalities of a bank account. The system allows you to deposit money, withdraw money, check the balance, and exit. The program starts with an initial balance of 500 units. 

The code includes the following key operations:

1. **Deposit**: Adds money to the bank account.
2. **Withdraw**: Removes money from the bank account (if balance permits).
3. **Check Balance**: Displays the current balance of the account.
4. **Exit**: Terminates the program.

## Features

- **Deposit**: Ensures the deposited amount is positive and adds it to the balance.
- **Withdraw**: Ensures the withdrawal amount is positive and doesn't exceed the current balance.
- **Check Balance**: Displays the current account balance.
- **Error Handling**: Handles invalid inputs for both deposit and withdrawal operations.

## Requirements

- Java 8 or higher is required to run this program.

## Getting Started

To use the Bank System, follow these steps:

### 1. **Clone or Download the Code**

You can access and run the Java code from the following link:

[Bank System Code - Programiz Online Compiler](https://www.programiz.com/online-compiler/9oVjYTfAlEW6e)

You can run it directly on the Programiz platform or copy it to your local development environment.

### 2. **Run the Program**
   - **Step 1**: Copy and paste the provided code into a Java file (e.g., `Main.java`).
   - **Step 2**: Compile and run the file.
   - **Step 3**: The program will prompt you with options to choose between deposit, withdrawal, balance check, or exit.

### 3. **Interacting with the Program**
   - Choose an option by entering a number from the provided menu.
   - For deposit and withdrawal options, you will be asked to input an amount.
   - You can repeat the operations until you choose to exit.

### 4. **Exit the Program**
   - When you select "4" to exit, the program will terminate with a thank you message.

## Code Walkthrough

Below is the detailed explanation of the code:

### Bank Class
This class represents a bank account and includes methods for depositing, withdrawing, and checking the balance.

```java
class Bank {
    double balance = 500;  // Starting balance of 500

    // Method to deposit money
    void deposit(double amount) {
        if(amount > 0) { // Check if the deposit amount is valid (positive)
            balance += amount;  // Add deposit amount to the balance
            System.out.println("Current balance is: " + balance);
        } else {
            System.out.println("Invalid amount");  // Handle invalid deposit amount
        }
    }

    // Method to withdraw money
    void withdraw(double amount) {
        if(amount > 0 && amount < balance) {  // Check if withdrawal amount is valid
            balance -= amount;  // Subtract withdrawal amount from the balance
            System.out.println("Remaining balance is: " + balance);
        } else {
            System.out.println("Invalid input");  // Handle invalid withdrawal amount
        }
    }

    // Method to check the balance
    double checkBalance() {
        return balance;  // Return the current balance
    }
}
```

#### **Explanation of Bank Class Methods**:
1. **deposit(double amount)**: This method takes a positive amount as input and adds it to the current balance. If the amount is invalid (non-positive), it prints an error message.
2. **withdraw(double amount)**: This method takes a withdrawal amount as input. If the amount is valid (positive and not greater than the current balance), it deducts the amount from the balance. If the input is invalid, it prints an error message.
3. **checkBalance()**: This method simply returns the current balance in the account.

### Main Class
The `Main` class handles user interaction. It presents a menu to the user, accepts their input, and calls the relevant methods from the `Bank` class.

```java
import java.util.Scanner;  // Import Scanner for user input

class Main {
    public static void main(String[] args) {
        Bank dhiraj = new Bank();  // Create an instance of Bank with initial balance
        Scanner sc = new Scanner(System.in);  // Scanner to read user input
        
        while(true) {  // Start an infinite loop for continuous interaction
            System.out.println("Select from the below option");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw ");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");

            int choice = sc.nextInt();  // Read the user’s choice

            switch(choice) {  // Switch statement to execute based on the user’s choice
                case 1:
                    System.out.println("Enter amount to deposit: ");
                    double depositAmount = sc.nextDouble();  // Get deposit amount from the user
                    dhiraj.deposit(depositAmount);  // Call deposit method
                    break;
                    
                case 2:
                    System.out.println("Enter amount to withdraw: ");
                    double withdrawAmount = sc.nextDouble();  // Get withdrawal amount from the user
                    dhiraj.withdraw(withdrawAmount);  // Call withdraw method
                    break;

                case 3:
                    System.out.println("Your current balance is: ");
                    System.out.println(dhiraj.checkBalance());  // Display current balance
                    break;

                case 4:
                    System.out.println("Thank you!");  // Exit message
                    return;  // Exit the program

                default:
                    System.out.println("Invalid choice.");  // Handle invalid menu options
            }
        }
    }
}
```

#### **Explanation of Main Class**:
1. **Menu Display**: The program repeatedly displays a menu with options for deposit, withdrawal, balance check, and exit.
2. **User Input**: The program reads the user's choice from the console.
3. **Switch-Case**: Based on the user's choice, the program calls the corresponding method from the `Bank` class to perform the operation.
4. **Exit Condition**: If the user selects "4", the program will terminate with a thank you message.

## Example Interaction

```plaintext
Select from the below options:
1. Deposit
2. Withdraw
3. Check Balance
4. Exit

Enter your choice: 1
Enter amount to deposit: 100
Current balance is: 600.0

Enter your choice: 2
Enter amount to withdraw: 50
Remaining balance is: 550.0

Enter your choice: 3
Your current balance is: 550.0

Enter your choice: 4
Thank you!
```

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Contributing

If you'd like to contribute to this project, feel free to fork it and make improvements. For any suggestions or improvements, open an issue or create a pull request.

---

Feel free to test the code, modify it, and improve it according to your needs!
