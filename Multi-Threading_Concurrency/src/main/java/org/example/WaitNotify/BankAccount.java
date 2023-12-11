package org.example.WaitNotify;

public class BankAccount {
    private int balance = 0;

    synchronized public void withdraw(int amount) {
        if(balance <= 0 ){
            System.out.println("Waiting for amount to be updated after withdrawal of $"+amount);
            try {
                wait(); //? wait(1000) is also possible here
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        balance = balance - amount;
        System.out.println("The current balance is $"+ balance);
    }

    synchronized public void withdraw2(int amount) {
        if(balance <= 0 ){
            System.out.println("Waiting for amount to be updated after withdrawal of $"+amount);
            try {
                wait(); //? wait(1000) is also possible here
            } catch (InterruptedException e) {
                System.out.println("Withdrawal Interrupted!!");
                System.out.println("The current balance is $"+ balance);
                return;
            }
        }
        if((balance - amount) < 0){
            System.out.println("Insufficient balance!!");
            return;
        }
        balance = balance - amount;
        System.out.println("The current balance is $"+ balance);
    }

    public void deposit(int amount) {
        synchronized (this){
            System.out.println("We are depositing the amount in the bank of sum $"+amount);
            balance = balance + amount;
            try {
                wait(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            notify(); //? notifyAll() is also possible here
        }
    }

    public boolean deposit2(int amount) {
        synchronized (this){
            if(amount > 0) {
                System.out.println("We are depositing the amount in the bank of sum $"+amount);
                balance = balance + amount;
                notify(); //? notifyAll() is also possible here
                return true;
            } else {
                System.out.println("Invalid amount!!");
                return false;
            }

        }
    }
}
