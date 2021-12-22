package HWToLes21;

import java.util.Scanner;

public class ATM {
    private final int maxGet = 100_000;
    private final int maxPut = 100_000;
    private final int min = 1;
    private int balance;

    public static void main(String[] args) {
        Thread thread1 = new ThreadClass();
        Thread thread2 = new ThreadClass();
        thread1.start();
        thread2.start();
    }

    public void get(){
        int get = min + (int)(Math.random()*((maxGet-1)+1));
        if(balance >= get){
            balance -= get;
            System.out.println(Thread.currentThread().getName() + " get " + get + " grn.    Balance: " + balance + " grn.");
        }else{
            Scanner sc = new Scanner(System.in);
            System.out.println("Insufficient funds. Enter sum you want to add: ");
            int sum = sc.nextInt();
            if(sum >= 1 && sum <= 100_000) {
                balance += sum;
                System.out.println(Thread.currentThread().getName() + " add " + sum + " grn.    Balance: " + balance + " grn.");
            }
        }
    }

    public void add(){
        int add = min + (int)(Math.random()*((maxPut-1)+1));
        balance += add;
        System.out.println(Thread.currentThread().getName() + " add " + add + " grn.    Balance: " + balance + " grn.");
    }

    public synchronized void doing(){
        if (Math.random() < 0.4) {
            get();
        } else {
            add();
        }
    }
}
