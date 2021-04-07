package com.company;

public class Main {

    public static void main(String[] args) throws LimitException {
        BankAccount user = new BankAccount();
        user.deposit(20000.0);
        System.out.println("На счету: " + user.getAmount());
        while (true){
            try {
                System.out.println(("Списано со счёта: " + "-") + user.withdraw(6000));
            }catch (LimitException e){
                System.out.println("Осталось на счету: " + e.getRemainingAmount());
                System.out.println(e.getMessage());
                System.out.println("Осталось на счету: " + (user.getAmount() - e.getRemainingAmount()));
                break;
            }
        }
    }
}

