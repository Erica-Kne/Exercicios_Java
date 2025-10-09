package br.com.ericaknevitz.sistemabancario;

import br.com.ericaknevitz.sistemabancario.exception.ExceededWithdrawLimitException;
import br.com.ericaknevitz.sistemabancario.exception.InsufficientBalanceException;
import br.com.ericaknevitz.sistemabancario.model.Account;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        int number;
        String holder;
        double balance;
        double withdrawLimit;
        double withdraw;

         Scanner sc = new Scanner(System.in);

         System.out.print("Enter account DATA:\n");
         System.out.print("Number: ");
         number = sc.nextInt();
         sc.nextLine();
         System.out.print("Holder: ");
         holder = sc.nextLine();
         System.out.print("Initial balance: ");
         balance = sc.nextDouble();
         System.out.print("Withdraw limit: ");
         withdrawLimit = sc.nextDouble();
         System.out.print("==========================================\n");
         System.out.print("Enter amount for withdraw: ");
         withdraw = sc.nextDouble();
        
         Account account = new Account(number, holder, balance, withdrawLimit);

         try {
             account.withdraw(withdraw);
             System.out.print("New balance: " + account.getBalance());

         } 
         catch (ExceededWithdrawLimitException e) {
             System.out.print("ERROR: " + e.getMessage());
         }
         catch (InsufficientBalanceException e) {
             System.out.print("ERROR: " + e.getMessage());
         }
         
         sc.close();
        
    }     

}
