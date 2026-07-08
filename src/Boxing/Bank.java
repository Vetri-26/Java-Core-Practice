package Boxing;

import java.util.Scanner;
class InsufficientBalanceException extends Exception {
 public InsufficientBalanceException(String message){
     super(message);
 }
}
class Account{
 private int balance;
 public Account(int balance){
     this.balance = balance;
 }
 public void withdraw(int amount)throws InsufficientBalanceException{
     if (amount > balance) {
         throw new InsufficientBalanceException("Insufficient Balance!");
     }
     balance -= amount;
     System.out.println("Withdrawal Successful");
     System.out.println("Remaining Balance: "+balance);
 }
}
public class Bank {
 public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.print("Enter Initial Balance: ");
     int balance=sc.nextInt();
     System.out.print("Enter Withdrawal Amount: ");
     int amount=sc.nextInt();
     Account acc=new Account(balance);
     try {
         acc.withdraw(amount);
     } catch(InsufficientBalanceException e){
         System.out.println(e.getMessage());
     }
     sc.close();
 }
}