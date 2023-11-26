public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();

        // Membuat tiga objek akun
        Account nikoAccount = new Account("Niko_SI4602", "1202220348", 100000);
        Account regaAccount = new Account("Rega_SI4602", "1202223378", 200000);
        Account aliAccount = new Account("Ali_SI4602", "1202223615", 300000);

        // Menambahkan akun ke bank
        bank.addAccount(nikoAccount);
        bank.addAccount(regaAccount);
        bank.addAccount(aliAccount);

        // Menampilkan saldo akun
        System.out.println("Saldo Akun " + nikoAccount.getAccountNumber() + ": " + nikoAccount.getBalance());
        System.out.println("Saldo Akun " + regaAccount.getAccountNumber() + ": " + regaAccount.getBalance());
        System.out.println("Saldo Akun " + aliAccount.getAccountNumber() + ": " + aliAccount.getBalance());
        System.out.println();

        // Menyetor dan menarik uang dari akun
        nikoAccount.deposit(50000);
        regaAccount.withdraw(20000);

        System.out.println("Saldo Akun " + nikoAccount.getAccountNumber() + " setelah menyetor: " + nikoAccount.getBalance());
        System.out.println("Saldo Akun " + regaAccount.getAccountNumber() + " setelah menarik uang: " + regaAccount.getBalance());
        System.out.println();

        // Menghapus akun
        bank.removeAccount(regaAccount.getAccountNumber());
        System.out.println("Akun " + regaAccount.getAccountNumber() + " Berhasil Dihapus");
        System.out.println();
        
        // Menampilkan daftar semua akun dalam bank
        System.out.println("Daftar Semua Akun dalam Bank:");
        for (Account account : bank.getAllAccounts()) {
            System.out.println("Nama: " + account.name + ", Nomor Akun: " + account.getAccountNumber() + ", Saldo: " + account.getBalance());
        }
    }
}
