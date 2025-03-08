import java.util.Scanner;

class BankAccount {
private double bal;
public BankAccount(double initialBal)
{
this.bal = initialBal;
}
public double getBal() 
{
return bal;
}
public void deposit(double amount) {
if (amount > 0) {
bal += amount;
System.out.println("Deposited: " + amount);
} else 
{
System.out.println("Invalid deposit amount.");
}
}
public boolean withdraw(double amount) {
if (amount > 0 && amount <= bal) {
bal -= amount;
System.out.println("Withdrawn: " + amount);
return true;
} else
{
System.out.println("Insufficient balance or invalid amount.");
return false;
}
}
}
class ATM {
private BankAccount acc;
public ATM(BankAccount acc) 
{
this.acc = acc;
}
public void showMenu() {
Scanner sc = new Scanner(System.in);
while (true) {
System.out.println("\n Functions ");
System.out.println("1. Check Balance");
System.out.println("2. Deposit");
System.out.println("3. Withdraw");
System.out.println("4. Exit");
System.out.print("Choose an option: ");
int choice = sc.nextInt();
switch (choice) {
case 1:
checkBalance();
break;
case 2:
deposit();
break;
case 3:
withdraw();
break;
case 4:
System.out.println("Thank you for using the ATM..");
return;
default:
System.out.println("Invalid choice. Please try again.");
}
}
}
private void checkBalance() {
System.out.println("Your current balance is: " + acc.getBal());
}
private void deposit() {
Scanner sc = new Scanner(System.in);
System.out.print("Enter the deposit amount: ");
double amount = sc.nextDouble();
acc.deposit(amount);
}
private void withdraw() {
Scanner sc = new Scanner(System.in);
System.out.print("Enter the withdrawal amount: ");
double amount = sc.nextDouble();
acc.withdraw(amount);
}
}

public class Main {
public static void main(String[] args) {
BankAccount acc = new BankAccount(2000.0);
ATM atm = new ATM(acc);
atm.showMenu();
}
}