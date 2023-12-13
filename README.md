# codesoft_tasks
# Random Number Guessing Game

This simple java program allows users to play a random number guessing game. Follow the steps below to understand how the game works:

## How to Play

1. **Generate a Random Number:**
   - The program will generate a random number within a specified range, for example, 1 to 100.

2. **User Guess:**
   - The user will be prompted to enter their guess for the generated number.

3. **Feedback:**
   - The program will compare the user's guess with the generated number and provide feedback on whether the guess is correct, too high, or too low.

4. **Repeat until Correct:**
   - Steps 2 and 3 will be repeated until the user guesses the correct number.

## Additional Features

5. **Limit Attempts:**
   - The user is allowed a limited number of attempts to guess the correct number. If the limit is reached, the game ends.

6. **Multiple Rounds:**
   - Players have the option to play multiple rounds, allowing them to enjoy the game again.

7. **Display Score:**
   - The program displays the user's score, which can be based on the number of attempts taken or rounds won.

## How to Run

To run the game, make sure you have java installed on your system.

```bash
java numbergame.java
```

Feel free to customize the code and ranges according to your preferences. Have fun playing!



# codesoft_task02
# Java Program: Student Grade Calculator

This Java program takes input for marks obtained (out of 100) in each subject, calculates the total marks, average percentage, assigns grades based on the average percentage, and displays the results to the user.

## Problem Description

1. **Input:**
   - Take marks obtained (out of 100) in each subject as input.

2. **Calculate Total Marks:**
   - Sum up the marks obtained in all subjects to calculate the total marks.

3. **Calculate Average Percentage:**
   - Divide the total marks by the total number of subjects to get the average percentage.

4. **Grade Calculation:**
   - Assign grades based on the average percentage achieved. You can customize the grading scale as per your requirements.

5. **Display Results:**
   - Show the user:
      - Total Marks
      - Average Percentage
      - Corresponding Grade

## How to Use

1. Ensure you have Java installed on your system.
2. Compile the Java program using a Java compiler.

    ```bash
    javac CalculateGrades.java
    ```

3. Run the compiled program.

    ```bash
    java CalculateGrades
    ```

4. Enter the marks for each subject when prompted.

5. The program will display the total marks, average percentage, and the corresponding grade.

Feel free to modify the code to suit your specific grading criteria or any additional features you may want to incorporate.


# codesoft_task03
# Java ATM Machine

This Java program simulates an ATM machine with basic functionalities like withdrawing, depositing, and checking the balance.

## Classes

### 1. **ATM Class:**
   - Represents the ATM machine and includes methods for various operations.
   - Methods:
     - `withdraw(amount)`: Withdraws the specified amount from the connected bank account.
     - `deposit(amount)`: Deposits the specified amount into the connected bank account.
     - `checkBalance()`: Retrieves and displays the current balance.

### 2. **BankAccount Class:**
   - Represents the user's bank account and stores the account balance.
   - Properties:
     - `balance`: Stores the current account balance.

## User Interface

The user interface includes options for interacting with the ATM, such as:
   - Withdraw
   - Deposit
   - Check Balance

## Implementation Details

1. **Connect ATM with Bank Account:**
   - The ATM class is connected with the BankAccount class to access and modify the account balance.

2. **User Input Validation:**
   - User input is validated to ensure it is within acceptable limits. For example, withdrawals are validated to ensure there is a sufficient balance.

3. **Transaction Messages:**
   - Appropriate messages are displayed to the user based on their chosen options and the success or failure of their transactions.

## How to Use

1. Compile the Java program using a Java compiler.

    ```bash
    javac ATMProgram.java
    ```

2. Run the compiled program.

    ```bash
    java ATMProgram
    ```

3. Follow the on-screen instructions to perform ATM transactions.

Feel free to customize the code to add more features or modify the user interface based on your requirements.
