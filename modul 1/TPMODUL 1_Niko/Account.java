public class Account {
    String name; // Nama pemilik akun
    private String accountNumber; // Nomor akun
    private double balance; // Saldo akun

    public Account(String name, String accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance; // Constructor untuk membuat objek akun dengan atribut yang diberikan
    }

    public void deposit(double amount) {
        balance += amount; // Method untuk menyetor uang ke akun
    }

    public boolean withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount; // Method untuk menarik uang dari akun jika saldo mencukupi
            return true;
        }
        return false; // Mengembalikan false jika saldo tidak mencukupi
    }

    public String getAccountNumber() {
        return accountNumber; // Method untuk mendapatkan nomor akun
    }

    public double getBalance() {
        return balance; // Method untuk mendapatkan saldo akun
    }
}
