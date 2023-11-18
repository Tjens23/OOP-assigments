package opgaver.opg21;

public class Customer {
    String name;
    int id;
    int balance;

    public Customer(String name, int id, int balance) {
        this.name = name;
        this.id = id;
        this.balance = balance;
    }

    public Customer(String name, int id) {
        this.name = name;
        this.id = id;
        this.balance = 0;
    }

    public void deposit(double amount) {
        this.balance += (int) amount;
    }

    public void withdraw(double amount) {
        this.balance -= (int) amount;
    }

    public double getBalance() {
        return this.balance;
    }
}
