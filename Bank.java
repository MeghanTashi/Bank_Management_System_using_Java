import java.util.Scanner;

public class Bank {
    static Scanner sc = new Scanner(System.in);
    static String name;
    static char gender;
    static int age, balance, deposit, withdraw, accountNo, loanAmount;
    static long mobileNo;

    public static void deposit() {
        System.out.println("Your current balance is: " + balance);
        System.out.println("Enter the amount you want to deposit in your bank account: ");
        deposit = sc.nextInt();
        balance = deposit + balance;
        System.out.println("Your current balance is: " + balance);
    }

    public static void withdraw() {
        System.out.println("Your current balance is: " + balance);
        System.out.println("Enter the amount you want to withdraw from your bank account: ");
        withdraw = sc.nextInt();
        if (balance <= 500 || withdraw > balance) {
            System.out.println("Minimum Balance in Account should be 500.");
        } else {
            balance = balance - withdraw;
            System.out.println("Your current balance is: " + balance);
        }
    }

    public static void takeLoan() {
        System.out.println("Enter the amount for Loan(MAX 10 Lakh)");
        loanAmount = sc.nextInt();
        if (loanAmount < 100000) {
            // Rate.of.Interest = 5% & Time = 3 Years
            System.out.println("The time for your loan will be 3 Years!!");
            System.out.println("The Rate of Interest will be 5%");
            int interest = (loanAmount * 5 * 3) / 100;
            int finalAmount = interest + loanAmount;
            System.out.println("Your final Amount would be: " + finalAmount);
            System.out.println("\n");
            System.out.println("Do you want to continue for your loan ?? (Y/N)");
            char continueLoan = sc.next().charAt(0);
            if (continueLoan == 'Y') {
                System.out.println("------------------------------------------------------------");
                System.out.println("Here is your Loan Receipt!!\n");
                System.out.println("Initial Amount: " + loanAmount);
                System.out.println("Rate of Interest: 5%.");
                System.out.println("Time for your Loan: 3 Years.");
                System.out.println("Interest Amount: " + interest);
                System.out.println("Final Amount: " + finalAmount);
                System.out.println("------------------------------------------------------------\n\n");

            } else if (continueLoan == 'N') {
                System.exit(0);
            }
        } else if (loanAmount > 100000 && loanAmount < 500000) {
            // Rate.of.Interest = 10% & Time = 6 Years
            System.out.println("The time for your loan will be 6 Years!!");
            System.out.println("The Rate of Interest will be 10%");
            int interest = (loanAmount * 10 * 6) / 100;
            int finalAmount = interest + loanAmount;
            System.out.println("Your final Amount would be: " + finalAmount);
            System.out.println("\n");

            System.out.println("Do you want to continue for your loan ?? (Y/N)");
            char continueLoan = sc.next().charAt(0);
            if (continueLoan == 'Y') {
                System.out.println("------------------------------------------------------------");
                System.out.println("Here is your Loan Receipt!!\n");
                System.out.println("Initial Amount: " + loanAmount);
                System.out.println("Rate of Interest: 10%.");
                System.out.println("Time for your Loan: 6 Years.");
                System.out.println("Interest Amount: " + interest);
                System.out.println("Final Amount: " + finalAmount);
                System.out.println("------------------------------------------------------------\n\n");

            } else if (continueLoan == 'N') {
                System.exit(0);
            }
        } else if (loanAmount <= 1000000) {
            // Rate.of.Interest = 12% & Time = 8 Years
            System.out.println("The time for your loan will be 8 Years!!");
            System.out.println("The Rate of Interest will be 12%");
            int interest = (loanAmount * 12 * 8) / 100;
            int finalAmount = interest + loanAmount;
            System.out.println("Your final Amount would be: " + finalAmount);
            System.out.println("\n");
            System.out.println("Do you want to continue for your loan ?? (Y/N)");
            char continueLoan = sc.next().charAt(0);
            if (continueLoan == 'Y') {
                System.out.println("------------------------------------------------------------");
                System.out.println("Here is your Loan Receipt!!\n");
                System.out.println("Initial Amount: " + loanAmount);
                System.out.println("Rate of Interest: 12%.");
                System.out.println("Time for your Loan: 8 Years.");
                System.out.println("Interest Amount: " + interest);
                System.out.println("Final Amount: " + finalAmount);
                System.out.println("------------------------------------------------------------\n\n");

            } else if (continueLoan == 'N') {
                System.exit(0);
            }
        }
    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void createAccount() {
        System.out.println("Enter your Name: ");
        name = sc.nextLine();
        System.out.println("Enter Account No: (MAX 8 digits only!)");
        accountNo = sc.nextInt();
        int length2 = String.valueOf(accountNo).length();
        if (length2 > 8) {
            System.out.println("Account No should not exceed 8 digits!!");
            System.out.println("Enter Account No again: ");
            accountNo = sc.nextInt();
        }
        System.out.println("Enter your Age: ");
        age = sc.nextInt();
        System.out.println("Enter your Mobile No: ");
        mobileNo = sc.nextLong();
        int length = String.valueOf(mobileNo).length();
        if (length < 10) {
            System.out.println("Enter a valid Mobile No!!!");
            mobileNo = sc.nextLong();
        }
        System.out.println("Enter your Gender:(M/F/T)");
        gender = sc.next().charAt(0);
        System.out.println("Enter amount in your Bank Account: ");
        balance = sc.nextInt();
        if (balance < 500) {
            System.out.println("The minimum balance should be 500!!");
            balance = sc.nextInt();
        }
        clearScreen();
        System.out.println("Account created Successfully!!\n");
    }

    public static void displayAccount() {
        clearScreen();
        System.out.println("Your name is: " + name);
        System.out.println("Your Account No is: " + accountNo);
        System.out.println("Your age is: " + age);
        System.out.println("Your Mobile No is: " + mobileNo);
        if (gender == 'M') {
            System.out.println("Your Gender is: Male");
        } else if (gender == 'F') {
            System.out.println("Your Gender is: Female");
        } else {
            System.out.println("Your Gender is: Transgender");
        }

        System.out.println("Your Balance is: " + balance);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("----------------------------------------------");
            System.out.println("            Welcome to Indian Bank");
            System.out.println("----------------------------------------------\n");
            System.out.println("1.Create Account!!");
            System.out.println("2.Display Account!!");
            System.out.println("3.Withdraw Money!!");
            System.out.println("4.Deposit Money!!");
            System.out.println("5.Take Loan!!");
            System.out.println("6.Exit\n");
            System.out.println("Please Enter your Choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    createAccount();
                    break;
                case 2:
                    displayAccount();
                    break;
                case 3:
                    withdraw();
                    break;
                case 4:
                    deposit();
                    break;
                case 5:
                    takeLoan();
                    break;
                case 6:
                    System.exit(0);
            }
        }
    }
}
